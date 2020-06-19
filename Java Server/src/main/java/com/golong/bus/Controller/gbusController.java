package com.golong.bus.Controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import org.apache.http.Header;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.config.TaskNamespaceHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.wxpay.sdk.WXPayUtil;
import com.golong.bus.lib.Common;
import com.golong.bus.lib.Encrypt;
import com.golong.bus.lib.HttpClient;
import com.golong.bus.lib.MacUtil;
import com.golong.bus.mapper.Tj_CodeScanbyBusMapper;
import com.golong.bus.model.Decrypt;
import com.golong.bus.model.Decrypts;
import com.golong.bus.model.DownMac;
import com.golong.bus.model.DownMacs;
import com.golong.bus.model.Tj_CodeScanbyBusWithBLOBs;
import com.golong.bus.model.TransCode;
import com.golong.bus.model.Transaction;
import com.golong.bus.model.pay.transaction_Pay;
import com.golong.bus.model.unionbank.AccessToken;
import com.golong.bus.model.unionbank.backJson;

import net.sf.json.JSONObject;

@RestController
@RequestMapping(value = "/pay", method = { RequestMethod.GET, RequestMethod.POST })
public class gbusController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final String md5Key = "775481e2556e4564985f5439a5e6a277";// "123456789ABCDEFGHIJKLMN987654321";

	/*
	 * 银商取token 测试地址：http://210.22.91.77:29015/v1/token/access
	 * 生产地址：https://api-mop.chinaums.com/v1/token/access
	 * 
	 * 另外测试环境参数为： appid:f0ec96ad2c3848b5b810e7aadf369e2f
	 * appkey:775481e2556e4564985f5439a5e6a277 商户终端可以使用这个:123456789900081 00810001
	 */
	@GetMapping("/GetAccessToken")
	public backJson GetAccessToken(String key) {
		String resJson = "";
		AccessToken token = null;
		backJson bjson = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formatter.format(new Date());
		String filePath = "e:\\javaspace\\" + strDate + ".log";
		File log = new File(filePath);
		Boolean reCall = true;
		if (log.exists()) {
			resJson = Common.readLogInfo(filePath);
			token = JSON.parseObject(resJson, AccessToken.class);
			if (token.getCreateDate().getTime() < new Date().getTime()) {
				reCall = false;
			}
			bjson = token.getResJson();
		}
		if (reCall) {
			Calendar calendar = Calendar.getInstance();
			String url = "http://210.22.91.77:29015/v1/token/access";
			JSONObject json = new JSONObject();
			json.put("appId", "f0ec96ad2c3848b5b810e7aadf369e2f");
			json.put("timestamp", WXPayUtil.getfTimestamp());
			json.put("nonce", "123456");// XPayUtil.generateNonceStr()
			String sign = WXPayUtil.Sha1(json.get("appId").toString() + json.get("timestamp").toString()
					+ json.get("nonce").toString() + md5Key);
			// sign = SignUtil.makeSign(strJson, md5Key);
			json.put("signature", sign);
			String spostjson = json.toString();
			resJson = HttpClient.doPostStr(url, spostjson, "application/json");
			bjson = JSON.parseObject(resJson, backJson.class);
			calendar.add(Calendar.SECOND, token.getResJson().getExpiresIn());
			token.setCreateDate(calendar.getTime());
			Common.writeLog(filePath, JSON.toJSONString(token), true);
		}

		return bjson;
	}

	@GetMapping("FindQrCode")
	public String FindQrcode() throws IOException {
		SqlSessionFactory sqlSessionFactory = Common.getsqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Tj_CodeScanbyBusMapper mapper = session.getMapper(Tj_CodeScanbyBusMapper.class);
			Tj_CodeScanbyBusWithBLOBs qrcode = mapper.selectByPrimaryKey("");
			// mapper.insert(record)

		} finally {
			session.close();
		}
		return "";
	}

	/*
	 * 银商通用处理
	 */
	public String commonBank(String url, JSONObject body, int use) {
		String Authorization = "";
		switch (use) {
		case 1:// OPEN-BODY-SIG方式
			JSONObject json = new JSONObject();
			json.put("AppId", "f0ec96ad2c3848b5b810e7aadf369e2f");
			json.put("Timestamp", WXPayUtil.getfTimestamp());
			json.put("Nonce", WXPayUtil.generateNonceStr());
			String sign = Common.bankSignature(json, body, md5Key);
			json.put("Signature", sign);
			String authjson = json.toString();
			Authorization = authjson.substring(1, authjson.length() - 2);
			break;
		default:// OPEN-ACCESS-TOKEN方式
			Authorization = "AccessToken=" + GetAccessToken("");
			break;
		}

		Header[] headers = { new BasicHeader("Authorization", Authorization) };
		String resJson = HttpClient.doPostStr(url, body.toString(), "application/json;", headers);// charset=UTF-8
		return resJson;
	}

	/*
	 * 激活终端
	 */
	@GetMapping("activeterminal")
	@PostMapping("activeterminal")
	public String activeTerminal(String terminalCode, String systemTraceNum, int use) {
		String url = "http://210.22.91.77:29015/v1/poslink/transaction/activeterminal";
		JSONObject body = new JSONObject();
		// 商户号
		body.put("merchantCode", "123456789900081");
		// 终端号
		body.put("terminalCode", terminalCode);
		// 系统跟踪号
		body.put("systemTraceNum", systemTraceNum);

		String resJson = commonBank(url, body, use);
		return resJson;
	}

	/*
	 * 支付
	 */
	@PostMapping("transactionPay")
	public String transactionPay(transaction_Pay pay) {
		String url = "http://210.22.91.77:29015/v1/poslink/transaction/pay";
		JSONObject body = JSONObject.fromObject(pay);
		String result = commonBank(url, body, 0);
		return result;

	}

	/*
	 * 支付冲正
	 */
	@PostMapping("reversepayment")
	public String reversePayment(transaction_Pay pay) {
		String url = "http://210.22.91.77:29015/v1/poslink/transaction/reversepayment";
		JSONObject body = JSONObject.fromObject(pay);
		String result = commonBank(url, body, 0);
		return result;
	}

	/*
	 * 支付撤销
	 */
	@PostMapping("voidpayment")
	public String voidPayment(transaction_Pay pay) {
		String url = "http://210.22.91.77:29015/v1/poslink/transaction/voidpayment";
		JSONObject body = JSONObject.fromObject(pay);
		String result = commonBank(url, body, 0);
		return result;
	}

	/*
	 * 交易退款
	 */
	@PostMapping("refund")
	public String refund(transaction_Pay pay) {
		String url = "http://210.22.91.77:29015/v1/poslink/transaction/refund";
		JSONObject body = JSONObject.fromObject(pay);
		String result = commonBank(url, body, 0);
		return result;
	}

	/*
	 * 订单状态查询
	 */
	@PostMapping("query")
	public String query(transaction_Pay pay) {
		String url = "http://210.22.91.77:29015/v1/poslink/transaction/query";
		JSONObject body = JSONObject.fromObject(pay);
		String result = commonBank(url, body, 0);
		return result;
	}

	@GetMapping("Aes")
	public String Aes() {
		String content = "13DD0DFB823205CA03418085766625DA2CFA8CAF248E547CD879C29B07D116F21EE8F66D0C4209998C792EF5C7A1CFAEB8F39541210477D4576FE0764425CFA5";
		String key = "hongshanyikatongerweimaceshixito";
		String iv = "abcdefghijklmnop";
		byte[] encrypted = Encrypt.AES_CBC_Encrypt(content.getBytes(), key.getBytes(), iv.getBytes());
		String result = Encrypt.byteToHexString(encrypted);
		return result;
	}

	/**
	 * 加密的数据进行解密，然后返回 验签的公钥--红山一卡通
	 */
	@GetMapping("ykt/key")
	public List<Decrypt> ykt_key() {

		String json2String = "";
		String Json = null;
		String decryptString = null;
		Decrypt decrypt = null;
		Decrypts decrypts = new Decrypts();
		List<Decrypt> dckeyJson = new ArrayList<>();
		ObjectMapper objectMapper = new ObjectMapper();
		String key = "hongshanyikatongerweimaceshixito";
		String iv = "abcdefghijklmnop";

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formatter.format(new Date());
		String filePath = "e:\\ykt\\key\\" + strDate + ".log";
		File log = new File(filePath);
		Boolean flag = true;

		if (log.exists()) {
			decryptString = Common.readLogInfo(filePath);
			decrypts = JSON.parseObject(decryptString, Decrypts.class);
			if (decrypts.getCreateDate().getTime() < new Date().getTime()) {
				flag = true;
			} else {
				flag = false;
			}
			dckeyJson = decrypts.getDecryptJson();
			try {
				Json = objectMapper.writeValueAsString(dckeyJson);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}

		if (flag) {
			Calendar cal = Calendar.getInstance();
			// 设置请求参数，发送请求
			String url = "https://yktaddition.klwsxx.com/ykt/key1";
			JSONObject jsonParam = new JSONObject();
			jsonParam.put("city_code_number", "01");
			jsonParam.put("uuid", "1");
			jsonParam.put("appid", "hstd37bs99ad9fecdf");
			// 获取签名
			String sign = MacUtil.createSign();
			jsonParam.put("sign", sign);

			String json = jsonParam.toString();
			json2String = HttpClient.doPostStr(url, json, "application/json");
			try {

				List<Decrypt> list = JSON.parseArray(json2String, Decrypt.class);

				for (Decrypt d : list) {
					String rs = d.getPublickey();

					// 解密
					byte[] bytes = Encrypt.HexString2Bytes(rs);
					byte[] decrypted = Encrypt.AES_CBC_Decrypt(bytes, key.getBytes(), iv.getBytes());
					String dckey = Encrypt.hexString2String(Encrypt.byteToHexString(decrypted));

					// 解密后的结果，封装成对象再转成字符串
					Decrypt decryptJson = new Decrypt();
					decryptJson.setPublickey(dckey);
					decryptJson.setValiddate(d.getValiddate());
					decryptJson.setRecordno(d.getRecordno());
					dckeyJson.add(decryptJson);

				}

				// 存到本地文件
				decrypts.setDecryptJson(dckeyJson);
				// 一天时间对比
				cal.add(Calendar.SECOND, 24 * 60 * 60);
				decrypts.setCreateDate(cal.getTime());
				Common.writeLog(filePath, JSON.toJSONString(decrypts), true);

				// 发送解密后的Json串
				Json = objectMapper.writeValueAsString(dckeyJson);

			} catch (Exception e) {
				e.printStackTrace();

			}
		}
		return dckeyJson;
	}

	/**
	 * 下载MAC码生成规则
	 */
	@GetMapping("/ykt/maccode")
	public String ykt_maccode() {

		String json2String = "";
		String key = "hongshanyikatongerweimaceshixito";// key秘钥
		String iv = "abcdefghijklmnop";
		List<DownMac> macList = new ArrayList<>();
		DownMacs downMacs = new DownMacs();
		Calendar cal = Calendar.getInstance();
		ObjectMapper objectMapper = new ObjectMapper();
		String Json = null;
		String downMacsString = "";

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formatter.format(new Date());
		String filePath = "e:\\ykt\\maccode\\" + strDate + ".log";
		File log = new File(filePath);
		Boolean flag = true;

		if (log.exists()) {
			downMacsString = Common.readLogInfo(filePath);
			downMacs = JSON.parseObject(downMacsString, DownMacs.class);
			if (downMacs.getCreateDate().getTime() < new Date().getTime()) {
				flag = true;
			} else {
				flag = false;
			}
			macList = downMacs.getMacs();
			try {
				Json = objectMapper.writeValueAsString(macList);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}

		if (flag) {
			// 设置请求参数，发送请求
			String url = "https://yktaddition.klwsxx.com/ykt/maccode";
			JSONObject jsonParam = new JSONObject();
			jsonParam.put("city_code_number", "01");
			jsonParam.put("uuid", "1");
			jsonParam.put("appid", "hstd37bs99ad9fecdf");
			// 获取签名
			String sign = MacUtil.createSign();
			jsonParam.put("sign", sign);

			String json = jsonParam.toString();
			json2String = HttpClient.doPostStr(url, json, "application/json");

			List<DownMac> list = JSON.parseArray(json2String, DownMac.class);

			for (DownMac d : list) {
				String rs = d.getKey12();
				// 解密
				byte[] bytes = Encrypt.HexString2Bytes(rs);
				byte[] decrypted = Encrypt.AES_CBC_Decrypt(bytes, key.getBytes(), iv.getBytes());
				String dckey = Encrypt.hexString2String(Encrypt.byteToHexString(decrypted));

				// 解密后的结果，封装成对象再转成字符串
				DownMac downMac = new DownMac();
				downMac.setKey12(dckey);
				downMac.setCiphertextbegin(d.getCiphertextbegin());
				downMac.setValiddate(d.getValiddate());
				macList.add(downMac);

			}
			// 存到本地文件
			downMacs.setMacs(macList);
			// 2天时间对比
			cal.add(Calendar.SECOND, 24 * 60 * 60);
			downMacs.setCreateDate(cal.getTime());
			Common.writeLog(filePath, JSON.toJSONString(downMacs), true);

			// 发送解密后的Json串
			try {
				Json = objectMapper.writeValueAsString(macList);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		if (Json != null) {
			return "OK";
		} else {
			return "NO";
		}
	}

	/**
	 * 上传交易记录
	 * 
	 * @param json
	 * @return 状态码
	 * @throws IOException
	 */
	@GetMapping("/ykt/scannerrecord/new")
	public String uploadTrs(@RequestBody Transaction trans) {

		// Transaction trans = new Transaction();
		// trans.setTac_code("3134064259c4c3c342258986bce169609b9f303031303131303030303031373638323333393336385a0555e25a0563f231303030c000303140e068a30000");
		// trans.setStation_code("100");
		// trans.setEquipment_code("100");
		// trans.setTrade_type_number("01");
		// trans.setCity_code_number("01");
		// trans.setMerchant_code_number("01");
		// trans.setQrcode_type_number("00");
		// trans.setTerminal_no_number("0000000010006080");
		// trans.setLine_no_number("000");
		// trans.setBus_no_number("0-6080");
		// trans.setSerial_no_number("1510299106");
		// trans.setUid_text("0000017682339368");
		// trans.setMoney_number("0.01");
		// trans.setScan_datetime("1510299106");
		// trans.setCompany_code("00");
		// trans.setLudui_code("9999");
		// trans.setDrivercard_code("0300000090002065");
		// trans.setAppid("hstd37bs99ad9fecdf");
		// trans.setSign("7F9A607570D1F0D50BB062639E4A8F89");
		// Transaction trans = JSON.parseObject(transjson, Transaction.class);
		// 获取签名
		// TreeMap<Object, Object> paraMap = new TreeMap<Object, Object>();
		// paraMap.put("city_code_number", "01");
		// paraMap.put("uuid", "1");
		// paraMap.put("appid", "hstd37bs99ad9fecdf");
		// String key1 = "9e38c2164484bcc98d99340d9c0c3d4f";
		// String sign = Encrypt.createSign(key1, "UTF-8", paraMap);
		// trans.setSign(sign);

		List<Transaction> list = new ArrayList<>();
		list.add(trans);
		String obj2String = JSON.toJSONString(list);
		String url = "https://yktaddition.klwsxx.com/ykt/scannerrecord/new";
		String state = HttpClient.doPostState(url, obj2String, "application/json", null);
		System.out.println(state);
		return state;

	}

	/**
	 * 黑名单下载
	 * 
	 * @return
	 */
	@GetMapping("/ykt/blacklist")
	public String backList() {
		String url = "https://yktaddition.klwsxx.com/ykt/blacklist";
		String uid = null;

		// 获取签名
		String sign = MacUtil.createSign();
		JSONObject jsonParam = new JSONObject();
		jsonParam.put("city_code_number", "01");
		jsonParam.put("uuid", "1");
		jsonParam.put("appid", "hstd37bs99ad9fecdf");
		jsonParam.put("sign", sign);
		String json = jsonParam.toString();
		// 返回的是uid json串
		uid = HttpClient.doPostStr(url, json, "application/json");
		return uid;

	}

	/**
	 * 生成mac码
	 */
	@GetMapping("/ykt/createMac")
	public String createMac(String TDCCREATETIME,String MAC,String JSON) {
		
		// 证书生成时间戳（4字节）+ 二维码生成时间（4字节）+ 用户ID后6字节 + 城市码（后1字节）+UUID（1字节）
		 TransCode transCode = new TransCode();
		 transCode.setMAC(MAC);
		 transCode.setTDCCREATETIME(TDCCREATETIME);
		 transCode.setJSON(JSON);
		
		DownMacs downMacs = MacUtil.ykt_maccode();
		if (downMacs == null) {
			// 重定向
			return "redirect:/ykt/maccode";
		}

		// 系统时间+1天
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, 1);
		// 取得key12的json串
		String key12 = "";
		int index = 0;
		if (downMacs.getCreateDate().getTime() > date.getTime()) {
			key12 = downMacs.getMacs().get(0).getKey12();
			index = Integer.valueOf(downMacs.getMacs().get(0).getCiphertextbegin());
		} else if (downMacs.getCreateDate().getTime() < cal.getTime().getTime()) {
			key12 = downMacs.getMacs().get(1).getKey12();
			index = Integer.valueOf(downMacs.getMacs().get(1).getCiphertextbegin());
		} else {
			// 重定向
			return "redirect:/ykt/maccode";
		}

		// 获取密文
		String tdcCreateTime = transCode.getTDCCREATETIME();
		String clear = transCode.getJSON();
		String hexString = MacUtil.hexString(tdcCreateTime, key12, clear);

		// 获取Mac 线程安全
		int count = 2 * index - 2;
		int cindex = 2 * index + 6;
		String mac = "";
		StringBuffer sb = new StringBuffer();
		if (count <= 24) {
			mac = hexString.substring(count, cindex);
		} else if (count == 26) {
			mac = sb.append(hexString.substring(count)).append(hexString.substring(0, 2)).toString();
		} else if (count == 28) {
			mac = sb.append(hexString.substring(count)).append(hexString.substring(0, 4)).toString();
		} else {
			mac = sb.append(hexString.substring(count)).append(hexString.substring(0, 6)).toString();
		}

		if (transCode.getMAC().equals(mac)) {
			return "OK";
		} else {
			return "NO";
		}

	}

}

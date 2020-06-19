package com.golong.bus.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.github.wxpay.sdk.WXPayUtil;
import com.golong.bus.lib.AesEncodeUtil;
import com.golong.bus.lib.Common;
import com.golong.bus.lib.HttpClient;
import com.golong.bus.model.qrcode;
import com.golong.bus.model.qrtrade;
import com.golong.bus.model.unionbank.backJson;

import net.sf.json.JSONObject;

@RestController
@RequestMapping(value = "/qrpay", method = RequestMethod.POST, consumes = "application/json")
public class busController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final String md5Key = "123456789ABCDEFGHIJKLMN987654321";

	@PostMapping("/upload")
	public String upload(@RequestBody qrtrade trade) throws Exception {
		qrtrade ptrade = new qrtrade();
		ptrade.setOrgCode(trade.getOrgCode());
		ptrade.setProType(trade.getProType());
		java.util.List<qrcode> qrList = new ArrayList<qrcode>();
		String tempdata = "";
		for (qrcode a : trade.getReqData()) {
			qrcode iqr = new qrcode();
			String xdata = AesEncodeUtil.base64Decode2str(a.getData());
			System.out.println("data" + xdata);
			tempdata = com.golong.bus.lib.AesEncodeUtil.aesEncrypt(xdata);
			// System.out.println(tempdata);
			iqr.setData(tempdata);
			iqr.setQrContent(a.getQrContent());
			iqr.setQrContent2(a.getQrContent2());
			iqr.setTradeType(a.getTradeType());
			qrList.add(iqr);
		}
		ptrade.setReqData(qrList);
		String jsonString = JSON.toJSONString(ptrade);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formatter.format(new Date());
		Common.writeLog("e:\\javaspace\\" + strDate + ".log", jsonString, false);
		String url = "http://hbcs.meijiaclub.com/mjhapptest/QRTradePosTransDetail/upload";
		String rjsonString = HttpClient.doPostStr(url, jsonString, "application/json;charset=UTF-8");
		// Common.httpPostWithJSON(url,jsonString);
		Common.writeLog("e:\\javaspace\\" + strDate + ".log", "-----callback:" + rjsonString, false);
		return rjsonString;
	}

	/*
	 * 银商取token 测试地址：http://210.22.91.77:29015/v1/token/access
	 * 生产地址：https://api-mop.chinaums.com/v1/token/access
	 */
	@GetMapping("/GetAccessToken")
	@PostMapping("/GetAccessToken")
	public String GetAccessToken(String key) {
		String url = "http://210.22.91.77:29015/v1/token/access";
		JSONObject json = new JSONObject();
		json.put("appid", "f0ec96ad2c3848b5b810e7aadf369e2f");
		json.put("timestamp", WXPayUtil.getCurrentTimestamp());
		json.put("nonce", WXPayUtil.generateNonceStr());
		String sign = WXPayUtil.Sha1(json.get("appid").toString() + json.get("timestamp").toString()
				+ json.get("nonce").toString() + md5Key);// SignUtil.makeSign(json, md5Key);
		json.put("signature", sign);
		String spostjson = json.toString();
		String resJson = HttpClient.doPostStr(url, spostjson, "application/json;charset=UTF-8");
		backJson bjson = JSON.parseObject(resJson, backJson.class);
		return bjson.getAccessToken();
	}

}

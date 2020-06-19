package com.golong.bus.lib;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.golong.bus.model.DownMac;
import com.golong.bus.model.DownMacs;

import net.sf.json.JSONObject;

public class MacUtil {

	/**
	 * 下载MAC码规则
	 */
	public static DownMacs ykt_maccode() {
		//参数设置
		DownMacs downMacs = null;
		ObjectMapper objectMapper = new ObjectMapper();
		String downMacsString = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = formatter.format(new Date());
		String filePath = "e:\\ykt\\maccode\\" + strDate + ".log";
		File log = new File(filePath);
		
		if (log.exists()) {
			downMacsString = Common.readLogInfo(filePath);
			downMacs = JSON.parseObject(downMacsString, DownMacs.class);
		}
		return downMacs;

	}

	/**
	 * 截取字符串
	 */
	public static String subStr(String str, int n) {
		String b = str.substring(str.length() - n, str.length());
		return b;
	}

	/**
	 * 生成sign
	 * 
	 * @return
	 */
	public static String createSign() {

		TreeMap<Object, Object> paraMap = new TreeMap<Object, Object>();
		paraMap.put("city_code_number", "01");
		paraMap.put("uuid", "1");
		paraMap.put("appid", "hstd37bs99ad9fecdf");
		String key1 = "9e38c2164484bcc98d99340d9c0c3d4f";
		return Encrypt.createSign(key1, "UTF-8", paraMap);
	}

	public static String hexString(String tdcCreateTime, String key12, String clear) {

		byte[] tdcCreateByte = Encrypt.hexStringToBytes(tdcCreateTime);
		// 组成秘钥16字节
		byte[] keyByte = Encrypt.addBytes(key12.getBytes(), tdcCreateByte);
		// 16字节的明文
		byte[] contentBytes = Encrypt.hexStringToBytes(clear);
		// aes加密
		byte[] encryptByte = Encrypt.encrypt2(contentBytes, keyByte);
		// 密文
		String hexString = Encrypt.byteToHexString(encryptByte);
		return hexString;

	}

}

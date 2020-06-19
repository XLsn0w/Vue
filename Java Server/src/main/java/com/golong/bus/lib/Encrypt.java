package com.golong.bus.lib;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.Map.Entry;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encrypt {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String content = "13DD0DFB823205CA03418085766625DA2CFA8CAF248E547CD879C29B07D116F21EE8F66D0C4209998C792EF5C7A1CFAEB8F39541210477D4576FE0764425CFA5";
		String key = "hongshanyikatongerweimaceshixito";
		String iv = "abcdefghijklmnop";

		System.out.println("加密前：" + content);

		byte[] encrypted = AES_CBC_Encrypt(content.getBytes(), key.getBytes(), iv.getBytes());
		System.out.println("加密后：" + byteToHexString(encrypted));
		byte[] decrypted = AES_CBC_Decrypt(encrypted, key.getBytes(), iv.getBytes());
		System.out.println("解密后：" + hexString2String(byteToHexString(decrypted)));
	}

	public static String get_result(String content) {
		// TODO Auto-generated method stub

		String key = "hongshanyikatongerweimaceshixito";
		String iv = "abcdefghijklmnop";

		System.out.println("加密前：" + content);

		byte[] encrypted = AES_CBC_Encrypt(content.getBytes(), key.getBytes(), iv.getBytes());

		System.out.println("加密后：" + byteToHexString(encrypted));

		return byteToHexString(encrypted);
	}

	public static byte[] AES_CBC_Encrypt(byte[] content, byte[] keyBytes, byte[] iv) {

		try {
			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
			// SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			// random.setSeed(keyBytes);
			// keyGenerator.init(128, random);
			keyGenerator.init(128, new SecureRandom(keyBytes));
			SecretKey key = keyGenerator.generateKey();
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));
			byte[] result = cipher.doFinal(content);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception:" + e.toString());
		}
		return null;
	}

	public static byte[] AES_CBC_Decrypt(byte[] content, byte[] keyBytes, byte[] iv) {

		try {
			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			random.setSeed(keyBytes);
			keyGenerator.init(128, random);// key长可设为128，192，256位，这里只能设为128
			SecretKey key = keyGenerator.generateKey();
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));
			byte[] result = cipher.doFinal(content);
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception:" + e.toString());
		}
		return null;
	}

	public static String byteToHexString(byte[] bytes) {
		StringBuffer sb = new StringBuffer(bytes.length);
		String sTemp;
		for (int i = 0; i < bytes.length; i++) {
			sTemp = Integer.toHexString(0xFF & bytes[i]);
			if (sTemp.length() < 2)
				sb.append(0);
			sb.append(sTemp.toUpperCase());
		}
		return sb.toString();
	}

	/**
	 * 16进制转string
	 * 
	 * @param src
	 * @return
	 */
	public static String hexString2String(String src) {
		String temp = "";
		for (int i = 0; i < src.length() / 2; i++) {
			temp = temp + (char) Integer.valueOf(src.substring(i * 2, i * 2 + 2), 16).byteValue();
		}
		return temp;
	}

	/**
	 * 转成16进制
	 * 
	 * @param s
	 * @return
	 */
	public static String toStringHex(String s) {
		byte[] baKeyword = new byte[s.length() / 2];
		for (int i = 0; i < baKeyword.length; i++) {
			try {
				baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			s = new String(baKeyword, "utf-8");// UTF-16le:Not
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return s;
	}

	/**
	 * byte转16进制
	 * 
	 * @param bytes
	 * @return
	 */
	public static String bytes2hex02(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		for (byte b : bytes) {
			// 将每个字节与0xFF进行与运算，然后转化为10进制，然后借助于Integer再转化为16进制
			tmp = Integer.toHexString(0xFF & b);
			if (tmp.length() == 1)// 每个字节8为，转为16进制标志，2个16进制位
			{
				tmp = "0" + tmp;
			}
			sb.append(tmp);
		}

		return sb.toString();

	}

	/**
	 * 16进制转byte
	 * 
	 * @param src
	 * @return
	 */
	public static byte[] HexString2Bytes(String src) {
		if (null == src || 0 == src.length()) {
			return null;
		}
		byte[] ret = new byte[src.length() / 2];
		byte[] tmp = src.getBytes();
		for (int i = 0; i < (tmp.length / 2); i++) {
			ret[i] = uniteBytes(tmp[i * 2], tmp[i * 2 + 1]);
		}
		return ret;
	}

	public static byte uniteBytes(byte src0, byte src1) {
		byte _b0 = Byte.decode("0x" + new String(new byte[] { src0 })).byteValue();
		_b0 = (byte) (_b0 << 4);
		byte _b1 = Byte.decode("0x" + new String(new byte[] { src1 })).byteValue();
		byte ret = (byte) (_b0 ^ _b1);
		return ret;
	}

	/**
	 * 获取sign签名
	 * 
	 * @param key
	 * @param characterEncoding
	 * @param parameters
	 * @return
	 */
	public static String createSign(String key, String characterEncoding, SortedMap<Object, Object> parameters) {
		StringBuffer sb = new StringBuffer();
		Set es = parameters.entrySet();
		Iterator it = es.iterator();

		while (it.hasNext()) {
			Entry sign = (Entry) it.next();
			String k = (String) sign.getKey();
			Object v = sign.getValue();
			if (v != null && !"".equals(v) && !"sign".equals(k) && !"key".equals(k)) {
				sb.append(k + "=" + v + "&");
			}
		}

		sb.append("key=" + key);
		// System.out.println("签名字符串:" + sb.toString());
		String sign1 = MD5Util.MD5Encode(sb.toString(), characterEncoding).toUpperCase();
		return sign1;
	}


	/**
	 * aes加密，明文加密成密文
	 * 
	 * @param content
	 * @param password
	 * @return
	 */
	public static byte[] encrypt2(byte[] content, byte[] password) {
		try {
			SecretKeySpec key = new SecretKeySpec(password, "AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
			byte[] byteContent = content;
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] result = cipher.doFinal(byteContent);
			return result;
		} catch (Exception e) {

		}
		return null;
	}

	/**
	 * 16进制转换成byte
	 * 
	 * @param hexString
	 * @return
	 */
	public static byte[] hexStringToBytes(String hexString) {
		if (hexString == null || hexString.equals("")) {
			return null;
		}
		hexString = hexString.toUpperCase();
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] d = new byte[length];
		for (int i = 0; i < length; i++) {
			int pos = i * 2;
			d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
		}
		return d;
	}

	public static byte charToByte(char c) {
		return (byte) "0123456789ABCDEF".indexOf(c);
	}
	
	 /** 
	  *  
	  * @param data1 
	  * @param data2 
	  * @return data1 与 data2拼接的结果 
	  */  
	 public static byte[] addBytes(byte[] data1, byte[] data2) {  
	     byte[] data3 = new byte[data1.length + data2.length];  
	     System.arraycopy(data1, 0, data3, 0, data1.length);  
	     System.arraycopy(data2, 0, data3, data1.length, data2.length);  
	     return data3;  
	   
	 } 

}
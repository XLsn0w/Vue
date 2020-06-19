package com.golong.bus.lib;

import java.security.SecureRandom;
import java.util.Locale;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class AesEncodeUtil {

	private final static String transferKey = "376E60DEA31B4AC9B41305602D5BD97A";// "93483A8D89FF4A3F8CA55D2EBB4FF191";

	/**
	 * �����ü���
	 * 
	 * @param content
	 * @return
	 * @throws Exception
	 */
	public static String aesTransferEncrypt(String content) throws Exception {
		return base64Encode(aesEncryptToBytes(content, transferKey));
	}

	/**
	 * �����ý���
	 * 
	 * @param content
	 * @return
	 * @throws Exception
	 */
	public static String aesTransferDncrypt(String encryptStr) throws Exception {
		return aesDecryptByBytes(base64Decode(encryptStr), transferKey);
	}

	/**
	 * base 64 encode
	 * 
	 * @param bytes
	 *            �������byte[]
	 * @return ������base 64 code
	 */
	public static String base64Encode(byte[] bytes) {
		return new BASE64Encoder().encode(bytes);
	}

	/**
	 * base 64 decode
	 * 
	 * @param base64Code
	 *            �������base 64 code
	 * @return byte[]
	 * @throws Exception
	 */
	private static byte[] base64Decode(String base64Code) throws Exception {
		return new BASE64Decoder().decodeBuffer(base64Code);
	}

	public static String base64Decode2str(String base64Code) throws Exception {
		byte[] bytearr = new BASE64Decoder().decodeBuffer(base64Code);
		return new String(bytearr, "utf-8");
	}

	/**
	 * AES����
	 * 
	 * @param content
	 *            �����ܵ�����
	 * @param encryptKey
	 *            ������Կ
	 * @return ���ܺ��byte[]
	 * @throws Exception
	 */
	private static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(encryptKey.getBytes());
		kgen.init(128, secureRandom);
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, kgen.generateKey());
		return cipher.doFinal(content.getBytes("UTF-8"));
	}

	/**
	 * AES����
	 * 
	 * @param encryptBytes
	 *            �����ܵ�byte[]
	 * @param decryptKey
	 *            ������Կ
	 * @return ���ܺ��String
	 * @throws Exception
	 */
	private static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(decryptKey.getBytes());
		kgen.init(128, secureRandom);
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, kgen.generateKey());
		byte[] decryptBytes = cipher.doFinal(encryptBytes);
		return new String(decryptBytes, "UTF-8");
	}

	public static String byte2HexStr(byte[] b) {
		String stmp = "";
		StringBuilder sb = new StringBuilder("");
		for (int n = 0; n < b.length; n++) {
			stmp = Integer.toHexString(b[n] & 0xFF);
			sb.append((stmp.length() == 1) ? "0" + stmp : stmp);
			// sb.append(" ");
		}
		return sb.toString().toUpperCase().trim();
	}

	public static byte[] hexStr2Bytes(String src) {
		/* ������ֵ���й淶������ */
		src = src.trim().replace(" ", "").toUpperCase(Locale.US);
		// ����ֵ��ʼ��
		int m = 0, n = 0;
		int iLen = src.length() / 2; // ���㳤��
		byte[] ret = new byte[iLen]; // ����洢�ռ�

		for (int i = 0; i < iLen; i++) {
			m = i * 2 + 1;
			n = m + 1;
			ret[i] = (byte) (Integer.decode("0x" + src.substring(i * 2, m) + src.substring(m, n)) & 0xFF);
		}
		return ret;
	}

	public static String aesDecrypt(String content) {
		try {
			System.out.println(content);
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
			secureRandom.setSeed(transferKey.getBytes());
			kgen.init(128, secureRandom);
			SecretKey secretKey = kgen.generateKey();
			byte[] enCodeFormat = secretKey.getEncoded();
			System.out.println(new String(enCodeFormat, "utf-8"));
			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
			Cipher cipher = Cipher.getInstance("AES");// ����������
			cipher.init(Cipher.DECRYPT_MODE, key);// ��ʼ��

			byte[] result = cipher.doFinal(hexStr2Bytes(content));
			return new String(result, "utf-8"); // ����
		} catch (Exception e) {
			return null;
		}

	}

	public static String aesEncrypt1(String content) {
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
			secureRandom.setSeed(transferKey.getBytes());
			kgen.init(128, secureRandom);
			SecretKey secretKey = kgen.generateKey();
			byte[] enCodeFormat = secretKey.getEncoded();
			// System.out.println(new String(enCodeFormat, "utf-8"));
			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
			Cipher cipher = Cipher.getInstance("AES");// ����������
			cipher.init(Cipher.ENCRYPT_MODE, key);// ��ʼ��

			byte[] result = cipher.doFinal(hexStr2Bytes(content));
			return new String(result, "utf-8"); // ����
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * ����
	 * 
	 * @param content
	 *            ��Ҫ���ܵ�����
	 * @param password
	 *            ��������
	 * @return
	 */
	public static String aesEncrypt(String content) {
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
			secureRandom.setSeed(transferKey.getBytes());
			kgen.init(128, secureRandom);
			SecretKey secretKey = kgen.generateKey();
			byte[] enCodeFormat = secretKey.getEncoded();
			SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
			Cipher cipher = Cipher.getInstance("AES");// ����������
			byte[] byteContent = content.getBytes("utf-8");
			cipher.init(Cipher.ENCRYPT_MODE, key);// ��ʼ��
			byte[] result = cipher.doFinal(byteContent);
			return byte2HexStr(result); // ����parseByte2HexStr
		} catch (Exception e) {
			return null;
		}
	}
}

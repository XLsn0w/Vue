package com.golong.bus.lib;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Encryptone {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
  
        String content="hjkfsdahlfjhfajhfdjhjhuyeeyqyhjdh1234546";  
        String key="hongshanyikatongerweimaceshixito"; 
        String iv="abcdefghijklmnop";  
        System.out.println("加密前-->:"+content);  
        byte[ ] encrypted=AES_CBC_Encrypt(content.getBytes(), key.getBytes(), iv.getBytes());  
        String rs=byteToHexString(encrypted);
        System.out.println("从服务器获取的结果-->:"+rs);
        
        
        //扫码设备方解密开始
        byte[] encrypted_1=HexString2Bytes(rs);
        byte[ ] decrypted=AES_CBC_Decrypt(encrypted_1, key.getBytes(), iv.getBytes());  
        System.out.println("解密后："+hexString2String(byteToHexString(decrypted)));  
    }  
    
    
    
    public static String get_result(String content) {  
        // TODO Auto-generated method stub  
  
    	String key="hongshanyikatongerweimaceshixito";  
        String iv="abcdefghijklmnop";  
        System.out.println("加密前："+content);  
        byte[ ] encrypted=AES_CBC_Encrypt(content.getBytes(), key.getBytes(), iv.getBytes());  
        System.out.println("加密后："+byteToHexString(encrypted));  
       
        return byteToHexString(encrypted);
    }  
      
    
    
    public static byte[] AES_CBC_Encrypt(byte[] content, byte[] keyBytes, byte[] iv){  
          
        try{  
            KeyGenerator keyGenerator=KeyGenerator.getInstance("AES");  
            keyGenerator.init(128, new SecureRandom(keyBytes));  
            SecretKey key=keyGenerator.generateKey();  
            Cipher cipher=Cipher.getInstance("AES/CBC/PKCS5Padding");  
            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(iv));  
            byte[] result=cipher.doFinal(content);  
            return result;  
        }catch (Exception e) {  
            // TODO Auto-generated catch block  
            System.out.println("exception:"+e.toString());  
        }   
        return null;  
    }  
      
    public static byte[] AES_CBC_Decrypt(byte[] content, byte[] keyBytes, byte[] iv){  
          
        try{  
            KeyGenerator keyGenerator=KeyGenerator.getInstance("AES");  
            keyGenerator.init(128, new SecureRandom(keyBytes));//key长可设为128，192，256位，这里只能设为128  
            SecretKey key=keyGenerator.generateKey();  
            Cipher cipher=Cipher.getInstance("AES/CBC/PKCS5Padding");  
            cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv));  
            byte[] result=cipher.doFinal(content);  
            return result;  
        }catch (Exception e) {  
            // TODO Auto-generated catch block  
            System.out.println("exception:"+e.toString());  
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
    
    
    public static String hexString2String(String src) {  
        String temp = "";  
        for (int i = 0; i < src.length() / 2; i++) {  
            temp = temp  
                    + (char) Integer.valueOf(src.substring(i * 2, i * 2 + 2),  
                            16).byteValue();  
        }  
        return temp;  
    }  
    
    public static String toStringHex(String s) 
    { 
    byte[] baKeyword = new byte[s.length()/2]; 
    for(int i = 0; i < baKeyword.length; i++) 
    { 
    try 
    { 
    baKeyword[i] = (byte)(0xff & Integer.parseInt(s.substring(i*2, i*2+2),16)); 
    } 
    catch(Exception e) 
    { 
    e.printStackTrace(); 
    } 
    } 
    try 
    { 
    s = new String(baKeyword, "utf-8");//UTF-16le:Not 
    } 
    catch (Exception e1) 
    { 
    e1.printStackTrace(); 
    } 
    return s; 
    } 
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
        byte _b0 = Byte.decode("0x" + new String(new byte[]{src0})).byteValue();
        _b0 = (byte) (_b0 << 4);
        byte _b1 = Byte.decode("0x" + new String(new byte[]{src1})).byteValue();
        byte ret = (byte) (_b0 ^ _b1);
        return ret;
    }

    
    
    
}  
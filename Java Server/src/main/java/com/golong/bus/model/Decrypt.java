package com.golong.bus.model;

import java.io.Serializable;

/**
 * 请求到的json封装成对象
 * publickey为加密字符串
 * @author husu
 *
 */
public class Decrypt implements Serializable {
	//参数
	String publickey;	
	String validdate;
	String recordno;
	
	public String getPublickey111() {
		return publickey;
	}
	
	public String getPublickey() {
		return publickey;
	}
	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}
	public String getValiddate() {
		return validdate;
	}
	public void setValiddate(String validdate) {
		this.validdate = validdate;
	}
	public String getRecordno() {
		return recordno;
	}
	public void setRecordno(String recordno) {
		this.recordno = recordno;
	}
	
	
	
	
	
}

package com.golong.bus.model;

import java.io.Serializable;

/**
 * 请求返回数据的封装
 * @author zc
 *
 */
public class DownMac implements Serializable {
	
	String key12;
	String ciphertextbegin ;
	String validdate;
	
	public String getKey12() {
		return key12;
	}
	public void setKey12(String key12) {
		this.key12 = key12;
	}
	public String getCiphertextbegin() {
		return ciphertextbegin;
	}
	public void setCiphertextbegin(String ciphertextbegin) {
		this.ciphertextbegin = ciphertextbegin;
	}
	public String getValiddate() {
		return validdate;
	}
	public void setValiddate(String validdate) {
		this.validdate = validdate;
	}
	
	
}

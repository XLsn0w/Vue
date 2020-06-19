package com.golong.bus.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 对象封装
 * @author zc
 *
 */
public class Decrypts implements Serializable {

	private Date createDate;
	private List<Decrypt> decryptJson;
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<Decrypt> getDecryptJson() {
		return decryptJson;
	}

	public void setDecryptJson(List<Decrypt> decryptJson) {
		this.decryptJson = decryptJson;
	}


	
	
}

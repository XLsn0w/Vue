package com.golong.bus.model;

import java.util.List;

public class qrtrade {
     
	private String orgCode;
	
	private String proType;
	
	private List<qrcode> reqData;

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public List<qrcode> getReqData() {
		return reqData;
	}

	public void setReqData(List<qrcode> reqData) {
		this.reqData = reqData;
	}
	
}

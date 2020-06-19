package com.golong.bus.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DownMacs implements Serializable {
	
	private Date createDate;
	private List<DownMac> macs;
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public List<DownMac> getMacs() {
		return macs;
	}
	public void setMacs(List<DownMac> macs) {
		this.macs = macs;
	}
	
	
	
}

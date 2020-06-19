package com.golong.bus.model.unionbank;

import java.util.Date;

/**
 * @author luofly
 *
 */
public class AccessToken {
	
	private Date createDate;
	private backJson resJson;

	public Date getCreateDate() {
		return createDate;
	}

	public backJson getResJson() {
		return resJson;
	}

	public void setResJson(backJson resJson) {
		this.resJson = resJson;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}

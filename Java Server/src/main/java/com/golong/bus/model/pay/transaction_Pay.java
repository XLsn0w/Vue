package com.golong.bus.model.pay;

public class transaction_Pay {
	private String merchantCode;
	private String terminalCode;
	private String systemTraceNum;

	public String getMerchantCode() {
		return merchantCode;
	}

	public String getSystemTraceNum() {
		return systemTraceNum;
	}

	public void setSystemTraceNum(String systemTraceNum) {
		this.systemTraceNum = systemTraceNum;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getTerminalCode() {
		return terminalCode;
	}

	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
}

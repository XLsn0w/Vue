package com.golong.bus.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author 
 */
public class Tj_CodeScanbyBusWithBLOBs extends Tj_CodeScanbyBus implements Serializable {
    /**
     * 二维码数据源
     */
    private String fldQrComtent;

    /**
     * 二维码数据源
     */
    private String fldQrComtent2;

    /**
     * 报文
     */
    private byte[] fldMessage;

    private static final long serialVersionUID = 1L;

    public String getFldQrComtent() {
        return fldQrComtent;
    }

    public void setFldQrComtent(String fldQrComtent) {
        this.fldQrComtent = fldQrComtent;
    }

    public String getFldQrComtent2() {
        return fldQrComtent2;
    }

    public void setFldQrComtent2(String fldQrComtent2) {
        this.fldQrComtent2 = fldQrComtent2;
    }

    public byte[] getFldMessage() {
        return fldMessage;
    }

    public void setFldMessage(byte[] fldMessage) {
        this.fldMessage = fldMessage;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Tj_CodeScanbyBusWithBLOBs other = (Tj_CodeScanbyBusWithBLOBs) that;
        return (this.getFldTradeNo() == null ? other.getFldTradeNo() == null : this.getFldTradeNo().equals(other.getFldTradeNo()))
            && (this.getFldBusid() == null ? other.getFldBusid() == null : this.getFldBusid().equals(other.getFldBusid()))
            && (this.getFldBusline() == null ? other.getFldBusline() == null : this.getFldBusline().equals(other.getFldBusline()))
            && (this.getFldPosid() == null ? other.getFldPosid() == null : this.getFldPosid().equals(other.getFldPosid()))
            && (this.getFldCityCode() == null ? other.getFldCityCode() == null : this.getFldCityCode().equals(other.getFldCityCode()))
            && (this.getFldDriverid() == null ? other.getFldDriverid() == null : this.getFldDriverid().equals(other.getFldDriverid()))
            && (this.getFldTradeTime() == null ? other.getFldTradeTime() == null : this.getFldTradeTime().equals(other.getFldTradeTime()))
            && (this.getFldUserNo() == null ? other.getFldUserNo() == null : this.getFldUserNo().equals(other.getFldUserNo()))
            && (this.getFldPrice() == null ? other.getFldPrice() == null : this.getFldPrice().equals(other.getFldPrice()))
            && (this.getFldAmount() == null ? other.getFldAmount() == null : this.getFldAmount().equals(other.getFldAmount()))
            && (this.getFldBalance() == null ? other.getFldBalance() == null : this.getFldBalance().equals(other.getFldBalance()))
            && (this.getFldConsumptionType() == null ? other.getFldConsumptionType() == null : this.getFldConsumptionType().equals(other.getFldConsumptionType()))
            && (this.getFldLon() == null ? other.getFldLon() == null : this.getFldLon().equals(other.getFldLon()))
            && (this.getFldLat() == null ? other.getFldLat() == null : this.getFldLat().equals(other.getFldLat()))
            && (this.getFldCompanyId() == null ? other.getFldCompanyId() == null : this.getFldCompanyId().equals(other.getFldCompanyId()))
            && (this.getFldPunchTime() == null ? other.getFldPunchTime() == null : this.getFldPunchTime().equals(other.getFldPunchTime()))
            && (this.getFldTradeIndex() == null ? other.getFldTradeIndex() == null : this.getFldTradeIndex().equals(other.getFldTradeIndex()))
            && (this.getFldTradeType() == null ? other.getFldTradeType() == null : this.getFldTradeType().equals(other.getFldTradeType()))
            && (this.getFldProtype() == null ? other.getFldProtype() == null : this.getFldProtype().equals(other.getFldProtype()))
            && (this.getFldUnitid() == null ? other.getFldUnitid() == null : this.getFldUnitid().equals(other.getFldUnitid()))
            && (this.getFldBranchid() == null ? other.getFldBranchid() == null : this.getFldBranchid().equals(other.getFldBranchid()))
            && (this.getFldArrayid() == null ? other.getFldArrayid() == null : this.getFldArrayid().equals(other.getFldArrayid()))
            && (this.getFldStationid1() == null ? other.getFldStationid1() == null : this.getFldStationid1().equals(other.getFldStationid1()))
            && (this.getFldStationid2() == null ? other.getFldStationid2() == null : this.getFldStationid2().equals(other.getFldStationid2()))
            && (this.getFldMac() == null ? other.getFldMac() == null : this.getFldMac().equals(other.getFldMac()))
            && (this.getFldTac() == null ? other.getFldTac() == null : this.getFldTac().equals(other.getFldTac()))
            && (this.getFldTradeSque() == null ? other.getFldTradeSque() == null : this.getFldTradeSque().equals(other.getFldTradeSque()))
            && (this.getFldMemo() == null ? other.getFldMemo() == null : this.getFldMemo().equals(other.getFldMemo()))
            && (this.getFldState() == null ? other.getFldState() == null : this.getFldState().equals(other.getFldState()))
            && (this.getFldServerId() == null ? other.getFldServerId() == null : this.getFldServerId().equals(other.getFldServerId()))
            && (this.getFldResultTime() == null ? other.getFldResultTime() == null : this.getFldResultTime().equals(other.getFldResultTime()))
            && (this.getFldUploadTime() == null ? other.getFldUploadTime() == null : this.getFldUploadTime().equals(other.getFldUploadTime()))
            && (this.getFldQrComtent() == null ? other.getFldQrComtent() == null : this.getFldQrComtent().equals(other.getFldQrComtent()))
            && (this.getFldQrComtent2() == null ? other.getFldQrComtent2() == null : this.getFldQrComtent2().equals(other.getFldQrComtent2()))
            && (Arrays.equals(this.getFldMessage(), other.getFldMessage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFldTradeNo() == null) ? 0 : getFldTradeNo().hashCode());
        result = prime * result + ((getFldBusid() == null) ? 0 : getFldBusid().hashCode());
        result = prime * result + ((getFldBusline() == null) ? 0 : getFldBusline().hashCode());
        result = prime * result + ((getFldPosid() == null) ? 0 : getFldPosid().hashCode());
        result = prime * result + ((getFldCityCode() == null) ? 0 : getFldCityCode().hashCode());
        result = prime * result + ((getFldDriverid() == null) ? 0 : getFldDriverid().hashCode());
        result = prime * result + ((getFldTradeTime() == null) ? 0 : getFldTradeTime().hashCode());
        result = prime * result + ((getFldUserNo() == null) ? 0 : getFldUserNo().hashCode());
        result = prime * result + ((getFldPrice() == null) ? 0 : getFldPrice().hashCode());
        result = prime * result + ((getFldAmount() == null) ? 0 : getFldAmount().hashCode());
        result = prime * result + ((getFldBalance() == null) ? 0 : getFldBalance().hashCode());
        result = prime * result + ((getFldConsumptionType() == null) ? 0 : getFldConsumptionType().hashCode());
        result = prime * result + ((getFldLon() == null) ? 0 : getFldLon().hashCode());
        result = prime * result + ((getFldLat() == null) ? 0 : getFldLat().hashCode());
        result = prime * result + ((getFldCompanyId() == null) ? 0 : getFldCompanyId().hashCode());
        result = prime * result + ((getFldPunchTime() == null) ? 0 : getFldPunchTime().hashCode());
        result = prime * result + ((getFldTradeIndex() == null) ? 0 : getFldTradeIndex().hashCode());
        result = prime * result + ((getFldTradeType() == null) ? 0 : getFldTradeType().hashCode());
        result = prime * result + ((getFldProtype() == null) ? 0 : getFldProtype().hashCode());
        result = prime * result + ((getFldUnitid() == null) ? 0 : getFldUnitid().hashCode());
        result = prime * result + ((getFldBranchid() == null) ? 0 : getFldBranchid().hashCode());
        result = prime * result + ((getFldArrayid() == null) ? 0 : getFldArrayid().hashCode());
        result = prime * result + ((getFldStationid1() == null) ? 0 : getFldStationid1().hashCode());
        result = prime * result + ((getFldStationid2() == null) ? 0 : getFldStationid2().hashCode());
        result = prime * result + ((getFldMac() == null) ? 0 : getFldMac().hashCode());
        result = prime * result + ((getFldTac() == null) ? 0 : getFldTac().hashCode());
        result = prime * result + ((getFldTradeSque() == null) ? 0 : getFldTradeSque().hashCode());
        result = prime * result + ((getFldMemo() == null) ? 0 : getFldMemo().hashCode());
        result = prime * result + ((getFldState() == null) ? 0 : getFldState().hashCode());
        result = prime * result + ((getFldServerId() == null) ? 0 : getFldServerId().hashCode());
        result = prime * result + ((getFldResultTime() == null) ? 0 : getFldResultTime().hashCode());
        result = prime * result + ((getFldUploadTime() == null) ? 0 : getFldUploadTime().hashCode());
        result = prime * result + ((getFldQrComtent() == null) ? 0 : getFldQrComtent().hashCode());
        result = prime * result + ((getFldQrComtent2() == null) ? 0 : getFldQrComtent2().hashCode());
        result = prime * result + (Arrays.hashCode(getFldMessage()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fldQrComtent=").append(fldQrComtent);
        sb.append(", fldQrComtent2=").append(fldQrComtent2);
        sb.append(", fldMessage=").append(fldMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
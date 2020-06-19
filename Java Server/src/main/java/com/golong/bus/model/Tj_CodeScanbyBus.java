package com.golong.bus.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Tj_CodeScanbyBus implements Serializable {
    /**
     * 商户订单号
     */
    private String fldTradeNo;

    /**
     * 车辆编号
     */
    private String fldBusid;

    /**
     * 线路编号
     */
    private String fldBusline;

    /**
     * pos编号
     */
    private String fldPosid;

    /**
     * 城市代码
     */
    private String fldCityCode;

    /**
     * 司机编号
     */
    private String fldDriverid;

    /**
     * 刷卡时间
     */
    private Date fldTradeTime;

    /**
     * 卡内号
     */
    private String fldUserNo;

    /**
     * 票价（分）
     */
    private Integer fldPrice;

    /**
     * 交易金额（分）
     */
    private Integer fldAmount;

    /**
     * 交易前实际余额（分）
     */
    private Integer fldBalance;

    /**
     * 消费类型 0-正常；1-换乘
     */
    private Integer fldConsumptionType;

    /**
     * 经度
     */
    private String fldLon;

    /**
     * 维度
     */
    private String fldLat;

    /**
     * 公司id
     */
    private String fldCompanyId;

    /**
     * 司机上班打卡时间
     */
    private Date fldPunchTime;

    /**
     * 消费序列号
     */
    private Integer fldTradeIndex;

    /**
     * 交易类型 0-一票制；1-分段计费
     */
    private Integer fldTradeType;

    /**
     * 行业类型
     */
    private String fldProtype;

    /**
     * 单位编号
     */
    private String fldUnitid;

    /**
     * 分公司编号
     */
    private String fldBranchid;

    /**
     * 路队编号
     */
    private String fldArrayid;

    /**
     * 站点编号(上车/进站)
     */
    private String fldStationid1;

    /**
     * 站点编号(下车/出站)
     */
    private String fldStationid2;

    /**
     * 二维码内MAC
     */
    private String fldMac;

    /**
     * 终端交易TAC
     */
    private String fldTac;

    /**
     * 终端交易流水号
     */
    private String fldTradeSque;

    /**
     * 预留
     */
    private String fldMemo;

    /**
     * 0-待处理
     */
    private Integer fldState;

    /**
     * 服务ID
     */
    private String fldServerId;

    /**
     * 结算返回时间
     */
    private Date fldResultTime;

    /**
     * 入库时间
     */
    private Date fldUploadTime;

    private static final long serialVersionUID = 1L;

    public String getFldTradeNo() {
        return fldTradeNo;
    }

    public void setFldTradeNo(String fldTradeNo) {
        this.fldTradeNo = fldTradeNo;
    }

    public String getFldBusid() {
        return fldBusid;
    }

    public void setFldBusid(String fldBusid) {
        this.fldBusid = fldBusid;
    }

    public String getFldBusline() {
        return fldBusline;
    }

    public void setFldBusline(String fldBusline) {
        this.fldBusline = fldBusline;
    }

    public String getFldPosid() {
        return fldPosid;
    }

    public void setFldPosid(String fldPosid) {
        this.fldPosid = fldPosid;
    }

    public String getFldCityCode() {
        return fldCityCode;
    }

    public void setFldCityCode(String fldCityCode) {
        this.fldCityCode = fldCityCode;
    }

    public String getFldDriverid() {
        return fldDriverid;
    }

    public void setFldDriverid(String fldDriverid) {
        this.fldDriverid = fldDriverid;
    }

    public Date getFldTradeTime() {
        return fldTradeTime;
    }

    public void setFldTradeTime(Date fldTradeTime) {
        this.fldTradeTime = fldTradeTime;
    }

    public String getFldUserNo() {
        return fldUserNo;
    }

    public void setFldUserNo(String fldUserNo) {
        this.fldUserNo = fldUserNo;
    }

    public Integer getFldPrice() {
        return fldPrice;
    }

    public void setFldPrice(Integer fldPrice) {
        this.fldPrice = fldPrice;
    }

    public Integer getFldAmount() {
        return fldAmount;
    }

    public void setFldAmount(Integer fldAmount) {
        this.fldAmount = fldAmount;
    }

    public Integer getFldBalance() {
        return fldBalance;
    }

    public void setFldBalance(Integer fldBalance) {
        this.fldBalance = fldBalance;
    }

    public Integer getFldConsumptionType() {
        return fldConsumptionType;
    }

    public void setFldConsumptionType(Integer fldConsumptionType) {
        this.fldConsumptionType = fldConsumptionType;
    }

    public String getFldLon() {
        return fldLon;
    }

    public void setFldLon(String fldLon) {
        this.fldLon = fldLon;
    }

    public String getFldLat() {
        return fldLat;
    }

    public void setFldLat(String fldLat) {
        this.fldLat = fldLat;
    }

    public String getFldCompanyId() {
        return fldCompanyId;
    }

    public void setFldCompanyId(String fldCompanyId) {
        this.fldCompanyId = fldCompanyId;
    }

    public Date getFldPunchTime() {
        return fldPunchTime;
    }

    public void setFldPunchTime(Date fldPunchTime) {
        this.fldPunchTime = fldPunchTime;
    }

    public Integer getFldTradeIndex() {
        return fldTradeIndex;
    }

    public void setFldTradeIndex(Integer fldTradeIndex) {
        this.fldTradeIndex = fldTradeIndex;
    }

    public Integer getFldTradeType() {
        return fldTradeType;
    }

    public void setFldTradeType(Integer fldTradeType) {
        this.fldTradeType = fldTradeType;
    }

    public String getFldProtype() {
        return fldProtype;
    }

    public void setFldProtype(String fldProtype) {
        this.fldProtype = fldProtype;
    }

    public String getFldUnitid() {
        return fldUnitid;
    }

    public void setFldUnitid(String fldUnitid) {
        this.fldUnitid = fldUnitid;
    }

    public String getFldBranchid() {
        return fldBranchid;
    }

    public void setFldBranchid(String fldBranchid) {
        this.fldBranchid = fldBranchid;
    }

    public String getFldArrayid() {
        return fldArrayid;
    }

    public void setFldArrayid(String fldArrayid) {
        this.fldArrayid = fldArrayid;
    }

    public String getFldStationid1() {
        return fldStationid1;
    }

    public void setFldStationid1(String fldStationid1) {
        this.fldStationid1 = fldStationid1;
    }

    public String getFldStationid2() {
        return fldStationid2;
    }

    public void setFldStationid2(String fldStationid2) {
        this.fldStationid2 = fldStationid2;
    }

    public String getFldMac() {
        return fldMac;
    }

    public void setFldMac(String fldMac) {
        this.fldMac = fldMac;
    }

    public String getFldTac() {
        return fldTac;
    }

    public void setFldTac(String fldTac) {
        this.fldTac = fldTac;
    }

    public String getFldTradeSque() {
        return fldTradeSque;
    }

    public void setFldTradeSque(String fldTradeSque) {
        this.fldTradeSque = fldTradeSque;
    }

    public String getFldMemo() {
        return fldMemo;
    }

    public void setFldMemo(String fldMemo) {
        this.fldMemo = fldMemo;
    }

    public Integer getFldState() {
        return fldState;
    }

    public void setFldState(Integer fldState) {
        this.fldState = fldState;
    }

    public String getFldServerId() {
        return fldServerId;
    }

    public void setFldServerId(String fldServerId) {
        this.fldServerId = fldServerId;
    }

    public Date getFldResultTime() {
        return fldResultTime;
    }

    public void setFldResultTime(Date fldResultTime) {
        this.fldResultTime = fldResultTime;
    }

    public Date getFldUploadTime() {
        return fldUploadTime;
    }

    public void setFldUploadTime(Date fldUploadTime) {
        this.fldUploadTime = fldUploadTime;
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
        Tj_CodeScanbyBus other = (Tj_CodeScanbyBus) that;
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
            && (this.getFldUploadTime() == null ? other.getFldUploadTime() == null : this.getFldUploadTime().equals(other.getFldUploadTime()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fldTradeNo=").append(fldTradeNo);
        sb.append(", fldBusid=").append(fldBusid);
        sb.append(", fldBusline=").append(fldBusline);
        sb.append(", fldPosid=").append(fldPosid);
        sb.append(", fldCityCode=").append(fldCityCode);
        sb.append(", fldDriverid=").append(fldDriverid);
        sb.append(", fldTradeTime=").append(fldTradeTime);
        sb.append(", fldUserNo=").append(fldUserNo);
        sb.append(", fldPrice=").append(fldPrice);
        sb.append(", fldAmount=").append(fldAmount);
        sb.append(", fldBalance=").append(fldBalance);
        sb.append(", fldConsumptionType=").append(fldConsumptionType);
        sb.append(", fldLon=").append(fldLon);
        sb.append(", fldLat=").append(fldLat);
        sb.append(", fldCompanyId=").append(fldCompanyId);
        sb.append(", fldPunchTime=").append(fldPunchTime);
        sb.append(", fldTradeIndex=").append(fldTradeIndex);
        sb.append(", fldTradeType=").append(fldTradeType);
        sb.append(", fldProtype=").append(fldProtype);
        sb.append(", fldUnitid=").append(fldUnitid);
        sb.append(", fldBranchid=").append(fldBranchid);
        sb.append(", fldArrayid=").append(fldArrayid);
        sb.append(", fldStationid1=").append(fldStationid1);
        sb.append(", fldStationid2=").append(fldStationid2);
        sb.append(", fldMac=").append(fldMac);
        sb.append(", fldTac=").append(fldTac);
        sb.append(", fldTradeSque=").append(fldTradeSque);
        sb.append(", fldMemo=").append(fldMemo);
        sb.append(", fldState=").append(fldState);
        sb.append(", fldServerId=").append(fldServerId);
        sb.append(", fldResultTime=").append(fldResultTime);
        sb.append(", fldUploadTime=").append(fldUploadTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
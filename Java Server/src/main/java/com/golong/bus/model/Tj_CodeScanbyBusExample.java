package com.golong.bus.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tj_CodeScanbyBusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public Tj_CodeScanbyBusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFldTradeNoIsNull() {
            addCriterion("FLD_TRADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoIsNotNull() {
            addCriterion("FLD_TRADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoEqualTo(String value) {
            addCriterion("FLD_TRADE_NO =", value, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoNotEqualTo(String value) {
            addCriterion("FLD_TRADE_NO <>", value, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoGreaterThan(String value) {
            addCriterion("FLD_TRADE_NO >", value, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_TRADE_NO >=", value, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoLessThan(String value) {
            addCriterion("FLD_TRADE_NO <", value, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoLessThanOrEqualTo(String value) {
            addCriterion("FLD_TRADE_NO <=", value, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoLike(String value) {
            addCriterion("FLD_TRADE_NO like", value, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoNotLike(String value) {
            addCriterion("FLD_TRADE_NO not like", value, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoIn(List<String> values) {
            addCriterion("FLD_TRADE_NO in", values, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoNotIn(List<String> values) {
            addCriterion("FLD_TRADE_NO not in", values, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoBetween(String value1, String value2) {
            addCriterion("FLD_TRADE_NO between", value1, value2, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldTradeNoNotBetween(String value1, String value2) {
            addCriterion("FLD_TRADE_NO not between", value1, value2, "fldTradeNo");
            return (Criteria) this;
        }

        public Criteria andFldBusidIsNull() {
            addCriterion("FLD_BUSID is null");
            return (Criteria) this;
        }

        public Criteria andFldBusidIsNotNull() {
            addCriterion("FLD_BUSID is not null");
            return (Criteria) this;
        }

        public Criteria andFldBusidEqualTo(String value) {
            addCriterion("FLD_BUSID =", value, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidNotEqualTo(String value) {
            addCriterion("FLD_BUSID <>", value, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidGreaterThan(String value) {
            addCriterion("FLD_BUSID >", value, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_BUSID >=", value, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidLessThan(String value) {
            addCriterion("FLD_BUSID <", value, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidLessThanOrEqualTo(String value) {
            addCriterion("FLD_BUSID <=", value, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidLike(String value) {
            addCriterion("FLD_BUSID like", value, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidNotLike(String value) {
            addCriterion("FLD_BUSID not like", value, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidIn(List<String> values) {
            addCriterion("FLD_BUSID in", values, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidNotIn(List<String> values) {
            addCriterion("FLD_BUSID not in", values, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidBetween(String value1, String value2) {
            addCriterion("FLD_BUSID between", value1, value2, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBusidNotBetween(String value1, String value2) {
            addCriterion("FLD_BUSID not between", value1, value2, "fldBusid");
            return (Criteria) this;
        }

        public Criteria andFldBuslineIsNull() {
            addCriterion("FLD_BUSLINE is null");
            return (Criteria) this;
        }

        public Criteria andFldBuslineIsNotNull() {
            addCriterion("FLD_BUSLINE is not null");
            return (Criteria) this;
        }

        public Criteria andFldBuslineEqualTo(String value) {
            addCriterion("FLD_BUSLINE =", value, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineNotEqualTo(String value) {
            addCriterion("FLD_BUSLINE <>", value, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineGreaterThan(String value) {
            addCriterion("FLD_BUSLINE >", value, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_BUSLINE >=", value, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineLessThan(String value) {
            addCriterion("FLD_BUSLINE <", value, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineLessThanOrEqualTo(String value) {
            addCriterion("FLD_BUSLINE <=", value, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineLike(String value) {
            addCriterion("FLD_BUSLINE like", value, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineNotLike(String value) {
            addCriterion("FLD_BUSLINE not like", value, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineIn(List<String> values) {
            addCriterion("FLD_BUSLINE in", values, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineNotIn(List<String> values) {
            addCriterion("FLD_BUSLINE not in", values, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineBetween(String value1, String value2) {
            addCriterion("FLD_BUSLINE between", value1, value2, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldBuslineNotBetween(String value1, String value2) {
            addCriterion("FLD_BUSLINE not between", value1, value2, "fldBusline");
            return (Criteria) this;
        }

        public Criteria andFldPosidIsNull() {
            addCriterion("FLD_POSID is null");
            return (Criteria) this;
        }

        public Criteria andFldPosidIsNotNull() {
            addCriterion("FLD_POSID is not null");
            return (Criteria) this;
        }

        public Criteria andFldPosidEqualTo(String value) {
            addCriterion("FLD_POSID =", value, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidNotEqualTo(String value) {
            addCriterion("FLD_POSID <>", value, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidGreaterThan(String value) {
            addCriterion("FLD_POSID >", value, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_POSID >=", value, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidLessThan(String value) {
            addCriterion("FLD_POSID <", value, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidLessThanOrEqualTo(String value) {
            addCriterion("FLD_POSID <=", value, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidLike(String value) {
            addCriterion("FLD_POSID like", value, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidNotLike(String value) {
            addCriterion("FLD_POSID not like", value, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidIn(List<String> values) {
            addCriterion("FLD_POSID in", values, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidNotIn(List<String> values) {
            addCriterion("FLD_POSID not in", values, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidBetween(String value1, String value2) {
            addCriterion("FLD_POSID between", value1, value2, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldPosidNotBetween(String value1, String value2) {
            addCriterion("FLD_POSID not between", value1, value2, "fldPosid");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeIsNull() {
            addCriterion("FLD_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeIsNotNull() {
            addCriterion("FLD_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeEqualTo(String value) {
            addCriterion("FLD_CITY_CODE =", value, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeNotEqualTo(String value) {
            addCriterion("FLD_CITY_CODE <>", value, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeGreaterThan(String value) {
            addCriterion("FLD_CITY_CODE >", value, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_CITY_CODE >=", value, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeLessThan(String value) {
            addCriterion("FLD_CITY_CODE <", value, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeLessThanOrEqualTo(String value) {
            addCriterion("FLD_CITY_CODE <=", value, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeLike(String value) {
            addCriterion("FLD_CITY_CODE like", value, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeNotLike(String value) {
            addCriterion("FLD_CITY_CODE not like", value, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeIn(List<String> values) {
            addCriterion("FLD_CITY_CODE in", values, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeNotIn(List<String> values) {
            addCriterion("FLD_CITY_CODE not in", values, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeBetween(String value1, String value2) {
            addCriterion("FLD_CITY_CODE between", value1, value2, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldCityCodeNotBetween(String value1, String value2) {
            addCriterion("FLD_CITY_CODE not between", value1, value2, "fldCityCode");
            return (Criteria) this;
        }

        public Criteria andFldDriveridIsNull() {
            addCriterion("FLD_DRIVERID is null");
            return (Criteria) this;
        }

        public Criteria andFldDriveridIsNotNull() {
            addCriterion("FLD_DRIVERID is not null");
            return (Criteria) this;
        }

        public Criteria andFldDriveridEqualTo(String value) {
            addCriterion("FLD_DRIVERID =", value, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridNotEqualTo(String value) {
            addCriterion("FLD_DRIVERID <>", value, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridGreaterThan(String value) {
            addCriterion("FLD_DRIVERID >", value, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_DRIVERID >=", value, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridLessThan(String value) {
            addCriterion("FLD_DRIVERID <", value, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridLessThanOrEqualTo(String value) {
            addCriterion("FLD_DRIVERID <=", value, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridLike(String value) {
            addCriterion("FLD_DRIVERID like", value, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridNotLike(String value) {
            addCriterion("FLD_DRIVERID not like", value, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridIn(List<String> values) {
            addCriterion("FLD_DRIVERID in", values, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridNotIn(List<String> values) {
            addCriterion("FLD_DRIVERID not in", values, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridBetween(String value1, String value2) {
            addCriterion("FLD_DRIVERID between", value1, value2, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldDriveridNotBetween(String value1, String value2) {
            addCriterion("FLD_DRIVERID not between", value1, value2, "fldDriverid");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeIsNull() {
            addCriterion("FLD_TRADE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeIsNotNull() {
            addCriterion("FLD_TRADE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeEqualTo(Date value) {
            addCriterion("FLD_TRADE_TIME =", value, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeNotEqualTo(Date value) {
            addCriterion("FLD_TRADE_TIME <>", value, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeGreaterThan(Date value) {
            addCriterion("FLD_TRADE_TIME >", value, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FLD_TRADE_TIME >=", value, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeLessThan(Date value) {
            addCriterion("FLD_TRADE_TIME <", value, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("FLD_TRADE_TIME <=", value, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeIn(List<Date> values) {
            addCriterion("FLD_TRADE_TIME in", values, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeNotIn(List<Date> values) {
            addCriterion("FLD_TRADE_TIME not in", values, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeBetween(Date value1, Date value2) {
            addCriterion("FLD_TRADE_TIME between", value1, value2, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("FLD_TRADE_TIME not between", value1, value2, "fldTradeTime");
            return (Criteria) this;
        }

        public Criteria andFldUserNoIsNull() {
            addCriterion("FLD_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andFldUserNoIsNotNull() {
            addCriterion("FLD_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFldUserNoEqualTo(String value) {
            addCriterion("FLD_USER_NO =", value, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoNotEqualTo(String value) {
            addCriterion("FLD_USER_NO <>", value, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoGreaterThan(String value) {
            addCriterion("FLD_USER_NO >", value, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_USER_NO >=", value, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoLessThan(String value) {
            addCriterion("FLD_USER_NO <", value, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoLessThanOrEqualTo(String value) {
            addCriterion("FLD_USER_NO <=", value, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoLike(String value) {
            addCriterion("FLD_USER_NO like", value, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoNotLike(String value) {
            addCriterion("FLD_USER_NO not like", value, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoIn(List<String> values) {
            addCriterion("FLD_USER_NO in", values, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoNotIn(List<String> values) {
            addCriterion("FLD_USER_NO not in", values, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoBetween(String value1, String value2) {
            addCriterion("FLD_USER_NO between", value1, value2, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldUserNoNotBetween(String value1, String value2) {
            addCriterion("FLD_USER_NO not between", value1, value2, "fldUserNo");
            return (Criteria) this;
        }

        public Criteria andFldPriceIsNull() {
            addCriterion("FLD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andFldPriceIsNotNull() {
            addCriterion("FLD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFldPriceEqualTo(Integer value) {
            addCriterion("FLD_PRICE =", value, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceNotEqualTo(Integer value) {
            addCriterion("FLD_PRICE <>", value, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceGreaterThan(Integer value) {
            addCriterion("FLD_PRICE >", value, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLD_PRICE >=", value, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceLessThan(Integer value) {
            addCriterion("FLD_PRICE <", value, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceLessThanOrEqualTo(Integer value) {
            addCriterion("FLD_PRICE <=", value, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceIn(List<Integer> values) {
            addCriterion("FLD_PRICE in", values, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceNotIn(List<Integer> values) {
            addCriterion("FLD_PRICE not in", values, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceBetween(Integer value1, Integer value2) {
            addCriterion("FLD_PRICE between", value1, value2, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("FLD_PRICE not between", value1, value2, "fldPrice");
            return (Criteria) this;
        }

        public Criteria andFldAmountIsNull() {
            addCriterion("FLD_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFldAmountIsNotNull() {
            addCriterion("FLD_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFldAmountEqualTo(Integer value) {
            addCriterion("FLD_AMOUNT =", value, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountNotEqualTo(Integer value) {
            addCriterion("FLD_AMOUNT <>", value, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountGreaterThan(Integer value) {
            addCriterion("FLD_AMOUNT >", value, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLD_AMOUNT >=", value, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountLessThan(Integer value) {
            addCriterion("FLD_AMOUNT <", value, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountLessThanOrEqualTo(Integer value) {
            addCriterion("FLD_AMOUNT <=", value, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountIn(List<Integer> values) {
            addCriterion("FLD_AMOUNT in", values, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountNotIn(List<Integer> values) {
            addCriterion("FLD_AMOUNT not in", values, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountBetween(Integer value1, Integer value2) {
            addCriterion("FLD_AMOUNT between", value1, value2, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("FLD_AMOUNT not between", value1, value2, "fldAmount");
            return (Criteria) this;
        }

        public Criteria andFldBalanceIsNull() {
            addCriterion("FLD_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andFldBalanceIsNotNull() {
            addCriterion("FLD_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andFldBalanceEqualTo(Integer value) {
            addCriterion("FLD_BALANCE =", value, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceNotEqualTo(Integer value) {
            addCriterion("FLD_BALANCE <>", value, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceGreaterThan(Integer value) {
            addCriterion("FLD_BALANCE >", value, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLD_BALANCE >=", value, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceLessThan(Integer value) {
            addCriterion("FLD_BALANCE <", value, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("FLD_BALANCE <=", value, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceIn(List<Integer> values) {
            addCriterion("FLD_BALANCE in", values, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceNotIn(List<Integer> values) {
            addCriterion("FLD_BALANCE not in", values, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceBetween(Integer value1, Integer value2) {
            addCriterion("FLD_BALANCE between", value1, value2, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("FLD_BALANCE not between", value1, value2, "fldBalance");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeIsNull() {
            addCriterion("FLD_CONSUMPTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeIsNotNull() {
            addCriterion("FLD_CONSUMPTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeEqualTo(Integer value) {
            addCriterion("FLD_CONSUMPTION_TYPE =", value, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeNotEqualTo(Integer value) {
            addCriterion("FLD_CONSUMPTION_TYPE <>", value, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeGreaterThan(Integer value) {
            addCriterion("FLD_CONSUMPTION_TYPE >", value, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLD_CONSUMPTION_TYPE >=", value, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeLessThan(Integer value) {
            addCriterion("FLD_CONSUMPTION_TYPE <", value, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("FLD_CONSUMPTION_TYPE <=", value, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeIn(List<Integer> values) {
            addCriterion("FLD_CONSUMPTION_TYPE in", values, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeNotIn(List<Integer> values) {
            addCriterion("FLD_CONSUMPTION_TYPE not in", values, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeBetween(Integer value1, Integer value2) {
            addCriterion("FLD_CONSUMPTION_TYPE between", value1, value2, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldConsumptionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FLD_CONSUMPTION_TYPE not between", value1, value2, "fldConsumptionType");
            return (Criteria) this;
        }

        public Criteria andFldLonIsNull() {
            addCriterion("FLD_LON is null");
            return (Criteria) this;
        }

        public Criteria andFldLonIsNotNull() {
            addCriterion("FLD_LON is not null");
            return (Criteria) this;
        }

        public Criteria andFldLonEqualTo(String value) {
            addCriterion("FLD_LON =", value, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonNotEqualTo(String value) {
            addCriterion("FLD_LON <>", value, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonGreaterThan(String value) {
            addCriterion("FLD_LON >", value, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_LON >=", value, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonLessThan(String value) {
            addCriterion("FLD_LON <", value, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonLessThanOrEqualTo(String value) {
            addCriterion("FLD_LON <=", value, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonLike(String value) {
            addCriterion("FLD_LON like", value, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonNotLike(String value) {
            addCriterion("FLD_LON not like", value, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonIn(List<String> values) {
            addCriterion("FLD_LON in", values, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonNotIn(List<String> values) {
            addCriterion("FLD_LON not in", values, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonBetween(String value1, String value2) {
            addCriterion("FLD_LON between", value1, value2, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLonNotBetween(String value1, String value2) {
            addCriterion("FLD_LON not between", value1, value2, "fldLon");
            return (Criteria) this;
        }

        public Criteria andFldLatIsNull() {
            addCriterion("FLD_LAT is null");
            return (Criteria) this;
        }

        public Criteria andFldLatIsNotNull() {
            addCriterion("FLD_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andFldLatEqualTo(String value) {
            addCriterion("FLD_LAT =", value, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatNotEqualTo(String value) {
            addCriterion("FLD_LAT <>", value, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatGreaterThan(String value) {
            addCriterion("FLD_LAT >", value, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_LAT >=", value, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatLessThan(String value) {
            addCriterion("FLD_LAT <", value, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatLessThanOrEqualTo(String value) {
            addCriterion("FLD_LAT <=", value, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatLike(String value) {
            addCriterion("FLD_LAT like", value, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatNotLike(String value) {
            addCriterion("FLD_LAT not like", value, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatIn(List<String> values) {
            addCriterion("FLD_LAT in", values, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatNotIn(List<String> values) {
            addCriterion("FLD_LAT not in", values, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatBetween(String value1, String value2) {
            addCriterion("FLD_LAT between", value1, value2, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldLatNotBetween(String value1, String value2) {
            addCriterion("FLD_LAT not between", value1, value2, "fldLat");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdIsNull() {
            addCriterion("FLD_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdIsNotNull() {
            addCriterion("FLD_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdEqualTo(String value) {
            addCriterion("FLD_COMPANY_ID =", value, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdNotEqualTo(String value) {
            addCriterion("FLD_COMPANY_ID <>", value, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdGreaterThan(String value) {
            addCriterion("FLD_COMPANY_ID >", value, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_COMPANY_ID >=", value, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdLessThan(String value) {
            addCriterion("FLD_COMPANY_ID <", value, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("FLD_COMPANY_ID <=", value, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdLike(String value) {
            addCriterion("FLD_COMPANY_ID like", value, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdNotLike(String value) {
            addCriterion("FLD_COMPANY_ID not like", value, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdIn(List<String> values) {
            addCriterion("FLD_COMPANY_ID in", values, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdNotIn(List<String> values) {
            addCriterion("FLD_COMPANY_ID not in", values, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdBetween(String value1, String value2) {
            addCriterion("FLD_COMPANY_ID between", value1, value2, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldCompanyIdNotBetween(String value1, String value2) {
            addCriterion("FLD_COMPANY_ID not between", value1, value2, "fldCompanyId");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeIsNull() {
            addCriterion("FLD_PUNCH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeIsNotNull() {
            addCriterion("FLD_PUNCH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeEqualTo(Date value) {
            addCriterion("FLD_PUNCH_TIME =", value, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeNotEqualTo(Date value) {
            addCriterion("FLD_PUNCH_TIME <>", value, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeGreaterThan(Date value) {
            addCriterion("FLD_PUNCH_TIME >", value, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FLD_PUNCH_TIME >=", value, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeLessThan(Date value) {
            addCriterion("FLD_PUNCH_TIME <", value, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeLessThanOrEqualTo(Date value) {
            addCriterion("FLD_PUNCH_TIME <=", value, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeIn(List<Date> values) {
            addCriterion("FLD_PUNCH_TIME in", values, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeNotIn(List<Date> values) {
            addCriterion("FLD_PUNCH_TIME not in", values, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeBetween(Date value1, Date value2) {
            addCriterion("FLD_PUNCH_TIME between", value1, value2, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldPunchTimeNotBetween(Date value1, Date value2) {
            addCriterion("FLD_PUNCH_TIME not between", value1, value2, "fldPunchTime");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexIsNull() {
            addCriterion("FLD_TRADE_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexIsNotNull() {
            addCriterion("FLD_TRADE_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexEqualTo(Integer value) {
            addCriterion("FLD_TRADE_INDEX =", value, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexNotEqualTo(Integer value) {
            addCriterion("FLD_TRADE_INDEX <>", value, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexGreaterThan(Integer value) {
            addCriterion("FLD_TRADE_INDEX >", value, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLD_TRADE_INDEX >=", value, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexLessThan(Integer value) {
            addCriterion("FLD_TRADE_INDEX <", value, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexLessThanOrEqualTo(Integer value) {
            addCriterion("FLD_TRADE_INDEX <=", value, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexIn(List<Integer> values) {
            addCriterion("FLD_TRADE_INDEX in", values, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexNotIn(List<Integer> values) {
            addCriterion("FLD_TRADE_INDEX not in", values, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexBetween(Integer value1, Integer value2) {
            addCriterion("FLD_TRADE_INDEX between", value1, value2, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("FLD_TRADE_INDEX not between", value1, value2, "fldTradeIndex");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeIsNull() {
            addCriterion("FLD_TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeIsNotNull() {
            addCriterion("FLD_TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeEqualTo(Integer value) {
            addCriterion("FLD_TRADE_TYPE =", value, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeNotEqualTo(Integer value) {
            addCriterion("FLD_TRADE_TYPE <>", value, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeGreaterThan(Integer value) {
            addCriterion("FLD_TRADE_TYPE >", value, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLD_TRADE_TYPE >=", value, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeLessThan(Integer value) {
            addCriterion("FLD_TRADE_TYPE <", value, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("FLD_TRADE_TYPE <=", value, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeIn(List<Integer> values) {
            addCriterion("FLD_TRADE_TYPE in", values, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeNotIn(List<Integer> values) {
            addCriterion("FLD_TRADE_TYPE not in", values, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("FLD_TRADE_TYPE between", value1, value2, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldTradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FLD_TRADE_TYPE not between", value1, value2, "fldTradeType");
            return (Criteria) this;
        }

        public Criteria andFldProtypeIsNull() {
            addCriterion("FLD_PROTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFldProtypeIsNotNull() {
            addCriterion("FLD_PROTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFldProtypeEqualTo(String value) {
            addCriterion("FLD_PROTYPE =", value, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeNotEqualTo(String value) {
            addCriterion("FLD_PROTYPE <>", value, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeGreaterThan(String value) {
            addCriterion("FLD_PROTYPE >", value, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_PROTYPE >=", value, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeLessThan(String value) {
            addCriterion("FLD_PROTYPE <", value, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeLessThanOrEqualTo(String value) {
            addCriterion("FLD_PROTYPE <=", value, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeLike(String value) {
            addCriterion("FLD_PROTYPE like", value, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeNotLike(String value) {
            addCriterion("FLD_PROTYPE not like", value, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeIn(List<String> values) {
            addCriterion("FLD_PROTYPE in", values, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeNotIn(List<String> values) {
            addCriterion("FLD_PROTYPE not in", values, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeBetween(String value1, String value2) {
            addCriterion("FLD_PROTYPE between", value1, value2, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldProtypeNotBetween(String value1, String value2) {
            addCriterion("FLD_PROTYPE not between", value1, value2, "fldProtype");
            return (Criteria) this;
        }

        public Criteria andFldUnitidIsNull() {
            addCriterion("FLD_UNITID is null");
            return (Criteria) this;
        }

        public Criteria andFldUnitidIsNotNull() {
            addCriterion("FLD_UNITID is not null");
            return (Criteria) this;
        }

        public Criteria andFldUnitidEqualTo(String value) {
            addCriterion("FLD_UNITID =", value, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidNotEqualTo(String value) {
            addCriterion("FLD_UNITID <>", value, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidGreaterThan(String value) {
            addCriterion("FLD_UNITID >", value, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_UNITID >=", value, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidLessThan(String value) {
            addCriterion("FLD_UNITID <", value, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidLessThanOrEqualTo(String value) {
            addCriterion("FLD_UNITID <=", value, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidLike(String value) {
            addCriterion("FLD_UNITID like", value, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidNotLike(String value) {
            addCriterion("FLD_UNITID not like", value, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidIn(List<String> values) {
            addCriterion("FLD_UNITID in", values, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidNotIn(List<String> values) {
            addCriterion("FLD_UNITID not in", values, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidBetween(String value1, String value2) {
            addCriterion("FLD_UNITID between", value1, value2, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldUnitidNotBetween(String value1, String value2) {
            addCriterion("FLD_UNITID not between", value1, value2, "fldUnitid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidIsNull() {
            addCriterion("FLD_BRANCHID is null");
            return (Criteria) this;
        }

        public Criteria andFldBranchidIsNotNull() {
            addCriterion("FLD_BRANCHID is not null");
            return (Criteria) this;
        }

        public Criteria andFldBranchidEqualTo(String value) {
            addCriterion("FLD_BRANCHID =", value, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidNotEqualTo(String value) {
            addCriterion("FLD_BRANCHID <>", value, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidGreaterThan(String value) {
            addCriterion("FLD_BRANCHID >", value, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_BRANCHID >=", value, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidLessThan(String value) {
            addCriterion("FLD_BRANCHID <", value, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidLessThanOrEqualTo(String value) {
            addCriterion("FLD_BRANCHID <=", value, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidLike(String value) {
            addCriterion("FLD_BRANCHID like", value, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidNotLike(String value) {
            addCriterion("FLD_BRANCHID not like", value, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidIn(List<String> values) {
            addCriterion("FLD_BRANCHID in", values, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidNotIn(List<String> values) {
            addCriterion("FLD_BRANCHID not in", values, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidBetween(String value1, String value2) {
            addCriterion("FLD_BRANCHID between", value1, value2, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldBranchidNotBetween(String value1, String value2) {
            addCriterion("FLD_BRANCHID not between", value1, value2, "fldBranchid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidIsNull() {
            addCriterion("FLD_ARRAYID is null");
            return (Criteria) this;
        }

        public Criteria andFldArrayidIsNotNull() {
            addCriterion("FLD_ARRAYID is not null");
            return (Criteria) this;
        }

        public Criteria andFldArrayidEqualTo(String value) {
            addCriterion("FLD_ARRAYID =", value, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidNotEqualTo(String value) {
            addCriterion("FLD_ARRAYID <>", value, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidGreaterThan(String value) {
            addCriterion("FLD_ARRAYID >", value, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_ARRAYID >=", value, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidLessThan(String value) {
            addCriterion("FLD_ARRAYID <", value, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidLessThanOrEqualTo(String value) {
            addCriterion("FLD_ARRAYID <=", value, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidLike(String value) {
            addCriterion("FLD_ARRAYID like", value, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidNotLike(String value) {
            addCriterion("FLD_ARRAYID not like", value, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidIn(List<String> values) {
            addCriterion("FLD_ARRAYID in", values, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidNotIn(List<String> values) {
            addCriterion("FLD_ARRAYID not in", values, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidBetween(String value1, String value2) {
            addCriterion("FLD_ARRAYID between", value1, value2, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldArrayidNotBetween(String value1, String value2) {
            addCriterion("FLD_ARRAYID not between", value1, value2, "fldArrayid");
            return (Criteria) this;
        }

        public Criteria andFldStationid1IsNull() {
            addCriterion("FLD_STATIONID1 is null");
            return (Criteria) this;
        }

        public Criteria andFldStationid1IsNotNull() {
            addCriterion("FLD_STATIONID1 is not null");
            return (Criteria) this;
        }

        public Criteria andFldStationid1EqualTo(String value) {
            addCriterion("FLD_STATIONID1 =", value, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1NotEqualTo(String value) {
            addCriterion("FLD_STATIONID1 <>", value, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1GreaterThan(String value) {
            addCriterion("FLD_STATIONID1 >", value, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1GreaterThanOrEqualTo(String value) {
            addCriterion("FLD_STATIONID1 >=", value, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1LessThan(String value) {
            addCriterion("FLD_STATIONID1 <", value, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1LessThanOrEqualTo(String value) {
            addCriterion("FLD_STATIONID1 <=", value, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1Like(String value) {
            addCriterion("FLD_STATIONID1 like", value, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1NotLike(String value) {
            addCriterion("FLD_STATIONID1 not like", value, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1In(List<String> values) {
            addCriterion("FLD_STATIONID1 in", values, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1NotIn(List<String> values) {
            addCriterion("FLD_STATIONID1 not in", values, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1Between(String value1, String value2) {
            addCriterion("FLD_STATIONID1 between", value1, value2, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid1NotBetween(String value1, String value2) {
            addCriterion("FLD_STATIONID1 not between", value1, value2, "fldStationid1");
            return (Criteria) this;
        }

        public Criteria andFldStationid2IsNull() {
            addCriterion("FLD_STATIONID2 is null");
            return (Criteria) this;
        }

        public Criteria andFldStationid2IsNotNull() {
            addCriterion("FLD_STATIONID2 is not null");
            return (Criteria) this;
        }

        public Criteria andFldStationid2EqualTo(String value) {
            addCriterion("FLD_STATIONID2 =", value, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2NotEqualTo(String value) {
            addCriterion("FLD_STATIONID2 <>", value, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2GreaterThan(String value) {
            addCriterion("FLD_STATIONID2 >", value, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2GreaterThanOrEqualTo(String value) {
            addCriterion("FLD_STATIONID2 >=", value, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2LessThan(String value) {
            addCriterion("FLD_STATIONID2 <", value, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2LessThanOrEqualTo(String value) {
            addCriterion("FLD_STATIONID2 <=", value, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2Like(String value) {
            addCriterion("FLD_STATIONID2 like", value, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2NotLike(String value) {
            addCriterion("FLD_STATIONID2 not like", value, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2In(List<String> values) {
            addCriterion("FLD_STATIONID2 in", values, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2NotIn(List<String> values) {
            addCriterion("FLD_STATIONID2 not in", values, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2Between(String value1, String value2) {
            addCriterion("FLD_STATIONID2 between", value1, value2, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldStationid2NotBetween(String value1, String value2) {
            addCriterion("FLD_STATIONID2 not between", value1, value2, "fldStationid2");
            return (Criteria) this;
        }

        public Criteria andFldMacIsNull() {
            addCriterion("FLD_MAC is null");
            return (Criteria) this;
        }

        public Criteria andFldMacIsNotNull() {
            addCriterion("FLD_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andFldMacEqualTo(String value) {
            addCriterion("FLD_MAC =", value, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacNotEqualTo(String value) {
            addCriterion("FLD_MAC <>", value, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacGreaterThan(String value) {
            addCriterion("FLD_MAC >", value, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_MAC >=", value, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacLessThan(String value) {
            addCriterion("FLD_MAC <", value, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacLessThanOrEqualTo(String value) {
            addCriterion("FLD_MAC <=", value, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacLike(String value) {
            addCriterion("FLD_MAC like", value, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacNotLike(String value) {
            addCriterion("FLD_MAC not like", value, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacIn(List<String> values) {
            addCriterion("FLD_MAC in", values, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacNotIn(List<String> values) {
            addCriterion("FLD_MAC not in", values, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacBetween(String value1, String value2) {
            addCriterion("FLD_MAC between", value1, value2, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldMacNotBetween(String value1, String value2) {
            addCriterion("FLD_MAC not between", value1, value2, "fldMac");
            return (Criteria) this;
        }

        public Criteria andFldTacIsNull() {
            addCriterion("FLD_TAC is null");
            return (Criteria) this;
        }

        public Criteria andFldTacIsNotNull() {
            addCriterion("FLD_TAC is not null");
            return (Criteria) this;
        }

        public Criteria andFldTacEqualTo(String value) {
            addCriterion("FLD_TAC =", value, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacNotEqualTo(String value) {
            addCriterion("FLD_TAC <>", value, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacGreaterThan(String value) {
            addCriterion("FLD_TAC >", value, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_TAC >=", value, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacLessThan(String value) {
            addCriterion("FLD_TAC <", value, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacLessThanOrEqualTo(String value) {
            addCriterion("FLD_TAC <=", value, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacLike(String value) {
            addCriterion("FLD_TAC like", value, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacNotLike(String value) {
            addCriterion("FLD_TAC not like", value, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacIn(List<String> values) {
            addCriterion("FLD_TAC in", values, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacNotIn(List<String> values) {
            addCriterion("FLD_TAC not in", values, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacBetween(String value1, String value2) {
            addCriterion("FLD_TAC between", value1, value2, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTacNotBetween(String value1, String value2) {
            addCriterion("FLD_TAC not between", value1, value2, "fldTac");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueIsNull() {
            addCriterion("FLD_TRADE_SQUE is null");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueIsNotNull() {
            addCriterion("FLD_TRADE_SQUE is not null");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueEqualTo(String value) {
            addCriterion("FLD_TRADE_SQUE =", value, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueNotEqualTo(String value) {
            addCriterion("FLD_TRADE_SQUE <>", value, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueGreaterThan(String value) {
            addCriterion("FLD_TRADE_SQUE >", value, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_TRADE_SQUE >=", value, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueLessThan(String value) {
            addCriterion("FLD_TRADE_SQUE <", value, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueLessThanOrEqualTo(String value) {
            addCriterion("FLD_TRADE_SQUE <=", value, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueLike(String value) {
            addCriterion("FLD_TRADE_SQUE like", value, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueNotLike(String value) {
            addCriterion("FLD_TRADE_SQUE not like", value, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueIn(List<String> values) {
            addCriterion("FLD_TRADE_SQUE in", values, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueNotIn(List<String> values) {
            addCriterion("FLD_TRADE_SQUE not in", values, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueBetween(String value1, String value2) {
            addCriterion("FLD_TRADE_SQUE between", value1, value2, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldTradeSqueNotBetween(String value1, String value2) {
            addCriterion("FLD_TRADE_SQUE not between", value1, value2, "fldTradeSque");
            return (Criteria) this;
        }

        public Criteria andFldMemoIsNull() {
            addCriterion("FLD_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andFldMemoIsNotNull() {
            addCriterion("FLD_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andFldMemoEqualTo(String value) {
            addCriterion("FLD_MEMO =", value, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoNotEqualTo(String value) {
            addCriterion("FLD_MEMO <>", value, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoGreaterThan(String value) {
            addCriterion("FLD_MEMO >", value, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_MEMO >=", value, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoLessThan(String value) {
            addCriterion("FLD_MEMO <", value, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoLessThanOrEqualTo(String value) {
            addCriterion("FLD_MEMO <=", value, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoLike(String value) {
            addCriterion("FLD_MEMO like", value, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoNotLike(String value) {
            addCriterion("FLD_MEMO not like", value, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoIn(List<String> values) {
            addCriterion("FLD_MEMO in", values, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoNotIn(List<String> values) {
            addCriterion("FLD_MEMO not in", values, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoBetween(String value1, String value2) {
            addCriterion("FLD_MEMO between", value1, value2, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldMemoNotBetween(String value1, String value2) {
            addCriterion("FLD_MEMO not between", value1, value2, "fldMemo");
            return (Criteria) this;
        }

        public Criteria andFldStateIsNull() {
            addCriterion("FLD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andFldStateIsNotNull() {
            addCriterion("FLD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andFldStateEqualTo(Integer value) {
            addCriterion("FLD_STATE =", value, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateNotEqualTo(Integer value) {
            addCriterion("FLD_STATE <>", value, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateGreaterThan(Integer value) {
            addCriterion("FLD_STATE >", value, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLD_STATE >=", value, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateLessThan(Integer value) {
            addCriterion("FLD_STATE <", value, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateLessThanOrEqualTo(Integer value) {
            addCriterion("FLD_STATE <=", value, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateIn(List<Integer> values) {
            addCriterion("FLD_STATE in", values, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateNotIn(List<Integer> values) {
            addCriterion("FLD_STATE not in", values, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateBetween(Integer value1, Integer value2) {
            addCriterion("FLD_STATE between", value1, value2, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldStateNotBetween(Integer value1, Integer value2) {
            addCriterion("FLD_STATE not between", value1, value2, "fldState");
            return (Criteria) this;
        }

        public Criteria andFldServerIdIsNull() {
            addCriterion("FLD_SERVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFldServerIdIsNotNull() {
            addCriterion("FLD_SERVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFldServerIdEqualTo(String value) {
            addCriterion("FLD_SERVER_ID =", value, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdNotEqualTo(String value) {
            addCriterion("FLD_SERVER_ID <>", value, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdGreaterThan(String value) {
            addCriterion("FLD_SERVER_ID >", value, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdGreaterThanOrEqualTo(String value) {
            addCriterion("FLD_SERVER_ID >=", value, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdLessThan(String value) {
            addCriterion("FLD_SERVER_ID <", value, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdLessThanOrEqualTo(String value) {
            addCriterion("FLD_SERVER_ID <=", value, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdLike(String value) {
            addCriterion("FLD_SERVER_ID like", value, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdNotLike(String value) {
            addCriterion("FLD_SERVER_ID not like", value, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdIn(List<String> values) {
            addCriterion("FLD_SERVER_ID in", values, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdNotIn(List<String> values) {
            addCriterion("FLD_SERVER_ID not in", values, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdBetween(String value1, String value2) {
            addCriterion("FLD_SERVER_ID between", value1, value2, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldServerIdNotBetween(String value1, String value2) {
            addCriterion("FLD_SERVER_ID not between", value1, value2, "fldServerId");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeIsNull() {
            addCriterion("FLD_RESULT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeIsNotNull() {
            addCriterion("FLD_RESULT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeEqualTo(Date value) {
            addCriterion("FLD_RESULT_TIME =", value, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeNotEqualTo(Date value) {
            addCriterion("FLD_RESULT_TIME <>", value, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeGreaterThan(Date value) {
            addCriterion("FLD_RESULT_TIME >", value, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FLD_RESULT_TIME >=", value, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeLessThan(Date value) {
            addCriterion("FLD_RESULT_TIME <", value, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeLessThanOrEqualTo(Date value) {
            addCriterion("FLD_RESULT_TIME <=", value, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeIn(List<Date> values) {
            addCriterion("FLD_RESULT_TIME in", values, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeNotIn(List<Date> values) {
            addCriterion("FLD_RESULT_TIME not in", values, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeBetween(Date value1, Date value2) {
            addCriterion("FLD_RESULT_TIME between", value1, value2, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldResultTimeNotBetween(Date value1, Date value2) {
            addCriterion("FLD_RESULT_TIME not between", value1, value2, "fldResultTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeIsNull() {
            addCriterion("FLD_UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeIsNotNull() {
            addCriterion("FLD_UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeEqualTo(Date value) {
            addCriterion("FLD_UPLOAD_TIME =", value, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeNotEqualTo(Date value) {
            addCriterion("FLD_UPLOAD_TIME <>", value, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeGreaterThan(Date value) {
            addCriterion("FLD_UPLOAD_TIME >", value, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FLD_UPLOAD_TIME >=", value, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeLessThan(Date value) {
            addCriterion("FLD_UPLOAD_TIME <", value, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("FLD_UPLOAD_TIME <=", value, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeIn(List<Date> values) {
            addCriterion("FLD_UPLOAD_TIME in", values, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeNotIn(List<Date> values) {
            addCriterion("FLD_UPLOAD_TIME not in", values, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeBetween(Date value1, Date value2) {
            addCriterion("FLD_UPLOAD_TIME between", value1, value2, "fldUploadTime");
            return (Criteria) this;
        }

        public Criteria andFldUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("FLD_UPLOAD_TIME not between", value1, value2, "fldUploadTime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
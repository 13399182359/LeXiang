package com.LeXiang.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("createdDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("createdDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("createdDate =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("createdDate <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("createdDate >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdDate >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("createdDate <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("createdDate <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("createdDate in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("createdDate not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("createdDate between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("createdDate not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNull() {
            addCriterion("lastModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNotNull() {
            addCriterion("lastModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateEqualTo(Date value) {
            addCriterion("lastModifiedDate =", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotEqualTo(Date value) {
            addCriterion("lastModifiedDate <>", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThan(Date value) {
            addCriterion("lastModifiedDate >", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastModifiedDate >=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThan(Date value) {
            addCriterion("lastModifiedDate <", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThanOrEqualTo(Date value) {
            addCriterion("lastModifiedDate <=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIn(List<Date> values) {
            addCriterion("lastModifiedDate in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotIn(List<Date> values) {
            addCriterion("lastModifiedDate not in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateBetween(Date value1, Date value2) {
            addCriterion("lastModifiedDate between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotBetween(Date value1, Date value2) {
            addCriterion("lastModifiedDate not between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountpaidIsNull() {
            addCriterion("amountPaid is null");
            return (Criteria) this;
        }

        public Criteria andAmountpaidIsNotNull() {
            addCriterion("amountPaid is not null");
            return (Criteria) this;
        }

        public Criteria andAmountpaidEqualTo(BigDecimal value) {
            addCriterion("amountPaid =", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotEqualTo(BigDecimal value) {
            addCriterion("amountPaid <>", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidGreaterThan(BigDecimal value) {
            addCriterion("amountPaid >", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amountPaid >=", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidLessThan(BigDecimal value) {
            addCriterion("amountPaid <", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amountPaid <=", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidIn(List<BigDecimal> values) {
            addCriterion("amountPaid in", values, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotIn(List<BigDecimal> values) {
            addCriterion("amountPaid not in", values, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amountPaid between", value1, value2, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amountPaid not between", value1, value2, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andCompletedateIsNull() {
            addCriterion("completeDate is null");
            return (Criteria) this;
        }

        public Criteria andCompletedateIsNotNull() {
            addCriterion("completeDate is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedateEqualTo(Date value) {
            addCriterion("completeDate =", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotEqualTo(Date value) {
            addCriterion("completeDate <>", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateGreaterThan(Date value) {
            addCriterion("completeDate >", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateGreaterThanOrEqualTo(Date value) {
            addCriterion("completeDate >=", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateLessThan(Date value) {
            addCriterion("completeDate <", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateLessThanOrEqualTo(Date value) {
            addCriterion("completeDate <=", value, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateIn(List<Date> values) {
            addCriterion("completeDate in", values, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotIn(List<Date> values) {
            addCriterion("completeDate not in", values, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateBetween(Date value1, Date value2) {
            addCriterion("completeDate between", value1, value2, "completedate");
            return (Criteria) this;
        }

        public Criteria andCompletedateNotBetween(Date value1, Date value2) {
            addCriterion("completeDate not between", value1, value2, "completedate");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountIsNull() {
            addCriterion("couponDiscount is null");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountIsNotNull() {
            addCriterion("couponDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountEqualTo(BigDecimal value) {
            addCriterion("couponDiscount =", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountNotEqualTo(BigDecimal value) {
            addCriterion("couponDiscount <>", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountGreaterThan(BigDecimal value) {
            addCriterion("couponDiscount >", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("couponDiscount >=", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountLessThan(BigDecimal value) {
            addCriterion("couponDiscount <", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("couponDiscount <=", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountIn(List<BigDecimal> values) {
            addCriterion("couponDiscount in", values, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountNotIn(List<BigDecimal> values) {
            addCriterion("couponDiscount not in", values, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("couponDiscount between", value1, value2, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("couponDiscount not between", value1, value2, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andExchangepointIsNull() {
            addCriterion("exchangePoint is null");
            return (Criteria) this;
        }

        public Criteria andExchangepointIsNotNull() {
            addCriterion("exchangePoint is not null");
            return (Criteria) this;
        }

        public Criteria andExchangepointEqualTo(Long value) {
            addCriterion("exchangePoint =", value, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointNotEqualTo(Long value) {
            addCriterion("exchangePoint <>", value, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointGreaterThan(Long value) {
            addCriterion("exchangePoint >", value, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointGreaterThanOrEqualTo(Long value) {
            addCriterion("exchangePoint >=", value, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointLessThan(Long value) {
            addCriterion("exchangePoint <", value, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointLessThanOrEqualTo(Long value) {
            addCriterion("exchangePoint <=", value, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointIn(List<Long> values) {
            addCriterion("exchangePoint in", values, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointNotIn(List<Long> values) {
            addCriterion("exchangePoint not in", values, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointBetween(Long value1, Long value2) {
            addCriterion("exchangePoint between", value1, value2, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExchangepointNotBetween(Long value1, Long value2) {
            addCriterion("exchangePoint not between", value1, value2, "exchangepoint");
            return (Criteria) this;
        }

        public Criteria andExpireIsNull() {
            addCriterion("expire is null");
            return (Criteria) this;
        }

        public Criteria andExpireIsNotNull() {
            addCriterion("expire is not null");
            return (Criteria) this;
        }

        public Criteria andExpireEqualTo(Date value) {
            addCriterion("expire =", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotEqualTo(Date value) {
            addCriterion("expire <>", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThan(Date value) {
            addCriterion("expire >", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("expire >=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThan(Date value) {
            addCriterion("expire <", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThanOrEqualTo(Date value) {
            addCriterion("expire <=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireIn(List<Date> values) {
            addCriterion("expire in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotIn(List<Date> values) {
            addCriterion("expire not in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireBetween(Date value1, Date value2) {
            addCriterion("expire between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotBetween(Date value1, Date value2) {
            addCriterion("expire not between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentIsNull() {
            addCriterion("invoiceContent is null");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentIsNotNull() {
            addCriterion("invoiceContent is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentEqualTo(String value) {
            addCriterion("invoiceContent =", value, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentNotEqualTo(String value) {
            addCriterion("invoiceContent <>", value, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentGreaterThan(String value) {
            addCriterion("invoiceContent >", value, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceContent >=", value, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentLessThan(String value) {
            addCriterion("invoiceContent <", value, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentLessThanOrEqualTo(String value) {
            addCriterion("invoiceContent <=", value, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentLike(String value) {
            addCriterion("invoiceContent like", value, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentNotLike(String value) {
            addCriterion("invoiceContent not like", value, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentIn(List<String> values) {
            addCriterion("invoiceContent in", values, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentNotIn(List<String> values) {
            addCriterion("invoiceContent not in", values, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentBetween(String value1, String value2) {
            addCriterion("invoiceContent between", value1, value2, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicecontentNotBetween(String value1, String value2) {
            addCriterion("invoiceContent not between", value1, value2, "invoicecontent");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIsNull() {
            addCriterion("invoiceTitle is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIsNotNull() {
            addCriterion("invoiceTitle is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleEqualTo(String value) {
            addCriterion("invoiceTitle =", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotEqualTo(String value) {
            addCriterion("invoiceTitle <>", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleGreaterThan(String value) {
            addCriterion("invoiceTitle >", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceTitle >=", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLessThan(String value) {
            addCriterion("invoiceTitle <", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLessThanOrEqualTo(String value) {
            addCriterion("invoiceTitle <=", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLike(String value) {
            addCriterion("invoiceTitle like", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotLike(String value) {
            addCriterion("invoiceTitle not like", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIn(List<String> values) {
            addCriterion("invoiceTitle in", values, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotIn(List<String> values) {
            addCriterion("invoiceTitle not in", values, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleBetween(String value1, String value2) {
            addCriterion("invoiceTitle between", value1, value2, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotBetween(String value1, String value2) {
            addCriterion("invoiceTitle not between", value1, value2, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockIsNull() {
            addCriterion("isAllocatedStock is null");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockIsNotNull() {
            addCriterion("isAllocatedStock is not null");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockEqualTo(Boolean value) {
            addCriterion("isAllocatedStock =", value, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockNotEqualTo(Boolean value) {
            addCriterion("isAllocatedStock <>", value, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockGreaterThan(Boolean value) {
            addCriterion("isAllocatedStock >", value, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isAllocatedStock >=", value, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockLessThan(Boolean value) {
            addCriterion("isAllocatedStock <", value, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockLessThanOrEqualTo(Boolean value) {
            addCriterion("isAllocatedStock <=", value, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockIn(List<Boolean> values) {
            addCriterion("isAllocatedStock in", values, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockNotIn(List<Boolean> values) {
            addCriterion("isAllocatedStock not in", values, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockBetween(Boolean value1, Boolean value2) {
            addCriterion("isAllocatedStock between", value1, value2, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsallocatedstockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isAllocatedStock not between", value1, value2, "isallocatedstock");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointIsNull() {
            addCriterion("isExchangePoint is null");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointIsNotNull() {
            addCriterion("isExchangePoint is not null");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointEqualTo(Boolean value) {
            addCriterion("isExchangePoint =", value, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointNotEqualTo(Boolean value) {
            addCriterion("isExchangePoint <>", value, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointGreaterThan(Boolean value) {
            addCriterion("isExchangePoint >", value, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isExchangePoint >=", value, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointLessThan(Boolean value) {
            addCriterion("isExchangePoint <", value, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointLessThanOrEqualTo(Boolean value) {
            addCriterion("isExchangePoint <=", value, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointIn(List<Boolean> values) {
            addCriterion("isExchangePoint in", values, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointNotIn(List<Boolean> values) {
            addCriterion("isExchangePoint not in", values, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointBetween(Boolean value1, Boolean value2) {
            addCriterion("isExchangePoint between", value1, value2, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsexchangepointNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isExchangePoint not between", value1, value2, "isexchangepoint");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeIsNull() {
            addCriterion("isUseCouponCode is null");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeIsNotNull() {
            addCriterion("isUseCouponCode is not null");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeEqualTo(Boolean value) {
            addCriterion("isUseCouponCode =", value, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeNotEqualTo(Boolean value) {
            addCriterion("isUseCouponCode <>", value, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeGreaterThan(Boolean value) {
            addCriterion("isUseCouponCode >", value, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isUseCouponCode >=", value, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeLessThan(Boolean value) {
            addCriterion("isUseCouponCode <", value, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeLessThanOrEqualTo(Boolean value) {
            addCriterion("isUseCouponCode <=", value, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeIn(List<Boolean> values) {
            addCriterion("isUseCouponCode in", values, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeNotIn(List<Boolean> values) {
            addCriterion("isUseCouponCode not in", values, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeBetween(Boolean value1, Boolean value2) {
            addCriterion("isUseCouponCode between", value1, value2, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andIsusecouponcodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isUseCouponCode not between", value1, value2, "isusecouponcode");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andOffsetamountIsNull() {
            addCriterion("offsetAmount is null");
            return (Criteria) this;
        }

        public Criteria andOffsetamountIsNotNull() {
            addCriterion("offsetAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetamountEqualTo(BigDecimal value) {
            addCriterion("offsetAmount =", value, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountNotEqualTo(BigDecimal value) {
            addCriterion("offsetAmount <>", value, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountGreaterThan(BigDecimal value) {
            addCriterion("offsetAmount >", value, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offsetAmount >=", value, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountLessThan(BigDecimal value) {
            addCriterion("offsetAmount <", value, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offsetAmount <=", value, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountIn(List<BigDecimal> values) {
            addCriterion("offsetAmount in", values, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountNotIn(List<BigDecimal> values) {
            addCriterion("offsetAmount not in", values, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offsetAmount between", value1, value2, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andOffsetamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offsetAmount not between", value1, value2, "offsetamount");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameIsNull() {
            addCriterion("paymentMethodName is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameIsNotNull() {
            addCriterion("paymentMethodName is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameEqualTo(String value) {
            addCriterion("paymentMethodName =", value, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameNotEqualTo(String value) {
            addCriterion("paymentMethodName <>", value, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameGreaterThan(String value) {
            addCriterion("paymentMethodName >", value, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameGreaterThanOrEqualTo(String value) {
            addCriterion("paymentMethodName >=", value, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameLessThan(String value) {
            addCriterion("paymentMethodName <", value, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameLessThanOrEqualTo(String value) {
            addCriterion("paymentMethodName <=", value, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameLike(String value) {
            addCriterion("paymentMethodName like", value, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameNotLike(String value) {
            addCriterion("paymentMethodName not like", value, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameIn(List<String> values) {
            addCriterion("paymentMethodName in", values, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameNotIn(List<String> values) {
            addCriterion("paymentMethodName not in", values, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameBetween(String value1, String value2) {
            addCriterion("paymentMethodName between", value1, value2, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodnameNotBetween(String value1, String value2) {
            addCriterion("paymentMethodName not between", value1, value2, "paymentmethodname");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeIsNull() {
            addCriterion("paymentMethodType is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeIsNotNull() {
            addCriterion("paymentMethodType is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeEqualTo(Integer value) {
            addCriterion("paymentMethodType =", value, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeNotEqualTo(Integer value) {
            addCriterion("paymentMethodType <>", value, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeGreaterThan(Integer value) {
            addCriterion("paymentMethodType >", value, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentMethodType >=", value, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeLessThan(Integer value) {
            addCriterion("paymentMethodType <", value, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeLessThanOrEqualTo(Integer value) {
            addCriterion("paymentMethodType <=", value, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeIn(List<Integer> values) {
            addCriterion("paymentMethodType in", values, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeNotIn(List<Integer> values) {
            addCriterion("paymentMethodType not in", values, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeBetween(Integer value1, Integer value2) {
            addCriterion("paymentMethodType between", value1, value2, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentMethodType not between", value1, value2, "paymentmethodtype");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountIsNull() {
            addCriterion("promotionDiscount is null");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountIsNotNull() {
            addCriterion("promotionDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountEqualTo(BigDecimal value) {
            addCriterion("promotionDiscount =", value, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountNotEqualTo(BigDecimal value) {
            addCriterion("promotionDiscount <>", value, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountGreaterThan(BigDecimal value) {
            addCriterion("promotionDiscount >", value, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotionDiscount >=", value, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountLessThan(BigDecimal value) {
            addCriterion("promotionDiscount <", value, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotionDiscount <=", value, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountIn(List<BigDecimal> values) {
            addCriterion("promotionDiscount in", values, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountNotIn(List<BigDecimal> values) {
            addCriterion("promotionDiscount not in", values, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotionDiscount between", value1, value2, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andPromotiondiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotionDiscount not between", value1, value2, "promotiondiscount");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNull() {
            addCriterion("refundAmount is null");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNotNull() {
            addCriterion("refundAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundamountEqualTo(BigDecimal value) {
            addCriterion("refundAmount =", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotEqualTo(BigDecimal value) {
            addCriterion("refundAmount <>", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThan(BigDecimal value) {
            addCriterion("refundAmount >", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundAmount >=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThan(BigDecimal value) {
            addCriterion("refundAmount <", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundAmount <=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIn(List<BigDecimal> values) {
            addCriterion("refundAmount in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotIn(List<BigDecimal> values) {
            addCriterion("refundAmount not in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundAmount between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundAmount not between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityIsNull() {
            addCriterion("returnedQuantity is null");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityIsNotNull() {
            addCriterion("returnedQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityEqualTo(Integer value) {
            addCriterion("returnedQuantity =", value, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityNotEqualTo(Integer value) {
            addCriterion("returnedQuantity <>", value, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityGreaterThan(Integer value) {
            addCriterion("returnedQuantity >", value, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("returnedQuantity >=", value, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityLessThan(Integer value) {
            addCriterion("returnedQuantity <", value, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityLessThanOrEqualTo(Integer value) {
            addCriterion("returnedQuantity <=", value, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityIn(List<Integer> values) {
            addCriterion("returnedQuantity in", values, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityNotIn(List<Integer> values) {
            addCriterion("returnedQuantity not in", values, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityBetween(Integer value1, Integer value2) {
            addCriterion("returnedQuantity between", value1, value2, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnedquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("returnedQuantity not between", value1, value2, "returnedquantity");
            return (Criteria) this;
        }

        public Criteria andRewardpointIsNull() {
            addCriterion("rewardPoint is null");
            return (Criteria) this;
        }

        public Criteria andRewardpointIsNotNull() {
            addCriterion("rewardPoint is not null");
            return (Criteria) this;
        }

        public Criteria andRewardpointEqualTo(Long value) {
            addCriterion("rewardPoint =", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointNotEqualTo(Long value) {
            addCriterion("rewardPoint <>", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointGreaterThan(Long value) {
            addCriterion("rewardPoint >", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointGreaterThanOrEqualTo(Long value) {
            addCriterion("rewardPoint >=", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointLessThan(Long value) {
            addCriterion("rewardPoint <", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointLessThanOrEqualTo(Long value) {
            addCriterion("rewardPoint <=", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointIn(List<Long> values) {
            addCriterion("rewardPoint in", values, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointNotIn(List<Long> values) {
            addCriterion("rewardPoint not in", values, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointBetween(Long value1, Long value2) {
            addCriterion("rewardPoint between", value1, value2, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointNotBetween(Long value1, Long value2) {
            addCriterion("rewardPoint not between", value1, value2, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andShippedquantityIsNull() {
            addCriterion("shippedQuantity is null");
            return (Criteria) this;
        }

        public Criteria andShippedquantityIsNotNull() {
            addCriterion("shippedQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andShippedquantityEqualTo(Integer value) {
            addCriterion("shippedQuantity =", value, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityNotEqualTo(Integer value) {
            addCriterion("shippedQuantity <>", value, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityGreaterThan(Integer value) {
            addCriterion("shippedQuantity >", value, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("shippedQuantity >=", value, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityLessThan(Integer value) {
            addCriterion("shippedQuantity <", value, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityLessThanOrEqualTo(Integer value) {
            addCriterion("shippedQuantity <=", value, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityIn(List<Integer> values) {
            addCriterion("shippedQuantity in", values, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityNotIn(List<Integer> values) {
            addCriterion("shippedQuantity not in", values, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityBetween(Integer value1, Integer value2) {
            addCriterion("shippedQuantity between", value1, value2, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippedquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("shippedQuantity not between", value1, value2, "shippedquantity");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameIsNull() {
            addCriterion("shippingMethodName is null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameIsNotNull() {
            addCriterion("shippingMethodName is not null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameEqualTo(String value) {
            addCriterion("shippingMethodName =", value, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameNotEqualTo(String value) {
            addCriterion("shippingMethodName <>", value, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameGreaterThan(String value) {
            addCriterion("shippingMethodName >", value, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameGreaterThanOrEqualTo(String value) {
            addCriterion("shippingMethodName >=", value, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameLessThan(String value) {
            addCriterion("shippingMethodName <", value, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameLessThanOrEqualTo(String value) {
            addCriterion("shippingMethodName <=", value, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameLike(String value) {
            addCriterion("shippingMethodName like", value, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameNotLike(String value) {
            addCriterion("shippingMethodName not like", value, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameIn(List<String> values) {
            addCriterion("shippingMethodName in", values, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameNotIn(List<String> values) {
            addCriterion("shippingMethodName not in", values, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameBetween(String value1, String value2) {
            addCriterion("shippingMethodName between", value1, value2, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andShippingmethodnameNotBetween(String value1, String value2) {
            addCriterion("shippingMethodName not between", value1, value2, "shippingmethodname");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipCode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipCode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipCode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipCode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipCode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipCode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipCode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipCode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipCode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipCode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipCode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipCode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipCode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipCode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdIsNull() {
            addCriterion("couponCode_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdIsNotNull() {
            addCriterion("couponCode_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdEqualTo(Long value) {
            addCriterion("couponCode_id =", value, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdNotEqualTo(Long value) {
            addCriterion("couponCode_id <>", value, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdGreaterThan(Long value) {
            addCriterion("couponCode_id >", value, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("couponCode_id >=", value, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdLessThan(Long value) {
            addCriterion("couponCode_id <", value, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdLessThanOrEqualTo(Long value) {
            addCriterion("couponCode_id <=", value, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdIn(List<Long> values) {
            addCriterion("couponCode_id in", values, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdNotIn(List<Long> values) {
            addCriterion("couponCode_id not in", values, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdBetween(Long value1, Long value2) {
            addCriterion("couponCode_id between", value1, value2, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andCouponcodeIdNotBetween(Long value1, Long value2) {
            addCriterion("couponCode_id not between", value1, value2, "couponcodeId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdIsNull() {
            addCriterion("paymentMethod_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdIsNotNull() {
            addCriterion("paymentMethod_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdEqualTo(Long value) {
            addCriterion("paymentMethod_id =", value, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdNotEqualTo(Long value) {
            addCriterion("paymentMethod_id <>", value, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdGreaterThan(Long value) {
            addCriterion("paymentMethod_id >", value, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("paymentMethod_id >=", value, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdLessThan(Long value) {
            addCriterion("paymentMethod_id <", value, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdLessThanOrEqualTo(Long value) {
            addCriterion("paymentMethod_id <=", value, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdIn(List<Long> values) {
            addCriterion("paymentMethod_id in", values, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdNotIn(List<Long> values) {
            addCriterion("paymentMethod_id not in", values, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdBetween(Long value1, Long value2) {
            addCriterion("paymentMethod_id between", value1, value2, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIdNotBetween(Long value1, Long value2) {
            addCriterion("paymentMethod_id not between", value1, value2, "paymentmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdIsNull() {
            addCriterion("shippingMethod_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdIsNotNull() {
            addCriterion("shippingMethod_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdEqualTo(Long value) {
            addCriterion("shippingMethod_id =", value, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdNotEqualTo(Long value) {
            addCriterion("shippingMethod_id <>", value, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdGreaterThan(Long value) {
            addCriterion("shippingMethod_id >", value, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shippingMethod_id >=", value, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdLessThan(Long value) {
            addCriterion("shippingMethod_id <", value, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdLessThanOrEqualTo(Long value) {
            addCriterion("shippingMethod_id <=", value, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdIn(List<Long> values) {
            addCriterion("shippingMethod_id in", values, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdNotIn(List<Long> values) {
            addCriterion("shippingMethod_id not in", values, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdBetween(Long value1, Long value2) {
            addCriterion("shippingMethod_id between", value1, value2, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIdNotBetween(Long value1, Long value2) {
            addCriterion("shippingMethod_id not between", value1, value2, "shippingmethodId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }
    }

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
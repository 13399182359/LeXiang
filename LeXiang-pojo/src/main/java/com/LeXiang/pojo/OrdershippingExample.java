package com.LeXiang.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdershippingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdershippingExample() {
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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

        public Criteria andDeliverycorpIsNull() {
            addCriterion("deliveryCorp is null");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpIsNotNull() {
            addCriterion("deliveryCorp is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpEqualTo(String value) {
            addCriterion("deliveryCorp =", value, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpNotEqualTo(String value) {
            addCriterion("deliveryCorp <>", value, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpGreaterThan(String value) {
            addCriterion("deliveryCorp >", value, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryCorp >=", value, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpLessThan(String value) {
            addCriterion("deliveryCorp <", value, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpLessThanOrEqualTo(String value) {
            addCriterion("deliveryCorp <=", value, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpLike(String value) {
            addCriterion("deliveryCorp like", value, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpNotLike(String value) {
            addCriterion("deliveryCorp not like", value, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpIn(List<String> values) {
            addCriterion("deliveryCorp in", values, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpNotIn(List<String> values) {
            addCriterion("deliveryCorp not in", values, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpBetween(String value1, String value2) {
            addCriterion("deliveryCorp between", value1, value2, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpNotBetween(String value1, String value2) {
            addCriterion("deliveryCorp not between", value1, value2, "deliverycorp");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeIsNull() {
            addCriterion("deliveryCorpCode is null");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeIsNotNull() {
            addCriterion("deliveryCorpCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeEqualTo(String value) {
            addCriterion("deliveryCorpCode =", value, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeNotEqualTo(String value) {
            addCriterion("deliveryCorpCode <>", value, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeGreaterThan(String value) {
            addCriterion("deliveryCorpCode >", value, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryCorpCode >=", value, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeLessThan(String value) {
            addCriterion("deliveryCorpCode <", value, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeLessThanOrEqualTo(String value) {
            addCriterion("deliveryCorpCode <=", value, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeLike(String value) {
            addCriterion("deliveryCorpCode like", value, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeNotLike(String value) {
            addCriterion("deliveryCorpCode not like", value, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeIn(List<String> values) {
            addCriterion("deliveryCorpCode in", values, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeNotIn(List<String> values) {
            addCriterion("deliveryCorpCode not in", values, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeBetween(String value1, String value2) {
            addCriterion("deliveryCorpCode between", value1, value2, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpcodeNotBetween(String value1, String value2) {
            addCriterion("deliveryCorpCode not between", value1, value2, "deliverycorpcode");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlIsNull() {
            addCriterion("deliveryCorpUrl is null");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlIsNotNull() {
            addCriterion("deliveryCorpUrl is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlEqualTo(String value) {
            addCriterion("deliveryCorpUrl =", value, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlNotEqualTo(String value) {
            addCriterion("deliveryCorpUrl <>", value, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlGreaterThan(String value) {
            addCriterion("deliveryCorpUrl >", value, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryCorpUrl >=", value, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlLessThan(String value) {
            addCriterion("deliveryCorpUrl <", value, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlLessThanOrEqualTo(String value) {
            addCriterion("deliveryCorpUrl <=", value, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlLike(String value) {
            addCriterion("deliveryCorpUrl like", value, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlNotLike(String value) {
            addCriterion("deliveryCorpUrl not like", value, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlIn(List<String> values) {
            addCriterion("deliveryCorpUrl in", values, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlNotIn(List<String> values) {
            addCriterion("deliveryCorpUrl not in", values, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlBetween(String value1, String value2) {
            addCriterion("deliveryCorpUrl between", value1, value2, "deliverycorpurl");
            return (Criteria) this;
        }

        public Criteria andDeliverycorpurlNotBetween(String value1, String value2) {
            addCriterion("deliveryCorpUrl not between", value1, value2, "deliverycorpurl");
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

        public Criteria andShippingmethodIsNull() {
            addCriterion("shippingMethod is null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIsNotNull() {
            addCriterion("shippingMethod is not null");
            return (Criteria) this;
        }

        public Criteria andShippingmethodEqualTo(String value) {
            addCriterion("shippingMethod =", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodNotEqualTo(String value) {
            addCriterion("shippingMethod <>", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodGreaterThan(String value) {
            addCriterion("shippingMethod >", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodGreaterThanOrEqualTo(String value) {
            addCriterion("shippingMethod >=", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodLessThan(String value) {
            addCriterion("shippingMethod <", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodLessThanOrEqualTo(String value) {
            addCriterion("shippingMethod <=", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodLike(String value) {
            addCriterion("shippingMethod like", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodNotLike(String value) {
            addCriterion("shippingMethod not like", value, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodIn(List<String> values) {
            addCriterion("shippingMethod in", values, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodNotIn(List<String> values) {
            addCriterion("shippingMethod not in", values, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodBetween(String value1, String value2) {
            addCriterion("shippingMethod between", value1, value2, "shippingmethod");
            return (Criteria) this;
        }

        public Criteria andShippingmethodNotBetween(String value1, String value2) {
            addCriterion("shippingMethod not between", value1, value2, "shippingmethod");
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

        public Criteria andTrackingnoIsNull() {
            addCriterion("trackingNo is null");
            return (Criteria) this;
        }

        public Criteria andTrackingnoIsNotNull() {
            addCriterion("trackingNo is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingnoEqualTo(String value) {
            addCriterion("trackingNo =", value, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoNotEqualTo(String value) {
            addCriterion("trackingNo <>", value, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoGreaterThan(String value) {
            addCriterion("trackingNo >", value, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoGreaterThanOrEqualTo(String value) {
            addCriterion("trackingNo >=", value, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoLessThan(String value) {
            addCriterion("trackingNo <", value, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoLessThanOrEqualTo(String value) {
            addCriterion("trackingNo <=", value, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoLike(String value) {
            addCriterion("trackingNo like", value, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoNotLike(String value) {
            addCriterion("trackingNo not like", value, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoIn(List<String> values) {
            addCriterion("trackingNo in", values, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoNotIn(List<String> values) {
            addCriterion("trackingNo not in", values, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoBetween(String value1, String value2) {
            addCriterion("trackingNo between", value1, value2, "trackingno");
            return (Criteria) this;
        }

        public Criteria andTrackingnoNotBetween(String value1, String value2) {
            addCriterion("trackingNo not between", value1, value2, "trackingno");
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

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Long value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Long value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Long value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Long value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Long value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Long value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Long> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Long> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Long value1, Long value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Long value1, Long value2) {
            addCriterion("orders not between", value1, value2, "orders");
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
package com.LeXiang.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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

        public Criteria andBegindateIsNull() {
            addCriterion("beginDate is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("beginDate is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Date value) {
            addCriterion("beginDate =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Date value) {
            addCriterion("beginDate <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Date value) {
            addCriterion("beginDate >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("beginDate >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Date value) {
            addCriterion("beginDate <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Date value) {
            addCriterion("beginDate <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Date> values) {
            addCriterion("beginDate in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Date> values) {
            addCriterion("beginDate not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Date value1, Date value2) {
            addCriterion("beginDate between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Date value1, Date value2) {
            addCriterion("beginDate not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNull() {
            addCriterion("isEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("isEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(Boolean value) {
            addCriterion("isEnabled =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Boolean value) {
            addCriterion("isEnabled <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Boolean value) {
            addCriterion("isEnabled >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isEnabled >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Boolean value) {
            addCriterion("isEnabled <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("isEnabled <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Boolean> values) {
            addCriterion("isEnabled in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Boolean> values) {
            addCriterion("isEnabled not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("isEnabled between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isEnabled not between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsexchangeIsNull() {
            addCriterion("isExchange is null");
            return (Criteria) this;
        }

        public Criteria andIsexchangeIsNotNull() {
            addCriterion("isExchange is not null");
            return (Criteria) this;
        }

        public Criteria andIsexchangeEqualTo(Boolean value) {
            addCriterion("isExchange =", value, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeNotEqualTo(Boolean value) {
            addCriterion("isExchange <>", value, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeGreaterThan(Boolean value) {
            addCriterion("isExchange >", value, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isExchange >=", value, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeLessThan(Boolean value) {
            addCriterion("isExchange <", value, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeLessThanOrEqualTo(Boolean value) {
            addCriterion("isExchange <=", value, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeIn(List<Boolean> values) {
            addCriterion("isExchange in", values, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeNotIn(List<Boolean> values) {
            addCriterion("isExchange not in", values, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeBetween(Boolean value1, Boolean value2) {
            addCriterion("isExchange between", value1, value2, "isexchange");
            return (Criteria) this;
        }

        public Criteria andIsexchangeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isExchange not between", value1, value2, "isexchange");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceIsNull() {
            addCriterion("maximumPrice is null");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceIsNotNull() {
            addCriterion("maximumPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceEqualTo(BigDecimal value) {
            addCriterion("maximumPrice =", value, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceNotEqualTo(BigDecimal value) {
            addCriterion("maximumPrice <>", value, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceGreaterThan(BigDecimal value) {
            addCriterion("maximumPrice >", value, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maximumPrice >=", value, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceLessThan(BigDecimal value) {
            addCriterion("maximumPrice <", value, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maximumPrice <=", value, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceIn(List<BigDecimal> values) {
            addCriterion("maximumPrice in", values, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceNotIn(List<BigDecimal> values) {
            addCriterion("maximumPrice not in", values, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maximumPrice between", value1, value2, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maximumPrice not between", value1, value2, "maximumprice");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityIsNull() {
            addCriterion("maximumQuantity is null");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityIsNotNull() {
            addCriterion("maximumQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityEqualTo(Integer value) {
            addCriterion("maximumQuantity =", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityNotEqualTo(Integer value) {
            addCriterion("maximumQuantity <>", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityGreaterThan(Integer value) {
            addCriterion("maximumQuantity >", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("maximumQuantity >=", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityLessThan(Integer value) {
            addCriterion("maximumQuantity <", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityLessThanOrEqualTo(Integer value) {
            addCriterion("maximumQuantity <=", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityIn(List<Integer> values) {
            addCriterion("maximumQuantity in", values, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityNotIn(List<Integer> values) {
            addCriterion("maximumQuantity not in", values, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityBetween(Integer value1, Integer value2) {
            addCriterion("maximumQuantity between", value1, value2, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("maximumQuantity not between", value1, value2, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceIsNull() {
            addCriterion("minimumPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceIsNotNull() {
            addCriterion("minimumPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceEqualTo(BigDecimal value) {
            addCriterion("minimumPrice =", value, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceNotEqualTo(BigDecimal value) {
            addCriterion("minimumPrice <>", value, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceGreaterThan(BigDecimal value) {
            addCriterion("minimumPrice >", value, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("minimumPrice >=", value, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceLessThan(BigDecimal value) {
            addCriterion("minimumPrice <", value, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("minimumPrice <=", value, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceIn(List<BigDecimal> values) {
            addCriterion("minimumPrice in", values, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceNotIn(List<BigDecimal> values) {
            addCriterion("minimumPrice not in", values, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minimumPrice between", value1, value2, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minimumPrice not between", value1, value2, "minimumprice");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityIsNull() {
            addCriterion("minimumQuantity is null");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityIsNotNull() {
            addCriterion("minimumQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityEqualTo(Integer value) {
            addCriterion("minimumQuantity =", value, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityNotEqualTo(Integer value) {
            addCriterion("minimumQuantity <>", value, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityGreaterThan(Integer value) {
            addCriterion("minimumQuantity >", value, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("minimumQuantity >=", value, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityLessThan(Integer value) {
            addCriterion("minimumQuantity <", value, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityLessThanOrEqualTo(Integer value) {
            addCriterion("minimumQuantity <=", value, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityIn(List<Integer> values) {
            addCriterion("minimumQuantity in", values, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityNotIn(List<Integer> values) {
            addCriterion("minimumQuantity not in", values, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityBetween(Integer value1, Integer value2) {
            addCriterion("minimumQuantity between", value1, value2, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andMinimumquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("minimumQuantity not between", value1, value2, "minimumquantity");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Long value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Long value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Long value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Long value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Long value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Long value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Long> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Long> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Long value1, Long value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Long value1, Long value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("prefix is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("prefix is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("prefix =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("prefix <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("prefix >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("prefix >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("prefix <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("prefix <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("prefix like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("prefix not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("prefix in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("prefix not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("prefix between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("prefix not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionIsNull() {
            addCriterion("priceExpression is null");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionIsNotNull() {
            addCriterion("priceExpression is not null");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionEqualTo(String value) {
            addCriterion("priceExpression =", value, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionNotEqualTo(String value) {
            addCriterion("priceExpression <>", value, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionGreaterThan(String value) {
            addCriterion("priceExpression >", value, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionGreaterThanOrEqualTo(String value) {
            addCriterion("priceExpression >=", value, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionLessThan(String value) {
            addCriterion("priceExpression <", value, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionLessThanOrEqualTo(String value) {
            addCriterion("priceExpression <=", value, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionLike(String value) {
            addCriterion("priceExpression like", value, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionNotLike(String value) {
            addCriterion("priceExpression not like", value, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionIn(List<String> values) {
            addCriterion("priceExpression in", values, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionNotIn(List<String> values) {
            addCriterion("priceExpression not in", values, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionBetween(String value1, String value2) {
            addCriterion("priceExpression between", value1, value2, "priceexpression");
            return (Criteria) this;
        }

        public Criteria andPriceexpressionNotBetween(String value1, String value2) {
            addCriterion("priceExpression not between", value1, value2, "priceexpression");
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
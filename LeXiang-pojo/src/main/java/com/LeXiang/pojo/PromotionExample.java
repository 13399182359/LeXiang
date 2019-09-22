package com.LeXiang.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionExample() {
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

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
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

        public Criteria andConditionsamountIsNull() {
            addCriterion("conditionsAmount is null");
            return (Criteria) this;
        }

        public Criteria andConditionsamountIsNotNull() {
            addCriterion("conditionsAmount is not null");
            return (Criteria) this;
        }

        public Criteria andConditionsamountEqualTo(BigDecimal value) {
            addCriterion("conditionsAmount =", value, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountNotEqualTo(BigDecimal value) {
            addCriterion("conditionsAmount <>", value, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountGreaterThan(BigDecimal value) {
            addCriterion("conditionsAmount >", value, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("conditionsAmount >=", value, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountLessThan(BigDecimal value) {
            addCriterion("conditionsAmount <", value, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("conditionsAmount <=", value, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountIn(List<BigDecimal> values) {
            addCriterion("conditionsAmount in", values, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountNotIn(List<BigDecimal> values) {
            addCriterion("conditionsAmount not in", values, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conditionsAmount between", value1, value2, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conditionsAmount not between", value1, value2, "conditionsamount");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberIsNull() {
            addCriterion("conditionsNumber is null");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberIsNotNull() {
            addCriterion("conditionsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberEqualTo(Integer value) {
            addCriterion("conditionsNumber =", value, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberNotEqualTo(Integer value) {
            addCriterion("conditionsNumber <>", value, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberGreaterThan(Integer value) {
            addCriterion("conditionsNumber >", value, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("conditionsNumber >=", value, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberLessThan(Integer value) {
            addCriterion("conditionsNumber <", value, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberLessThanOrEqualTo(Integer value) {
            addCriterion("conditionsNumber <=", value, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberIn(List<Integer> values) {
            addCriterion("conditionsNumber in", values, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberNotIn(List<Integer> values) {
            addCriterion("conditionsNumber not in", values, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberBetween(Integer value1, Integer value2) {
            addCriterion("conditionsNumber between", value1, value2, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andConditionsnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("conditionsNumber not between", value1, value2, "conditionsnumber");
            return (Criteria) this;
        }

        public Criteria andCreditamountIsNull() {
            addCriterion("creditAmount is null");
            return (Criteria) this;
        }

        public Criteria andCreditamountIsNotNull() {
            addCriterion("creditAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditamountEqualTo(BigDecimal value) {
            addCriterion("creditAmount =", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotEqualTo(BigDecimal value) {
            addCriterion("creditAmount <>", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountGreaterThan(BigDecimal value) {
            addCriterion("creditAmount >", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("creditAmount >=", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountLessThan(BigDecimal value) {
            addCriterion("creditAmount <", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("creditAmount <=", value, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountIn(List<BigDecimal> values) {
            addCriterion("creditAmount in", values, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotIn(List<BigDecimal> values) {
            addCriterion("creditAmount not in", values, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("creditAmount between", value1, value2, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("creditAmount not between", value1, value2, "creditamount");
            return (Criteria) this;
        }

        public Criteria andCreditnumberIsNull() {
            addCriterion("creditNumber is null");
            return (Criteria) this;
        }

        public Criteria andCreditnumberIsNotNull() {
            addCriterion("creditNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCreditnumberEqualTo(Integer value) {
            addCriterion("creditNumber =", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberNotEqualTo(Integer value) {
            addCriterion("creditNumber <>", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberGreaterThan(Integer value) {
            addCriterion("creditNumber >", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditNumber >=", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberLessThan(Integer value) {
            addCriterion("creditNumber <", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberLessThanOrEqualTo(Integer value) {
            addCriterion("creditNumber <=", value, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberIn(List<Integer> values) {
            addCriterion("creditNumber in", values, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberNotIn(List<Integer> values) {
            addCriterion("creditNumber not in", values, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberBetween(Integer value1, Integer value2) {
            addCriterion("creditNumber between", value1, value2, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andCreditnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("creditNumber not between", value1, value2, "creditnumber");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
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

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedIsNull() {
            addCriterion("isCouponAllowed is null");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedIsNotNull() {
            addCriterion("isCouponAllowed is not null");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedEqualTo(Boolean value) {
            addCriterion("isCouponAllowed =", value, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedNotEqualTo(Boolean value) {
            addCriterion("isCouponAllowed <>", value, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedGreaterThan(Boolean value) {
            addCriterion("isCouponAllowed >", value, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isCouponAllowed >=", value, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedLessThan(Boolean value) {
            addCriterion("isCouponAllowed <", value, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedLessThanOrEqualTo(Boolean value) {
            addCriterion("isCouponAllowed <=", value, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedIn(List<Boolean> values) {
            addCriterion("isCouponAllowed in", values, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedNotIn(List<Boolean> values) {
            addCriterion("isCouponAllowed not in", values, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedBetween(Boolean value1, Boolean value2) {
            addCriterion("isCouponAllowed between", value1, value2, "iscouponallowed");
            return (Criteria) this;
        }

        public Criteria andIscouponallowedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isCouponAllowed not between", value1, value2, "iscouponallowed");
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

        public Criteria andIsfreeshippingIsNull() {
            addCriterion("isFreeShipping is null");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingIsNotNull() {
            addCriterion("isFreeShipping is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingEqualTo(Boolean value) {
            addCriterion("isFreeShipping =", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingNotEqualTo(Boolean value) {
            addCriterion("isFreeShipping <>", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingGreaterThan(Boolean value) {
            addCriterion("isFreeShipping >", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isFreeShipping >=", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingLessThan(Boolean value) {
            addCriterion("isFreeShipping <", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingLessThanOrEqualTo(Boolean value) {
            addCriterion("isFreeShipping <=", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingIn(List<Boolean> values) {
            addCriterion("isFreeShipping in", values, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingNotIn(List<Boolean> values) {
            addCriterion("isFreeShipping not in", values, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingBetween(Boolean value1, Boolean value2) {
            addCriterion("isFreeShipping between", value1, value2, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isFreeShipping not between", value1, value2, "isfreeshipping");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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
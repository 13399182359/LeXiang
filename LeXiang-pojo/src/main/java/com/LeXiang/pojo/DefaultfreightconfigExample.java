package com.LeXiang.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DefaultfreightconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DefaultfreightconfigExample() {
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

        public Criteria andContinuepriceIsNull() {
            addCriterion("continuePrice is null");
            return (Criteria) this;
        }

        public Criteria andContinuepriceIsNotNull() {
            addCriterion("continuePrice is not null");
            return (Criteria) this;
        }

        public Criteria andContinuepriceEqualTo(BigDecimal value) {
            addCriterion("continuePrice =", value, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceNotEqualTo(BigDecimal value) {
            addCriterion("continuePrice <>", value, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceGreaterThan(BigDecimal value) {
            addCriterion("continuePrice >", value, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continuePrice >=", value, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceLessThan(BigDecimal value) {
            addCriterion("continuePrice <", value, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continuePrice <=", value, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceIn(List<BigDecimal> values) {
            addCriterion("continuePrice in", values, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceNotIn(List<BigDecimal> values) {
            addCriterion("continuePrice not in", values, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continuePrice between", value1, value2, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinuepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continuePrice not between", value1, value2, "continueprice");
            return (Criteria) this;
        }

        public Criteria andContinueweightIsNull() {
            addCriterion("continueWeight is null");
            return (Criteria) this;
        }

        public Criteria andContinueweightIsNotNull() {
            addCriterion("continueWeight is not null");
            return (Criteria) this;
        }

        public Criteria andContinueweightEqualTo(Integer value) {
            addCriterion("continueWeight =", value, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightNotEqualTo(Integer value) {
            addCriterion("continueWeight <>", value, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightGreaterThan(Integer value) {
            addCriterion("continueWeight >", value, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("continueWeight >=", value, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightLessThan(Integer value) {
            addCriterion("continueWeight <", value, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightLessThanOrEqualTo(Integer value) {
            addCriterion("continueWeight <=", value, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightIn(List<Integer> values) {
            addCriterion("continueWeight in", values, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightNotIn(List<Integer> values) {
            addCriterion("continueWeight not in", values, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightBetween(Integer value1, Integer value2) {
            addCriterion("continueWeight between", value1, value2, "continueweight");
            return (Criteria) this;
        }

        public Criteria andContinueweightNotBetween(Integer value1, Integer value2) {
            addCriterion("continueWeight not between", value1, value2, "continueweight");
            return (Criteria) this;
        }

        public Criteria andFirstpriceIsNull() {
            addCriterion("firstPrice is null");
            return (Criteria) this;
        }

        public Criteria andFirstpriceIsNotNull() {
            addCriterion("firstPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpriceEqualTo(BigDecimal value) {
            addCriterion("firstPrice =", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceNotEqualTo(BigDecimal value) {
            addCriterion("firstPrice <>", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceGreaterThan(BigDecimal value) {
            addCriterion("firstPrice >", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("firstPrice >=", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceLessThan(BigDecimal value) {
            addCriterion("firstPrice <", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("firstPrice <=", value, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceIn(List<BigDecimal> values) {
            addCriterion("firstPrice in", values, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceNotIn(List<BigDecimal> values) {
            addCriterion("firstPrice not in", values, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("firstPrice between", value1, value2, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("firstPrice not between", value1, value2, "firstprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightIsNull() {
            addCriterion("firstWeight is null");
            return (Criteria) this;
        }

        public Criteria andFirstweightIsNotNull() {
            addCriterion("firstWeight is not null");
            return (Criteria) this;
        }

        public Criteria andFirstweightEqualTo(Integer value) {
            addCriterion("firstWeight =", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightNotEqualTo(Integer value) {
            addCriterion("firstWeight <>", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightGreaterThan(Integer value) {
            addCriterion("firstWeight >", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstWeight >=", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightLessThan(Integer value) {
            addCriterion("firstWeight <", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightLessThanOrEqualTo(Integer value) {
            addCriterion("firstWeight <=", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightIn(List<Integer> values) {
            addCriterion("firstWeight in", values, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightNotIn(List<Integer> values) {
            addCriterion("firstWeight not in", values, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightBetween(Integer value1, Integer value2) {
            addCriterion("firstWeight between", value1, value2, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightNotBetween(Integer value1, Integer value2) {
            addCriterion("firstWeight not between", value1, value2, "firstweight");
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
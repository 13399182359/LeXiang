package com.LeXiang.pojo;

import java.util.ArrayList;
import java.util.List;

public class PromotionSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionSkuExample() {
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

        public Criteria andGiftpromotionsIdIsNull() {
            addCriterion("giftPromotions_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdIsNotNull() {
            addCriterion("giftPromotions_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdEqualTo(Long value) {
            addCriterion("giftPromotions_id =", value, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdNotEqualTo(Long value) {
            addCriterion("giftPromotions_id <>", value, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdGreaterThan(Long value) {
            addCriterion("giftPromotions_id >", value, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("giftPromotions_id >=", value, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdLessThan(Long value) {
            addCriterion("giftPromotions_id <", value, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdLessThanOrEqualTo(Long value) {
            addCriterion("giftPromotions_id <=", value, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdIn(List<Long> values) {
            addCriterion("giftPromotions_id in", values, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdNotIn(List<Long> values) {
            addCriterion("giftPromotions_id not in", values, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdBetween(Long value1, Long value2) {
            addCriterion("giftPromotions_id between", value1, value2, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftpromotionsIdNotBetween(Long value1, Long value2) {
            addCriterion("giftPromotions_id not between", value1, value2, "giftpromotionsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdIsNull() {
            addCriterion("gifts_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftsIdIsNotNull() {
            addCriterion("gifts_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsIdEqualTo(Long value) {
            addCriterion("gifts_id =", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotEqualTo(Long value) {
            addCriterion("gifts_id <>", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdGreaterThan(Long value) {
            addCriterion("gifts_id >", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gifts_id >=", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdLessThan(Long value) {
            addCriterion("gifts_id <", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdLessThanOrEqualTo(Long value) {
            addCriterion("gifts_id <=", value, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdIn(List<Long> values) {
            addCriterion("gifts_id in", values, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotIn(List<Long> values) {
            addCriterion("gifts_id not in", values, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdBetween(Long value1, Long value2) {
            addCriterion("gifts_id between", value1, value2, "giftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsIdNotBetween(Long value1, Long value2) {
            addCriterion("gifts_id not between", value1, value2, "giftsId");
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
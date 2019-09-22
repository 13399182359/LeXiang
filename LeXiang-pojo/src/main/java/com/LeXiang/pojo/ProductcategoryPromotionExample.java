package com.LeXiang.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductcategoryPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductcategoryPromotionExample() {
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

        public Criteria andProductcategoriesIdIsNull() {
            addCriterion("productCategories_id is null");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdIsNotNull() {
            addCriterion("productCategories_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdEqualTo(Long value) {
            addCriterion("productCategories_id =", value, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdNotEqualTo(Long value) {
            addCriterion("productCategories_id <>", value, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdGreaterThan(Long value) {
            addCriterion("productCategories_id >", value, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("productCategories_id >=", value, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdLessThan(Long value) {
            addCriterion("productCategories_id <", value, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdLessThanOrEqualTo(Long value) {
            addCriterion("productCategories_id <=", value, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdIn(List<Long> values) {
            addCriterion("productCategories_id in", values, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdNotIn(List<Long> values) {
            addCriterion("productCategories_id not in", values, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdBetween(Long value1, Long value2) {
            addCriterion("productCategories_id between", value1, value2, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andProductcategoriesIdNotBetween(Long value1, Long value2) {
            addCriterion("productCategories_id not between", value1, value2, "productcategoriesId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdIsNull() {
            addCriterion("promotions_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdIsNotNull() {
            addCriterion("promotions_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdEqualTo(Long value) {
            addCriterion("promotions_id =", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdNotEqualTo(Long value) {
            addCriterion("promotions_id <>", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdGreaterThan(Long value) {
            addCriterion("promotions_id >", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("promotions_id >=", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdLessThan(Long value) {
            addCriterion("promotions_id <", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdLessThanOrEqualTo(Long value) {
            addCriterion("promotions_id <=", value, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdIn(List<Long> values) {
            addCriterion("promotions_id in", values, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdNotIn(List<Long> values) {
            addCriterion("promotions_id not in", values, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdBetween(Long value1, Long value2) {
            addCriterion("promotions_id between", value1, value2, "promotionsId");
            return (Criteria) this;
        }

        public Criteria andPromotionsIdNotBetween(Long value1, Long value2) {
            addCriterion("promotions_id not between", value1, value2, "promotionsId");
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
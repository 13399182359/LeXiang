package com.LeXiang.pojo;

import java.util.ArrayList;
import java.util.List;

public class DisplaysetupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisplaysetupExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(Integer value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(Integer value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(Integer value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(Integer value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(Integer value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(Integer value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<Integer> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<Integer> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(Integer value1, Integer value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(Integer value1, Integer value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthIsNull() {
            addCriterion("largeProductImageWidth is null");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthIsNotNull() {
            addCriterion("largeProductImageWidth is not null");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthEqualTo(Double value) {
            addCriterion("largeProductImageWidth =", value, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthNotEqualTo(Double value) {
            addCriterion("largeProductImageWidth <>", value, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthGreaterThan(Double value) {
            addCriterion("largeProductImageWidth >", value, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthGreaterThanOrEqualTo(Double value) {
            addCriterion("largeProductImageWidth >=", value, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthLessThan(Double value) {
            addCriterion("largeProductImageWidth <", value, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthLessThanOrEqualTo(Double value) {
            addCriterion("largeProductImageWidth <=", value, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthIn(List<Double> values) {
            addCriterion("largeProductImageWidth in", values, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthNotIn(List<Double> values) {
            addCriterion("largeProductImageWidth not in", values, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthBetween(Double value1, Double value2) {
            addCriterion("largeProductImageWidth between", value1, value2, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimagewidthNotBetween(Double value1, Double value2) {
            addCriterion("largeProductImageWidth not between", value1, value2, "largeproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightIsNull() {
            addCriterion("largeProductImageHeight is null");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightIsNotNull() {
            addCriterion("largeProductImageHeight is not null");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightEqualTo(Double value) {
            addCriterion("largeProductImageHeight =", value, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightNotEqualTo(Double value) {
            addCriterion("largeProductImageHeight <>", value, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightGreaterThan(Double value) {
            addCriterion("largeProductImageHeight >", value, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightGreaterThanOrEqualTo(Double value) {
            addCriterion("largeProductImageHeight >=", value, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightLessThan(Double value) {
            addCriterion("largeProductImageHeight <", value, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightLessThanOrEqualTo(Double value) {
            addCriterion("largeProductImageHeight <=", value, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightIn(List<Double> values) {
            addCriterion("largeProductImageHeight in", values, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightNotIn(List<Double> values) {
            addCriterion("largeProductImageHeight not in", values, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightBetween(Double value1, Double value2) {
            addCriterion("largeProductImageHeight between", value1, value2, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andLargeproductimageheightNotBetween(Double value1, Double value2) {
            addCriterion("largeProductImageHeight not between", value1, value2, "largeproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthIsNull() {
            addCriterion("mediumProductImageWidth is null");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthIsNotNull() {
            addCriterion("mediumProductImageWidth is not null");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthEqualTo(Double value) {
            addCriterion("mediumProductImageWidth =", value, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthNotEqualTo(Double value) {
            addCriterion("mediumProductImageWidth <>", value, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthGreaterThan(Double value) {
            addCriterion("mediumProductImageWidth >", value, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthGreaterThanOrEqualTo(Double value) {
            addCriterion("mediumProductImageWidth >=", value, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthLessThan(Double value) {
            addCriterion("mediumProductImageWidth <", value, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthLessThanOrEqualTo(Double value) {
            addCriterion("mediumProductImageWidth <=", value, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthIn(List<Double> values) {
            addCriterion("mediumProductImageWidth in", values, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthNotIn(List<Double> values) {
            addCriterion("mediumProductImageWidth not in", values, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthBetween(Double value1, Double value2) {
            addCriterion("mediumProductImageWidth between", value1, value2, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimagewidthNotBetween(Double value1, Double value2) {
            addCriterion("mediumProductImageWidth not between", value1, value2, "mediumproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightIsNull() {
            addCriterion("mediumProductImageHeight is null");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightIsNotNull() {
            addCriterion("mediumProductImageHeight is not null");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightEqualTo(Double value) {
            addCriterion("mediumProductImageHeight =", value, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightNotEqualTo(Double value) {
            addCriterion("mediumProductImageHeight <>", value, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightGreaterThan(Double value) {
            addCriterion("mediumProductImageHeight >", value, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightGreaterThanOrEqualTo(Double value) {
            addCriterion("mediumProductImageHeight >=", value, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightLessThan(Double value) {
            addCriterion("mediumProductImageHeight <", value, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightLessThanOrEqualTo(Double value) {
            addCriterion("mediumProductImageHeight <=", value, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightIn(List<Double> values) {
            addCriterion("mediumProductImageHeight in", values, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightNotIn(List<Double> values) {
            addCriterion("mediumProductImageHeight not in", values, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightBetween(Double value1, Double value2) {
            addCriterion("mediumProductImageHeight between", value1, value2, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andMediumproductimageheightNotBetween(Double value1, Double value2) {
            addCriterion("mediumProductImageHeight not between", value1, value2, "mediumproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthIsNull() {
            addCriterion("thumbnailProductImageWidth is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthIsNotNull() {
            addCriterion("thumbnailProductImageWidth is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthEqualTo(Double value) {
            addCriterion("thumbnailProductImageWidth =", value, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthNotEqualTo(Double value) {
            addCriterion("thumbnailProductImageWidth <>", value, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthGreaterThan(Double value) {
            addCriterion("thumbnailProductImageWidth >", value, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthGreaterThanOrEqualTo(Double value) {
            addCriterion("thumbnailProductImageWidth >=", value, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthLessThan(Double value) {
            addCriterion("thumbnailProductImageWidth <", value, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthLessThanOrEqualTo(Double value) {
            addCriterion("thumbnailProductImageWidth <=", value, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthIn(List<Double> values) {
            addCriterion("thumbnailProductImageWidth in", values, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthNotIn(List<Double> values) {
            addCriterion("thumbnailProductImageWidth not in", values, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthBetween(Double value1, Double value2) {
            addCriterion("thumbnailProductImageWidth between", value1, value2, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimagewidthNotBetween(Double value1, Double value2) {
            addCriterion("thumbnailProductImageWidth not between", value1, value2, "thumbnailproductimagewidth");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightIsNull() {
            addCriterion("thumbnailProductImageHeight is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightIsNotNull() {
            addCriterion("thumbnailProductImageHeight is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightEqualTo(Double value) {
            addCriterion("thumbnailProductImageHeight =", value, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightNotEqualTo(Double value) {
            addCriterion("thumbnailProductImageHeight <>", value, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightGreaterThan(Double value) {
            addCriterion("thumbnailProductImageHeight >", value, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightGreaterThanOrEqualTo(Double value) {
            addCriterion("thumbnailProductImageHeight >=", value, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightLessThan(Double value) {
            addCriterion("thumbnailProductImageHeight <", value, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightLessThanOrEqualTo(Double value) {
            addCriterion("thumbnailProductImageHeight <=", value, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightIn(List<Double> values) {
            addCriterion("thumbnailProductImageHeight in", values, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightNotIn(List<Double> values) {
            addCriterion("thumbnailProductImageHeight not in", values, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightBetween(Double value1, Double value2) {
            addCriterion("thumbnailProductImageHeight between", value1, value2, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andThumbnailproductimageheightNotBetween(Double value1, Double value2) {
            addCriterion("thumbnailProductImageHeight not between", value1, value2, "thumbnailproductimageheight");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageIsNull() {
            addCriterion("defaultLargeProductImage is null");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageIsNotNull() {
            addCriterion("defaultLargeProductImage is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageEqualTo(String value) {
            addCriterion("defaultLargeProductImage =", value, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageNotEqualTo(String value) {
            addCriterion("defaultLargeProductImage <>", value, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageGreaterThan(String value) {
            addCriterion("defaultLargeProductImage >", value, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageGreaterThanOrEqualTo(String value) {
            addCriterion("defaultLargeProductImage >=", value, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageLessThan(String value) {
            addCriterion("defaultLargeProductImage <", value, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageLessThanOrEqualTo(String value) {
            addCriterion("defaultLargeProductImage <=", value, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageLike(String value) {
            addCriterion("defaultLargeProductImage like", value, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageNotLike(String value) {
            addCriterion("defaultLargeProductImage not like", value, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageIn(List<String> values) {
            addCriterion("defaultLargeProductImage in", values, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageNotIn(List<String> values) {
            addCriterion("defaultLargeProductImage not in", values, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageBetween(String value1, String value2) {
            addCriterion("defaultLargeProductImage between", value1, value2, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultlargeproductimageNotBetween(String value1, String value2) {
            addCriterion("defaultLargeProductImage not between", value1, value2, "defaultlargeproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageIsNull() {
            addCriterion("defaultMediumProductImage is null");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageIsNotNull() {
            addCriterion("defaultMediumProductImage is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageEqualTo(String value) {
            addCriterion("defaultMediumProductImage =", value, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageNotEqualTo(String value) {
            addCriterion("defaultMediumProductImage <>", value, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageGreaterThan(String value) {
            addCriterion("defaultMediumProductImage >", value, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageGreaterThanOrEqualTo(String value) {
            addCriterion("defaultMediumProductImage >=", value, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageLessThan(String value) {
            addCriterion("defaultMediumProductImage <", value, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageLessThanOrEqualTo(String value) {
            addCriterion("defaultMediumProductImage <=", value, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageLike(String value) {
            addCriterion("defaultMediumProductImage like", value, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageNotLike(String value) {
            addCriterion("defaultMediumProductImage not like", value, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageIn(List<String> values) {
            addCriterion("defaultMediumProductImage in", values, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageNotIn(List<String> values) {
            addCriterion("defaultMediumProductImage not in", values, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageBetween(String value1, String value2) {
            addCriterion("defaultMediumProductImage between", value1, value2, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultmediumproductimageNotBetween(String value1, String value2) {
            addCriterion("defaultMediumProductImage not between", value1, value2, "defaultmediumproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageIsNull() {
            addCriterion("defaultThumbnailProductImage is null");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageIsNotNull() {
            addCriterion("defaultThumbnailProductImage is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageEqualTo(String value) {
            addCriterion("defaultThumbnailProductImage =", value, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageNotEqualTo(String value) {
            addCriterion("defaultThumbnailProductImage <>", value, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageGreaterThan(String value) {
            addCriterion("defaultThumbnailProductImage >", value, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageGreaterThanOrEqualTo(String value) {
            addCriterion("defaultThumbnailProductImage >=", value, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageLessThan(String value) {
            addCriterion("defaultThumbnailProductImage <", value, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageLessThanOrEqualTo(String value) {
            addCriterion("defaultThumbnailProductImage <=", value, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageLike(String value) {
            addCriterion("defaultThumbnailProductImage like", value, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageNotLike(String value) {
            addCriterion("defaultThumbnailProductImage not like", value, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageIn(List<String> values) {
            addCriterion("defaultThumbnailProductImage in", values, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageNotIn(List<String> values) {
            addCriterion("defaultThumbnailProductImage not in", values, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageBetween(String value1, String value2) {
            addCriterion("defaultThumbnailProductImage between", value1, value2, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultthumbnailproductimageNotBetween(String value1, String value2) {
            addCriterion("defaultThumbnailProductImage not between", value1, value2, "defaultthumbnailproductimage");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoIsNull() {
            addCriterion("defaultStoreLogo is null");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoIsNotNull() {
            addCriterion("defaultStoreLogo is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoEqualTo(String value) {
            addCriterion("defaultStoreLogo =", value, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoNotEqualTo(String value) {
            addCriterion("defaultStoreLogo <>", value, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoGreaterThan(String value) {
            addCriterion("defaultStoreLogo >", value, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoGreaterThanOrEqualTo(String value) {
            addCriterion("defaultStoreLogo >=", value, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoLessThan(String value) {
            addCriterion("defaultStoreLogo <", value, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoLessThanOrEqualTo(String value) {
            addCriterion("defaultStoreLogo <=", value, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoLike(String value) {
            addCriterion("defaultStoreLogo like", value, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoNotLike(String value) {
            addCriterion("defaultStoreLogo not like", value, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoIn(List<String> values) {
            addCriterion("defaultStoreLogo in", values, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoNotIn(List<String> values) {
            addCriterion("defaultStoreLogo not in", values, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoBetween(String value1, String value2) {
            addCriterion("defaultStoreLogo between", value1, value2, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andDefaultstorelogoNotBetween(String value1, String value2) {
            addCriterion("defaultStoreLogo not between", value1, value2, "defaultstorelogo");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaIsNull() {
            addCriterion("watermarkAlpha is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaIsNotNull() {
            addCriterion("watermarkAlpha is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaEqualTo(Integer value) {
            addCriterion("watermarkAlpha =", value, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaNotEqualTo(Integer value) {
            addCriterion("watermarkAlpha <>", value, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaGreaterThan(Integer value) {
            addCriterion("watermarkAlpha >", value, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaGreaterThanOrEqualTo(Integer value) {
            addCriterion("watermarkAlpha >=", value, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaLessThan(Integer value) {
            addCriterion("watermarkAlpha <", value, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaLessThanOrEqualTo(Integer value) {
            addCriterion("watermarkAlpha <=", value, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaIn(List<Integer> values) {
            addCriterion("watermarkAlpha in", values, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaNotIn(List<Integer> values) {
            addCriterion("watermarkAlpha not in", values, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaBetween(Integer value1, Integer value2) {
            addCriterion("watermarkAlpha between", value1, value2, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkalphaNotBetween(Integer value1, Integer value2) {
            addCriterion("watermarkAlpha not between", value1, value2, "watermarkalpha");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileIsNull() {
            addCriterion("watermarkImageFile is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileIsNotNull() {
            addCriterion("watermarkImageFile is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileEqualTo(String value) {
            addCriterion("watermarkImageFile =", value, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileNotEqualTo(String value) {
            addCriterion("watermarkImageFile <>", value, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileGreaterThan(String value) {
            addCriterion("watermarkImageFile >", value, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileGreaterThanOrEqualTo(String value) {
            addCriterion("watermarkImageFile >=", value, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileLessThan(String value) {
            addCriterion("watermarkImageFile <", value, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileLessThanOrEqualTo(String value) {
            addCriterion("watermarkImageFile <=", value, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileLike(String value) {
            addCriterion("watermarkImageFile like", value, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileNotLike(String value) {
            addCriterion("watermarkImageFile not like", value, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileIn(List<String> values) {
            addCriterion("watermarkImageFile in", values, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileNotIn(List<String> values) {
            addCriterion("watermarkImageFile not in", values, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileBetween(String value1, String value2) {
            addCriterion("watermarkImageFile between", value1, value2, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkimagefileNotBetween(String value1, String value2) {
            addCriterion("watermarkImageFile not between", value1, value2, "watermarkimagefile");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionIsNull() {
            addCriterion("watermarkPosition is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionIsNotNull() {
            addCriterion("watermarkPosition is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionEqualTo(Integer value) {
            addCriterion("watermarkPosition =", value, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionNotEqualTo(Integer value) {
            addCriterion("watermarkPosition <>", value, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionGreaterThan(Integer value) {
            addCriterion("watermarkPosition >", value, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("watermarkPosition >=", value, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionLessThan(Integer value) {
            addCriterion("watermarkPosition <", value, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionLessThanOrEqualTo(Integer value) {
            addCriterion("watermarkPosition <=", value, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionIn(List<Integer> values) {
            addCriterion("watermarkPosition in", values, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionNotIn(List<Integer> values) {
            addCriterion("watermarkPosition not in", values, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionBetween(Integer value1, Integer value2) {
            addCriterion("watermarkPosition between", value1, value2, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andWatermarkpositionNotBetween(Integer value1, Integer value2) {
            addCriterion("watermarkPosition not between", value1, value2, "watermarkposition");
            return (Criteria) this;
        }

        public Criteria andPricescaleIsNull() {
            addCriterion("priceScale is null");
            return (Criteria) this;
        }

        public Criteria andPricescaleIsNotNull() {
            addCriterion("priceScale is not null");
            return (Criteria) this;
        }

        public Criteria andPricescaleEqualTo(Integer value) {
            addCriterion("priceScale =", value, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleNotEqualTo(Integer value) {
            addCriterion("priceScale <>", value, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleGreaterThan(Integer value) {
            addCriterion("priceScale >", value, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceScale >=", value, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleLessThan(Integer value) {
            addCriterion("priceScale <", value, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleLessThanOrEqualTo(Integer value) {
            addCriterion("priceScale <=", value, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleIn(List<Integer> values) {
            addCriterion("priceScale in", values, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleNotIn(List<Integer> values) {
            addCriterion("priceScale not in", values, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleBetween(Integer value1, Integer value2) {
            addCriterion("priceScale between", value1, value2, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPricescaleNotBetween(Integer value1, Integer value2) {
            addCriterion("priceScale not between", value1, value2, "pricescale");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeIsNull() {
            addCriterion("priceRoundType is null");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeIsNotNull() {
            addCriterion("priceRoundType is not null");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeEqualTo(Integer value) {
            addCriterion("priceRoundType =", value, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeNotEqualTo(Integer value) {
            addCriterion("priceRoundType <>", value, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeGreaterThan(Integer value) {
            addCriterion("priceRoundType >", value, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceRoundType >=", value, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeLessThan(Integer value) {
            addCriterion("priceRoundType <", value, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeLessThanOrEqualTo(Integer value) {
            addCriterion("priceRoundType <=", value, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeIn(List<Integer> values) {
            addCriterion("priceRoundType in", values, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeNotIn(List<Integer> values) {
            addCriterion("priceRoundType not in", values, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeBetween(Integer value1, Integer value2) {
            addCriterion("priceRoundType between", value1, value2, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andPriceroundtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("priceRoundType not between", value1, value2, "priceroundtype");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceIsNull() {
            addCriterion("isShowMarketPrice is null");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceIsNotNull() {
            addCriterion("isShowMarketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceEqualTo(Integer value) {
            addCriterion("isShowMarketPrice =", value, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceNotEqualTo(Integer value) {
            addCriterion("isShowMarketPrice <>", value, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceGreaterThan(Integer value) {
            addCriterion("isShowMarketPrice >", value, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShowMarketPrice >=", value, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceLessThan(Integer value) {
            addCriterion("isShowMarketPrice <", value, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceLessThanOrEqualTo(Integer value) {
            addCriterion("isShowMarketPrice <=", value, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceIn(List<Integer> values) {
            addCriterion("isShowMarketPrice in", values, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceNotIn(List<Integer> values) {
            addCriterion("isShowMarketPrice not in", values, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceBetween(Integer value1, Integer value2) {
            addCriterion("isShowMarketPrice between", value1, value2, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andIsshowmarketpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("isShowMarketPrice not between", value1, value2, "isshowmarketprice");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleIsNull() {
            addCriterion("defaultMarketPriceScale is null");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleIsNotNull() {
            addCriterion("defaultMarketPriceScale is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleEqualTo(Double value) {
            addCriterion("defaultMarketPriceScale =", value, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleNotEqualTo(Double value) {
            addCriterion("defaultMarketPriceScale <>", value, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleGreaterThan(Double value) {
            addCriterion("defaultMarketPriceScale >", value, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleGreaterThanOrEqualTo(Double value) {
            addCriterion("defaultMarketPriceScale >=", value, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleLessThan(Double value) {
            addCriterion("defaultMarketPriceScale <", value, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleLessThanOrEqualTo(Double value) {
            addCriterion("defaultMarketPriceScale <=", value, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleIn(List<Double> values) {
            addCriterion("defaultMarketPriceScale in", values, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleNotIn(List<Double> values) {
            addCriterion("defaultMarketPriceScale not in", values, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleBetween(Double value1, Double value2) {
            addCriterion("defaultMarketPriceScale between", value1, value2, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andDefaultmarketpricescaleNotBetween(Double value1, Double value2) {
            addCriterion("defaultMarketPriceScale not between", value1, value2, "defaultmarketpricescale");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNull() {
            addCriterion("siteName is null");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNotNull() {
            addCriterion("siteName is not null");
            return (Criteria) this;
        }

        public Criteria andSitenameEqualTo(String value) {
            addCriterion("siteName =", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotEqualTo(String value) {
            addCriterion("siteName <>", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThan(String value) {
            addCriterion("siteName >", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("siteName >=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThan(String value) {
            addCriterion("siteName <", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThanOrEqualTo(String value) {
            addCriterion("siteName <=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLike(String value) {
            addCriterion("siteName like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotLike(String value) {
            addCriterion("siteName not like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameIn(List<String> values) {
            addCriterion("siteName in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotIn(List<String> values) {
            addCriterion("siteName not in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameBetween(String value1, String value2) {
            addCriterion("siteName between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotBetween(String value1, String value2) {
            addCriterion("siteName not between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSiteurlIsNull() {
            addCriterion("siteUrl is null");
            return (Criteria) this;
        }

        public Criteria andSiteurlIsNotNull() {
            addCriterion("siteUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSiteurlEqualTo(String value) {
            addCriterion("siteUrl =", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotEqualTo(String value) {
            addCriterion("siteUrl <>", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlGreaterThan(String value) {
            addCriterion("siteUrl >", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlGreaterThanOrEqualTo(String value) {
            addCriterion("siteUrl >=", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLessThan(String value) {
            addCriterion("siteUrl <", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLessThanOrEqualTo(String value) {
            addCriterion("siteUrl <=", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlLike(String value) {
            addCriterion("siteUrl like", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotLike(String value) {
            addCriterion("siteUrl not like", value, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlIn(List<String> values) {
            addCriterion("siteUrl in", values, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotIn(List<String> values) {
            addCriterion("siteUrl not in", values, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlBetween(String value1, String value2) {
            addCriterion("siteUrl between", value1, value2, "siteurl");
            return (Criteria) this;
        }

        public Criteria andSiteurlNotBetween(String value1, String value2) {
            addCriterion("siteUrl not between", value1, value2, "siteurl");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andHotsearchIsNull() {
            addCriterion("hotSearch is null");
            return (Criteria) this;
        }

        public Criteria andHotsearchIsNotNull() {
            addCriterion("hotSearch is not null");
            return (Criteria) this;
        }

        public Criteria andHotsearchEqualTo(String value) {
            addCriterion("hotSearch =", value, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchNotEqualTo(String value) {
            addCriterion("hotSearch <>", value, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchGreaterThan(String value) {
            addCriterion("hotSearch >", value, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchGreaterThanOrEqualTo(String value) {
            addCriterion("hotSearch >=", value, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchLessThan(String value) {
            addCriterion("hotSearch <", value, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchLessThanOrEqualTo(String value) {
            addCriterion("hotSearch <=", value, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchLike(String value) {
            addCriterion("hotSearch like", value, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchNotLike(String value) {
            addCriterion("hotSearch not like", value, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchIn(List<String> values) {
            addCriterion("hotSearch in", values, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchNotIn(List<String> values) {
            addCriterion("hotSearch not in", values, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchBetween(String value1, String value2) {
            addCriterion("hotSearch between", value1, value2, "hotsearch");
            return (Criteria) this;
        }

        public Criteria andHotsearchNotBetween(String value1, String value2) {
            addCriterion("hotSearch not between", value1, value2, "hotsearch");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCerttextIsNull() {
            addCriterion("certtext is null");
            return (Criteria) this;
        }

        public Criteria andCerttextIsNotNull() {
            addCriterion("certtext is not null");
            return (Criteria) this;
        }

        public Criteria andCerttextEqualTo(String value) {
            addCriterion("certtext =", value, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextNotEqualTo(String value) {
            addCriterion("certtext <>", value, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextGreaterThan(String value) {
            addCriterion("certtext >", value, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextGreaterThanOrEqualTo(String value) {
            addCriterion("certtext >=", value, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextLessThan(String value) {
            addCriterion("certtext <", value, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextLessThanOrEqualTo(String value) {
            addCriterion("certtext <=", value, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextLike(String value) {
            addCriterion("certtext like", value, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextNotLike(String value) {
            addCriterion("certtext not like", value, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextIn(List<String> values) {
            addCriterion("certtext in", values, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextNotIn(List<String> values) {
            addCriterion("certtext not in", values, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextBetween(String value1, String value2) {
            addCriterion("certtext between", value1, value2, "certtext");
            return (Criteria) this;
        }

        public Criteria andCerttextNotBetween(String value1, String value2) {
            addCriterion("certtext not between", value1, value2, "certtext");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesIsNull() {
            addCriterion("allowedRegisterTypes is null");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesIsNotNull() {
            addCriterion("allowedRegisterTypes is not null");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesEqualTo(String value) {
            addCriterion("allowedRegisterTypes =", value, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesNotEqualTo(String value) {
            addCriterion("allowedRegisterTypes <>", value, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesGreaterThan(String value) {
            addCriterion("allowedRegisterTypes >", value, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesGreaterThanOrEqualTo(String value) {
            addCriterion("allowedRegisterTypes >=", value, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesLessThan(String value) {
            addCriterion("allowedRegisterTypes <", value, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesLessThanOrEqualTo(String value) {
            addCriterion("allowedRegisterTypes <=", value, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesLike(String value) {
            addCriterion("allowedRegisterTypes like", value, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesNotLike(String value) {
            addCriterion("allowedRegisterTypes not like", value, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesIn(List<String> values) {
            addCriterion("allowedRegisterTypes in", values, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesNotIn(List<String> values) {
            addCriterion("allowedRegisterTypes not in", values, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesBetween(String value1, String value2) {
            addCriterion("allowedRegisterTypes between", value1, value2, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andAllowedregistertypesNotBetween(String value1, String value2) {
            addCriterion("allowedRegisterTypes not between", value1, value2, "allowedregistertypes");
            return (Criteria) this;
        }

        public Criteria andRegisterpointIsNull() {
            addCriterion("registerPoint is null");
            return (Criteria) this;
        }

        public Criteria andRegisterpointIsNotNull() {
            addCriterion("registerPoint is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterpointEqualTo(Integer value) {
            addCriterion("registerPoint =", value, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointNotEqualTo(Integer value) {
            addCriterion("registerPoint <>", value, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointGreaterThan(Integer value) {
            addCriterion("registerPoint >", value, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("registerPoint >=", value, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointLessThan(Integer value) {
            addCriterion("registerPoint <", value, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointLessThanOrEqualTo(Integer value) {
            addCriterion("registerPoint <=", value, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointIn(List<Integer> values) {
            addCriterion("registerPoint in", values, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointNotIn(List<Integer> values) {
            addCriterion("registerPoint not in", values, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointBetween(Integer value1, Integer value2) {
            addCriterion("registerPoint between", value1, value2, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andRegisterpointNotBetween(Integer value1, Integer value2) {
            addCriterion("registerPoint not between", value1, value2, "registerpoint");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesIsNull() {
            addCriterion("captchaTypes is null");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesIsNotNull() {
            addCriterion("captchaTypes is not null");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesEqualTo(String value) {
            addCriterion("captchaTypes =", value, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesNotEqualTo(String value) {
            addCriterion("captchaTypes <>", value, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesGreaterThan(String value) {
            addCriterion("captchaTypes >", value, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesGreaterThanOrEqualTo(String value) {
            addCriterion("captchaTypes >=", value, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesLessThan(String value) {
            addCriterion("captchaTypes <", value, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesLessThanOrEqualTo(String value) {
            addCriterion("captchaTypes <=", value, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesLike(String value) {
            addCriterion("captchaTypes like", value, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesNotLike(String value) {
            addCriterion("captchaTypes not like", value, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesIn(List<String> values) {
            addCriterion("captchaTypes in", values, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesNotIn(List<String> values) {
            addCriterion("captchaTypes not in", values, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesBetween(String value1, String value2) {
            addCriterion("captchaTypes between", value1, value2, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andCaptchatypesNotBetween(String value1, String value2) {
            addCriterion("captchaTypes not between", value1, value2, "captchatypes");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsIsNull() {
            addCriterion("maxFailedLoginAttempts is null");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsIsNotNull() {
            addCriterion("maxFailedLoginAttempts is not null");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsEqualTo(Integer value) {
            addCriterion("maxFailedLoginAttempts =", value, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsNotEqualTo(Integer value) {
            addCriterion("maxFailedLoginAttempts <>", value, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsGreaterThan(Integer value) {
            addCriterion("maxFailedLoginAttempts >", value, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxFailedLoginAttempts >=", value, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsLessThan(Integer value) {
            addCriterion("maxFailedLoginAttempts <", value, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsLessThanOrEqualTo(Integer value) {
            addCriterion("maxFailedLoginAttempts <=", value, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsIn(List<Integer> values) {
            addCriterion("maxFailedLoginAttempts in", values, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsNotIn(List<Integer> values) {
            addCriterion("maxFailedLoginAttempts not in", values, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsBetween(Integer value1, Integer value2) {
            addCriterion("maxFailedLoginAttempts between", value1, value2, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andMaxfailedloginattemptsNotBetween(Integer value1, Integer value2) {
            addCriterion("maxFailedLoginAttempts not between", value1, value2, "maxfailedloginattempts");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeIsNull() {
            addCriterion("passwordLockTime is null");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeIsNotNull() {
            addCriterion("passwordLockTime is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeEqualTo(Integer value) {
            addCriterion("passwordLockTime =", value, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeNotEqualTo(Integer value) {
            addCriterion("passwordLockTime <>", value, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeGreaterThan(Integer value) {
            addCriterion("passwordLockTime >", value, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("passwordLockTime >=", value, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeLessThan(Integer value) {
            addCriterion("passwordLockTime <", value, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeLessThanOrEqualTo(Integer value) {
            addCriterion("passwordLockTime <=", value, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeIn(List<Integer> values) {
            addCriterion("passwordLockTime in", values, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeNotIn(List<Integer> values) {
            addCriterion("passwordLockTime not in", values, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeBetween(Integer value1, Integer value2) {
            addCriterion("passwordLockTime between", value1, value2, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andPasswordlocktimeNotBetween(Integer value1, Integer value2) {
            addCriterion("passwordLockTime not between", value1, value2, "passwordlocktime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeIsNull() {
            addCriterion("safeKeyExpiryTime is null");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeIsNotNull() {
            addCriterion("safeKeyExpiryTime is not null");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeEqualTo(Integer value) {
            addCriterion("safeKeyExpiryTime =", value, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeNotEqualTo(Integer value) {
            addCriterion("safeKeyExpiryTime <>", value, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeGreaterThan(Integer value) {
            addCriterion("safeKeyExpiryTime >", value, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("safeKeyExpiryTime >=", value, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeLessThan(Integer value) {
            addCriterion("safeKeyExpiryTime <", value, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeLessThanOrEqualTo(Integer value) {
            addCriterion("safeKeyExpiryTime <=", value, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeIn(List<Integer> values) {
            addCriterion("safeKeyExpiryTime in", values, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeNotIn(List<Integer> values) {
            addCriterion("safeKeyExpiryTime not in", values, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeBetween(Integer value1, Integer value2) {
            addCriterion("safeKeyExpiryTime between", value1, value2, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andSafekeyexpirytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("safeKeyExpiryTime not between", value1, value2, "safekeyexpirytime");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeIsNull() {
            addCriterion("uploadMaxSize is null");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeIsNotNull() {
            addCriterion("uploadMaxSize is not null");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeEqualTo(Integer value) {
            addCriterion("uploadMaxSize =", value, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeNotEqualTo(Integer value) {
            addCriterion("uploadMaxSize <>", value, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeGreaterThan(Integer value) {
            addCriterion("uploadMaxSize >", value, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uploadMaxSize >=", value, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeLessThan(Integer value) {
            addCriterion("uploadMaxSize <", value, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeLessThanOrEqualTo(Integer value) {
            addCriterion("uploadMaxSize <=", value, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeIn(List<Integer> values) {
            addCriterion("uploadMaxSize in", values, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeNotIn(List<Integer> values) {
            addCriterion("uploadMaxSize not in", values, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeBetween(Integer value1, Integer value2) {
            addCriterion("uploadMaxSize between", value1, value2, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadmaxsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("uploadMaxSize not between", value1, value2, "uploadmaxsize");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionIsNull() {
            addCriterion("uploadImageExtension is null");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionIsNotNull() {
            addCriterion("uploadImageExtension is not null");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionEqualTo(String value) {
            addCriterion("uploadImageExtension =", value, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionNotEqualTo(String value) {
            addCriterion("uploadImageExtension <>", value, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionGreaterThan(String value) {
            addCriterion("uploadImageExtension >", value, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionGreaterThanOrEqualTo(String value) {
            addCriterion("uploadImageExtension >=", value, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionLessThan(String value) {
            addCriterion("uploadImageExtension <", value, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionLessThanOrEqualTo(String value) {
            addCriterion("uploadImageExtension <=", value, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionLike(String value) {
            addCriterion("uploadImageExtension like", value, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionNotLike(String value) {
            addCriterion("uploadImageExtension not like", value, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionIn(List<String> values) {
            addCriterion("uploadImageExtension in", values, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionNotIn(List<String> values) {
            addCriterion("uploadImageExtension not in", values, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionBetween(String value1, String value2) {
            addCriterion("uploadImageExtension between", value1, value2, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadimageextensionNotBetween(String value1, String value2) {
            addCriterion("uploadImageExtension not between", value1, value2, "uploadimageextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionIsNull() {
            addCriterion("uploadMediaExtension is null");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionIsNotNull() {
            addCriterion("uploadMediaExtension is not null");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionEqualTo(String value) {
            addCriterion("uploadMediaExtension =", value, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionNotEqualTo(String value) {
            addCriterion("uploadMediaExtension <>", value, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionGreaterThan(String value) {
            addCriterion("uploadMediaExtension >", value, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionGreaterThanOrEqualTo(String value) {
            addCriterion("uploadMediaExtension >=", value, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionLessThan(String value) {
            addCriterion("uploadMediaExtension <", value, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionLessThanOrEqualTo(String value) {
            addCriterion("uploadMediaExtension <=", value, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionLike(String value) {
            addCriterion("uploadMediaExtension like", value, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionNotLike(String value) {
            addCriterion("uploadMediaExtension not like", value, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionIn(List<String> values) {
            addCriterion("uploadMediaExtension in", values, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionNotIn(List<String> values) {
            addCriterion("uploadMediaExtension not in", values, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionBetween(String value1, String value2) {
            addCriterion("uploadMediaExtension between", value1, value2, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadmediaextensionNotBetween(String value1, String value2) {
            addCriterion("uploadMediaExtension not between", value1, value2, "uploadmediaextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionIsNull() {
            addCriterion("uploadFileExtension is null");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionIsNotNull() {
            addCriterion("uploadFileExtension is not null");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionEqualTo(String value) {
            addCriterion("uploadFileExtension =", value, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionNotEqualTo(String value) {
            addCriterion("uploadFileExtension <>", value, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionGreaterThan(String value) {
            addCriterion("uploadFileExtension >", value, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionGreaterThanOrEqualTo(String value) {
            addCriterion("uploadFileExtension >=", value, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionLessThan(String value) {
            addCriterion("uploadFileExtension <", value, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionLessThanOrEqualTo(String value) {
            addCriterion("uploadFileExtension <=", value, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionLike(String value) {
            addCriterion("uploadFileExtension like", value, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionNotLike(String value) {
            addCriterion("uploadFileExtension not like", value, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionIn(List<String> values) {
            addCriterion("uploadFileExtension in", values, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionNotIn(List<String> values) {
            addCriterion("uploadFileExtension not in", values, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionBetween(String value1, String value2) {
            addCriterion("uploadFileExtension between", value1, value2, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andUploadfileextensionNotBetween(String value1, String value2) {
            addCriterion("uploadFileExtension not between", value1, value2, "uploadfileextension");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathIsNull() {
            addCriterion("imageUploadPath is null");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathIsNotNull() {
            addCriterion("imageUploadPath is not null");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathEqualTo(String value) {
            addCriterion("imageUploadPath =", value, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathNotEqualTo(String value) {
            addCriterion("imageUploadPath <>", value, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathGreaterThan(String value) {
            addCriterion("imageUploadPath >", value, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathGreaterThanOrEqualTo(String value) {
            addCriterion("imageUploadPath >=", value, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathLessThan(String value) {
            addCriterion("imageUploadPath <", value, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathLessThanOrEqualTo(String value) {
            addCriterion("imageUploadPath <=", value, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathLike(String value) {
            addCriterion("imageUploadPath like", value, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathNotLike(String value) {
            addCriterion("imageUploadPath not like", value, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathIn(List<String> values) {
            addCriterion("imageUploadPath in", values, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathNotIn(List<String> values) {
            addCriterion("imageUploadPath not in", values, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathBetween(String value1, String value2) {
            addCriterion("imageUploadPath between", value1, value2, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andImageuploadpathNotBetween(String value1, String value2) {
            addCriterion("imageUploadPath not between", value1, value2, "imageuploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathIsNull() {
            addCriterion("mediaUploadPath is null");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathIsNotNull() {
            addCriterion("mediaUploadPath is not null");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathEqualTo(String value) {
            addCriterion("mediaUploadPath =", value, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathNotEqualTo(String value) {
            addCriterion("mediaUploadPath <>", value, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathGreaterThan(String value) {
            addCriterion("mediaUploadPath >", value, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathGreaterThanOrEqualTo(String value) {
            addCriterion("mediaUploadPath >=", value, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathLessThan(String value) {
            addCriterion("mediaUploadPath <", value, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathLessThanOrEqualTo(String value) {
            addCriterion("mediaUploadPath <=", value, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathLike(String value) {
            addCriterion("mediaUploadPath like", value, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathNotLike(String value) {
            addCriterion("mediaUploadPath not like", value, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathIn(List<String> values) {
            addCriterion("mediaUploadPath in", values, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathNotIn(List<String> values) {
            addCriterion("mediaUploadPath not in", values, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathBetween(String value1, String value2) {
            addCriterion("mediaUploadPath between", value1, value2, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andMediauploadpathNotBetween(String value1, String value2) {
            addCriterion("mediaUploadPath not between", value1, value2, "mediauploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathIsNull() {
            addCriterion("fileUploadPath is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathIsNotNull() {
            addCriterion("fileUploadPath is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathEqualTo(String value) {
            addCriterion("fileUploadPath =", value, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathNotEqualTo(String value) {
            addCriterion("fileUploadPath <>", value, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathGreaterThan(String value) {
            addCriterion("fileUploadPath >", value, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathGreaterThanOrEqualTo(String value) {
            addCriterion("fileUploadPath >=", value, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathLessThan(String value) {
            addCriterion("fileUploadPath <", value, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathLessThanOrEqualTo(String value) {
            addCriterion("fileUploadPath <=", value, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathLike(String value) {
            addCriterion("fileUploadPath like", value, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathNotLike(String value) {
            addCriterion("fileUploadPath not like", value, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathIn(List<String> values) {
            addCriterion("fileUploadPath in", values, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathNotIn(List<String> values) {
            addCriterion("fileUploadPath not in", values, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathBetween(String value1, String value2) {
            addCriterion("fileUploadPath between", value1, value2, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andFileuploadpathNotBetween(String value1, String value2) {
            addCriterion("fileUploadPath not between", value1, value2, "fileuploadpath");
            return (Criteria) this;
        }

        public Criteria andSmtphostIsNull() {
            addCriterion("smtpHost is null");
            return (Criteria) this;
        }

        public Criteria andSmtphostIsNotNull() {
            addCriterion("smtpHost is not null");
            return (Criteria) this;
        }

        public Criteria andSmtphostEqualTo(String value) {
            addCriterion("smtpHost =", value, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostNotEqualTo(String value) {
            addCriterion("smtpHost <>", value, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostGreaterThan(String value) {
            addCriterion("smtpHost >", value, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostGreaterThanOrEqualTo(String value) {
            addCriterion("smtpHost >=", value, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostLessThan(String value) {
            addCriterion("smtpHost <", value, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostLessThanOrEqualTo(String value) {
            addCriterion("smtpHost <=", value, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostLike(String value) {
            addCriterion("smtpHost like", value, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostNotLike(String value) {
            addCriterion("smtpHost not like", value, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostIn(List<String> values) {
            addCriterion("smtpHost in", values, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostNotIn(List<String> values) {
            addCriterion("smtpHost not in", values, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostBetween(String value1, String value2) {
            addCriterion("smtpHost between", value1, value2, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtphostNotBetween(String value1, String value2) {
            addCriterion("smtpHost not between", value1, value2, "smtphost");
            return (Criteria) this;
        }

        public Criteria andSmtpportIsNull() {
            addCriterion("smtpPort is null");
            return (Criteria) this;
        }

        public Criteria andSmtpportIsNotNull() {
            addCriterion("smtpPort is not null");
            return (Criteria) this;
        }

        public Criteria andSmtpportEqualTo(String value) {
            addCriterion("smtpPort =", value, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportNotEqualTo(String value) {
            addCriterion("smtpPort <>", value, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportGreaterThan(String value) {
            addCriterion("smtpPort >", value, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportGreaterThanOrEqualTo(String value) {
            addCriterion("smtpPort >=", value, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportLessThan(String value) {
            addCriterion("smtpPort <", value, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportLessThanOrEqualTo(String value) {
            addCriterion("smtpPort <=", value, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportLike(String value) {
            addCriterion("smtpPort like", value, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportNotLike(String value) {
            addCriterion("smtpPort not like", value, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportIn(List<String> values) {
            addCriterion("smtpPort in", values, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportNotIn(List<String> values) {
            addCriterion("smtpPort not in", values, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportBetween(String value1, String value2) {
            addCriterion("smtpPort between", value1, value2, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpportNotBetween(String value1, String value2) {
            addCriterion("smtpPort not between", value1, value2, "smtpport");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameIsNull() {
            addCriterion("smtpUsername is null");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameIsNotNull() {
            addCriterion("smtpUsername is not null");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameEqualTo(String value) {
            addCriterion("smtpUsername =", value, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameNotEqualTo(String value) {
            addCriterion("smtpUsername <>", value, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameGreaterThan(String value) {
            addCriterion("smtpUsername >", value, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameGreaterThanOrEqualTo(String value) {
            addCriterion("smtpUsername >=", value, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameLessThan(String value) {
            addCriterion("smtpUsername <", value, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameLessThanOrEqualTo(String value) {
            addCriterion("smtpUsername <=", value, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameLike(String value) {
            addCriterion("smtpUsername like", value, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameNotLike(String value) {
            addCriterion("smtpUsername not like", value, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameIn(List<String> values) {
            addCriterion("smtpUsername in", values, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameNotIn(List<String> values) {
            addCriterion("smtpUsername not in", values, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameBetween(String value1, String value2) {
            addCriterion("smtpUsername between", value1, value2, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtpusernameNotBetween(String value1, String value2) {
            addCriterion("smtpUsername not between", value1, value2, "smtpusername");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordIsNull() {
            addCriterion("smtpPassword is null");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordIsNotNull() {
            addCriterion("smtpPassword is not null");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordEqualTo(String value) {
            addCriterion("smtpPassword =", value, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordNotEqualTo(String value) {
            addCriterion("smtpPassword <>", value, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordGreaterThan(String value) {
            addCriterion("smtpPassword >", value, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordGreaterThanOrEqualTo(String value) {
            addCriterion("smtpPassword >=", value, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordLessThan(String value) {
            addCriterion("smtpPassword <", value, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordLessThanOrEqualTo(String value) {
            addCriterion("smtpPassword <=", value, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordLike(String value) {
            addCriterion("smtpPassword like", value, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordNotLike(String value) {
            addCriterion("smtpPassword not like", value, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordIn(List<String> values) {
            addCriterion("smtpPassword in", values, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordNotIn(List<String> values) {
            addCriterion("smtpPassword not in", values, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordBetween(String value1, String value2) {
            addCriterion("smtpPassword between", value1, value2, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtppasswordNotBetween(String value1, String value2) {
            addCriterion("smtpPassword not between", value1, value2, "smtppassword");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledIsNull() {
            addCriterion("smtpSSLEnabled is null");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledIsNotNull() {
            addCriterion("smtpSSLEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledEqualTo(String value) {
            addCriterion("smtpSSLEnabled =", value, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledNotEqualTo(String value) {
            addCriterion("smtpSSLEnabled <>", value, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledGreaterThan(String value) {
            addCriterion("smtpSSLEnabled >", value, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledGreaterThanOrEqualTo(String value) {
            addCriterion("smtpSSLEnabled >=", value, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledLessThan(String value) {
            addCriterion("smtpSSLEnabled <", value, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledLessThanOrEqualTo(String value) {
            addCriterion("smtpSSLEnabled <=", value, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledLike(String value) {
            addCriterion("smtpSSLEnabled like", value, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledNotLike(String value) {
            addCriterion("smtpSSLEnabled not like", value, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledIn(List<String> values) {
            addCriterion("smtpSSLEnabled in", values, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledNotIn(List<String> values) {
            addCriterion("smtpSSLEnabled not in", values, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledBetween(String value1, String value2) {
            addCriterion("smtpSSLEnabled between", value1, value2, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpsslenabledNotBetween(String value1, String value2) {
            addCriterion("smtpSSLEnabled not between", value1, value2, "smtpsslenabled");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailIsNull() {
            addCriterion("smtpFromMail is null");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailIsNotNull() {
            addCriterion("smtpFromMail is not null");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailEqualTo(String value) {
            addCriterion("smtpFromMail =", value, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailNotEqualTo(String value) {
            addCriterion("smtpFromMail <>", value, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailGreaterThan(String value) {
            addCriterion("smtpFromMail >", value, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailGreaterThanOrEqualTo(String value) {
            addCriterion("smtpFromMail >=", value, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailLessThan(String value) {
            addCriterion("smtpFromMail <", value, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailLessThanOrEqualTo(String value) {
            addCriterion("smtpFromMail <=", value, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailLike(String value) {
            addCriterion("smtpFromMail like", value, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailNotLike(String value) {
            addCriterion("smtpFromMail not like", value, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailIn(List<String> values) {
            addCriterion("smtpFromMail in", values, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailNotIn(List<String> values) {
            addCriterion("smtpFromMail not in", values, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailBetween(String value1, String value2) {
            addCriterion("smtpFromMail between", value1, value2, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andSmtpfrommailNotBetween(String value1, String value2) {
            addCriterion("smtpFromMail not between", value1, value2, "smtpfrommail");
            return (Criteria) this;
        }

        public Criteria andTomailIsNull() {
            addCriterion("toMail is null");
            return (Criteria) this;
        }

        public Criteria andTomailIsNotNull() {
            addCriterion("toMail is not null");
            return (Criteria) this;
        }

        public Criteria andTomailEqualTo(String value) {
            addCriterion("toMail =", value, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailNotEqualTo(String value) {
            addCriterion("toMail <>", value, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailGreaterThan(String value) {
            addCriterion("toMail >", value, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailGreaterThanOrEqualTo(String value) {
            addCriterion("toMail >=", value, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailLessThan(String value) {
            addCriterion("toMail <", value, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailLessThanOrEqualTo(String value) {
            addCriterion("toMail <=", value, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailLike(String value) {
            addCriterion("toMail like", value, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailNotLike(String value) {
            addCriterion("toMail not like", value, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailIn(List<String> values) {
            addCriterion("toMail in", values, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailNotIn(List<String> values) {
            addCriterion("toMail not in", values, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailBetween(String value1, String value2) {
            addCriterion("toMail between", value1, value2, "tomail");
            return (Criteria) this;
        }

        public Criteria andTomailNotBetween(String value1, String value2) {
            addCriterion("toMail not between", value1, value2, "tomail");
            return (Criteria) this;
        }

        public Criteria andCurrencysignIsNull() {
            addCriterion("currencySign is null");
            return (Criteria) this;
        }

        public Criteria andCurrencysignIsNotNull() {
            addCriterion("currencySign is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencysignEqualTo(String value) {
            addCriterion("currencySign =", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignNotEqualTo(String value) {
            addCriterion("currencySign <>", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignGreaterThan(String value) {
            addCriterion("currencySign >", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignGreaterThanOrEqualTo(String value) {
            addCriterion("currencySign >=", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignLessThan(String value) {
            addCriterion("currencySign <", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignLessThanOrEqualTo(String value) {
            addCriterion("currencySign <=", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignLike(String value) {
            addCriterion("currencySign like", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignNotLike(String value) {
            addCriterion("currencySign not like", value, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignIn(List<String> values) {
            addCriterion("currencySign in", values, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignNotIn(List<String> values) {
            addCriterion("currencySign not in", values, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignBetween(String value1, String value2) {
            addCriterion("currencySign between", value1, value2, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencysignNotBetween(String value1, String value2) {
            addCriterion("currencySign not between", value1, value2, "currencysign");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitIsNull() {
            addCriterion("currencyUnit is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitIsNotNull() {
            addCriterion("currencyUnit is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitEqualTo(String value) {
            addCriterion("currencyUnit =", value, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitNotEqualTo(String value) {
            addCriterion("currencyUnit <>", value, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitGreaterThan(String value) {
            addCriterion("currencyUnit >", value, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitGreaterThanOrEqualTo(String value) {
            addCriterion("currencyUnit >=", value, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitLessThan(String value) {
            addCriterion("currencyUnit <", value, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitLessThanOrEqualTo(String value) {
            addCriterion("currencyUnit <=", value, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitLike(String value) {
            addCriterion("currencyUnit like", value, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitNotLike(String value) {
            addCriterion("currencyUnit not like", value, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitIn(List<String> values) {
            addCriterion("currencyUnit in", values, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitNotIn(List<String> values) {
            addCriterion("currencyUnit not in", values, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitBetween(String value1, String value2) {
            addCriterion("currencyUnit between", value1, value2, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andCurrencyunitNotBetween(String value1, String value2) {
            addCriterion("currencyUnit not between", value1, value2, "currencyunit");
            return (Criteria) this;
        }

        public Criteria andStockalertcountIsNull() {
            addCriterion("stockAlertCount is null");
            return (Criteria) this;
        }

        public Criteria andStockalertcountIsNotNull() {
            addCriterion("stockAlertCount is not null");
            return (Criteria) this;
        }

        public Criteria andStockalertcountEqualTo(Integer value) {
            addCriterion("stockAlertCount =", value, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountNotEqualTo(Integer value) {
            addCriterion("stockAlertCount <>", value, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountGreaterThan(Integer value) {
            addCriterion("stockAlertCount >", value, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockAlertCount >=", value, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountLessThan(Integer value) {
            addCriterion("stockAlertCount <", value, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountLessThanOrEqualTo(Integer value) {
            addCriterion("stockAlertCount <=", value, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountIn(List<Integer> values) {
            addCriterion("stockAlertCount in", values, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountNotIn(List<Integer> values) {
            addCriterion("stockAlertCount not in", values, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountBetween(Integer value1, Integer value2) {
            addCriterion("stockAlertCount between", value1, value2, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andStockalertcountNotBetween(Integer value1, Integer value2) {
            addCriterion("stockAlertCount not between", value1, value2, "stockalertcount");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeIsNull() {
            addCriterion("automaticReceiveTime is null");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeIsNotNull() {
            addCriterion("automaticReceiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeEqualTo(Integer value) {
            addCriterion("automaticReceiveTime =", value, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeNotEqualTo(Integer value) {
            addCriterion("automaticReceiveTime <>", value, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeGreaterThan(Integer value) {
            addCriterion("automaticReceiveTime >", value, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("automaticReceiveTime >=", value, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeLessThan(Integer value) {
            addCriterion("automaticReceiveTime <", value, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeLessThanOrEqualTo(Integer value) {
            addCriterion("automaticReceiveTime <=", value, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeIn(List<Integer> values) {
            addCriterion("automaticReceiveTime in", values, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeNotIn(List<Integer> values) {
            addCriterion("automaticReceiveTime not in", values, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeBetween(Integer value1, Integer value2) {
            addCriterion("automaticReceiveTime between", value1, value2, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andAutomaticreceivetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("automaticReceiveTime not between", value1, value2, "automaticreceivetime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeIsNull() {
            addCriterion("stockAllocationTime is null");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeIsNotNull() {
            addCriterion("stockAllocationTime is not null");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeEqualTo(Integer value) {
            addCriterion("stockAllocationTime =", value, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeNotEqualTo(Integer value) {
            addCriterion("stockAllocationTime <>", value, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeGreaterThan(Integer value) {
            addCriterion("stockAllocationTime >", value, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockAllocationTime >=", value, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeLessThan(Integer value) {
            addCriterion("stockAllocationTime <", value, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeLessThanOrEqualTo(Integer value) {
            addCriterion("stockAllocationTime <=", value, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeIn(List<Integer> values) {
            addCriterion("stockAllocationTime in", values, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeNotIn(List<Integer> values) {
            addCriterion("stockAllocationTime not in", values, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeBetween(Integer value1, Integer value2) {
            addCriterion("stockAllocationTime between", value1, value2, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andStockallocationtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("stockAllocationTime not between", value1, value2, "stockallocationtime");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleIsNull() {
            addCriterion("defaultPointScale is null");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleIsNotNull() {
            addCriterion("defaultPointScale is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleEqualTo(Integer value) {
            addCriterion("defaultPointScale =", value, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleNotEqualTo(Integer value) {
            addCriterion("defaultPointScale <>", value, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleGreaterThan(Integer value) {
            addCriterion("defaultPointScale >", value, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("defaultPointScale >=", value, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleLessThan(Integer value) {
            addCriterion("defaultPointScale <", value, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleLessThanOrEqualTo(Integer value) {
            addCriterion("defaultPointScale <=", value, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleIn(List<Integer> values) {
            addCriterion("defaultPointScale in", values, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleNotIn(List<Integer> values) {
            addCriterion("defaultPointScale not in", values, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleBetween(Integer value1, Integer value2) {
            addCriterion("defaultPointScale between", value1, value2, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andDefaultpointscaleNotBetween(Integer value1, Integer value2) {
            addCriterion("defaultPointScale not between", value1, value2, "defaultpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleIsNull() {
            addCriterion("maxPointScale is null");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleIsNotNull() {
            addCriterion("maxPointScale is not null");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleEqualTo(Integer value) {
            addCriterion("maxPointScale =", value, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleNotEqualTo(Integer value) {
            addCriterion("maxPointScale <>", value, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleGreaterThan(Integer value) {
            addCriterion("maxPointScale >", value, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxPointScale >=", value, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleLessThan(Integer value) {
            addCriterion("maxPointScale <", value, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleLessThanOrEqualTo(Integer value) {
            addCriterion("maxPointScale <=", value, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleIn(List<Integer> values) {
            addCriterion("maxPointScale in", values, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleNotIn(List<Integer> values) {
            addCriterion("maxPointScale not in", values, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleBetween(Integer value1, Integer value2) {
            addCriterion("maxPointScale between", value1, value2, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andMaxpointscaleNotBetween(Integer value1, Integer value2) {
            addCriterion("maxPointScale not between", value1, value2, "maxpointscale");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledIsNull() {
            addCriterion("isDevelopmentEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledIsNotNull() {
            addCriterion("isDevelopmentEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledEqualTo(Integer value) {
            addCriterion("isDevelopmentEnabled =", value, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledNotEqualTo(Integer value) {
            addCriterion("isDevelopmentEnabled <>", value, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledGreaterThan(Integer value) {
            addCriterion("isDevelopmentEnabled >", value, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDevelopmentEnabled >=", value, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledLessThan(Integer value) {
            addCriterion("isDevelopmentEnabled <", value, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledLessThanOrEqualTo(Integer value) {
            addCriterion("isDevelopmentEnabled <=", value, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledIn(List<Integer> values) {
            addCriterion("isDevelopmentEnabled in", values, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledNotIn(List<Integer> values) {
            addCriterion("isDevelopmentEnabled not in", values, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledBetween(Integer value1, Integer value2) {
            addCriterion("isDevelopmentEnabled between", value1, value2, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsdevelopmentenabledNotBetween(Integer value1, Integer value2) {
            addCriterion("isDevelopmentEnabled not between", value1, value2, "isdevelopmentenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledIsNull() {
            addCriterion("isReviewEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledIsNotNull() {
            addCriterion("isReviewEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledEqualTo(Integer value) {
            addCriterion("isReviewEnabled =", value, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledNotEqualTo(Integer value) {
            addCriterion("isReviewEnabled <>", value, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledGreaterThan(Integer value) {
            addCriterion("isReviewEnabled >", value, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("isReviewEnabled >=", value, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledLessThan(Integer value) {
            addCriterion("isReviewEnabled <", value, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledLessThanOrEqualTo(Integer value) {
            addCriterion("isReviewEnabled <=", value, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledIn(List<Integer> values) {
            addCriterion("isReviewEnabled in", values, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledNotIn(List<Integer> values) {
            addCriterion("isReviewEnabled not in", values, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledBetween(Integer value1, Integer value2) {
            addCriterion("isReviewEnabled between", value1, value2, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewenabledNotBetween(Integer value1, Integer value2) {
            addCriterion("isReviewEnabled not between", value1, value2, "isreviewenabled");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckIsNull() {
            addCriterion("isReviewCheck is null");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckIsNotNull() {
            addCriterion("isReviewCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckEqualTo(Integer value) {
            addCriterion("isReviewCheck =", value, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckNotEqualTo(Integer value) {
            addCriterion("isReviewCheck <>", value, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckGreaterThan(Integer value) {
            addCriterion("isReviewCheck >", value, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("isReviewCheck >=", value, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckLessThan(Integer value) {
            addCriterion("isReviewCheck <", value, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckLessThanOrEqualTo(Integer value) {
            addCriterion("isReviewCheck <=", value, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckIn(List<Integer> values) {
            addCriterion("isReviewCheck in", values, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckNotIn(List<Integer> values) {
            addCriterion("isReviewCheck not in", values, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckBetween(Integer value1, Integer value2) {
            addCriterion("isReviewCheck between", value1, value2, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsreviewcheckNotBetween(Integer value1, Integer value2) {
            addCriterion("isReviewCheck not between", value1, value2, "isreviewcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledIsNull() {
            addCriterion("isConsultationEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledIsNotNull() {
            addCriterion("isConsultationEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledEqualTo(Integer value) {
            addCriterion("isConsultationEnabled =", value, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledNotEqualTo(Integer value) {
            addCriterion("isConsultationEnabled <>", value, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledGreaterThan(Integer value) {
            addCriterion("isConsultationEnabled >", value, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("isConsultationEnabled >=", value, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledLessThan(Integer value) {
            addCriterion("isConsultationEnabled <", value, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledLessThanOrEqualTo(Integer value) {
            addCriterion("isConsultationEnabled <=", value, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledIn(List<Integer> values) {
            addCriterion("isConsultationEnabled in", values, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledNotIn(List<Integer> values) {
            addCriterion("isConsultationEnabled not in", values, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledBetween(Integer value1, Integer value2) {
            addCriterion("isConsultationEnabled between", value1, value2, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationenabledNotBetween(Integer value1, Integer value2) {
            addCriterion("isConsultationEnabled not between", value1, value2, "isconsultationenabled");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckIsNull() {
            addCriterion("isConsultationCheck is null");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckIsNotNull() {
            addCriterion("isConsultationCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckEqualTo(Integer value) {
            addCriterion("isConsultationCheck =", value, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckNotEqualTo(Integer value) {
            addCriterion("isConsultationCheck <>", value, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckGreaterThan(Integer value) {
            addCriterion("isConsultationCheck >", value, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("isConsultationCheck >=", value, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckLessThan(Integer value) {
            addCriterion("isConsultationCheck <", value, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckLessThanOrEqualTo(Integer value) {
            addCriterion("isConsultationCheck <=", value, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckIn(List<Integer> values) {
            addCriterion("isConsultationCheck in", values, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckNotIn(List<Integer> values) {
            addCriterion("isConsultationCheck not in", values, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckBetween(Integer value1, Integer value2) {
            addCriterion("isConsultationCheck between", value1, value2, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsconsultationcheckNotBetween(Integer value1, Integer value2) {
            addCriterion("isConsultationCheck not between", value1, value2, "isconsultationcheck");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledIsNull() {
            addCriterion("isInvoiceEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledIsNotNull() {
            addCriterion("isInvoiceEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledEqualTo(Integer value) {
            addCriterion("isInvoiceEnabled =", value, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledNotEqualTo(Integer value) {
            addCriterion("isInvoiceEnabled <>", value, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledGreaterThan(Integer value) {
            addCriterion("isInvoiceEnabled >", value, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("isInvoiceEnabled >=", value, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledLessThan(Integer value) {
            addCriterion("isInvoiceEnabled <", value, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledLessThanOrEqualTo(Integer value) {
            addCriterion("isInvoiceEnabled <=", value, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledIn(List<Integer> values) {
            addCriterion("isInvoiceEnabled in", values, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledNotIn(List<Integer> values) {
            addCriterion("isInvoiceEnabled not in", values, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledBetween(Integer value1, Integer value2) {
            addCriterion("isInvoiceEnabled between", value1, value2, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceenabledNotBetween(Integer value1, Integer value2) {
            addCriterion("isInvoiceEnabled not between", value1, value2, "isinvoiceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledIsNull() {
            addCriterion("isTaxPriceEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledIsNotNull() {
            addCriterion("isTaxPriceEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledEqualTo(Integer value) {
            addCriterion("isTaxPriceEnabled =", value, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledNotEqualTo(Integer value) {
            addCriterion("isTaxPriceEnabled <>", value, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledGreaterThan(Integer value) {
            addCriterion("isTaxPriceEnabled >", value, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("isTaxPriceEnabled >=", value, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledLessThan(Integer value) {
            addCriterion("isTaxPriceEnabled <", value, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledLessThanOrEqualTo(Integer value) {
            addCriterion("isTaxPriceEnabled <=", value, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledIn(List<Integer> values) {
            addCriterion("isTaxPriceEnabled in", values, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledNotIn(List<Integer> values) {
            addCriterion("isTaxPriceEnabled not in", values, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledBetween(Integer value1, Integer value2) {
            addCriterion("isTaxPriceEnabled between", value1, value2, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andIstaxpriceenabledNotBetween(Integer value1, Integer value2) {
            addCriterion("isTaxPriceEnabled not between", value1, value2, "istaxpriceenabled");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("taxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("taxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Double value) {
            addCriterion("taxRate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Double value) {
            addCriterion("taxRate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Double value) {
            addCriterion("taxRate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Double value) {
            addCriterion("taxRate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Double value) {
            addCriterion("taxRate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Double value) {
            addCriterion("taxRate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Double> values) {
            addCriterion("taxRate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Double> values) {
            addCriterion("taxRate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Double value1, Double value2) {
            addCriterion("taxRate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Double value1, Double value2) {
            addCriterion("taxRate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andCookiepathIsNull() {
            addCriterion("cookiePath is null");
            return (Criteria) this;
        }

        public Criteria andCookiepathIsNotNull() {
            addCriterion("cookiePath is not null");
            return (Criteria) this;
        }

        public Criteria andCookiepathEqualTo(String value) {
            addCriterion("cookiePath =", value, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathNotEqualTo(String value) {
            addCriterion("cookiePath <>", value, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathGreaterThan(String value) {
            addCriterion("cookiePath >", value, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathGreaterThanOrEqualTo(String value) {
            addCriterion("cookiePath >=", value, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathLessThan(String value) {
            addCriterion("cookiePath <", value, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathLessThanOrEqualTo(String value) {
            addCriterion("cookiePath <=", value, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathLike(String value) {
            addCriterion("cookiePath like", value, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathNotLike(String value) {
            addCriterion("cookiePath not like", value, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathIn(List<String> values) {
            addCriterion("cookiePath in", values, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathNotIn(List<String> values) {
            addCriterion("cookiePath not in", values, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathBetween(String value1, String value2) {
            addCriterion("cookiePath between", value1, value2, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiepathNotBetween(String value1, String value2) {
            addCriterion("cookiePath not between", value1, value2, "cookiepath");
            return (Criteria) this;
        }

        public Criteria andCookiedomainIsNull() {
            addCriterion("cookieDomain is null");
            return (Criteria) this;
        }

        public Criteria andCookiedomainIsNotNull() {
            addCriterion("cookieDomain is not null");
            return (Criteria) this;
        }

        public Criteria andCookiedomainEqualTo(String value) {
            addCriterion("cookieDomain =", value, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainNotEqualTo(String value) {
            addCriterion("cookieDomain <>", value, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainGreaterThan(String value) {
            addCriterion("cookieDomain >", value, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainGreaterThanOrEqualTo(String value) {
            addCriterion("cookieDomain >=", value, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainLessThan(String value) {
            addCriterion("cookieDomain <", value, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainLessThanOrEqualTo(String value) {
            addCriterion("cookieDomain <=", value, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainLike(String value) {
            addCriterion("cookieDomain like", value, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainNotLike(String value) {
            addCriterion("cookieDomain not like", value, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainIn(List<String> values) {
            addCriterion("cookieDomain in", values, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainNotIn(List<String> values) {
            addCriterion("cookieDomain not in", values, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainBetween(String value1, String value2) {
            addCriterion("cookieDomain between", value1, value2, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andCookiedomainNotBetween(String value1, String value2) {
            addCriterion("cookieDomain not between", value1, value2, "cookiedomain");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyIsNull() {
            addCriterion("kuaidi100Key is null");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyIsNotNull() {
            addCriterion("kuaidi100Key is not null");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyEqualTo(String value) {
            addCriterion("kuaidi100Key =", value, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyNotEqualTo(String value) {
            addCriterion("kuaidi100Key <>", value, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyGreaterThan(String value) {
            addCriterion("kuaidi100Key >", value, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyGreaterThanOrEqualTo(String value) {
            addCriterion("kuaidi100Key >=", value, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyLessThan(String value) {
            addCriterion("kuaidi100Key <", value, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyLessThanOrEqualTo(String value) {
            addCriterion("kuaidi100Key <=", value, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyLike(String value) {
            addCriterion("kuaidi100Key like", value, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyNotLike(String value) {
            addCriterion("kuaidi100Key not like", value, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyIn(List<String> values) {
            addCriterion("kuaidi100Key in", values, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyNotIn(List<String> values) {
            addCriterion("kuaidi100Key not in", values, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyBetween(String value1, String value2) {
            addCriterion("kuaidi100Key between", value1, value2, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andKuaidi100keyNotBetween(String value1, String value2) {
            addCriterion("kuaidi100Key not between", value1, value2, "kuaidi100key");
            return (Criteria) this;
        }

        public Criteria andSmssnIsNull() {
            addCriterion("smsSn is null");
            return (Criteria) this;
        }

        public Criteria andSmssnIsNotNull() {
            addCriterion("smsSn is not null");
            return (Criteria) this;
        }

        public Criteria andSmssnEqualTo(String value) {
            addCriterion("smsSn =", value, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnNotEqualTo(String value) {
            addCriterion("smsSn <>", value, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnGreaterThan(String value) {
            addCriterion("smsSn >", value, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnGreaterThanOrEqualTo(String value) {
            addCriterion("smsSn >=", value, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnLessThan(String value) {
            addCriterion("smsSn <", value, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnLessThanOrEqualTo(String value) {
            addCriterion("smsSn <=", value, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnLike(String value) {
            addCriterion("smsSn like", value, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnNotLike(String value) {
            addCriterion("smsSn not like", value, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnIn(List<String> values) {
            addCriterion("smsSn in", values, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnNotIn(List<String> values) {
            addCriterion("smsSn not in", values, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnBetween(String value1, String value2) {
            addCriterion("smsSn between", value1, value2, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmssnNotBetween(String value1, String value2) {
            addCriterion("smsSn not between", value1, value2, "smssn");
            return (Criteria) this;
        }

        public Criteria andSmskeyIsNull() {
            addCriterion("smsKey is null");
            return (Criteria) this;
        }

        public Criteria andSmskeyIsNotNull() {
            addCriterion("smsKey is not null");
            return (Criteria) this;
        }

        public Criteria andSmskeyEqualTo(String value) {
            addCriterion("smsKey =", value, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyNotEqualTo(String value) {
            addCriterion("smsKey <>", value, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyGreaterThan(String value) {
            addCriterion("smsKey >", value, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyGreaterThanOrEqualTo(String value) {
            addCriterion("smsKey >=", value, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyLessThan(String value) {
            addCriterion("smsKey <", value, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyLessThanOrEqualTo(String value) {
            addCriterion("smsKey <=", value, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyLike(String value) {
            addCriterion("smsKey like", value, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyNotLike(String value) {
            addCriterion("smsKey not like", value, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyIn(List<String> values) {
            addCriterion("smsKey in", values, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyNotIn(List<String> values) {
            addCriterion("smsKey not in", values, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyBetween(String value1, String value2) {
            addCriterion("smsKey between", value1, value2, "smskey");
            return (Criteria) this;
        }

        public Criteria andSmskeyNotBetween(String value1, String value2) {
            addCriterion("smsKey not between", value1, value2, "smskey");
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
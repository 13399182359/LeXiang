package com.LeXiang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliverytemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliverytemplateExample() {
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

        public Criteria andBackgroundIsNull() {
            addCriterion("background is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundIsNotNull() {
            addCriterion("background is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundEqualTo(String value) {
            addCriterion("background =", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotEqualTo(String value) {
            addCriterion("background <>", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundGreaterThan(String value) {
            addCriterion("background >", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("background >=", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLessThan(String value) {
            addCriterion("background <", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLessThanOrEqualTo(String value) {
            addCriterion("background <=", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLike(String value) {
            addCriterion("background like", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotLike(String value) {
            addCriterion("background not like", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundIn(List<String> values) {
            addCriterion("background in", values, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotIn(List<String> values) {
            addCriterion("background not in", values, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundBetween(String value1, String value2) {
            addCriterion("background between", value1, value2, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotBetween(String value1, String value2) {
            addCriterion("background not between", value1, value2, "background");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("isDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("isDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Boolean value) {
            addCriterion("isDefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Boolean value) {
            addCriterion("isDefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Boolean value) {
            addCriterion("isDefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Boolean value) {
            addCriterion("isDefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("isDefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Boolean> values) {
            addCriterion("isDefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Boolean> values) {
            addCriterion("isDefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("isDefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDefault not between", value1, value2, "isdefault");
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

        public Criteria andOffsetxIsNull() {
            addCriterion("offsetX is null");
            return (Criteria) this;
        }

        public Criteria andOffsetxIsNotNull() {
            addCriterion("offsetX is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetxEqualTo(Integer value) {
            addCriterion("offsetX =", value, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxNotEqualTo(Integer value) {
            addCriterion("offsetX <>", value, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxGreaterThan(Integer value) {
            addCriterion("offsetX >", value, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxGreaterThanOrEqualTo(Integer value) {
            addCriterion("offsetX >=", value, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxLessThan(Integer value) {
            addCriterion("offsetX <", value, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxLessThanOrEqualTo(Integer value) {
            addCriterion("offsetX <=", value, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxIn(List<Integer> values) {
            addCriterion("offsetX in", values, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxNotIn(List<Integer> values) {
            addCriterion("offsetX not in", values, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxBetween(Integer value1, Integer value2) {
            addCriterion("offsetX between", value1, value2, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetxNotBetween(Integer value1, Integer value2) {
            addCriterion("offsetX not between", value1, value2, "offsetx");
            return (Criteria) this;
        }

        public Criteria andOffsetyIsNull() {
            addCriterion("offsetY is null");
            return (Criteria) this;
        }

        public Criteria andOffsetyIsNotNull() {
            addCriterion("offsetY is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetyEqualTo(Integer value) {
            addCriterion("offsetY =", value, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyNotEqualTo(Integer value) {
            addCriterion("offsetY <>", value, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyGreaterThan(Integer value) {
            addCriterion("offsetY >", value, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyGreaterThanOrEqualTo(Integer value) {
            addCriterion("offsetY >=", value, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyLessThan(Integer value) {
            addCriterion("offsetY <", value, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyLessThanOrEqualTo(Integer value) {
            addCriterion("offsetY <=", value, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyIn(List<Integer> values) {
            addCriterion("offsetY in", values, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyNotIn(List<Integer> values) {
            addCriterion("offsetY not in", values, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyBetween(Integer value1, Integer value2) {
            addCriterion("offsetY between", value1, value2, "offsety");
            return (Criteria) this;
        }

        public Criteria andOffsetyNotBetween(Integer value1, Integer value2) {
            addCriterion("offsetY not between", value1, value2, "offsety");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
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
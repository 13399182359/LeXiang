package com.LeXiang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIsdraftIsNull() {
            addCriterion("isDraft is null");
            return (Criteria) this;
        }

        public Criteria andIsdraftIsNotNull() {
            addCriterion("isDraft is not null");
            return (Criteria) this;
        }

        public Criteria andIsdraftEqualTo(Boolean value) {
            addCriterion("isDraft =", value, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftNotEqualTo(Boolean value) {
            addCriterion("isDraft <>", value, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftGreaterThan(Boolean value) {
            addCriterion("isDraft >", value, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDraft >=", value, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftLessThan(Boolean value) {
            addCriterion("isDraft <", value, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftLessThanOrEqualTo(Boolean value) {
            addCriterion("isDraft <=", value, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftIn(List<Boolean> values) {
            addCriterion("isDraft in", values, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftNotIn(List<Boolean> values) {
            addCriterion("isDraft not in", values, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftBetween(Boolean value1, Boolean value2) {
            addCriterion("isDraft between", value1, value2, "isdraft");
            return (Criteria) this;
        }

        public Criteria andIsdraftNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDraft not between", value1, value2, "isdraft");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteIsNull() {
            addCriterion("receiverDelete is null");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteIsNotNull() {
            addCriterion("receiverDelete is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteEqualTo(Boolean value) {
            addCriterion("receiverDelete =", value, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteNotEqualTo(Boolean value) {
            addCriterion("receiverDelete <>", value, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteGreaterThan(Boolean value) {
            addCriterion("receiverDelete >", value, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("receiverDelete >=", value, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteLessThan(Boolean value) {
            addCriterion("receiverDelete <", value, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("receiverDelete <=", value, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteIn(List<Boolean> values) {
            addCriterion("receiverDelete in", values, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteNotIn(List<Boolean> values) {
            addCriterion("receiverDelete not in", values, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("receiverDelete between", value1, value2, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("receiverDelete not between", value1, value2, "receiverdelete");
            return (Criteria) this;
        }

        public Criteria andReceiverreadIsNull() {
            addCriterion("receiverRead is null");
            return (Criteria) this;
        }

        public Criteria andReceiverreadIsNotNull() {
            addCriterion("receiverRead is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverreadEqualTo(Boolean value) {
            addCriterion("receiverRead =", value, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadNotEqualTo(Boolean value) {
            addCriterion("receiverRead <>", value, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadGreaterThan(Boolean value) {
            addCriterion("receiverRead >", value, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("receiverRead >=", value, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadLessThan(Boolean value) {
            addCriterion("receiverRead <", value, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadLessThanOrEqualTo(Boolean value) {
            addCriterion("receiverRead <=", value, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadIn(List<Boolean> values) {
            addCriterion("receiverRead in", values, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadNotIn(List<Boolean> values) {
            addCriterion("receiverRead not in", values, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadBetween(Boolean value1, Boolean value2) {
            addCriterion("receiverRead between", value1, value2, "receiverread");
            return (Criteria) this;
        }

        public Criteria andReceiverreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("receiverRead not between", value1, value2, "receiverread");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteIsNull() {
            addCriterion("senderDelete is null");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteIsNotNull() {
            addCriterion("senderDelete is not null");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteEqualTo(Boolean value) {
            addCriterion("senderDelete =", value, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteNotEqualTo(Boolean value) {
            addCriterion("senderDelete <>", value, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteGreaterThan(Boolean value) {
            addCriterion("senderDelete >", value, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("senderDelete >=", value, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteLessThan(Boolean value) {
            addCriterion("senderDelete <", value, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("senderDelete <=", value, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteIn(List<Boolean> values) {
            addCriterion("senderDelete in", values, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteNotIn(List<Boolean> values) {
            addCriterion("senderDelete not in", values, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("senderDelete between", value1, value2, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("senderDelete not between", value1, value2, "senderdelete");
            return (Criteria) this;
        }

        public Criteria andSenderreadIsNull() {
            addCriterion("senderRead is null");
            return (Criteria) this;
        }

        public Criteria andSenderreadIsNotNull() {
            addCriterion("senderRead is not null");
            return (Criteria) this;
        }

        public Criteria andSenderreadEqualTo(Boolean value) {
            addCriterion("senderRead =", value, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadNotEqualTo(Boolean value) {
            addCriterion("senderRead <>", value, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadGreaterThan(Boolean value) {
            addCriterion("senderRead >", value, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("senderRead >=", value, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadLessThan(Boolean value) {
            addCriterion("senderRead <", value, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadLessThanOrEqualTo(Boolean value) {
            addCriterion("senderRead <=", value, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadIn(List<Boolean> values) {
            addCriterion("senderRead in", values, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadNotIn(List<Boolean> values) {
            addCriterion("senderRead not in", values, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadBetween(Boolean value1, Boolean value2) {
            addCriterion("senderRead between", value1, value2, "senderread");
            return (Criteria) this;
        }

        public Criteria andSenderreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("senderRead not between", value1, value2, "senderread");
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

        public Criteria andFormessageIdIsNull() {
            addCriterion("forMessage_id is null");
            return (Criteria) this;
        }

        public Criteria andFormessageIdIsNotNull() {
            addCriterion("forMessage_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormessageIdEqualTo(Long value) {
            addCriterion("forMessage_id =", value, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdNotEqualTo(Long value) {
            addCriterion("forMessage_id <>", value, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdGreaterThan(Long value) {
            addCriterion("forMessage_id >", value, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("forMessage_id >=", value, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdLessThan(Long value) {
            addCriterion("forMessage_id <", value, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdLessThanOrEqualTo(Long value) {
            addCriterion("forMessage_id <=", value, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdIn(List<Long> values) {
            addCriterion("forMessage_id in", values, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdNotIn(List<Long> values) {
            addCriterion("forMessage_id not in", values, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdBetween(Long value1, Long value2) {
            addCriterion("forMessage_id between", value1, value2, "formessageId");
            return (Criteria) this;
        }

        public Criteria andFormessageIdNotBetween(Long value1, Long value2) {
            addCriterion("forMessage_id not between", value1, value2, "formessageId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Long value) {
            addCriterion("receiver_id =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Long value) {
            addCriterion("receiver_id <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Long value) {
            addCriterion("receiver_id >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receiver_id >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Long value) {
            addCriterion("receiver_id <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Long value) {
            addCriterion("receiver_id <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Long> values) {
            addCriterion("receiver_id in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Long> values) {
            addCriterion("receiver_id not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Long value1, Long value2) {
            addCriterion("receiver_id between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Long value1, Long value2) {
            addCriterion("receiver_id not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(Long value) {
            addCriterion("sender_id =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(Long value) {
            addCriterion("sender_id <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(Long value) {
            addCriterion("sender_id >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sender_id >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(Long value) {
            addCriterion("sender_id <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(Long value) {
            addCriterion("sender_id <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<Long> values) {
            addCriterion("sender_id in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<Long> values) {
            addCriterion("sender_id not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(Long value1, Long value2) {
            addCriterion("sender_id between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(Long value1, Long value2) {
            addCriterion("sender_id not between", value1, value2, "senderId");
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
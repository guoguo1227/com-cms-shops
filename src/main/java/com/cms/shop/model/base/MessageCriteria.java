package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MessageCriteria() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 1L;

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

        public Criteria andMsgIdIsNull() {
            addCriterion("MSG_ID is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("MSG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Integer value) {
            addCriterion("MSG_ID =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Integer value) {
            addCriterion("MSG_ID <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Integer value) {
            addCriterion("MSG_ID >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MSG_ID >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Integer value) {
            addCriterion("MSG_ID <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("MSG_ID <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Integer> values) {
            addCriterion("MSG_ID in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Integer> values) {
            addCriterion("MSG_ID not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("MSG_ID between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MSG_ID not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgDateIsNull() {
            addCriterion("MSG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMsgDateIsNotNull() {
            addCriterion("MSG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgDateEqualTo(Date value) {
            addCriterion("MSG_DATE =", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotEqualTo(Date value) {
            addCriterion("MSG_DATE <>", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateGreaterThan(Date value) {
            addCriterion("MSG_DATE >", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MSG_DATE >=", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateLessThan(Date value) {
            addCriterion("MSG_DATE <", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateLessThanOrEqualTo(Date value) {
            addCriterion("MSG_DATE <=", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateIn(List<Date> values) {
            addCriterion("MSG_DATE in", values, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotIn(List<Date> values) {
            addCriterion("MSG_DATE not in", values, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateBetween(Date value1, Date value2) {
            addCriterion("MSG_DATE between", value1, value2, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotBetween(Date value1, Date value2) {
            addCriterion("MSG_DATE not between", value1, value2, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("MSG_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("MSG_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("MSG_CONTENT =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("MSG_CONTENT <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("MSG_CONTENT >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_CONTENT >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("MSG_CONTENT <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("MSG_CONTENT <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("MSG_CONTENT like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("MSG_CONTENT not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("MSG_CONTENT in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("MSG_CONTENT not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("MSG_CONTENT between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("MSG_CONTENT not between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIsNull() {
            addCriterion("MSG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIsNotNull() {
            addCriterion("MSG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMsgStatusEqualTo(Integer value) {
            addCriterion("MSG_STATUS =", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotEqualTo(Integer value) {
            addCriterion("MSG_STATUS <>", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusGreaterThan(Integer value) {
            addCriterion("MSG_STATUS >", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("MSG_STATUS >=", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLessThan(Integer value) {
            addCriterion("MSG_STATUS <", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("MSG_STATUS <=", value, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusIn(List<Integer> values) {
            addCriterion("MSG_STATUS in", values, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotIn(List<Integer> values) {
            addCriterion("MSG_STATUS not in", values, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusBetween(Integer value1, Integer value2) {
            addCriterion("MSG_STATUS between", value1, value2, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("MSG_STATUS not between", value1, value2, "msgStatus");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdIsNull() {
            addCriterion("msg_Type_Id is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdIsNotNull() {
            addCriterion("msg_Type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdEqualTo(Integer value) {
            addCriterion("msg_Type_Id =", value, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdNotEqualTo(Integer value) {
            addCriterion("msg_Type_Id <>", value, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdGreaterThan(Integer value) {
            addCriterion("msg_Type_Id >", value, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_Type_Id >=", value, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdLessThan(Integer value) {
            addCriterion("msg_Type_Id <", value, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_Type_Id <=", value, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdIn(List<Integer> values) {
            addCriterion("msg_Type_Id in", values, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdNotIn(List<Integer> values) {
            addCriterion("msg_Type_Id not in", values, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_Type_Id between", value1, value2, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_Type_Id not between", value1, value2, "msgTypeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_Id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_Id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_Id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_Id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_Id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_Id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_Id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_Id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_Id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_Id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_Id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNull() {
            addCriterion("msg_Title is null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNotNull() {
            addCriterion("msg_Title is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleEqualTo(String value) {
            addCriterion("msg_Title =", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotEqualTo(String value) {
            addCriterion("msg_Title <>", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThan(String value) {
            addCriterion("msg_Title >", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("msg_Title >=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThan(String value) {
            addCriterion("msg_Title <", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("msg_Title <=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLike(String value) {
            addCriterion("msg_Title like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotLike(String value) {
            addCriterion("msg_Title not like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIn(List<String> values) {
            addCriterion("msg_Title in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotIn(List<String> values) {
            addCriterion("msg_Title not in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleBetween(String value1, String value2) {
            addCriterion("msg_Title between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotBetween(String value1, String value2) {
            addCriterion("msg_Title not between", value1, value2, "msgTitle");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private static final long serialVersionUID = 1L;

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
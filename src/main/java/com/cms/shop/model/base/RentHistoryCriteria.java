package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentHistoryCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RentHistoryCriteria() {
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

        public Criteria andRentIdIsNull() {
            addCriterion("RENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRentIdIsNotNull() {
            addCriterion("RENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRentIdEqualTo(Integer value) {
            addCriterion("RENT_ID =", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdNotEqualTo(Integer value) {
            addCriterion("RENT_ID <>", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdGreaterThan(Integer value) {
            addCriterion("RENT_ID >", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RENT_ID >=", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdLessThan(Integer value) {
            addCriterion("RENT_ID <", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdLessThanOrEqualTo(Integer value) {
            addCriterion("RENT_ID <=", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdIn(List<Integer> values) {
            addCriterion("RENT_ID in", values, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdNotIn(List<Integer> values) {
            addCriterion("RENT_ID not in", values, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdBetween(Integer value1, Integer value2) {
            addCriterion("RENT_ID between", value1, value2, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RENT_ID not between", value1, value2, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentStatusIsNull() {
            addCriterion("RENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRentStatusIsNotNull() {
            addCriterion("RENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRentStatusEqualTo(Integer value) {
            addCriterion("RENT_STATUS =", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotEqualTo(Integer value) {
            addCriterion("RENT_STATUS <>", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusGreaterThan(Integer value) {
            addCriterion("RENT_STATUS >", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RENT_STATUS >=", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLessThan(Integer value) {
            addCriterion("RENT_STATUS <", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RENT_STATUS <=", value, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusIn(List<Integer> values) {
            addCriterion("RENT_STATUS in", values, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotIn(List<Integer> values) {
            addCriterion("RENT_STATUS not in", values, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusBetween(Integer value1, Integer value2) {
            addCriterion("RENT_STATUS between", value1, value2, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andRentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RENT_STATUS not between", value1, value2, "rentStatus");
            return (Criteria) this;
        }

        public Criteria andAuditLevelIsNull() {
            addCriterion("AUDIT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAuditLevelIsNotNull() {
            addCriterion("AUDIT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAuditLevelEqualTo(Integer value) {
            addCriterion("AUDIT_LEVEL =", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelNotEqualTo(Integer value) {
            addCriterion("AUDIT_LEVEL <>", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelGreaterThan(Integer value) {
            addCriterion("AUDIT_LEVEL >", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_LEVEL >=", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelLessThan(Integer value) {
            addCriterion("AUDIT_LEVEL <", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelLessThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_LEVEL <=", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelIn(List<Integer> values) {
            addCriterion("AUDIT_LEVEL in", values, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelNotIn(List<Integer> values) {
            addCriterion("AUDIT_LEVEL not in", values, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_LEVEL between", value1, value2, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_LEVEL not between", value1, value2, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNull() {
            addCriterion("reply_Date is null");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNotNull() {
            addCriterion("reply_Date is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDateEqualTo(Date value) {
            addCriterion("reply_Date =", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotEqualTo(Date value) {
            addCriterion("reply_Date <>", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThan(Date value) {
            addCriterion("reply_Date >", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_Date >=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThan(Date value) {
            addCriterion("reply_Date <", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThanOrEqualTo(Date value) {
            addCriterion("reply_Date <=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateIn(List<Date> values) {
            addCriterion("reply_Date in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotIn(List<Date> values) {
            addCriterion("reply_Date not in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateBetween(Date value1, Date value2) {
            addCriterion("reply_Date between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotBetween(Date value1, Date value2) {
            addCriterion("reply_Date not between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_Id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_Id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_Id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_Id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_Id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_Id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_Id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_Id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_Id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_Id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_Id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_Id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andRenterIdIsNull() {
            addCriterion("renter_Id is null");
            return (Criteria) this;
        }

        public Criteria andRenterIdIsNotNull() {
            addCriterion("renter_Id is not null");
            return (Criteria) this;
        }

        public Criteria andRenterIdEqualTo(Integer value) {
            addCriterion("renter_Id =", value, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdNotEqualTo(Integer value) {
            addCriterion("renter_Id <>", value, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdGreaterThan(Integer value) {
            addCriterion("renter_Id >", value, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("renter_Id >=", value, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdLessThan(Integer value) {
            addCriterion("renter_Id <", value, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdLessThanOrEqualTo(Integer value) {
            addCriterion("renter_Id <=", value, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdIn(List<Integer> values) {
            addCriterion("renter_Id in", values, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdNotIn(List<Integer> values) {
            addCriterion("renter_Id not in", values, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdBetween(Integer value1, Integer value2) {
            addCriterion("renter_Id between", value1, value2, "renterId");
            return (Criteria) this;
        }

        public Criteria andRenterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("renter_Id not between", value1, value2, "renterId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("info_Id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_Id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_Id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_Id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_Id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_Id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_Id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_Id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_Id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_Id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_Id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_Id not between", value1, value2, "infoId");
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
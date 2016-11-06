package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustAudHistCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CustAudHistCriteria() {
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

        public Criteria andCustAudIdIsNull() {
            addCriterion("CUST_AUD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustAudIdIsNotNull() {
            addCriterion("CUST_AUD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustAudIdEqualTo(Integer value) {
            addCriterion("CUST_AUD_ID =", value, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdNotEqualTo(Integer value) {
            addCriterion("CUST_AUD_ID <>", value, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdGreaterThan(Integer value) {
            addCriterion("CUST_AUD_ID >", value, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUST_AUD_ID >=", value, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdLessThan(Integer value) {
            addCriterion("CUST_AUD_ID <", value, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUST_AUD_ID <=", value, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdIn(List<Integer> values) {
            addCriterion("CUST_AUD_ID in", values, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdNotIn(List<Integer> values) {
            addCriterion("CUST_AUD_ID not in", values, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdBetween(Integer value1, Integer value2) {
            addCriterion("CUST_AUD_ID between", value1, value2, "custAudId");
            return (Criteria) this;
        }

        public Criteria andCustAudIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUST_AUD_ID not between", value1, value2, "custAudId");
            return (Criteria) this;
        }

        public Criteria andAuditOperIsNull() {
            addCriterion("AUDIT_OPER is null");
            return (Criteria) this;
        }

        public Criteria andAuditOperIsNotNull() {
            addCriterion("AUDIT_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOperEqualTo(Integer value) {
            addCriterion("AUDIT_OPER =", value, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperNotEqualTo(Integer value) {
            addCriterion("AUDIT_OPER <>", value, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperGreaterThan(Integer value) {
            addCriterion("AUDIT_OPER >", value, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_OPER >=", value, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperLessThan(Integer value) {
            addCriterion("AUDIT_OPER <", value, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperLessThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_OPER <=", value, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperIn(List<Integer> values) {
            addCriterion("AUDIT_OPER in", values, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperNotIn(List<Integer> values) {
            addCriterion("AUDIT_OPER not in", values, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_OPER between", value1, value2, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditOperNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_OPER not between", value1, value2, "auditOper");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("AUDIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("AUDIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("AUDIT_DATE =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("AUDIT_DATE <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("AUDIT_DATE >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDIT_DATE >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("AUDIT_DATE <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("AUDIT_DATE <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("AUDIT_DATE in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("AUDIT_DATE not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("AUDIT_DATE between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("AUDIT_DATE not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNull() {
            addCriterion("AUDIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNotNull() {
            addCriterion("AUDIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNameEqualTo(String value) {
            addCriterion("AUDIT_NAME =", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotEqualTo(String value) {
            addCriterion("AUDIT_NAME <>", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThan(String value) {
            addCriterion("AUDIT_NAME >", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_NAME >=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThan(String value) {
            addCriterion("AUDIT_NAME <", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_NAME <=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLike(String value) {
            addCriterion("AUDIT_NAME like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotLike(String value) {
            addCriterion("AUDIT_NAME not like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameIn(List<String> values) {
            addCriterion("AUDIT_NAME in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotIn(List<String> values) {
            addCriterion("AUDIT_NAME not in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameBetween(String value1, String value2) {
            addCriterion("AUDIT_NAME between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotBetween(String value1, String value2) {
            addCriterion("AUDIT_NAME not between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIsNull() {
            addCriterion("auditor_Name is null");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIsNotNull() {
            addCriterion("auditor_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorNameEqualTo(String value) {
            addCriterion("auditor_Name =", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotEqualTo(String value) {
            addCriterion("auditor_Name <>", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameGreaterThan(String value) {
            addCriterion("auditor_Name >", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_Name >=", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLessThan(String value) {
            addCriterion("auditor_Name <", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLessThanOrEqualTo(String value) {
            addCriterion("auditor_Name <=", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLike(String value) {
            addCriterion("auditor_Name like", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotLike(String value) {
            addCriterion("auditor_Name not like", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIn(List<String> values) {
            addCriterion("auditor_Name in", values, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotIn(List<String> values) {
            addCriterion("auditor_Name not in", values, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameBetween(String value1, String value2) {
            addCriterion("auditor_Name between", value1, value2, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotBetween(String value1, String value2) {
            addCriterion("auditor_Name not between", value1, value2, "auditorName");
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
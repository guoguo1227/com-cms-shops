package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizAudHistCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BizAudHistCriteria() {
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

        public Criteria andBizAudIdIsNull() {
            addCriterion("BIZ_AUD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBizAudIdIsNotNull() {
            addCriterion("BIZ_AUD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBizAudIdEqualTo(Integer value) {
            addCriterion("BIZ_AUD_ID =", value, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdNotEqualTo(Integer value) {
            addCriterion("BIZ_AUD_ID <>", value, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdGreaterThan(Integer value) {
            addCriterion("BIZ_AUD_ID >", value, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BIZ_AUD_ID >=", value, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdLessThan(Integer value) {
            addCriterion("BIZ_AUD_ID <", value, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdLessThanOrEqualTo(Integer value) {
            addCriterion("BIZ_AUD_ID <=", value, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdIn(List<Integer> values) {
            addCriterion("BIZ_AUD_ID in", values, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdNotIn(List<Integer> values) {
            addCriterion("BIZ_AUD_ID not in", values, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdBetween(Integer value1, Integer value2) {
            addCriterion("BIZ_AUD_ID between", value1, value2, "bizAudId");
            return (Criteria) this;
        }

        public Criteria andBizAudIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BIZ_AUD_ID not between", value1, value2, "bizAudId");
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

        public Criteria andBizIdIsNull() {
            addCriterion("biz_Id is null");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("biz_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBizIdEqualTo(Integer value) {
            addCriterion("biz_Id =", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotEqualTo(Integer value) {
            addCriterion("biz_Id <>", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThan(Integer value) {
            addCriterion("biz_Id >", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_Id >=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThan(Integer value) {
            addCriterion("biz_Id <", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThanOrEqualTo(Integer value) {
            addCriterion("biz_Id <=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdIn(List<Integer> values) {
            addCriterion("biz_Id in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotIn(List<Integer> values) {
            addCriterion("biz_Id not in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdBetween(Integer value1, Integer value2) {
            addCriterion("biz_Id between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_Id not between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andAudIdIsNull() {
            addCriterion("aud_Id is null");
            return (Criteria) this;
        }

        public Criteria andAudIdIsNotNull() {
            addCriterion("aud_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAudIdEqualTo(Integer value) {
            addCriterion("aud_Id =", value, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdNotEqualTo(Integer value) {
            addCriterion("aud_Id <>", value, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdGreaterThan(Integer value) {
            addCriterion("aud_Id >", value, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aud_Id >=", value, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdLessThan(Integer value) {
            addCriterion("aud_Id <", value, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdLessThanOrEqualTo(Integer value) {
            addCriterion("aud_Id <=", value, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdIn(List<Integer> values) {
            addCriterion("aud_Id in", values, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdNotIn(List<Integer> values) {
            addCriterion("aud_Id not in", values, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdBetween(Integer value1, Integer value2) {
            addCriterion("aud_Id between", value1, value2, "audId");
            return (Criteria) this;
        }

        public Criteria andAudIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aud_Id not between", value1, value2, "audId");
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
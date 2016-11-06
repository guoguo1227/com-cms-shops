package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentAudHistCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RentAudHistCriteria() {
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

        public Criteria andRentAudIdIsNull() {
            addCriterion("RENT_AUD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRentAudIdIsNotNull() {
            addCriterion("RENT_AUD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRentAudIdEqualTo(Integer value) {
            addCriterion("RENT_AUD_ID =", value, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdNotEqualTo(Integer value) {
            addCriterion("RENT_AUD_ID <>", value, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdGreaterThan(Integer value) {
            addCriterion("RENT_AUD_ID >", value, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RENT_AUD_ID >=", value, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdLessThan(Integer value) {
            addCriterion("RENT_AUD_ID <", value, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdLessThanOrEqualTo(Integer value) {
            addCriterion("RENT_AUD_ID <=", value, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdIn(List<Integer> values) {
            addCriterion("RENT_AUD_ID in", values, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdNotIn(List<Integer> values) {
            addCriterion("RENT_AUD_ID not in", values, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdBetween(Integer value1, Integer value2) {
            addCriterion("RENT_AUD_ID between", value1, value2, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andRentAudIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RENT_AUD_ID not between", value1, value2, "rentAudId");
            return (Criteria) this;
        }

        public Criteria andAudDateIsNull() {
            addCriterion("AUD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAudDateIsNotNull() {
            addCriterion("AUD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAudDateEqualTo(Date value) {
            addCriterion("AUD_DATE =", value, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateNotEqualTo(Date value) {
            addCriterion("AUD_DATE <>", value, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateGreaterThan(Date value) {
            addCriterion("AUD_DATE >", value, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUD_DATE >=", value, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateLessThan(Date value) {
            addCriterion("AUD_DATE <", value, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateLessThanOrEqualTo(Date value) {
            addCriterion("AUD_DATE <=", value, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateIn(List<Date> values) {
            addCriterion("AUD_DATE in", values, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateNotIn(List<Date> values) {
            addCriterion("AUD_DATE not in", values, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateBetween(Date value1, Date value2) {
            addCriterion("AUD_DATE between", value1, value2, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudDateNotBetween(Date value1, Date value2) {
            addCriterion("AUD_DATE not between", value1, value2, "audDate");
            return (Criteria) this;
        }

        public Criteria andAudOperIsNull() {
            addCriterion("AUD_OPER is null");
            return (Criteria) this;
        }

        public Criteria andAudOperIsNotNull() {
            addCriterion("AUD_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andAudOperEqualTo(Integer value) {
            addCriterion("AUD_OPER =", value, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperNotEqualTo(Integer value) {
            addCriterion("AUD_OPER <>", value, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperGreaterThan(Integer value) {
            addCriterion("AUD_OPER >", value, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUD_OPER >=", value, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperLessThan(Integer value) {
            addCriterion("AUD_OPER <", value, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperLessThanOrEqualTo(Integer value) {
            addCriterion("AUD_OPER <=", value, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperIn(List<Integer> values) {
            addCriterion("AUD_OPER in", values, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperNotIn(List<Integer> values) {
            addCriterion("AUD_OPER not in", values, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperBetween(Integer value1, Integer value2) {
            addCriterion("AUD_OPER between", value1, value2, "audOper");
            return (Criteria) this;
        }

        public Criteria andAudOperNotBetween(Integer value1, Integer value2) {
            addCriterion("AUD_OPER not between", value1, value2, "audOper");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIsNull() {
            addCriterion("AUDITOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIsNotNull() {
            addCriterion("AUDITOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorNameEqualTo(String value) {
            addCriterion("AUDITOR_NAME =", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotEqualTo(String value) {
            addCriterion("AUDITOR_NAME <>", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameGreaterThan(String value) {
            addCriterion("AUDITOR_NAME >", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITOR_NAME >=", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLessThan(String value) {
            addCriterion("AUDITOR_NAME <", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLessThanOrEqualTo(String value) {
            addCriterion("AUDITOR_NAME <=", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLike(String value) {
            addCriterion("AUDITOR_NAME like", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotLike(String value) {
            addCriterion("AUDITOR_NAME not like", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIn(List<String> values) {
            addCriterion("AUDITOR_NAME in", values, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotIn(List<String> values) {
            addCriterion("AUDITOR_NAME not in", values, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameBetween(String value1, String value2) {
            addCriterion("AUDITOR_NAME between", value1, value2, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotBetween(String value1, String value2) {
            addCriterion("AUDITOR_NAME not between", value1, value2, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNull() {
            addCriterion("audit_Id is null");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNotNull() {
            addCriterion("audit_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditIdEqualTo(Integer value) {
            addCriterion("audit_Id =", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotEqualTo(Integer value) {
            addCriterion("audit_Id <>", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThan(Integer value) {
            addCriterion("audit_Id >", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_Id >=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThan(Integer value) {
            addCriterion("audit_Id <", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_Id <=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdIn(List<Integer> values) {
            addCriterion("audit_Id in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotIn(List<Integer> values) {
            addCriterion("audit_Id not in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_Id between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_Id not between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andHistIdIsNull() {
            addCriterion("hist_Id is null");
            return (Criteria) this;
        }

        public Criteria andHistIdIsNotNull() {
            addCriterion("hist_Id is not null");
            return (Criteria) this;
        }

        public Criteria andHistIdEqualTo(Integer value) {
            addCriterion("hist_Id =", value, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdNotEqualTo(Integer value) {
            addCriterion("hist_Id <>", value, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdGreaterThan(Integer value) {
            addCriterion("hist_Id >", value, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hist_Id >=", value, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdLessThan(Integer value) {
            addCriterion("hist_Id <", value, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdLessThanOrEqualTo(Integer value) {
            addCriterion("hist_Id <=", value, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdIn(List<Integer> values) {
            addCriterion("hist_Id in", values, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdNotIn(List<Integer> values) {
            addCriterion("hist_Id not in", values, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdBetween(Integer value1, Integer value2) {
            addCriterion("hist_Id between", value1, value2, "histId");
            return (Criteria) this;
        }

        public Criteria andHistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hist_Id not between", value1, value2, "histId");
            return (Criteria) this;
        }

        public Criteria andAudCommentIsNull() {
            addCriterion("AUD_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andAudCommentIsNotNull() {
            addCriterion("AUD_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAudCommentEqualTo(String value) {
            addCriterion("AUD_COMMENT =", value, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentNotEqualTo(String value) {
            addCriterion("AUD_COMMENT <>", value, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentGreaterThan(String value) {
            addCriterion("AUD_COMMENT >", value, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentGreaterThanOrEqualTo(String value) {
            addCriterion("AUD_COMMENT >=", value, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentLessThan(String value) {
            addCriterion("AUD_COMMENT <", value, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentLessThanOrEqualTo(String value) {
            addCriterion("AUD_COMMENT <=", value, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentLike(String value) {
            addCriterion("AUD_COMMENT like", value, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentNotLike(String value) {
            addCriterion("AUD_COMMENT not like", value, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentIn(List<String> values) {
            addCriterion("AUD_COMMENT in", values, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentNotIn(List<String> values) {
            addCriterion("AUD_COMMENT not in", values, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentBetween(String value1, String value2) {
            addCriterion("AUD_COMMENT between", value1, value2, "audComment");
            return (Criteria) this;
        }

        public Criteria andAudCommentNotBetween(String value1, String value2) {
            addCriterion("AUD_COMMENT not between", value1, value2, "audComment");
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
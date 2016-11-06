package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysUserCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public SysUserCriteria() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
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

        public Criteria andInfoNameIsNull() {
            addCriterion("INFO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInfoNameIsNotNull() {
            addCriterion("INFO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInfoNameEqualTo(String value) {
            addCriterion("INFO_NAME =", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotEqualTo(String value) {
            addCriterion("INFO_NAME <>", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThan(String value) {
            addCriterion("INFO_NAME >", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_NAME >=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThan(String value) {
            addCriterion("INFO_NAME <", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThanOrEqualTo(String value) {
            addCriterion("INFO_NAME <=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLike(String value) {
            addCriterion("INFO_NAME like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotLike(String value) {
            addCriterion("INFO_NAME not like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameIn(List<String> values) {
            addCriterion("INFO_NAME in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotIn(List<String> values) {
            addCriterion("INFO_NAME not in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameBetween(String value1, String value2) {
            addCriterion("INFO_NAME between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotBetween(String value1, String value2) {
            addCriterion("INFO_NAME not between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNull() {
            addCriterion("USER_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNotNull() {
            addCriterion("USER_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailEqualTo(String value) {
            addCriterion("USER_MAIL =", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotEqualTo(String value) {
            addCriterion("USER_MAIL <>", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThan(String value) {
            addCriterion("USER_MAIL >", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MAIL >=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThan(String value) {
            addCriterion("USER_MAIL <", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThanOrEqualTo(String value) {
            addCriterion("USER_MAIL <=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLike(String value) {
            addCriterion("USER_MAIL like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotLike(String value) {
            addCriterion("USER_MAIL not like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailIn(List<String> values) {
            addCriterion("USER_MAIL in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotIn(List<String> values) {
            addCriterion("USER_MAIL not in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailBetween(String value1, String value2) {
            addCriterion("USER_MAIL between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotBetween(String value1, String value2) {
            addCriterion("USER_MAIL not between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andProposalLevelIsNull() {
            addCriterion("proposal_Level is null");
            return (Criteria) this;
        }

        public Criteria andProposalLevelIsNotNull() {
            addCriterion("proposal_Level is not null");
            return (Criteria) this;
        }

        public Criteria andProposalLevelEqualTo(Integer value) {
            addCriterion("proposal_Level =", value, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelNotEqualTo(Integer value) {
            addCriterion("proposal_Level <>", value, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelGreaterThan(Integer value) {
            addCriterion("proposal_Level >", value, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("proposal_Level >=", value, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelLessThan(Integer value) {
            addCriterion("proposal_Level <", value, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelLessThanOrEqualTo(Integer value) {
            addCriterion("proposal_Level <=", value, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelIn(List<Integer> values) {
            addCriterion("proposal_Level in", values, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelNotIn(List<Integer> values) {
            addCriterion("proposal_Level not in", values, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelBetween(Integer value1, Integer value2) {
            addCriterion("proposal_Level between", value1, value2, "proposalLevel");
            return (Criteria) this;
        }

        public Criteria andProposalLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("proposal_Level not between", value1, value2, "proposalLevel");
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
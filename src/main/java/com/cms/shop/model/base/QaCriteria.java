package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QaCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public QaCriteria() {
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

        public Criteria andQaIdIsNull() {
            addCriterion("QA_ID is null");
            return (Criteria) this;
        }

        public Criteria andQaIdIsNotNull() {
            addCriterion("QA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQaIdEqualTo(Integer value) {
            addCriterion("QA_ID =", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotEqualTo(Integer value) {
            addCriterion("QA_ID <>", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdGreaterThan(Integer value) {
            addCriterion("QA_ID >", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QA_ID >=", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdLessThan(Integer value) {
            addCriterion("QA_ID <", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdLessThanOrEqualTo(Integer value) {
            addCriterion("QA_ID <=", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdIn(List<Integer> values) {
            addCriterion("QA_ID in", values, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotIn(List<Integer> values) {
            addCriterion("QA_ID not in", values, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdBetween(Integer value1, Integer value2) {
            addCriterion("QA_ID between", value1, value2, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QA_ID not between", value1, value2, "qaId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAskerIdIsNull() {
            addCriterion("ASKER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAskerIdIsNotNull() {
            addCriterion("ASKER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAskerIdEqualTo(Integer value) {
            addCriterion("ASKER_ID =", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdNotEqualTo(Integer value) {
            addCriterion("ASKER_ID <>", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdGreaterThan(Integer value) {
            addCriterion("ASKER_ID >", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ASKER_ID >=", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdLessThan(Integer value) {
            addCriterion("ASKER_ID <", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdLessThanOrEqualTo(Integer value) {
            addCriterion("ASKER_ID <=", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdIn(List<Integer> values) {
            addCriterion("ASKER_ID in", values, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdNotIn(List<Integer> values) {
            addCriterion("ASKER_ID not in", values, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdBetween(Integer value1, Integer value2) {
            addCriterion("ASKER_ID between", value1, value2, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ASKER_ID not between", value1, value2, "askerId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andReplyIsNull() {
            addCriterion("REPLY is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("REPLY is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(String value) {
            addCriterion("REPLY =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(String value) {
            addCriterion("REPLY <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(String value) {
            addCriterion("REPLY >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(String value) {
            addCriterion("REPLY <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(String value) {
            addCriterion("REPLY <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLike(String value) {
            addCriterion("REPLY like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotLike(String value) {
            addCriterion("REPLY not like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<String> values) {
            addCriterion("REPLY in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<String> values) {
            addCriterion("REPLY not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(String value1, String value2) {
            addCriterion("REPLY between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(String value1, String value2) {
            addCriterion("REPLY not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andAskerNameIsNull() {
            addCriterion("ASKER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAskerNameIsNotNull() {
            addCriterion("ASKER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAskerNameEqualTo(String value) {
            addCriterion("ASKER_NAME =", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameNotEqualTo(String value) {
            addCriterion("ASKER_NAME <>", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameGreaterThan(String value) {
            addCriterion("ASKER_NAME >", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameGreaterThanOrEqualTo(String value) {
            addCriterion("ASKER_NAME >=", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameLessThan(String value) {
            addCriterion("ASKER_NAME <", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameLessThanOrEqualTo(String value) {
            addCriterion("ASKER_NAME <=", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameLike(String value) {
            addCriterion("ASKER_NAME like", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameNotLike(String value) {
            addCriterion("ASKER_NAME not like", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameIn(List<String> values) {
            addCriterion("ASKER_NAME in", values, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameNotIn(List<String> values) {
            addCriterion("ASKER_NAME not in", values, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameBetween(String value1, String value2) {
            addCriterion("ASKER_NAME between", value1, value2, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameNotBetween(String value1, String value2) {
            addCriterion("ASKER_NAME not between", value1, value2, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerLocIsNull() {
            addCriterion("ASKER_LOC is null");
            return (Criteria) this;
        }

        public Criteria andAskerLocIsNotNull() {
            addCriterion("ASKER_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andAskerLocEqualTo(String value) {
            addCriterion("ASKER_LOC =", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocNotEqualTo(String value) {
            addCriterion("ASKER_LOC <>", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocGreaterThan(String value) {
            addCriterion("ASKER_LOC >", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocGreaterThanOrEqualTo(String value) {
            addCriterion("ASKER_LOC >=", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocLessThan(String value) {
            addCriterion("ASKER_LOC <", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocLessThanOrEqualTo(String value) {
            addCriterion("ASKER_LOC <=", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocLike(String value) {
            addCriterion("ASKER_LOC like", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocNotLike(String value) {
            addCriterion("ASKER_LOC not like", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocIn(List<String> values) {
            addCriterion("ASKER_LOC in", values, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocNotIn(List<String> values) {
            addCriterion("ASKER_LOC not in", values, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocBetween(String value1, String value2) {
            addCriterion("ASKER_LOC between", value1, value2, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocNotBetween(String value1, String value2) {
            addCriterion("ASKER_LOC not between", value1, value2, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneIsNull() {
            addCriterion("ASKER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneIsNotNull() {
            addCriterion("ASKER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneEqualTo(String value) {
            addCriterion("ASKER_PHONE =", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneNotEqualTo(String value) {
            addCriterion("ASKER_PHONE <>", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneGreaterThan(String value) {
            addCriterion("ASKER_PHONE >", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ASKER_PHONE >=", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneLessThan(String value) {
            addCriterion("ASKER_PHONE <", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneLessThanOrEqualTo(String value) {
            addCriterion("ASKER_PHONE <=", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneLike(String value) {
            addCriterion("ASKER_PHONE like", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneNotLike(String value) {
            addCriterion("ASKER_PHONE not like", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneIn(List<String> values) {
            addCriterion("ASKER_PHONE in", values, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneNotIn(List<String> values) {
            addCriterion("ASKER_PHONE not in", values, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneBetween(String value1, String value2) {
            addCriterion("ASKER_PHONE between", value1, value2, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneNotBetween(String value1, String value2) {
            addCriterion("ASKER_PHONE not between", value1, value2, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerMailIsNull() {
            addCriterion("ASKER_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andAskerMailIsNotNull() {
            addCriterion("ASKER_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAskerMailEqualTo(String value) {
            addCriterion("ASKER_MAIL =", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailNotEqualTo(String value) {
            addCriterion("ASKER_MAIL <>", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailGreaterThan(String value) {
            addCriterion("ASKER_MAIL >", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailGreaterThanOrEqualTo(String value) {
            addCriterion("ASKER_MAIL >=", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailLessThan(String value) {
            addCriterion("ASKER_MAIL <", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailLessThanOrEqualTo(String value) {
            addCriterion("ASKER_MAIL <=", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailLike(String value) {
            addCriterion("ASKER_MAIL like", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailNotLike(String value) {
            addCriterion("ASKER_MAIL not like", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailIn(List<String> values) {
            addCriterion("ASKER_MAIL in", values, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailNotIn(List<String> values) {
            addCriterion("ASKER_MAIL not in", values, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailBetween(String value1, String value2) {
            addCriterion("ASKER_MAIL between", value1, value2, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailNotBetween(String value1, String value2) {
            addCriterion("ASKER_MAIL not between", value1, value2, "askerMail");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNull() {
            addCriterion("REPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNotNull() {
            addCriterion("REPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDateEqualTo(Date value) {
            addCriterion("REPLY_DATE =", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotEqualTo(Date value) {
            addCriterion("REPLY_DATE <>", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThan(Date value) {
            addCriterion("REPLY_DATE >", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPLY_DATE >=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThan(Date value) {
            addCriterion("REPLY_DATE <", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThanOrEqualTo(Date value) {
            addCriterion("REPLY_DATE <=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateIn(List<Date> values) {
            addCriterion("REPLY_DATE in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotIn(List<Date> values) {
            addCriterion("REPLY_DATE not in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateBetween(Date value1, Date value2) {
            addCriterion("REPLY_DATE between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotBetween(Date value1, Date value2) {
            addCriterion("REPLY_DATE not between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIsNull() {
            addCriterion("REPLY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIsNotNull() {
            addCriterion("REPLY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReplyStatusEqualTo(Integer value) {
            addCriterion("REPLY_STATUS =", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotEqualTo(Integer value) {
            addCriterion("REPLY_STATUS <>", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusGreaterThan(Integer value) {
            addCriterion("REPLY_STATUS >", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPLY_STATUS >=", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLessThan(Integer value) {
            addCriterion("REPLY_STATUS <", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("REPLY_STATUS <=", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIn(List<Integer> values) {
            addCriterion("REPLY_STATUS in", values, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotIn(List<Integer> values) {
            addCriterion("REPLY_STATUS not in", values, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusBetween(Integer value1, Integer value2) {
            addCriterion("REPLY_STATUS between", value1, value2, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("REPLY_STATUS not between", value1, value2, "replyStatus");
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

        public Criteria andAuditDateIsNull() {
            addCriterion("audit_Date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("audit_Date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("audit_Date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("audit_Date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("audit_Date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_Date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("audit_Date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("audit_Date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("audit_Date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("audit_Date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("audit_Date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("audit_Date not between", value1, value2, "auditDate");
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
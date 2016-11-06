package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizqaCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BizqaCriteria() {
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
            addCriterion("qa_Id is null");
            return (Criteria) this;
        }

        public Criteria andQaIdIsNotNull() {
            addCriterion("qa_Id is not null");
            return (Criteria) this;
        }

        public Criteria andQaIdEqualTo(Integer value) {
            addCriterion("qa_Id =", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotEqualTo(Integer value) {
            addCriterion("qa_Id <>", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdGreaterThan(Integer value) {
            addCriterion("qa_Id >", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qa_Id >=", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdLessThan(Integer value) {
            addCriterion("qa_Id <", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdLessThanOrEqualTo(Integer value) {
            addCriterion("qa_Id <=", value, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdIn(List<Integer> values) {
            addCriterion("qa_Id in", values, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotIn(List<Integer> values) {
            addCriterion("qa_Id not in", values, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdBetween(Integer value1, Integer value2) {
            addCriterion("qa_Id between", value1, value2, "qaId");
            return (Criteria) this;
        }

        public Criteria andQaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qa_Id not between", value1, value2, "qaId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_Status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_Status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("audit_Status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("audit_Status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("audit_Status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_Status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("audit_Status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("audit_Status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("audit_Status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("audit_Status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("audit_Status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_Status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAskerIdIsNull() {
            addCriterion("asker_Id is null");
            return (Criteria) this;
        }

        public Criteria andAskerIdIsNotNull() {
            addCriterion("asker_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAskerIdEqualTo(Integer value) {
            addCriterion("asker_Id =", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdNotEqualTo(Integer value) {
            addCriterion("asker_Id <>", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdGreaterThan(Integer value) {
            addCriterion("asker_Id >", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("asker_Id >=", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdLessThan(Integer value) {
            addCriterion("asker_Id <", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdLessThanOrEqualTo(Integer value) {
            addCriterion("asker_Id <=", value, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdIn(List<Integer> values) {
            addCriterion("asker_Id in", values, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdNotIn(List<Integer> values) {
            addCriterion("asker_Id not in", values, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdBetween(Integer value1, Integer value2) {
            addCriterion("asker_Id between", value1, value2, "askerId");
            return (Criteria) this;
        }

        public Criteria andAskerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("asker_Id not between", value1, value2, "askerId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_Date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_Date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_Date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_Date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_Date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_Date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_Date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_Date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_Date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_Date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_Date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andReplyIsNull() {
            addCriterion("reply is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("reply is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(String value) {
            addCriterion("reply =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(String value) {
            addCriterion("reply <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(String value) {
            addCriterion("reply >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(String value) {
            addCriterion("reply >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(String value) {
            addCriterion("reply <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(String value) {
            addCriterion("reply <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLike(String value) {
            addCriterion("reply like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotLike(String value) {
            addCriterion("reply not like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<String> values) {
            addCriterion("reply in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<String> values) {
            addCriterion("reply not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(String value1, String value2) {
            addCriterion("reply between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(String value1, String value2) {
            addCriterion("reply not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andAskerNameIsNull() {
            addCriterion("asker_Name is null");
            return (Criteria) this;
        }

        public Criteria andAskerNameIsNotNull() {
            addCriterion("asker_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAskerNameEqualTo(String value) {
            addCriterion("asker_Name =", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameNotEqualTo(String value) {
            addCriterion("asker_Name <>", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameGreaterThan(String value) {
            addCriterion("asker_Name >", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameGreaterThanOrEqualTo(String value) {
            addCriterion("asker_Name >=", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameLessThan(String value) {
            addCriterion("asker_Name <", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameLessThanOrEqualTo(String value) {
            addCriterion("asker_Name <=", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameLike(String value) {
            addCriterion("asker_Name like", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameNotLike(String value) {
            addCriterion("asker_Name not like", value, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameIn(List<String> values) {
            addCriterion("asker_Name in", values, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameNotIn(List<String> values) {
            addCriterion("asker_Name not in", values, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameBetween(String value1, String value2) {
            addCriterion("asker_Name between", value1, value2, "askerName");
            return (Criteria) this;
        }

        public Criteria andAskerNameNotBetween(String value1, String value2) {
            addCriterion("asker_Name not between", value1, value2, "askerName");
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

        public Criteria andReplyStatusIsNull() {
            addCriterion("reply_Status is null");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIsNotNull() {
            addCriterion("reply_Status is not null");
            return (Criteria) this;
        }

        public Criteria andReplyStatusEqualTo(Integer value) {
            addCriterion("reply_Status =", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotEqualTo(Integer value) {
            addCriterion("reply_Status <>", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusGreaterThan(Integer value) {
            addCriterion("reply_Status >", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_Status >=", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLessThan(Integer value) {
            addCriterion("reply_Status <", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("reply_Status <=", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIn(List<Integer> values) {
            addCriterion("reply_Status in", values, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotIn(List<Integer> values) {
            addCriterion("reply_Status not in", values, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusBetween(Integer value1, Integer value2) {
            addCriterion("reply_Status between", value1, value2, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_Status not between", value1, value2, "replyStatus");
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

        public Criteria andAskerLocIsNull() {
            addCriterion("asker_Loc is null");
            return (Criteria) this;
        }

        public Criteria andAskerLocIsNotNull() {
            addCriterion("asker_Loc is not null");
            return (Criteria) this;
        }

        public Criteria andAskerLocEqualTo(String value) {
            addCriterion("asker_Loc =", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocNotEqualTo(String value) {
            addCriterion("asker_Loc <>", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocGreaterThan(String value) {
            addCriterion("asker_Loc >", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocGreaterThanOrEqualTo(String value) {
            addCriterion("asker_Loc >=", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocLessThan(String value) {
            addCriterion("asker_Loc <", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocLessThanOrEqualTo(String value) {
            addCriterion("asker_Loc <=", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocLike(String value) {
            addCriterion("asker_Loc like", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocNotLike(String value) {
            addCriterion("asker_Loc not like", value, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocIn(List<String> values) {
            addCriterion("asker_Loc in", values, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocNotIn(List<String> values) {
            addCriterion("asker_Loc not in", values, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocBetween(String value1, String value2) {
            addCriterion("asker_Loc between", value1, value2, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerLocNotBetween(String value1, String value2) {
            addCriterion("asker_Loc not between", value1, value2, "askerLoc");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneIsNull() {
            addCriterion("asker_Phone is null");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneIsNotNull() {
            addCriterion("asker_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneEqualTo(String value) {
            addCriterion("asker_Phone =", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneNotEqualTo(String value) {
            addCriterion("asker_Phone <>", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneGreaterThan(String value) {
            addCriterion("asker_Phone >", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("asker_Phone >=", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneLessThan(String value) {
            addCriterion("asker_Phone <", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneLessThanOrEqualTo(String value) {
            addCriterion("asker_Phone <=", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneLike(String value) {
            addCriterion("asker_Phone like", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneNotLike(String value) {
            addCriterion("asker_Phone not like", value, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneIn(List<String> values) {
            addCriterion("asker_Phone in", values, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneNotIn(List<String> values) {
            addCriterion("asker_Phone not in", values, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneBetween(String value1, String value2) {
            addCriterion("asker_Phone between", value1, value2, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerPhoneNotBetween(String value1, String value2) {
            addCriterion("asker_Phone not between", value1, value2, "askerPhone");
            return (Criteria) this;
        }

        public Criteria andAskerMailIsNull() {
            addCriterion("asker_Mail is null");
            return (Criteria) this;
        }

        public Criteria andAskerMailIsNotNull() {
            addCriterion("asker_Mail is not null");
            return (Criteria) this;
        }

        public Criteria andAskerMailEqualTo(String value) {
            addCriterion("asker_Mail =", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailNotEqualTo(String value) {
            addCriterion("asker_Mail <>", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailGreaterThan(String value) {
            addCriterion("asker_Mail >", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailGreaterThanOrEqualTo(String value) {
            addCriterion("asker_Mail >=", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailLessThan(String value) {
            addCriterion("asker_Mail <", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailLessThanOrEqualTo(String value) {
            addCriterion("asker_Mail <=", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailLike(String value) {
            addCriterion("asker_Mail like", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailNotLike(String value) {
            addCriterion("asker_Mail not like", value, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailIn(List<String> values) {
            addCriterion("asker_Mail in", values, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailNotIn(List<String> values) {
            addCriterion("asker_Mail not in", values, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailBetween(String value1, String value2) {
            addCriterion("asker_Mail between", value1, value2, "askerMail");
            return (Criteria) this;
        }

        public Criteria andAskerMailNotBetween(String value1, String value2) {
            addCriterion("asker_Mail not between", value1, value2, "askerMail");
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
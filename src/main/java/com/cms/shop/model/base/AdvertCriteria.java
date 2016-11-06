package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public AdvertCriteria() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("AD_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("AD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("AD_ID =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("AD_ID <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("AD_ID >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AD_ID >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("AD_ID <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("AD_ID <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("AD_ID in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("AD_ID not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("AD_ID between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AD_ID not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNull() {
            addCriterion("AD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("AD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("AD_NAME =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("AD_NAME <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("AD_NAME >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("AD_NAME >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("AD_NAME <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("AD_NAME <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("AD_NAME like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("AD_NAME not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("AD_NAME in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("AD_NAME not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("AD_NAME between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("AD_NAME not between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNull() {
            addCriterion("PIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNotNull() {
            addCriterion("PIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPicNameEqualTo(String value) {
            addCriterion("PIC_NAME =", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotEqualTo(String value) {
            addCriterion("PIC_NAME <>", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThan(String value) {
            addCriterion("PIC_NAME >", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_NAME >=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThan(String value) {
            addCriterion("PIC_NAME <", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThanOrEqualTo(String value) {
            addCriterion("PIC_NAME <=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLike(String value) {
            addCriterion("PIC_NAME like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotLike(String value) {
            addCriterion("PIC_NAME not like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameIn(List<String> values) {
            addCriterion("PIC_NAME in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotIn(List<String> values) {
            addCriterion("PIC_NAME not in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameBetween(String value1, String value2) {
            addCriterion("PIC_NAME between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotBetween(String value1, String value2) {
            addCriterion("PIC_NAME not between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameIsNull() {
            addCriterion("NEW_PIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNewPicNameIsNotNull() {
            addCriterion("NEW_PIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNewPicNameEqualTo(String value) {
            addCriterion("NEW_PIC_NAME =", value, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameNotEqualTo(String value) {
            addCriterion("NEW_PIC_NAME <>", value, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameGreaterThan(String value) {
            addCriterion("NEW_PIC_NAME >", value, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_PIC_NAME >=", value, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameLessThan(String value) {
            addCriterion("NEW_PIC_NAME <", value, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameLessThanOrEqualTo(String value) {
            addCriterion("NEW_PIC_NAME <=", value, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameLike(String value) {
            addCriterion("NEW_PIC_NAME like", value, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameNotLike(String value) {
            addCriterion("NEW_PIC_NAME not like", value, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameIn(List<String> values) {
            addCriterion("NEW_PIC_NAME in", values, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameNotIn(List<String> values) {
            addCriterion("NEW_PIC_NAME not in", values, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameBetween(String value1, String value2) {
            addCriterion("NEW_PIC_NAME between", value1, value2, "newPicName");
            return (Criteria) this;
        }

        public Criteria andNewPicNameNotBetween(String value1, String value2) {
            addCriterion("NEW_PIC_NAME not between", value1, value2, "newPicName");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAdStatusIsNull() {
            addCriterion("AD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAdStatusIsNotNull() {
            addCriterion("AD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAdStatusEqualTo(Integer value) {
            addCriterion("AD_STATUS =", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotEqualTo(Integer value) {
            addCriterion("AD_STATUS <>", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusGreaterThan(Integer value) {
            addCriterion("AD_STATUS >", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AD_STATUS >=", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusLessThan(Integer value) {
            addCriterion("AD_STATUS <", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("AD_STATUS <=", value, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusIn(List<Integer> values) {
            addCriterion("AD_STATUS in", values, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotIn(List<Integer> values) {
            addCriterion("AD_STATUS not in", values, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusBetween(Integer value1, Integer value2) {
            addCriterion("AD_STATUS between", value1, value2, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AD_STATUS not between", value1, value2, "adStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusIsNull() {
            addCriterion("AUD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAudStatusIsNotNull() {
            addCriterion("AUD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAudStatusEqualTo(Integer value) {
            addCriterion("AUD_STATUS =", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusNotEqualTo(Integer value) {
            addCriterion("AUD_STATUS <>", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusGreaterThan(Integer value) {
            addCriterion("AUD_STATUS >", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUD_STATUS >=", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusLessThan(Integer value) {
            addCriterion("AUD_STATUS <", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusLessThanOrEqualTo(Integer value) {
            addCriterion("AUD_STATUS <=", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusIn(List<Integer> values) {
            addCriterion("AUD_STATUS in", values, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusNotIn(List<Integer> values) {
            addCriterion("AUD_STATUS not in", values, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusBetween(Integer value1, Integer value2) {
            addCriterion("AUD_STATUS between", value1, value2, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AUD_STATUS not between", value1, value2, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAdLocIsNull() {
            addCriterion("AD_LOC is null");
            return (Criteria) this;
        }

        public Criteria andAdLocIsNotNull() {
            addCriterion("AD_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andAdLocEqualTo(Integer value) {
            addCriterion("AD_LOC =", value, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocNotEqualTo(Integer value) {
            addCriterion("AD_LOC <>", value, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocGreaterThan(Integer value) {
            addCriterion("AD_LOC >", value, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocGreaterThanOrEqualTo(Integer value) {
            addCriterion("AD_LOC >=", value, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocLessThan(Integer value) {
            addCriterion("AD_LOC <", value, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocLessThanOrEqualTo(Integer value) {
            addCriterion("AD_LOC <=", value, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocIn(List<Integer> values) {
            addCriterion("AD_LOC in", values, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocNotIn(List<Integer> values) {
            addCriterion("AD_LOC not in", values, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocBetween(Integer value1, Integer value2) {
            addCriterion("AD_LOC between", value1, value2, "adLoc");
            return (Criteria) this;
        }

        public Criteria andAdLocNotBetween(Integer value1, Integer value2) {
            addCriterion("AD_LOC not between", value1, value2, "adLoc");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
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

        public Criteria andEditTagIsNull() {
            addCriterion("edit_Tag is null");
            return (Criteria) this;
        }

        public Criteria andEditTagIsNotNull() {
            addCriterion("edit_Tag is not null");
            return (Criteria) this;
        }

        public Criteria andEditTagEqualTo(Integer value) {
            addCriterion("edit_Tag =", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotEqualTo(Integer value) {
            addCriterion("edit_Tag <>", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagGreaterThan(Integer value) {
            addCriterion("edit_Tag >", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_Tag >=", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagLessThan(Integer value) {
            addCriterion("edit_Tag <", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagLessThanOrEqualTo(Integer value) {
            addCriterion("edit_Tag <=", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagIn(List<Integer> values) {
            addCriterion("edit_Tag in", values, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotIn(List<Integer> values) {
            addCriterion("edit_Tag not in", values, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagBetween(Integer value1, Integer value2) {
            addCriterion("edit_Tag between", value1, value2, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_Tag not between", value1, value2, "editTag");
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
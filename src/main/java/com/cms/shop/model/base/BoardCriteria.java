package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BoardCriteria() {
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

        public Criteria andBrdIdIsNull() {
            addCriterion("BRD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBrdIdIsNotNull() {
            addCriterion("BRD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBrdIdEqualTo(Integer value) {
            addCriterion("BRD_ID =", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotEqualTo(Integer value) {
            addCriterion("BRD_ID <>", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdGreaterThan(Integer value) {
            addCriterion("BRD_ID >", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRD_ID >=", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdLessThan(Integer value) {
            addCriterion("BRD_ID <", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("BRD_ID <=", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdIn(List<Integer> values) {
            addCriterion("BRD_ID in", values, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotIn(List<Integer> values) {
            addCriterion("BRD_ID not in", values, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdBetween(Integer value1, Integer value2) {
            addCriterion("BRD_ID between", value1, value2, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BRD_ID not between", value1, value2, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdTypeIsNull() {
            addCriterion("BRD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBrdTypeIsNotNull() {
            addCriterion("BRD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBrdTypeEqualTo(Integer value) {
            addCriterion("BRD_TYPE =", value, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeNotEqualTo(Integer value) {
            addCriterion("BRD_TYPE <>", value, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeGreaterThan(Integer value) {
            addCriterion("BRD_TYPE >", value, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRD_TYPE >=", value, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeLessThan(Integer value) {
            addCriterion("BRD_TYPE <", value, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BRD_TYPE <=", value, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeIn(List<Integer> values) {
            addCriterion("BRD_TYPE in", values, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeNotIn(List<Integer> values) {
            addCriterion("BRD_TYPE not in", values, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeBetween(Integer value1, Integer value2) {
            addCriterion("BRD_TYPE between", value1, value2, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BRD_TYPE not between", value1, value2, "brdType");
            return (Criteria) this;
        }

        public Criteria andBrdTitleIsNull() {
            addCriterion("BRD_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andBrdTitleIsNotNull() {
            addCriterion("BRD_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andBrdTitleEqualTo(String value) {
            addCriterion("BRD_TITLE =", value, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleNotEqualTo(String value) {
            addCriterion("BRD_TITLE <>", value, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleGreaterThan(String value) {
            addCriterion("BRD_TITLE >", value, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleGreaterThanOrEqualTo(String value) {
            addCriterion("BRD_TITLE >=", value, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleLessThan(String value) {
            addCriterion("BRD_TITLE <", value, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleLessThanOrEqualTo(String value) {
            addCriterion("BRD_TITLE <=", value, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleLike(String value) {
            addCriterion("BRD_TITLE like", value, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleNotLike(String value) {
            addCriterion("BRD_TITLE not like", value, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleIn(List<String> values) {
            addCriterion("BRD_TITLE in", values, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleNotIn(List<String> values) {
            addCriterion("BRD_TITLE not in", values, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleBetween(String value1, String value2) {
            addCriterion("BRD_TITLE between", value1, value2, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdTitleNotBetween(String value1, String value2) {
            addCriterion("BRD_TITLE not between", value1, value2, "brdTitle");
            return (Criteria) this;
        }

        public Criteria andBrdContentIsNull() {
            addCriterion("BRD_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andBrdContentIsNotNull() {
            addCriterion("BRD_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andBrdContentEqualTo(String value) {
            addCriterion("BRD_CONTENT =", value, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentNotEqualTo(String value) {
            addCriterion("BRD_CONTENT <>", value, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentGreaterThan(String value) {
            addCriterion("BRD_CONTENT >", value, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentGreaterThanOrEqualTo(String value) {
            addCriterion("BRD_CONTENT >=", value, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentLessThan(String value) {
            addCriterion("BRD_CONTENT <", value, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentLessThanOrEqualTo(String value) {
            addCriterion("BRD_CONTENT <=", value, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentLike(String value) {
            addCriterion("BRD_CONTENT like", value, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentNotLike(String value) {
            addCriterion("BRD_CONTENT not like", value, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentIn(List<String> values) {
            addCriterion("BRD_CONTENT in", values, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentNotIn(List<String> values) {
            addCriterion("BRD_CONTENT not in", values, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentBetween(String value1, String value2) {
            addCriterion("BRD_CONTENT between", value1, value2, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdContentNotBetween(String value1, String value2) {
            addCriterion("BRD_CONTENT not between", value1, value2, "brdContent");
            return (Criteria) this;
        }

        public Criteria andBrdStatusIsNull() {
            addCriterion("BRD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBrdStatusIsNotNull() {
            addCriterion("BRD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBrdStatusEqualTo(Integer value) {
            addCriterion("BRD_STATUS =", value, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusNotEqualTo(Integer value) {
            addCriterion("BRD_STATUS <>", value, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusGreaterThan(Integer value) {
            addCriterion("BRD_STATUS >", value, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRD_STATUS >=", value, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusLessThan(Integer value) {
            addCriterion("BRD_STATUS <", value, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("BRD_STATUS <=", value, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusIn(List<Integer> values) {
            addCriterion("BRD_STATUS in", values, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusNotIn(List<Integer> values) {
            addCriterion("BRD_STATUS not in", values, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusBetween(Integer value1, Integer value2) {
            addCriterion("BRD_STATUS between", value1, value2, "brdStatus");
            return (Criteria) this;
        }

        public Criteria andBrdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("BRD_STATUS not between", value1, value2, "brdStatus");
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

        public Criteria andCreIdIsNull() {
            addCriterion("cre_Id is null");
            return (Criteria) this;
        }

        public Criteria andCreIdIsNotNull() {
            addCriterion("cre_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCreIdEqualTo(Integer value) {
            addCriterion("cre_Id =", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdNotEqualTo(Integer value) {
            addCriterion("cre_Id <>", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdGreaterThan(Integer value) {
            addCriterion("cre_Id >", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cre_Id >=", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdLessThan(Integer value) {
            addCriterion("cre_Id <", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdLessThanOrEqualTo(Integer value) {
            addCriterion("cre_Id <=", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdIn(List<Integer> values) {
            addCriterion("cre_Id in", values, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdNotIn(List<Integer> values) {
            addCriterion("cre_Id not in", values, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdBetween(Integer value1, Integer value2) {
            addCriterion("cre_Id between", value1, value2, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cre_Id not between", value1, value2, "creId");
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
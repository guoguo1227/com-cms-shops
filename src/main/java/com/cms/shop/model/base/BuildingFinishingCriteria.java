package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BuildingFinishingCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BuildingFinishingCriteria() {
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

        public Criteria andFinishingIdIsNull() {
            addCriterion("finishing_Id is null");
            return (Criteria) this;
        }

        public Criteria andFinishingIdIsNotNull() {
            addCriterion("finishing_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishingIdEqualTo(Integer value) {
            addCriterion("finishing_Id =", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdNotEqualTo(Integer value) {
            addCriterion("finishing_Id <>", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdGreaterThan(Integer value) {
            addCriterion("finishing_Id >", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishing_Id >=", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdLessThan(Integer value) {
            addCriterion("finishing_Id <", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdLessThanOrEqualTo(Integer value) {
            addCriterion("finishing_Id <=", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdIn(List<Integer> values) {
            addCriterion("finishing_Id in", values, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdNotIn(List<Integer> values) {
            addCriterion("finishing_Id not in", values, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdBetween(Integer value1, Integer value2) {
            addCriterion("finishing_Id between", value1, value2, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finishing_Id not between", value1, value2, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingNameIsNull() {
            addCriterion("finishing_Name is null");
            return (Criteria) this;
        }

        public Criteria andFinishingNameIsNotNull() {
            addCriterion("finishing_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFinishingNameEqualTo(String value) {
            addCriterion("finishing_Name =", value, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameNotEqualTo(String value) {
            addCriterion("finishing_Name <>", value, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameGreaterThan(String value) {
            addCriterion("finishing_Name >", value, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameGreaterThanOrEqualTo(String value) {
            addCriterion("finishing_Name >=", value, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameLessThan(String value) {
            addCriterion("finishing_Name <", value, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameLessThanOrEqualTo(String value) {
            addCriterion("finishing_Name <=", value, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameLike(String value) {
            addCriterion("finishing_Name like", value, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameNotLike(String value) {
            addCriterion("finishing_Name not like", value, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameIn(List<String> values) {
            addCriterion("finishing_Name in", values, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameNotIn(List<String> values) {
            addCriterion("finishing_Name not in", values, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameBetween(String value1, String value2) {
            addCriterion("finishing_Name between", value1, value2, "finishingName");
            return (Criteria) this;
        }

        public Criteria andFinishingNameNotBetween(String value1, String value2) {
            addCriterion("finishing_Name not between", value1, value2, "finishingName");
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
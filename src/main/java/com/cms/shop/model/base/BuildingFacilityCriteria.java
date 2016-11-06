package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BuildingFacilityCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BuildingFacilityCriteria() {
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

        public Criteria andFacilIdIsNull() {
            addCriterion("FACIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFacilIdIsNotNull() {
            addCriterion("FACIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFacilIdEqualTo(Integer value) {
            addCriterion("FACIL_ID =", value, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdNotEqualTo(Integer value) {
            addCriterion("FACIL_ID <>", value, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdGreaterThan(Integer value) {
            addCriterion("FACIL_ID >", value, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FACIL_ID >=", value, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdLessThan(Integer value) {
            addCriterion("FACIL_ID <", value, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdLessThanOrEqualTo(Integer value) {
            addCriterion("FACIL_ID <=", value, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdIn(List<Integer> values) {
            addCriterion("FACIL_ID in", values, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdNotIn(List<Integer> values) {
            addCriterion("FACIL_ID not in", values, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdBetween(Integer value1, Integer value2) {
            addCriterion("FACIL_ID between", value1, value2, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FACIL_ID not between", value1, value2, "facilId");
            return (Criteria) this;
        }

        public Criteria andFacilNameIsNull() {
            addCriterion("FACIL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFacilNameIsNotNull() {
            addCriterion("FACIL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFacilNameEqualTo(String value) {
            addCriterion("FACIL_NAME =", value, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameNotEqualTo(String value) {
            addCriterion("FACIL_NAME <>", value, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameGreaterThan(String value) {
            addCriterion("FACIL_NAME >", value, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameGreaterThanOrEqualTo(String value) {
            addCriterion("FACIL_NAME >=", value, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameLessThan(String value) {
            addCriterion("FACIL_NAME <", value, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameLessThanOrEqualTo(String value) {
            addCriterion("FACIL_NAME <=", value, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameLike(String value) {
            addCriterion("FACIL_NAME like", value, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameNotLike(String value) {
            addCriterion("FACIL_NAME not like", value, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameIn(List<String> values) {
            addCriterion("FACIL_NAME in", values, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameNotIn(List<String> values) {
            addCriterion("FACIL_NAME not in", values, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameBetween(String value1, String value2) {
            addCriterion("FACIL_NAME between", value1, value2, "facilName");
            return (Criteria) this;
        }

        public Criteria andFacilNameNotBetween(String value1, String value2) {
            addCriterion("FACIL_NAME not between", value1, value2, "facilName");
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
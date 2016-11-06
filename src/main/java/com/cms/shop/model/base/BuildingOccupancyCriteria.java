package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BuildingOccupancyCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BuildingOccupancyCriteria() {
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

        public Criteria andOcpyIdIsNull() {
            addCriterion("OCPY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOcpyIdIsNotNull() {
            addCriterion("OCPY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOcpyIdEqualTo(Integer value) {
            addCriterion("OCPY_ID =", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdNotEqualTo(Integer value) {
            addCriterion("OCPY_ID <>", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdGreaterThan(Integer value) {
            addCriterion("OCPY_ID >", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OCPY_ID >=", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdLessThan(Integer value) {
            addCriterion("OCPY_ID <", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdLessThanOrEqualTo(Integer value) {
            addCriterion("OCPY_ID <=", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdIn(List<Integer> values) {
            addCriterion("OCPY_ID in", values, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdNotIn(List<Integer> values) {
            addCriterion("OCPY_ID not in", values, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdBetween(Integer value1, Integer value2) {
            addCriterion("OCPY_ID between", value1, value2, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OCPY_ID not between", value1, value2, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyNameIsNull() {
            addCriterion("OCPY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOcpyNameIsNotNull() {
            addCriterion("OCPY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOcpyNameEqualTo(String value) {
            addCriterion("OCPY_NAME =", value, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameNotEqualTo(String value) {
            addCriterion("OCPY_NAME <>", value, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameGreaterThan(String value) {
            addCriterion("OCPY_NAME >", value, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameGreaterThanOrEqualTo(String value) {
            addCriterion("OCPY_NAME >=", value, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameLessThan(String value) {
            addCriterion("OCPY_NAME <", value, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameLessThanOrEqualTo(String value) {
            addCriterion("OCPY_NAME <=", value, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameLike(String value) {
            addCriterion("OCPY_NAME like", value, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameNotLike(String value) {
            addCriterion("OCPY_NAME not like", value, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameIn(List<String> values) {
            addCriterion("OCPY_NAME in", values, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameNotIn(List<String> values) {
            addCriterion("OCPY_NAME not in", values, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameBetween(String value1, String value2) {
            addCriterion("OCPY_NAME between", value1, value2, "ocpyName");
            return (Criteria) this;
        }

        public Criteria andOcpyNameNotBetween(String value1, String value2) {
            addCriterion("OCPY_NAME not between", value1, value2, "ocpyName");
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
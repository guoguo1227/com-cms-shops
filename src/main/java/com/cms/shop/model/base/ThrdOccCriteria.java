package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ThrdOccCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ThrdOccCriteria() {
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

        public Criteria andThrdOccIdIsNull() {
            addCriterion("THRD_OCC_ID is null");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdIsNotNull() {
            addCriterion("THRD_OCC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdEqualTo(Integer value) {
            addCriterion("THRD_OCC_ID =", value, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdNotEqualTo(Integer value) {
            addCriterion("THRD_OCC_ID <>", value, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdGreaterThan(Integer value) {
            addCriterion("THRD_OCC_ID >", value, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("THRD_OCC_ID >=", value, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdLessThan(Integer value) {
            addCriterion("THRD_OCC_ID <", value, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdLessThanOrEqualTo(Integer value) {
            addCriterion("THRD_OCC_ID <=", value, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdIn(List<Integer> values) {
            addCriterion("THRD_OCC_ID in", values, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdNotIn(List<Integer> values) {
            addCriterion("THRD_OCC_ID not in", values, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdBetween(Integer value1, Integer value2) {
            addCriterion("THRD_OCC_ID between", value1, value2, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("THRD_OCC_ID not between", value1, value2, "thrdOccId");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameIsNull() {
            addCriterion("THRD_OCC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameIsNotNull() {
            addCriterion("THRD_OCC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameEqualTo(String value) {
            addCriterion("THRD_OCC_NAME =", value, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameNotEqualTo(String value) {
            addCriterion("THRD_OCC_NAME <>", value, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameGreaterThan(String value) {
            addCriterion("THRD_OCC_NAME >", value, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameGreaterThanOrEqualTo(String value) {
            addCriterion("THRD_OCC_NAME >=", value, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameLessThan(String value) {
            addCriterion("THRD_OCC_NAME <", value, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameLessThanOrEqualTo(String value) {
            addCriterion("THRD_OCC_NAME <=", value, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameLike(String value) {
            addCriterion("THRD_OCC_NAME like", value, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameNotLike(String value) {
            addCriterion("THRD_OCC_NAME not like", value, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameIn(List<String> values) {
            addCriterion("THRD_OCC_NAME in", values, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameNotIn(List<String> values) {
            addCriterion("THRD_OCC_NAME not in", values, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameBetween(String value1, String value2) {
            addCriterion("THRD_OCC_NAME between", value1, value2, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andThrdOccNameNotBetween(String value1, String value2) {
            addCriterion("THRD_OCC_NAME not between", value1, value2, "thrdOccName");
            return (Criteria) this;
        }

        public Criteria andSubOccIdIsNull() {
            addCriterion("sub_Occ_Id is null");
            return (Criteria) this;
        }

        public Criteria andSubOccIdIsNotNull() {
            addCriterion("sub_Occ_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSubOccIdEqualTo(Integer value) {
            addCriterion("sub_Occ_Id =", value, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdNotEqualTo(Integer value) {
            addCriterion("sub_Occ_Id <>", value, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdGreaterThan(Integer value) {
            addCriterion("sub_Occ_Id >", value, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_Occ_Id >=", value, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdLessThan(Integer value) {
            addCriterion("sub_Occ_Id <", value, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_Occ_Id <=", value, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdIn(List<Integer> values) {
            addCriterion("sub_Occ_Id in", values, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdNotIn(List<Integer> values) {
            addCriterion("sub_Occ_Id not in", values, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_Occ_Id between", value1, value2, "subOccId");
            return (Criteria) this;
        }

        public Criteria andSubOccIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_Occ_Id not between", value1, value2, "subOccId");
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
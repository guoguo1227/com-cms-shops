package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FlashCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public FlashCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNull() {
            addCriterion("old_name is null");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNotNull() {
            addCriterion("old_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldNameEqualTo(String value) {
            addCriterion("old_name =", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotEqualTo(String value) {
            addCriterion("old_name <>", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThan(String value) {
            addCriterion("old_name >", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThanOrEqualTo(String value) {
            addCriterion("old_name >=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThan(String value) {
            addCriterion("old_name <", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThanOrEqualTo(String value) {
            addCriterion("old_name <=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLike(String value) {
            addCriterion("old_name like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotLike(String value) {
            addCriterion("old_name not like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameIn(List<String> values) {
            addCriterion("old_name in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotIn(List<String> values) {
            addCriterion("old_name not in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameBetween(String value1, String value2) {
            addCriterion("old_name between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotBetween(String value1, String value2) {
            addCriterion("old_name not between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andFlashNameIsNull() {
            addCriterion("flash_name is null");
            return (Criteria) this;
        }

        public Criteria andFlashNameIsNotNull() {
            addCriterion("flash_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlashNameEqualTo(String value) {
            addCriterion("flash_name =", value, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameNotEqualTo(String value) {
            addCriterion("flash_name <>", value, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameGreaterThan(String value) {
            addCriterion("flash_name >", value, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameGreaterThanOrEqualTo(String value) {
            addCriterion("flash_name >=", value, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameLessThan(String value) {
            addCriterion("flash_name <", value, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameLessThanOrEqualTo(String value) {
            addCriterion("flash_name <=", value, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameLike(String value) {
            addCriterion("flash_name like", value, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameNotLike(String value) {
            addCriterion("flash_name not like", value, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameIn(List<String> values) {
            addCriterion("flash_name in", values, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameNotIn(List<String> values) {
            addCriterion("flash_name not in", values, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameBetween(String value1, String value2) {
            addCriterion("flash_name between", value1, value2, "flashName");
            return (Criteria) this;
        }

        public Criteria andFlashNameNotBetween(String value1, String value2) {
            addCriterion("flash_name not between", value1, value2, "flashName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
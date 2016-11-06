package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StreetCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public StreetCriteria() {
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

        public Criteria andStreetIdIsNull() {
            addCriterion("STREET_ID is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNotNull() {
            addCriterion("STREET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdEqualTo(Integer value) {
            addCriterion("STREET_ID =", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotEqualTo(Integer value) {
            addCriterion("STREET_ID <>", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThan(Integer value) {
            addCriterion("STREET_ID >", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STREET_ID >=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThan(Integer value) {
            addCriterion("STREET_ID <", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThanOrEqualTo(Integer value) {
            addCriterion("STREET_ID <=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIn(List<Integer> values) {
            addCriterion("STREET_ID in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotIn(List<Integer> values) {
            addCriterion("STREET_ID not in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdBetween(Integer value1, Integer value2) {
            addCriterion("STREET_ID between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STREET_ID not between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNull() {
            addCriterion("STREET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNotNull() {
            addCriterion("STREET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStreetNameEqualTo(String value) {
            addCriterion("STREET_NAME =", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotEqualTo(String value) {
            addCriterion("STREET_NAME <>", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThan(String value) {
            addCriterion("STREET_NAME >", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThanOrEqualTo(String value) {
            addCriterion("STREET_NAME >=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThan(String value) {
            addCriterion("STREET_NAME <", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThanOrEqualTo(String value) {
            addCriterion("STREET_NAME <=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLike(String value) {
            addCriterion("STREET_NAME like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotLike(String value) {
            addCriterion("STREET_NAME not like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameIn(List<String> values) {
            addCriterion("STREET_NAME in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotIn(List<String> values) {
            addCriterion("STREET_NAME not in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameBetween(String value1, String value2) {
            addCriterion("STREET_NAME between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotBetween(String value1, String value2) {
            addCriterion("STREET_NAME not between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_Id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_Id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_Id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_Id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_Id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_Id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_Id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_Id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_Id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_Id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_Id not between", value1, value2, "districtId");
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
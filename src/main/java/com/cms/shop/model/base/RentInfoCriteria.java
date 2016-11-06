package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RentInfoCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RentInfoCriteria() {
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

        public Criteria andRentInfoIdIsNull() {
            addCriterion("RENT_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdIsNotNull() {
            addCriterion("RENT_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdEqualTo(Integer value) {
            addCriterion("RENT_INFO_ID =", value, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdNotEqualTo(Integer value) {
            addCriterion("RENT_INFO_ID <>", value, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdGreaterThan(Integer value) {
            addCriterion("RENT_INFO_ID >", value, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RENT_INFO_ID >=", value, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdLessThan(Integer value) {
            addCriterion("RENT_INFO_ID <", value, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("RENT_INFO_ID <=", value, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdIn(List<Integer> values) {
            addCriterion("RENT_INFO_ID in", values, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdNotIn(List<Integer> values) {
            addCriterion("RENT_INFO_ID not in", values, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("RENT_INFO_ID between", value1, value2, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andRentInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RENT_INFO_ID not between", value1, value2, "rentInfoId");
            return (Criteria) this;
        }

        public Criteria andSquareIsNull() {
            addCriterion("SQUARE is null");
            return (Criteria) this;
        }

        public Criteria andSquareIsNotNull() {
            addCriterion("SQUARE is not null");
            return (Criteria) this;
        }

        public Criteria andSquareEqualTo(Integer value) {
            addCriterion("SQUARE =", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotEqualTo(Integer value) {
            addCriterion("SQUARE <>", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThan(Integer value) {
            addCriterion("SQUARE >", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThanOrEqualTo(Integer value) {
            addCriterion("SQUARE >=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThan(Integer value) {
            addCriterion("SQUARE <", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThanOrEqualTo(Integer value) {
            addCriterion("SQUARE <=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareIn(List<Integer> values) {
            addCriterion("SQUARE in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotIn(List<Integer> values) {
            addCriterion("SQUARE not in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareBetween(Integer value1, Integer value2) {
            addCriterion("SQUARE between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotBetween(Integer value1, Integer value2) {
            addCriterion("SQUARE not between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("FLOOR is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("FLOOR is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("FLOOR =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("FLOOR <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("FLOOR >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLOOR >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("FLOOR <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("FLOOR <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("FLOOR in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("FLOOR not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("FLOOR between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("FLOOR not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andFacilIsNull() {
            addCriterion("FACIL is null");
            return (Criteria) this;
        }

        public Criteria andFacilIsNotNull() {
            addCriterion("FACIL is not null");
            return (Criteria) this;
        }

        public Criteria andFacilEqualTo(String value) {
            addCriterion("FACIL =", value, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilNotEqualTo(String value) {
            addCriterion("FACIL <>", value, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilGreaterThan(String value) {
            addCriterion("FACIL >", value, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilGreaterThanOrEqualTo(String value) {
            addCriterion("FACIL >=", value, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilLessThan(String value) {
            addCriterion("FACIL <", value, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilLessThanOrEqualTo(String value) {
            addCriterion("FACIL <=", value, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilLike(String value) {
            addCriterion("FACIL like", value, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilNotLike(String value) {
            addCriterion("FACIL not like", value, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilIn(List<String> values) {
            addCriterion("FACIL in", values, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilNotIn(List<String> values) {
            addCriterion("FACIL not in", values, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilBetween(String value1, String value2) {
            addCriterion("FACIL between", value1, value2, "facil");
            return (Criteria) this;
        }

        public Criteria andFacilNotBetween(String value1, String value2) {
            addCriterion("FACIL not between", value1, value2, "facil");
            return (Criteria) this;
        }

        public Criteria andDistNameIsNull() {
            addCriterion("DIST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDistNameIsNotNull() {
            addCriterion("DIST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDistNameEqualTo(String value) {
            addCriterion("DIST_NAME =", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotEqualTo(String value) {
            addCriterion("DIST_NAME <>", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameGreaterThan(String value) {
            addCriterion("DIST_NAME >", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameGreaterThanOrEqualTo(String value) {
            addCriterion("DIST_NAME >=", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLessThan(String value) {
            addCriterion("DIST_NAME <", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLessThanOrEqualTo(String value) {
            addCriterion("DIST_NAME <=", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameLike(String value) {
            addCriterion("DIST_NAME like", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotLike(String value) {
            addCriterion("DIST_NAME not like", value, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameIn(List<String> values) {
            addCriterion("DIST_NAME in", values, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotIn(List<String> values) {
            addCriterion("DIST_NAME not in", values, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameBetween(String value1, String value2) {
            addCriterion("DIST_NAME between", value1, value2, "distName");
            return (Criteria) this;
        }

        public Criteria andDistNameNotBetween(String value1, String value2) {
            addCriterion("DIST_NAME not between", value1, value2, "distName");
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
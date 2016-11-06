package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShopImgCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ShopImgCriteria() {
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

        public Criteria andImgIdIsNull() {
            addCriterion("IMG_ID is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("IMG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Integer value) {
            addCriterion("IMG_ID =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Integer value) {
            addCriterion("IMG_ID <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Integer value) {
            addCriterion("IMG_ID >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMG_ID >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Integer value) {
            addCriterion("IMG_ID <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("IMG_ID <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Integer> values) {
            addCriterion("IMG_ID in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Integer> values) {
            addCriterion("IMG_ID not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Integer value1, Integer value2) {
            addCriterion("IMG_ID between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("IMG_ID not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andNewImgNameIsNull() {
            addCriterion("NEW_IMG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNewImgNameIsNotNull() {
            addCriterion("NEW_IMG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNewImgNameEqualTo(String value) {
            addCriterion("NEW_IMG_NAME =", value, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameNotEqualTo(String value) {
            addCriterion("NEW_IMG_NAME <>", value, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameGreaterThan(String value) {
            addCriterion("NEW_IMG_NAME >", value, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_IMG_NAME >=", value, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameLessThan(String value) {
            addCriterion("NEW_IMG_NAME <", value, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameLessThanOrEqualTo(String value) {
            addCriterion("NEW_IMG_NAME <=", value, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameLike(String value) {
            addCriterion("NEW_IMG_NAME like", value, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameNotLike(String value) {
            addCriterion("NEW_IMG_NAME not like", value, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameIn(List<String> values) {
            addCriterion("NEW_IMG_NAME in", values, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameNotIn(List<String> values) {
            addCriterion("NEW_IMG_NAME not in", values, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameBetween(String value1, String value2) {
            addCriterion("NEW_IMG_NAME between", value1, value2, "newImgName");
            return (Criteria) this;
        }

        public Criteria andNewImgNameNotBetween(String value1, String value2) {
            addCriterion("NEW_IMG_NAME not between", value1, value2, "newImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameIsNull() {
            addCriterion("OLD_IMG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOldImgNameIsNotNull() {
            addCriterion("OLD_IMG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldImgNameEqualTo(String value) {
            addCriterion("OLD_IMG_NAME =", value, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameNotEqualTo(String value) {
            addCriterion("OLD_IMG_NAME <>", value, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameGreaterThan(String value) {
            addCriterion("OLD_IMG_NAME >", value, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_IMG_NAME >=", value, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameLessThan(String value) {
            addCriterion("OLD_IMG_NAME <", value, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameLessThanOrEqualTo(String value) {
            addCriterion("OLD_IMG_NAME <=", value, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameLike(String value) {
            addCriterion("OLD_IMG_NAME like", value, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameNotLike(String value) {
            addCriterion("OLD_IMG_NAME not like", value, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameIn(List<String> values) {
            addCriterion("OLD_IMG_NAME in", values, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameNotIn(List<String> values) {
            addCriterion("OLD_IMG_NAME not in", values, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameBetween(String value1, String value2) {
            addCriterion("OLD_IMG_NAME between", value1, value2, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andOldImgNameNotBetween(String value1, String value2) {
            addCriterion("OLD_IMG_NAME not between", value1, value2, "oldImgName");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_Id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_Id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_Id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_Id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_Id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_Id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_Id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_Id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_Id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_Id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_Id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_Id not between", value1, value2, "shopId");
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
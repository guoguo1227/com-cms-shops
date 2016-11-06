package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopFavoCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ShopFavoCriteria() {
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

        public Criteria andFavoIdIsNull() {
            addCriterion("FAVO_ID is null");
            return (Criteria) this;
        }

        public Criteria andFavoIdIsNotNull() {
            addCriterion("FAVO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFavoIdEqualTo(Integer value) {
            addCriterion("FAVO_ID =", value, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdNotEqualTo(Integer value) {
            addCriterion("FAVO_ID <>", value, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdGreaterThan(Integer value) {
            addCriterion("FAVO_ID >", value, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAVO_ID >=", value, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdLessThan(Integer value) {
            addCriterion("FAVO_ID <", value, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdLessThanOrEqualTo(Integer value) {
            addCriterion("FAVO_ID <=", value, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdIn(List<Integer> values) {
            addCriterion("FAVO_ID in", values, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdNotIn(List<Integer> values) {
            addCriterion("FAVO_ID not in", values, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdBetween(Integer value1, Integer value2) {
            addCriterion("FAVO_ID between", value1, value2, "favoId");
            return (Criteria) this;
        }

        public Criteria andFavoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FAVO_ID not between", value1, value2, "favoId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
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

        public Criteria andAddDateIsNull() {
            addCriterion("ADD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("ADD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterion("ADD_DATE =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterion("ADD_DATE <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterion("ADD_DATE >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_DATE >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterion("ADD_DATE <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterion("ADD_DATE <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterion("ADD_DATE in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterion("ADD_DATE not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterion("ADD_DATE between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterion("ADD_DATE not between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNull() {
            addCriterion("SHOP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNotNull() {
            addCriterion("SHOP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andShopStatusEqualTo(Integer value) {
            addCriterion("SHOP_STATUS =", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotEqualTo(Integer value) {
            addCriterion("SHOP_STATUS <>", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThan(Integer value) {
            addCriterion("SHOP_STATUS >", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_STATUS >=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThan(Integer value) {
            addCriterion("SHOP_STATUS <", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_STATUS <=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusIn(List<Integer> values) {
            addCriterion("SHOP_STATUS in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotIn(List<Integer> values) {
            addCriterion("SHOP_STATUS not in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_STATUS between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_STATUS not between", value1, value2, "shopStatus");
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
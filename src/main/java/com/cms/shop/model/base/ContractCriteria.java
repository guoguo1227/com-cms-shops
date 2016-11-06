package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ContractCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ContractCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_Id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_Id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Integer value) {
            addCriterion("contract_Id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Integer value) {
            addCriterion("contract_Id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Integer value) {
            addCriterion("contract_Id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_Id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Integer value) {
            addCriterion("contract_Id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("contract_Id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Integer> values) {
            addCriterion("contract_Id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Integer> values) {
            addCriterion("contract_Id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Integer value1, Integer value2) {
            addCriterion("contract_Id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_Id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_No is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_No is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_No =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_No <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_No >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_No >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_No <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_No <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_No like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_No not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_No in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_No not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_No between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_No not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_Date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_Date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_Date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_Date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_Date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_Date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_Date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_Date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_Date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_Date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_Date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_Date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNull() {
            addCriterion("contract_Status is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("contract_Status is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(Integer value) {
            addCriterion("contract_Status =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(Integer value) {
            addCriterion("contract_Status <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(Integer value) {
            addCriterion("contract_Status >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_Status >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(Integer value) {
            addCriterion("contract_Status <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(Integer value) {
            addCriterion("contract_Status <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<Integer> values) {
            addCriterion("contract_Status in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<Integer> values) {
            addCriterion("contract_Status not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(Integer value1, Integer value2) {
            addCriterion("contract_Status between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_Status not between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNull() {
            addCriterion("salesman is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNotNull() {
            addCriterion("salesman is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanEqualTo(String value) {
            addCriterion("salesman =", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotEqualTo(String value) {
            addCriterion("salesman <>", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThan(String value) {
            addCriterion("salesman >", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("salesman >=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThan(String value) {
            addCriterion("salesman <", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThanOrEqualTo(String value) {
            addCriterion("salesman <=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLike(String value) {
            addCriterion("salesman like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotLike(String value) {
            addCriterion("salesman not like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanIn(List<String> values) {
            addCriterion("salesman in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotIn(List<String> values) {
            addCriterion("salesman not in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanBetween(String value1, String value2) {
            addCriterion("salesman between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotBetween(String value1, String value2) {
            addCriterion("salesman not between", value1, value2, "salesman");
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

        public Criteria andRemindPointIsNull() {
            addCriterion("REMIND_POINT is null");
            return (Criteria) this;
        }

        public Criteria andRemindPointIsNotNull() {
            addCriterion("REMIND_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andRemindPointEqualTo(Integer value) {
            addCriterion("REMIND_POINT =", value, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointNotEqualTo(Integer value) {
            addCriterion("REMIND_POINT <>", value, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointGreaterThan(Integer value) {
            addCriterion("REMIND_POINT >", value, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("REMIND_POINT >=", value, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointLessThan(Integer value) {
            addCriterion("REMIND_POINT <", value, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointLessThanOrEqualTo(Integer value) {
            addCriterion("REMIND_POINT <=", value, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointIn(List<Integer> values) {
            addCriterion("REMIND_POINT in", values, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointNotIn(List<Integer> values) {
            addCriterion("REMIND_POINT not in", values, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointBetween(Integer value1, Integer value2) {
            addCriterion("REMIND_POINT between", value1, value2, "remindPoint");
            return (Criteria) this;
        }

        public Criteria andRemindPointNotBetween(Integer value1, Integer value2) {
            addCriterion("REMIND_POINT not between", value1, value2, "remindPoint");
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
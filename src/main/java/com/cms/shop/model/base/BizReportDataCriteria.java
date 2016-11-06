package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizReportDataCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BizReportDataCriteria() {
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

        public Criteria andYeMonIsNull() {
            addCriterion("ye_Mon is null");
            return (Criteria) this;
        }

        public Criteria andYeMonIsNotNull() {
            addCriterion("ye_Mon is not null");
            return (Criteria) this;
        }

        public Criteria andYeMonEqualTo(String value) {
            addCriterion("ye_Mon =", value, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonNotEqualTo(String value) {
            addCriterion("ye_Mon <>", value, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonGreaterThan(String value) {
            addCriterion("ye_Mon >", value, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonGreaterThanOrEqualTo(String value) {
            addCriterion("ye_Mon >=", value, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonLessThan(String value) {
            addCriterion("ye_Mon <", value, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonLessThanOrEqualTo(String value) {
            addCriterion("ye_Mon <=", value, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonLike(String value) {
            addCriterion("ye_Mon like", value, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonNotLike(String value) {
            addCriterion("ye_Mon not like", value, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonIn(List<String> values) {
            addCriterion("ye_Mon in", values, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonNotIn(List<String> values) {
            addCriterion("ye_Mon not in", values, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonBetween(String value1, String value2) {
            addCriterion("ye_Mon between", value1, value2, "yeMon");
            return (Criteria) this;
        }

        public Criteria andYeMonNotBetween(String value1, String value2) {
            addCriterion("ye_Mon not between", value1, value2, "yeMon");
            return (Criteria) this;
        }

        public Criteria andCustNumIsNull() {
            addCriterion("cust_Num is null");
            return (Criteria) this;
        }

        public Criteria andCustNumIsNotNull() {
            addCriterion("cust_Num is not null");
            return (Criteria) this;
        }

        public Criteria andCustNumEqualTo(Integer value) {
            addCriterion("cust_Num =", value, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumNotEqualTo(Integer value) {
            addCriterion("cust_Num <>", value, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumGreaterThan(Integer value) {
            addCriterion("cust_Num >", value, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_Num >=", value, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumLessThan(Integer value) {
            addCriterion("cust_Num <", value, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumLessThanOrEqualTo(Integer value) {
            addCriterion("cust_Num <=", value, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumIn(List<Integer> values) {
            addCriterion("cust_Num in", values, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumNotIn(List<Integer> values) {
            addCriterion("cust_Num not in", values, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumBetween(Integer value1, Integer value2) {
            addCriterion("cust_Num between", value1, value2, "custNum");
            return (Criteria) this;
        }

        public Criteria andCustNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_Num not between", value1, value2, "custNum");
            return (Criteria) this;
        }

        public Criteria andShopNumIsNull() {
            addCriterion("shop_Num is null");
            return (Criteria) this;
        }

        public Criteria andShopNumIsNotNull() {
            addCriterion("shop_Num is not null");
            return (Criteria) this;
        }

        public Criteria andShopNumEqualTo(Integer value) {
            addCriterion("shop_Num =", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumNotEqualTo(Integer value) {
            addCriterion("shop_Num <>", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumGreaterThan(Integer value) {
            addCriterion("shop_Num >", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_Num >=", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumLessThan(Integer value) {
            addCriterion("shop_Num <", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("shop_Num <=", value, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumIn(List<Integer> values) {
            addCriterion("shop_Num in", values, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumNotIn(List<Integer> values) {
            addCriterion("shop_Num not in", values, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumBetween(Integer value1, Integer value2) {
            addCriterion("shop_Num between", value1, value2, "shopNum");
            return (Criteria) this;
        }

        public Criteria andShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_Num not between", value1, value2, "shopNum");
            return (Criteria) this;
        }

        public Criteria andRentNumIsNull() {
            addCriterion("rent_Num is null");
            return (Criteria) this;
        }

        public Criteria andRentNumIsNotNull() {
            addCriterion("rent_Num is not null");
            return (Criteria) this;
        }

        public Criteria andRentNumEqualTo(Integer value) {
            addCriterion("rent_Num =", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotEqualTo(Integer value) {
            addCriterion("rent_Num <>", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumGreaterThan(Integer value) {
            addCriterion("rent_Num >", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_Num >=", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumLessThan(Integer value) {
            addCriterion("rent_Num <", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumLessThanOrEqualTo(Integer value) {
            addCriterion("rent_Num <=", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumIn(List<Integer> values) {
            addCriterion("rent_Num in", values, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotIn(List<Integer> values) {
            addCriterion("rent_Num not in", values, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumBetween(Integer value1, Integer value2) {
            addCriterion("rent_Num between", value1, value2, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_Num not between", value1, value2, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumIsNull() {
            addCriterion("rent_Sc_Num is null");
            return (Criteria) this;
        }

        public Criteria andRentScNumIsNotNull() {
            addCriterion("rent_Sc_Num is not null");
            return (Criteria) this;
        }

        public Criteria andRentScNumEqualTo(Integer value) {
            addCriterion("rent_Sc_Num =", value, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumNotEqualTo(Integer value) {
            addCriterion("rent_Sc_Num <>", value, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumGreaterThan(Integer value) {
            addCriterion("rent_Sc_Num >", value, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_Sc_Num >=", value, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumLessThan(Integer value) {
            addCriterion("rent_Sc_Num <", value, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumLessThanOrEqualTo(Integer value) {
            addCriterion("rent_Sc_Num <=", value, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumIn(List<Integer> values) {
            addCriterion("rent_Sc_Num in", values, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumNotIn(List<Integer> values) {
            addCriterion("rent_Sc_Num not in", values, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumBetween(Integer value1, Integer value2) {
            addCriterion("rent_Sc_Num between", value1, value2, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andRentScNumNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_Sc_Num not between", value1, value2, "rentScNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumIsNull() {
            addCriterion("info_Num is null");
            return (Criteria) this;
        }

        public Criteria andInfoNumIsNotNull() {
            addCriterion("info_Num is not null");
            return (Criteria) this;
        }

        public Criteria andInfoNumEqualTo(Integer value) {
            addCriterion("info_Num =", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumNotEqualTo(Integer value) {
            addCriterion("info_Num <>", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumGreaterThan(Integer value) {
            addCriterion("info_Num >", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_Num >=", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumLessThan(Integer value) {
            addCriterion("info_Num <", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumLessThanOrEqualTo(Integer value) {
            addCriterion("info_Num <=", value, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumIn(List<Integer> values) {
            addCriterion("info_Num in", values, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumNotIn(List<Integer> values) {
            addCriterion("info_Num not in", values, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumBetween(Integer value1, Integer value2) {
            addCriterion("info_Num between", value1, value2, "infoNum");
            return (Criteria) this;
        }

        public Criteria andInfoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("info_Num not between", value1, value2, "infoNum");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNull() {
            addCriterion("data_Time is null");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNotNull() {
            addCriterion("data_Time is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimeEqualTo(Date value) {
            addCriterion("data_Time =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(Date value) {
            addCriterion("data_Time <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(Date value) {
            addCriterion("data_Time >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_Time >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(Date value) {
            addCriterion("data_Time <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_Time <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<Date> values) {
            addCriterion("data_Time in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<Date> values) {
            addCriterion("data_Time not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(Date value1, Date value2) {
            addCriterion("data_Time between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_Time not between", value1, value2, "dataTime");
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
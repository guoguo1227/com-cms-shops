package com.cms.shop.model.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ShopCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andShopNoIsNull() {
            addCriterion("SHOP_NO is null");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNotNull() {
            addCriterion("SHOP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andShopNoEqualTo(String value) {
            addCriterion("SHOP_NO =", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotEqualTo(String value) {
            addCriterion("SHOP_NO <>", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThan(String value) {
            addCriterion("SHOP_NO >", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NO >=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThan(String value) {
            addCriterion("SHOP_NO <", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NO <=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLike(String value) {
            addCriterion("SHOP_NO like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotLike(String value) {
            addCriterion("SHOP_NO not like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoIn(List<String> values) {
            addCriterion("SHOP_NO in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotIn(List<String> values) {
            addCriterion("SHOP_NO not in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoBetween(String value1, String value2) {
            addCriterion("SHOP_NO between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotBetween(String value1, String value2) {
            addCriterion("SHOP_NO not between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
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

        public Criteria andFloorEqualTo(String value) {
            addCriterion("FLOOR =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("FLOOR <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("FLOOR >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("FLOOR >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("FLOOR <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("FLOOR <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("FLOOR like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("FLOOR not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("FLOOR in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("FLOOR not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("FLOOR between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("FLOOR not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andSquareMetresIsNull() {
            addCriterion("SQUARE_METRES is null");
            return (Criteria) this;
        }

        public Criteria andSquareMetresIsNotNull() {
            addCriterion("SQUARE_METRES is not null");
            return (Criteria) this;
        }

        public Criteria andSquareMetresEqualTo(BigDecimal value) {
            addCriterion("SQUARE_METRES =", value, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresNotEqualTo(BigDecimal value) {
            addCriterion("SQUARE_METRES <>", value, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresGreaterThan(BigDecimal value) {
            addCriterion("SQUARE_METRES >", value, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SQUARE_METRES >=", value, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresLessThan(BigDecimal value) {
            addCriterion("SQUARE_METRES <", value, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SQUARE_METRES <=", value, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresIn(List<BigDecimal> values) {
            addCriterion("SQUARE_METRES in", values, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresNotIn(List<BigDecimal> values) {
            addCriterion("SQUARE_METRES not in", values, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQUARE_METRES between", value1, value2, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andSquareMetresNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQUARE_METRES not between", value1, value2, "squareMetres");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("TRAFFIC is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("TRAFFIC is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(String value) {
            addCriterion("TRAFFIC =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(String value) {
            addCriterion("TRAFFIC <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(String value) {
            addCriterion("TRAFFIC >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("TRAFFIC >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(String value) {
            addCriterion("TRAFFIC <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(String value) {
            addCriterion("TRAFFIC <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLike(String value) {
            addCriterion("TRAFFIC like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotLike(String value) {
            addCriterion("TRAFFIC not like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<String> values) {
            addCriterion("TRAFFIC in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<String> values) {
            addCriterion("TRAFFIC not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(String value1, String value2) {
            addCriterion("TRAFFIC between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(String value1, String value2) {
            addCriterion("TRAFFIC not between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andFacilityIsNull() {
            addCriterion("FACILITY is null");
            return (Criteria) this;
        }

        public Criteria andFacilityIsNotNull() {
            addCriterion("FACILITY is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityEqualTo(String value) {
            addCriterion("FACILITY =", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityNotEqualTo(String value) {
            addCriterion("FACILITY <>", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityGreaterThan(String value) {
            addCriterion("FACILITY >", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITY >=", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityLessThan(String value) {
            addCriterion("FACILITY <", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityLessThanOrEqualTo(String value) {
            addCriterion("FACILITY <=", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityLike(String value) {
            addCriterion("FACILITY like", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityNotLike(String value) {
            addCriterion("FACILITY not like", value, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityIn(List<String> values) {
            addCriterion("FACILITY in", values, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityNotIn(List<String> values) {
            addCriterion("FACILITY not in", values, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityBetween(String value1, String value2) {
            addCriterion("FACILITY between", value1, value2, "facility");
            return (Criteria) this;
        }

        public Criteria andFacilityNotBetween(String value1, String value2) {
            addCriterion("FACILITY not between", value1, value2, "facility");
            return (Criteria) this;
        }

        public Criteria andMonthDepositIsNull() {
            addCriterion("MONTH_DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andMonthDepositIsNotNull() {
            addCriterion("MONTH_DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andMonthDepositEqualTo(Integer value) {
            addCriterion("MONTH_DEPOSIT =", value, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositNotEqualTo(Integer value) {
            addCriterion("MONTH_DEPOSIT <>", value, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositGreaterThan(Integer value) {
            addCriterion("MONTH_DEPOSIT >", value, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTH_DEPOSIT >=", value, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositLessThan(Integer value) {
            addCriterion("MONTH_DEPOSIT <", value, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositLessThanOrEqualTo(Integer value) {
            addCriterion("MONTH_DEPOSIT <=", value, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositIn(List<Integer> values) {
            addCriterion("MONTH_DEPOSIT in", values, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositNotIn(List<Integer> values) {
            addCriterion("MONTH_DEPOSIT not in", values, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositBetween(Integer value1, Integer value2) {
            addCriterion("MONTH_DEPOSIT between", value1, value2, "monthDeposit");
            return (Criteria) this;
        }

        public Criteria andMonthDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTH_DEPOSIT not between", value1, value2, "monthDeposit");
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

        public Criteria andPriceEqualTo(String value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("PRICE like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("PRICE not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceSeIsNull() {
            addCriterion("PRICE_SE is null");
            return (Criteria) this;
        }

        public Criteria andPriceSeIsNotNull() {
            addCriterion("PRICE_SE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceSeEqualTo(String value) {
            addCriterion("PRICE_SE =", value, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeNotEqualTo(String value) {
            addCriterion("PRICE_SE <>", value, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeGreaterThan(String value) {
            addCriterion("PRICE_SE >", value, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_SE >=", value, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeLessThan(String value) {
            addCriterion("PRICE_SE <", value, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeLessThanOrEqualTo(String value) {
            addCriterion("PRICE_SE <=", value, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeLike(String value) {
            addCriterion("PRICE_SE like", value, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeNotLike(String value) {
            addCriterion("PRICE_SE not like", value, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeIn(List<String> values) {
            addCriterion("PRICE_SE in", values, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeNotIn(List<String> values) {
            addCriterion("PRICE_SE not in", values, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeBetween(String value1, String value2) {
            addCriterion("PRICE_SE between", value1, value2, "priceSe");
            return (Criteria) this;
        }

        public Criteria andPriceSeNotBetween(String value1, String value2) {
            addCriterion("PRICE_SE not between", value1, value2, "priceSe");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIsNull() {
            addCriterion("REMOVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIsNotNull() {
            addCriterion("REMOVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveDateEqualTo(Date value) {
            addCriterionForJDBCDate("REMOVE_DATE =", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REMOVE_DATE <>", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REMOVE_DATE >", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REMOVE_DATE >=", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateLessThan(Date value) {
            addCriterionForJDBCDate("REMOVE_DATE <", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REMOVE_DATE <=", value, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateIn(List<Date> values) {
            addCriterionForJDBCDate("REMOVE_DATE in", values, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REMOVE_DATE not in", values, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REMOVE_DATE between", value1, value2, "removeDate");
            return (Criteria) this;
        }

        public Criteria andRemoveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REMOVE_DATE not between", value1, value2, "removeDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateIsNull() {
            addCriterion("ONSELL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOnsellDateIsNotNull() {
            addCriterion("ONSELL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOnsellDateEqualTo(Date value) {
            addCriterionForJDBCDate("ONSELL_DATE =", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ONSELL_DATE <>", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ONSELL_DATE >", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ONSELL_DATE >=", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateLessThan(Date value) {
            addCriterionForJDBCDate("ONSELL_DATE <", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ONSELL_DATE <=", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateIn(List<Date> values) {
            addCriterionForJDBCDate("ONSELL_DATE in", values, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ONSELL_DATE not in", values, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ONSELL_DATE between", value1, value2, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ONSELL_DATE not between", value1, value2, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateIsNull() {
            addCriterion("OFFSELL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOffsellDateIsNotNull() {
            addCriterion("OFFSELL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOffsellDateEqualTo(Date value) {
            addCriterionForJDBCDate("OFFSELL_DATE =", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OFFSELL_DATE <>", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateGreaterThan(Date value) {
            addCriterionForJDBCDate("OFFSELL_DATE >", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OFFSELL_DATE >=", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateLessThan(Date value) {
            addCriterionForJDBCDate("OFFSELL_DATE <", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OFFSELL_DATE <=", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateIn(List<Date> values) {
            addCriterionForJDBCDate("OFFSELL_DATE in", values, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OFFSELL_DATE not in", values, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OFFSELL_DATE between", value1, value2, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OFFSELL_DATE not between", value1, value2, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andAuditLevelIsNull() {
            addCriterion("AUDIT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAuditLevelIsNotNull() {
            addCriterion("AUDIT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAuditLevelEqualTo(Integer value) {
            addCriterion("AUDIT_LEVEL =", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelNotEqualTo(Integer value) {
            addCriterion("AUDIT_LEVEL <>", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelGreaterThan(Integer value) {
            addCriterion("AUDIT_LEVEL >", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_LEVEL >=", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelLessThan(Integer value) {
            addCriterion("AUDIT_LEVEL <", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelLessThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_LEVEL <=", value, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelIn(List<Integer> values) {
            addCriterion("AUDIT_LEVEL in", values, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelNotIn(List<Integer> values) {
            addCriterion("AUDIT_LEVEL not in", values, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_LEVEL between", value1, value2, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_LEVEL not between", value1, value2, "auditLevel");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andEditTagIsNull() {
            addCriterion("EDIT_TAG is null");
            return (Criteria) this;
        }

        public Criteria andEditTagIsNotNull() {
            addCriterion("EDIT_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andEditTagEqualTo(Integer value) {
            addCriterion("EDIT_TAG =", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotEqualTo(Integer value) {
            addCriterion("EDIT_TAG <>", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagGreaterThan(Integer value) {
            addCriterion("EDIT_TAG >", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("EDIT_TAG >=", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagLessThan(Integer value) {
            addCriterion("EDIT_TAG <", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagLessThanOrEqualTo(Integer value) {
            addCriterion("EDIT_TAG <=", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagIn(List<Integer> values) {
            addCriterion("EDIT_TAG in", values, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotIn(List<Integer> values) {
            addCriterion("EDIT_TAG not in", values, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagBetween(Integer value1, Integer value2) {
            addCriterion("EDIT_TAG between", value1, value2, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotBetween(Integer value1, Integer value2) {
            addCriterion("EDIT_TAG not between", value1, value2, "editTag");
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

        public Criteria andArchiIdIsNull() {
            addCriterion("archi_Id is null");
            return (Criteria) this;
        }

        public Criteria andArchiIdIsNotNull() {
            addCriterion("archi_Id is not null");
            return (Criteria) this;
        }

        public Criteria andArchiIdEqualTo(Integer value) {
            addCriterion("archi_Id =", value, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdNotEqualTo(Integer value) {
            addCriterion("archi_Id <>", value, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdGreaterThan(Integer value) {
            addCriterion("archi_Id >", value, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("archi_Id >=", value, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdLessThan(Integer value) {
            addCriterion("archi_Id <", value, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdLessThanOrEqualTo(Integer value) {
            addCriterion("archi_Id <=", value, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdIn(List<Integer> values) {
            addCriterion("archi_Id in", values, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdNotIn(List<Integer> values) {
            addCriterion("archi_Id not in", values, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdBetween(Integer value1, Integer value2) {
            addCriterion("archi_Id between", value1, value2, "archiId");
            return (Criteria) this;
        }

        public Criteria andArchiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("archi_Id not between", value1, value2, "archiId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdIsNull() {
            addCriterion("ocpy_Id is null");
            return (Criteria) this;
        }

        public Criteria andOcpyIdIsNotNull() {
            addCriterion("ocpy_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOcpyIdEqualTo(Integer value) {
            addCriterion("ocpy_Id =", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdNotEqualTo(Integer value) {
            addCriterion("ocpy_Id <>", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdGreaterThan(Integer value) {
            addCriterion("ocpy_Id >", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ocpy_Id >=", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdLessThan(Integer value) {
            addCriterion("ocpy_Id <", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ocpy_Id <=", value, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdIn(List<Integer> values) {
            addCriterion("ocpy_Id in", values, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdNotIn(List<Integer> values) {
            addCriterion("ocpy_Id not in", values, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdBetween(Integer value1, Integer value2) {
            addCriterion("ocpy_Id between", value1, value2, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andOcpyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ocpy_Id not between", value1, value2, "ocpyId");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIsNull() {
            addCriterion("LINKMAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIsNotNull() {
            addCriterion("LINKMAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameEqualTo(String value) {
            addCriterion("LINKMAN_NAME =", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotEqualTo(String value) {
            addCriterion("LINKMAN_NAME <>", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameGreaterThan(String value) {
            addCriterion("LINKMAN_NAME >", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_NAME >=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLessThan(String value) {
            addCriterion("LINKMAN_NAME <", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_NAME <=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLike(String value) {
            addCriterion("LINKMAN_NAME like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotLike(String value) {
            addCriterion("LINKMAN_NAME not like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIn(List<String> values) {
            addCriterion("LINKMAN_NAME in", values, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotIn(List<String> values) {
            addCriterion("LINKMAN_NAME not in", values, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameBetween(String value1, String value2) {
            addCriterion("LINKMAN_NAME between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_NAME not between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNull() {
            addCriterion("LINKMAN_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNotNull() {
            addCriterion("LINKMAN_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneEqualTo(String value) {
            addCriterion("LINKMAN_PHONE =", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotEqualTo(String value) {
            addCriterion("LINKMAN_PHONE <>", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThan(String value) {
            addCriterion("LINKMAN_PHONE >", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_PHONE >=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThan(String value) {
            addCriterion("LINKMAN_PHONE <", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_PHONE <=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLike(String value) {
            addCriterion("LINKMAN_PHONE like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotLike(String value) {
            addCriterion("LINKMAN_PHONE not like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIn(List<String> values) {
            addCriterion("LINKMAN_PHONE in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotIn(List<String> values) {
            addCriterion("LINKMAN_PHONE not in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneBetween(String value1, String value2) {
            addCriterion("LINKMAN_PHONE between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_PHONE not between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIsNull() {
            addCriterion("LINKMAN_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIsNotNull() {
            addCriterion("LINKMAN_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL =", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL <>", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThan(String value) {
            addCriterion("LINKMAN_EMAIL >", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL >=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLessThan(String value) {
            addCriterion("LINKMAN_EMAIL <", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL <=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLike(String value) {
            addCriterion("LINKMAN_EMAIL like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotLike(String value) {
            addCriterion("LINKMAN_EMAIL not like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIn(List<String> values) {
            addCriterion("LINKMAN_EMAIL in", values, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotIn(List<String> values) {
            addCriterion("LINKMAN_EMAIL not in", values, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailBetween(String value1, String value2) {
            addCriterion("LINKMAN_EMAIL between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_EMAIL not between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIsNull() {
            addCriterion("LINKMAN_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIsNotNull() {
            addCriterion("LINKMAN_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE =", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE <>", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThan(String value) {
            addCriterion("LINKMAN_MOBILE >", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE >=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLessThan(String value) {
            addCriterion("LINKMAN_MOBILE <", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE <=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLike(String value) {
            addCriterion("LINKMAN_MOBILE like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotLike(String value) {
            addCriterion("LINKMAN_MOBILE not like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIn(List<String> values) {
            addCriterion("LINKMAN_MOBILE in", values, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotIn(List<String> values) {
            addCriterion("LINKMAN_MOBILE not in", values, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileBetween(String value1, String value2) {
            addCriterion("LINKMAN_MOBILE between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_MOBILE not between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeIsNull() {
            addCriterion("LINKMAN_NAME_SE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeIsNotNull() {
            addCriterion("LINKMAN_NAME_SE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeEqualTo(String value) {
            addCriterion("LINKMAN_NAME_SE =", value, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeNotEqualTo(String value) {
            addCriterion("LINKMAN_NAME_SE <>", value, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeGreaterThan(String value) {
            addCriterion("LINKMAN_NAME_SE >", value, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_NAME_SE >=", value, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeLessThan(String value) {
            addCriterion("LINKMAN_NAME_SE <", value, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_NAME_SE <=", value, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeLike(String value) {
            addCriterion("LINKMAN_NAME_SE like", value, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeNotLike(String value) {
            addCriterion("LINKMAN_NAME_SE not like", value, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeIn(List<String> values) {
            addCriterion("LINKMAN_NAME_SE in", values, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeNotIn(List<String> values) {
            addCriterion("LINKMAN_NAME_SE not in", values, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeBetween(String value1, String value2) {
            addCriterion("LINKMAN_NAME_SE between", value1, value2, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameSeNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_NAME_SE not between", value1, value2, "linkmanNameSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeIsNull() {
            addCriterion("LINKMAN_PHONE_SE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeIsNotNull() {
            addCriterion("LINKMAN_PHONE_SE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeEqualTo(String value) {
            addCriterion("LINKMAN_PHONE_SE =", value, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeNotEqualTo(String value) {
            addCriterion("LINKMAN_PHONE_SE <>", value, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeGreaterThan(String value) {
            addCriterion("LINKMAN_PHONE_SE >", value, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_PHONE_SE >=", value, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeLessThan(String value) {
            addCriterion("LINKMAN_PHONE_SE <", value, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_PHONE_SE <=", value, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeLike(String value) {
            addCriterion("LINKMAN_PHONE_SE like", value, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeNotLike(String value) {
            addCriterion("LINKMAN_PHONE_SE not like", value, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeIn(List<String> values) {
            addCriterion("LINKMAN_PHONE_SE in", values, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeNotIn(List<String> values) {
            addCriterion("LINKMAN_PHONE_SE not in", values, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeBetween(String value1, String value2) {
            addCriterion("LINKMAN_PHONE_SE between", value1, value2, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneSeNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_PHONE_SE not between", value1, value2, "linkmanPhoneSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeIsNull() {
            addCriterion("LINKMAN_EMAIL_SE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeIsNotNull() {
            addCriterion("LINKMAN_EMAIL_SE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL_SE =", value, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeNotEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL_SE <>", value, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeGreaterThan(String value) {
            addCriterion("LINKMAN_EMAIL_SE >", value, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL_SE >=", value, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeLessThan(String value) {
            addCriterion("LINKMAN_EMAIL_SE <", value, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL_SE <=", value, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeLike(String value) {
            addCriterion("LINKMAN_EMAIL_SE like", value, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeNotLike(String value) {
            addCriterion("LINKMAN_EMAIL_SE not like", value, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeIn(List<String> values) {
            addCriterion("LINKMAN_EMAIL_SE in", values, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeNotIn(List<String> values) {
            addCriterion("LINKMAN_EMAIL_SE not in", values, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeBetween(String value1, String value2) {
            addCriterion("LINKMAN_EMAIL_SE between", value1, value2, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailSeNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_EMAIL_SE not between", value1, value2, "linkmanEmailSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeIsNull() {
            addCriterion("LINKMAN_MOBILE_SE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeIsNotNull() {
            addCriterion("LINKMAN_MOBILE_SE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE_SE =", value, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeNotEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE_SE <>", value, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeGreaterThan(String value) {
            addCriterion("LINKMAN_MOBILE_SE >", value, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE_SE >=", value, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeLessThan(String value) {
            addCriterion("LINKMAN_MOBILE_SE <", value, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_MOBILE_SE <=", value, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeLike(String value) {
            addCriterion("LINKMAN_MOBILE_SE like", value, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeNotLike(String value) {
            addCriterion("LINKMAN_MOBILE_SE not like", value, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeIn(List<String> values) {
            addCriterion("LINKMAN_MOBILE_SE in", values, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeNotIn(List<String> values) {
            addCriterion("LINKMAN_MOBILE_SE not in", values, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeBetween(String value1, String value2) {
            addCriterion("LINKMAN_MOBILE_SE between", value1, value2, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileSeNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_MOBILE_SE not between", value1, value2, "linkmanMobileSe");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_Id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_Id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_Id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_Id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_Id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_Id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_Id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_Id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_Id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_Id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_Id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdIsNull() {
            addCriterion("finishing_Id is null");
            return (Criteria) this;
        }

        public Criteria andFinishingIdIsNotNull() {
            addCriterion("finishing_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFinishingIdEqualTo(Integer value) {
            addCriterion("finishing_Id =", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdNotEqualTo(Integer value) {
            addCriterion("finishing_Id <>", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdGreaterThan(Integer value) {
            addCriterion("finishing_Id >", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishing_Id >=", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdLessThan(Integer value) {
            addCriterion("finishing_Id <", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdLessThanOrEqualTo(Integer value) {
            addCriterion("finishing_Id <=", value, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdIn(List<Integer> values) {
            addCriterion("finishing_Id in", values, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdNotIn(List<Integer> values) {
            addCriterion("finishing_Id not in", values, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdBetween(Integer value1, Integer value2) {
            addCriterion("finishing_Id between", value1, value2, "finishingId");
            return (Criteria) this;
        }

        public Criteria andFinishingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finishing_Id not between", value1, value2, "finishingId");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("PRICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("PRICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(Integer value) {
            addCriterion("PRICE_TYPE =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(Integer value) {
            addCriterion("PRICE_TYPE <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(Integer value) {
            addCriterion("PRICE_TYPE >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICE_TYPE >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(Integer value) {
            addCriterion("PRICE_TYPE <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PRICE_TYPE <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<Integer> values) {
            addCriterion("PRICE_TYPE in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<Integer> values) {
            addCriterion("PRICE_TYPE not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(Integer value1, Integer value2) {
            addCriterion("PRICE_TYPE between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICE_TYPE not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("PUBLISHER is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("PUBLISHER is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("PUBLISHER =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("PUBLISHER <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("PUBLISHER >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLISHER >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("PUBLISHER <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("PUBLISHER <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("PUBLISHER like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("PUBLISHER not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("PUBLISHER in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("PUBLISHER not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("PUBLISHER between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("PUBLISHER not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNull() {
            addCriterion("street_Id is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNotNull() {
            addCriterion("street_Id is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdEqualTo(Integer value) {
            addCriterion("street_Id =", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotEqualTo(Integer value) {
            addCriterion("street_Id <>", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThan(Integer value) {
            addCriterion("street_Id >", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("street_Id >=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThan(Integer value) {
            addCriterion("street_Id <", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThanOrEqualTo(Integer value) {
            addCriterion("street_Id <=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIn(List<Integer> values) {
            addCriterion("street_Id in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotIn(List<Integer> values) {
            addCriterion("street_Id not in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdBetween(Integer value1, Integer value2) {
            addCriterion("street_Id between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("street_Id not between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andHotIdIsNull() {
            addCriterion("hot_Id is null");
            return (Criteria) this;
        }

        public Criteria andHotIdIsNotNull() {
            addCriterion("hot_Id is not null");
            return (Criteria) this;
        }

        public Criteria andHotIdEqualTo(Integer value) {
            addCriterion("hot_Id =", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdNotEqualTo(Integer value) {
            addCriterion("hot_Id <>", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdGreaterThan(Integer value) {
            addCriterion("hot_Id >", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hot_Id >=", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdLessThan(Integer value) {
            addCriterion("hot_Id <", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdLessThanOrEqualTo(Integer value) {
            addCriterion("hot_Id <=", value, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdIn(List<Integer> values) {
            addCriterion("hot_Id in", values, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdNotIn(List<Integer> values) {
            addCriterion("hot_Id not in", values, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdBetween(Integer value1, Integer value2) {
            addCriterion("hot_Id between", value1, value2, "hotId");
            return (Criteria) this;
        }

        public Criteria andHotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hot_Id not between", value1, value2, "hotId");
            return (Criteria) this;
        }

        public Criteria andBrowsersIsNull() {
            addCriterion("browsers is null");
            return (Criteria) this;
        }

        public Criteria andBrowsersIsNotNull() {
            addCriterion("browsers is not null");
            return (Criteria) this;
        }

        public Criteria andBrowsersEqualTo(Integer value) {
            addCriterion("browsers =", value, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersNotEqualTo(Integer value) {
            addCriterion("browsers <>", value, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersGreaterThan(Integer value) {
            addCriterion("browsers >", value, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersGreaterThanOrEqualTo(Integer value) {
            addCriterion("browsers >=", value, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersLessThan(Integer value) {
            addCriterion("browsers <", value, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersLessThanOrEqualTo(Integer value) {
            addCriterion("browsers <=", value, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersIn(List<Integer> values) {
            addCriterion("browsers in", values, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersNotIn(List<Integer> values) {
            addCriterion("browsers not in", values, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersBetween(Integer value1, Integer value2) {
            addCriterion("browsers between", value1, value2, "browsers");
            return (Criteria) this;
        }

        public Criteria andBrowsersNotBetween(Integer value1, Integer value2) {
            addCriterion("browsers not between", value1, value2, "browsers");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andZoomIsNull() {
            addCriterion("zoom is null");
            return (Criteria) this;
        }

        public Criteria andZoomIsNotNull() {
            addCriterion("zoom is not null");
            return (Criteria) this;
        }

        public Criteria andZoomEqualTo(Integer value) {
            addCriterion("zoom =", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotEqualTo(Integer value) {
            addCriterion("zoom <>", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomGreaterThan(Integer value) {
            addCriterion("zoom >", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("zoom >=", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomLessThan(Integer value) {
            addCriterion("zoom <", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomLessThanOrEqualTo(Integer value) {
            addCriterion("zoom <=", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomIn(List<Integer> values) {
            addCriterion("zoom in", values, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotIn(List<Integer> values) {
            addCriterion("zoom not in", values, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomBetween(Integer value1, Integer value2) {
            addCriterion("zoom between", value1, value2, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotBetween(Integer value1, Integer value2) {
            addCriterion("zoom not between", value1, value2, "zoom");
            return (Criteria) this;
        }

        public Criteria andFlrheightIsNull() {
            addCriterion("flrHeight is null");
            return (Criteria) this;
        }

        public Criteria andFlrheightIsNotNull() {
            addCriterion("flrHeight is not null");
            return (Criteria) this;
        }

        public Criteria andFlrheightEqualTo(Integer value) {
            addCriterion("flrHeight =", value, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightNotEqualTo(Integer value) {
            addCriterion("flrHeight <>", value, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightGreaterThan(Integer value) {
            addCriterion("flrHeight >", value, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightGreaterThanOrEqualTo(Integer value) {
            addCriterion("flrHeight >=", value, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightLessThan(Integer value) {
            addCriterion("flrHeight <", value, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightLessThanOrEqualTo(Integer value) {
            addCriterion("flrHeight <=", value, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightIn(List<Integer> values) {
            addCriterion("flrHeight in", values, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightNotIn(List<Integer> values) {
            addCriterion("flrHeight not in", values, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightBetween(Integer value1, Integer value2) {
            addCriterion("flrHeight between", value1, value2, "flrheight");
            return (Criteria) this;
        }

        public Criteria andFlrheightNotBetween(Integer value1, Integer value2) {
            addCriterion("flrHeight not between", value1, value2, "flrheight");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareIsNull() {
            addCriterion("office_Square is null");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareIsNotNull() {
            addCriterion("office_Square is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareEqualTo(BigDecimal value) {
            addCriterion("office_Square =", value, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareNotEqualTo(BigDecimal value) {
            addCriterion("office_Square <>", value, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareGreaterThan(BigDecimal value) {
            addCriterion("office_Square >", value, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("office_Square >=", value, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareLessThan(BigDecimal value) {
            addCriterion("office_Square <", value, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("office_Square <=", value, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareIn(List<BigDecimal> values) {
            addCriterion("office_Square in", values, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareNotIn(List<BigDecimal> values) {
            addCriterion("office_Square not in", values, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("office_Square between", value1, value2, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andOfficeSquareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("office_Square not between", value1, value2, "officeSquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareIsNull() {
            addCriterion("factory_Square is null");
            return (Criteria) this;
        }

        public Criteria andFactorySquareIsNotNull() {
            addCriterion("factory_Square is not null");
            return (Criteria) this;
        }

        public Criteria andFactorySquareEqualTo(BigDecimal value) {
            addCriterion("factory_Square =", value, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareNotEqualTo(BigDecimal value) {
            addCriterion("factory_Square <>", value, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareGreaterThan(BigDecimal value) {
            addCriterion("factory_Square >", value, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("factory_Square >=", value, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareLessThan(BigDecimal value) {
            addCriterion("factory_Square <", value, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("factory_Square <=", value, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareIn(List<BigDecimal> values) {
            addCriterion("factory_Square in", values, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareNotIn(List<BigDecimal> values) {
            addCriterion("factory_Square not in", values, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("factory_Square between", value1, value2, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andFactorySquareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("factory_Square not between", value1, value2, "factorySquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareIsNull() {
            addCriterion("warehouse_Square is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareIsNotNull() {
            addCriterion("warehouse_Square is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareEqualTo(BigDecimal value) {
            addCriterion("warehouse_Square =", value, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareNotEqualTo(BigDecimal value) {
            addCriterion("warehouse_Square <>", value, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareGreaterThan(BigDecimal value) {
            addCriterion("warehouse_Square >", value, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("warehouse_Square >=", value, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareLessThan(BigDecimal value) {
            addCriterion("warehouse_Square <", value, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("warehouse_Square <=", value, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareIn(List<BigDecimal> values) {
            addCriterion("warehouse_Square in", values, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareNotIn(List<BigDecimal> values) {
            addCriterion("warehouse_Square not in", values, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warehouse_Square between", value1, value2, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andWarehouseSquareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("warehouse_Square not between", value1, value2, "warehouseSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareIsNull() {
            addCriterion("yard_Square is null");
            return (Criteria) this;
        }

        public Criteria andYardSquareIsNotNull() {
            addCriterion("yard_Square is not null");
            return (Criteria) this;
        }

        public Criteria andYardSquareEqualTo(BigDecimal value) {
            addCriterion("yard_Square =", value, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareNotEqualTo(BigDecimal value) {
            addCriterion("yard_Square <>", value, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareGreaterThan(BigDecimal value) {
            addCriterion("yard_Square >", value, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yard_Square >=", value, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareLessThan(BigDecimal value) {
            addCriterion("yard_Square <", value, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yard_Square <=", value, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareIn(List<BigDecimal> values) {
            addCriterion("yard_Square in", values, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareNotIn(List<BigDecimal> values) {
            addCriterion("yard_Square not in", values, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yard_Square between", value1, value2, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andYardSquareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yard_Square not between", value1, value2, "yardSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareIsNull() {
            addCriterion("shop_Square is null");
            return (Criteria) this;
        }

        public Criteria andShopSquareIsNotNull() {
            addCriterion("shop_Square is not null");
            return (Criteria) this;
        }

        public Criteria andShopSquareEqualTo(BigDecimal value) {
            addCriterion("shop_Square =", value, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareNotEqualTo(BigDecimal value) {
            addCriterion("shop_Square <>", value, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareGreaterThan(BigDecimal value) {
            addCriterion("shop_Square >", value, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_Square >=", value, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareLessThan(BigDecimal value) {
            addCriterion("shop_Square <", value, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_Square <=", value, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareIn(List<BigDecimal> values) {
            addCriterion("shop_Square in", values, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareNotIn(List<BigDecimal> values) {
            addCriterion("shop_Square not in", values, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_Square between", value1, value2, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andShopSquareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_Square not between", value1, value2, "shopSquare");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNull() {
            addCriterion("rent_Type is null");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNotNull() {
            addCriterion("rent_Type is not null");
            return (Criteria) this;
        }

        public Criteria andRentTypeEqualTo(Integer value) {
            addCriterion("rent_Type =", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotEqualTo(Integer value) {
            addCriterion("rent_Type <>", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThan(Integer value) {
            addCriterion("rent_Type >", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_Type >=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThan(Integer value) {
            addCriterion("rent_Type <", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rent_Type <=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeIn(List<Integer> values) {
            addCriterion("rent_Type in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotIn(List<Integer> values) {
            addCriterion("rent_Type not in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeBetween(Integer value1, Integer value2) {
            addCriterion("rent_Type between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_Type not between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andOntopIsNull() {
            addCriterion("ontop is null");
            return (Criteria) this;
        }

        public Criteria andOntopIsNotNull() {
            addCriterion("ontop is not null");
            return (Criteria) this;
        }

        public Criteria andOntopEqualTo(Integer value) {
            addCriterion("ontop =", value, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopNotEqualTo(Integer value) {
            addCriterion("ontop <>", value, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopGreaterThan(Integer value) {
            addCriterion("ontop >", value, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopGreaterThanOrEqualTo(Integer value) {
            addCriterion("ontop >=", value, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopLessThan(Integer value) {
            addCriterion("ontop <", value, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopLessThanOrEqualTo(Integer value) {
            addCriterion("ontop <=", value, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopIn(List<Integer> values) {
            addCriterion("ontop in", values, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopNotIn(List<Integer> values) {
            addCriterion("ontop not in", values, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopBetween(Integer value1, Integer value2) {
            addCriterion("ontop between", value1, value2, "ontop");
            return (Criteria) this;
        }

        public Criteria andOntopNotBetween(Integer value1, Integer value2) {
            addCriterion("ontop not between", value1, value2, "ontop");
            return (Criteria) this;
        }

        public Criteria andDepositTypeIsNull() {
            addCriterion("DEPOSIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDepositTypeIsNotNull() {
            addCriterion("DEPOSIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositTypeEqualTo(Integer value) {
            addCriterion("DEPOSIT_TYPE =", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeNotEqualTo(Integer value) {
            addCriterion("DEPOSIT_TYPE <>", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeGreaterThan(Integer value) {
            addCriterion("DEPOSIT_TYPE >", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_TYPE >=", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeLessThan(Integer value) {
            addCriterion("DEPOSIT_TYPE <", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT_TYPE <=", value, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeIn(List<Integer> values) {
            addCriterion("DEPOSIT_TYPE in", values, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeNotIn(List<Integer> values) {
            addCriterion("DEPOSIT_TYPE not in", values, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_TYPE between", value1, value2, "depositType");
            return (Criteria) this;
        }

        public Criteria andDepositTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT_TYPE not between", value1, value2, "depositType");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNull() {
            addCriterion("PRICE2 is null");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNotNull() {
            addCriterion("PRICE2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice2EqualTo(Integer value) {
            addCriterion("PRICE2 =", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotEqualTo(Integer value) {
            addCriterion("PRICE2 <>", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThan(Integer value) {
            addCriterion("PRICE2 >", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICE2 >=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThan(Integer value) {
            addCriterion("PRICE2 <", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThanOrEqualTo(Integer value) {
            addCriterion("PRICE2 <=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2In(List<Integer> values) {
            addCriterion("PRICE2 in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotIn(List<Integer> values) {
            addCriterion("PRICE2 not in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2Between(Integer value1, Integer value2) {
            addCriterion("PRICE2 between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotBetween(Integer value1, Integer value2) {
            addCriterion("PRICE2 not between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2IsNull() {
            addCriterion("PRICE_SE2 is null");
            return (Criteria) this;
        }

        public Criteria andPriceSe2IsNotNull() {
            addCriterion("PRICE_SE2 is not null");
            return (Criteria) this;
        }

        public Criteria andPriceSe2EqualTo(Integer value) {
            addCriterion("PRICE_SE2 =", value, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2NotEqualTo(Integer value) {
            addCriterion("PRICE_SE2 <>", value, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2GreaterThan(Integer value) {
            addCriterion("PRICE_SE2 >", value, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2GreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICE_SE2 >=", value, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2LessThan(Integer value) {
            addCriterion("PRICE_SE2 <", value, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2LessThanOrEqualTo(Integer value) {
            addCriterion("PRICE_SE2 <=", value, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2In(List<Integer> values) {
            addCriterion("PRICE_SE2 in", values, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2NotIn(List<Integer> values) {
            addCriterion("PRICE_SE2 not in", values, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2Between(Integer value1, Integer value2) {
            addCriterion("PRICE_SE2 between", value1, value2, "priceSe2");
            return (Criteria) this;
        }

        public Criteria andPriceSe2NotBetween(Integer value1, Integer value2) {
            addCriterion("PRICE_SE2 not between", value1, value2, "priceSe2");
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
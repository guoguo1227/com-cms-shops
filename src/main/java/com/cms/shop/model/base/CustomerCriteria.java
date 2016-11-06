package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CustomerCriteria() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("CELLPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("CELLPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("CELLPHONE =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("CELLPHONE <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("CELLPHONE >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CELLPHONE >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("CELLPHONE <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("CELLPHONE <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("CELLPHONE like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("CELLPHONE not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("CELLPHONE in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("CELLPHONE not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("CELLPHONE between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("CELLPHONE not between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOccIsNull() {
            addCriterion("OCC is null");
            return (Criteria) this;
        }

        public Criteria andOccIsNotNull() {
            addCriterion("OCC is not null");
            return (Criteria) this;
        }

        public Criteria andOccEqualTo(String value) {
            addCriterion("OCC =", value, "occ");
            return (Criteria) this;
        }

        public Criteria andOccNotEqualTo(String value) {
            addCriterion("OCC <>", value, "occ");
            return (Criteria) this;
        }

        public Criteria andOccGreaterThan(String value) {
            addCriterion("OCC >", value, "occ");
            return (Criteria) this;
        }

        public Criteria andOccGreaterThanOrEqualTo(String value) {
            addCriterion("OCC >=", value, "occ");
            return (Criteria) this;
        }

        public Criteria andOccLessThan(String value) {
            addCriterion("OCC <", value, "occ");
            return (Criteria) this;
        }

        public Criteria andOccLessThanOrEqualTo(String value) {
            addCriterion("OCC <=", value, "occ");
            return (Criteria) this;
        }

        public Criteria andOccLike(String value) {
            addCriterion("OCC like", value, "occ");
            return (Criteria) this;
        }

        public Criteria andOccNotLike(String value) {
            addCriterion("OCC not like", value, "occ");
            return (Criteria) this;
        }

        public Criteria andOccIn(List<String> values) {
            addCriterion("OCC in", values, "occ");
            return (Criteria) this;
        }

        public Criteria andOccNotIn(List<String> values) {
            addCriterion("OCC not in", values, "occ");
            return (Criteria) this;
        }

        public Criteria andOccBetween(String value1, String value2) {
            addCriterion("OCC between", value1, value2, "occ");
            return (Criteria) this;
        }

        public Criteria andOccNotBetween(String value1, String value2) {
            addCriterion("OCC not between", value1, value2, "occ");
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("customer_Status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("customer_Status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(Integer value) {
            addCriterion("customer_Status =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(Integer value) {
            addCriterion("customer_Status <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(Integer value) {
            addCriterion("customer_Status >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_Status >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(Integer value) {
            addCriterion("customer_Status <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_Status <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<Integer> values) {
            addCriterion("customer_Status in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<Integer> values) {
            addCriterion("customer_Status not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_Status between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_Status not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_Date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_Date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("register_Date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("register_Date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("register_Date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_Date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("register_Date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("register_Date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("register_Date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("register_Date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("register_Date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("register_Date not between", value1, value2, "registerDate");
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

        public Criteria andEditTagIsNull() {
            addCriterion("edit_Tag is null");
            return (Criteria) this;
        }

        public Criteria andEditTagIsNotNull() {
            addCriterion("edit_Tag is not null");
            return (Criteria) this;
        }

        public Criteria andEditTagEqualTo(Integer value) {
            addCriterion("edit_Tag =", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotEqualTo(Integer value) {
            addCriterion("edit_Tag <>", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagGreaterThan(Integer value) {
            addCriterion("edit_Tag >", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_Tag >=", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagLessThan(Integer value) {
            addCriterion("edit_Tag <", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagLessThanOrEqualTo(Integer value) {
            addCriterion("edit_Tag <=", value, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagIn(List<Integer> values) {
            addCriterion("edit_Tag in", values, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotIn(List<Integer> values) {
            addCriterion("edit_Tag not in", values, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagBetween(Integer value1, Integer value2) {
            addCriterion("edit_Tag between", value1, value2, "editTag");
            return (Criteria) this;
        }

        public Criteria andEditTagNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_Tag not between", value1, value2, "editTag");
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
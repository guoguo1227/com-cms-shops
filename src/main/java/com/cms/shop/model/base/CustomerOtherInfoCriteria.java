package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerOtherInfoCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CustomerOtherInfoCriteria() {
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

        public Criteria andCustInfoIdIsNull() {
            addCriterion("CUST_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdIsNotNull() {
            addCriterion("CUST_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdEqualTo(Integer value) {
            addCriterion("CUST_INFO_ID =", value, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdNotEqualTo(Integer value) {
            addCriterion("CUST_INFO_ID <>", value, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdGreaterThan(Integer value) {
            addCriterion("CUST_INFO_ID >", value, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUST_INFO_ID >=", value, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdLessThan(Integer value) {
            addCriterion("CUST_INFO_ID <", value, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUST_INFO_ID <=", value, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdIn(List<Integer> values) {
            addCriterion("CUST_INFO_ID in", values, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdNotIn(List<Integer> values) {
            addCriterion("CUST_INFO_ID not in", values, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("CUST_INFO_ID between", value1, value2, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andCustInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUST_INFO_ID not between", value1, value2, "custInfoId");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andExprcTagIsNull() {
            addCriterion("EXPRC_TAG is null");
            return (Criteria) this;
        }

        public Criteria andExprcTagIsNotNull() {
            addCriterion("EXPRC_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andExprcTagEqualTo(Integer value) {
            addCriterion("EXPRC_TAG =", value, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagNotEqualTo(Integer value) {
            addCriterion("EXPRC_TAG <>", value, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagGreaterThan(Integer value) {
            addCriterion("EXPRC_TAG >", value, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPRC_TAG >=", value, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagLessThan(Integer value) {
            addCriterion("EXPRC_TAG <", value, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagLessThanOrEqualTo(Integer value) {
            addCriterion("EXPRC_TAG <=", value, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagIn(List<Integer> values) {
            addCriterion("EXPRC_TAG in", values, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagNotIn(List<Integer> values) {
            addCriterion("EXPRC_TAG not in", values, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagBetween(Integer value1, Integer value2) {
            addCriterion("EXPRC_TAG between", value1, value2, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcTagNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPRC_TAG not between", value1, value2, "exprcTag");
            return (Criteria) this;
        }

        public Criteria andExprcYearsIsNull() {
            addCriterion("EXPRC_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andExprcYearsIsNotNull() {
            addCriterion("EXPRC_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andExprcYearsEqualTo(Integer value) {
            addCriterion("EXPRC_YEARS =", value, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsNotEqualTo(Integer value) {
            addCriterion("EXPRC_YEARS <>", value, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsGreaterThan(Integer value) {
            addCriterion("EXPRC_YEARS >", value, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPRC_YEARS >=", value, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsLessThan(Integer value) {
            addCriterion("EXPRC_YEARS <", value, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsLessThanOrEqualTo(Integer value) {
            addCriterion("EXPRC_YEARS <=", value, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsIn(List<Integer> values) {
            addCriterion("EXPRC_YEARS in", values, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsNotIn(List<Integer> values) {
            addCriterion("EXPRC_YEARS not in", values, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsBetween(Integer value1, Integer value2) {
            addCriterion("EXPRC_YEARS between", value1, value2, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andExprcYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPRC_YEARS not between", value1, value2, "exprcYears");
            return (Criteria) this;
        }

        public Criteria andOtExprcIsNull() {
            addCriterion("OT_EXPRC is null");
            return (Criteria) this;
        }

        public Criteria andOtExprcIsNotNull() {
            addCriterion("OT_EXPRC is not null");
            return (Criteria) this;
        }

        public Criteria andOtExprcEqualTo(String value) {
            addCriterion("OT_EXPRC =", value, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcNotEqualTo(String value) {
            addCriterion("OT_EXPRC <>", value, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcGreaterThan(String value) {
            addCriterion("OT_EXPRC >", value, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcGreaterThanOrEqualTo(String value) {
            addCriterion("OT_EXPRC >=", value, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcLessThan(String value) {
            addCriterion("OT_EXPRC <", value, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcLessThanOrEqualTo(String value) {
            addCriterion("OT_EXPRC <=", value, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcLike(String value) {
            addCriterion("OT_EXPRC like", value, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcNotLike(String value) {
            addCriterion("OT_EXPRC not like", value, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcIn(List<String> values) {
            addCriterion("OT_EXPRC in", values, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcNotIn(List<String> values) {
            addCriterion("OT_EXPRC not in", values, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcBetween(String value1, String value2) {
            addCriterion("OT_EXPRC between", value1, value2, "otExprc");
            return (Criteria) this;
        }

        public Criteria andOtExprcNotBetween(String value1, String value2) {
            addCriterion("OT_EXPRC not between", value1, value2, "otExprc");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRgstCptlIsNull() {
            addCriterion("RGST_CPTL is null");
            return (Criteria) this;
        }

        public Criteria andRgstCptlIsNotNull() {
            addCriterion("RGST_CPTL is not null");
            return (Criteria) this;
        }

        public Criteria andRgstCptlEqualTo(Integer value) {
            addCriterion("RGST_CPTL =", value, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlNotEqualTo(Integer value) {
            addCriterion("RGST_CPTL <>", value, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlGreaterThan(Integer value) {
            addCriterion("RGST_CPTL >", value, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlGreaterThanOrEqualTo(Integer value) {
            addCriterion("RGST_CPTL >=", value, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlLessThan(Integer value) {
            addCriterion("RGST_CPTL <", value, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlLessThanOrEqualTo(Integer value) {
            addCriterion("RGST_CPTL <=", value, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlIn(List<Integer> values) {
            addCriterion("RGST_CPTL in", values, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlNotIn(List<Integer> values) {
            addCriterion("RGST_CPTL not in", values, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlBetween(Integer value1, Integer value2) {
            addCriterion("RGST_CPTL between", value1, value2, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstCptlNotBetween(Integer value1, Integer value2) {
            addCriterion("RGST_CPTL not between", value1, value2, "rgstCptl");
            return (Criteria) this;
        }

        public Criteria andRgstLocIsNull() {
            addCriterion("RGST_LOC is null");
            return (Criteria) this;
        }

        public Criteria andRgstLocIsNotNull() {
            addCriterion("RGST_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andRgstLocEqualTo(String value) {
            addCriterion("RGST_LOC =", value, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocNotEqualTo(String value) {
            addCriterion("RGST_LOC <>", value, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocGreaterThan(String value) {
            addCriterion("RGST_LOC >", value, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocGreaterThanOrEqualTo(String value) {
            addCriterion("RGST_LOC >=", value, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocLessThan(String value) {
            addCriterion("RGST_LOC <", value, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocLessThanOrEqualTo(String value) {
            addCriterion("RGST_LOC <=", value, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocLike(String value) {
            addCriterion("RGST_LOC like", value, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocNotLike(String value) {
            addCriterion("RGST_LOC not like", value, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocIn(List<String> values) {
            addCriterion("RGST_LOC in", values, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocNotIn(List<String> values) {
            addCriterion("RGST_LOC not in", values, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocBetween(String value1, String value2) {
            addCriterion("RGST_LOC between", value1, value2, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andRgstLocNotBetween(String value1, String value2) {
            addCriterion("RGST_LOC not between", value1, value2, "rgstLoc");
            return (Criteria) this;
        }

        public Criteria andFndDateIsNull() {
            addCriterion("FND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFndDateIsNotNull() {
            addCriterion("FND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFndDateEqualTo(Date value) {
            addCriterionForJDBCDate("FND_DATE =", value, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FND_DATE <>", value, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FND_DATE >", value, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FND_DATE >=", value, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateLessThan(Date value) {
            addCriterionForJDBCDate("FND_DATE <", value, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FND_DATE <=", value, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateIn(List<Date> values) {
            addCriterionForJDBCDate("FND_DATE in", values, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FND_DATE not in", values, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FND_DATE between", value1, value2, "fndDate");
            return (Criteria) this;
        }

        public Criteria andFndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FND_DATE not between", value1, value2, "fndDate");
            return (Criteria) this;
        }

        public Criteria andEmpScalIsNull() {
            addCriterion("EMP_SCAL is null");
            return (Criteria) this;
        }

        public Criteria andEmpScalIsNotNull() {
            addCriterion("EMP_SCAL is not null");
            return (Criteria) this;
        }

        public Criteria andEmpScalEqualTo(Integer value) {
            addCriterion("EMP_SCAL =", value, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalNotEqualTo(Integer value) {
            addCriterion("EMP_SCAL <>", value, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalGreaterThan(Integer value) {
            addCriterion("EMP_SCAL >", value, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMP_SCAL >=", value, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalLessThan(Integer value) {
            addCriterion("EMP_SCAL <", value, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalLessThanOrEqualTo(Integer value) {
            addCriterion("EMP_SCAL <=", value, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalIn(List<Integer> values) {
            addCriterion("EMP_SCAL in", values, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalNotIn(List<Integer> values) {
            addCriterion("EMP_SCAL not in", values, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalBetween(Integer value1, Integer value2) {
            addCriterion("EMP_SCAL between", value1, value2, "empScal");
            return (Criteria) this;
        }

        public Criteria andEmpScalNotBetween(Integer value1, Integer value2) {
            addCriterion("EMP_SCAL not between", value1, value2, "empScal");
            return (Criteria) this;
        }

        public Criteria andSbbpfIsNull() {
            addCriterion("SBBPF is null");
            return (Criteria) this;
        }

        public Criteria andSbbpfIsNotNull() {
            addCriterion("SBBPF is not null");
            return (Criteria) this;
        }

        public Criteria andSbbpfEqualTo(Integer value) {
            addCriterion("SBBPF =", value, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfNotEqualTo(Integer value) {
            addCriterion("SBBPF <>", value, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfGreaterThan(Integer value) {
            addCriterion("SBBPF >", value, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfGreaterThanOrEqualTo(Integer value) {
            addCriterion("SBBPF >=", value, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfLessThan(Integer value) {
            addCriterion("SBBPF <", value, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfLessThanOrEqualTo(Integer value) {
            addCriterion("SBBPF <=", value, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfIn(List<Integer> values) {
            addCriterion("SBBPF in", values, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfNotIn(List<Integer> values) {
            addCriterion("SBBPF not in", values, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfBetween(Integer value1, Integer value2) {
            addCriterion("SBBPF between", value1, value2, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andSbbpfNotBetween(Integer value1, Integer value2) {
            addCriterion("SBBPF not between", value1, value2, "sbbpf");
            return (Criteria) this;
        }

        public Criteria andScpOfBusIsNull() {
            addCriterion("scp_Of_Bus is null");
            return (Criteria) this;
        }

        public Criteria andScpOfBusIsNotNull() {
            addCriterion("scp_Of_Bus is not null");
            return (Criteria) this;
        }

        public Criteria andScpOfBusEqualTo(String value) {
            addCriterion("scp_Of_Bus =", value, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusNotEqualTo(String value) {
            addCriterion("scp_Of_Bus <>", value, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusGreaterThan(String value) {
            addCriterion("scp_Of_Bus >", value, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusGreaterThanOrEqualTo(String value) {
            addCriterion("scp_Of_Bus >=", value, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusLessThan(String value) {
            addCriterion("scp_Of_Bus <", value, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusLessThanOrEqualTo(String value) {
            addCriterion("scp_Of_Bus <=", value, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusLike(String value) {
            addCriterion("scp_Of_Bus like", value, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusNotLike(String value) {
            addCriterion("scp_Of_Bus not like", value, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusIn(List<String> values) {
            addCriterion("scp_Of_Bus in", values, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusNotIn(List<String> values) {
            addCriterion("scp_Of_Bus not in", values, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusBetween(String value1, String value2) {
            addCriterion("scp_Of_Bus between", value1, value2, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andScpOfBusNotBetween(String value1, String value2) {
            addCriterion("scp_Of_Bus not between", value1, value2, "scpOfBus");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_Id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_Id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_Id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_Id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_Id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_Id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_Id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_Id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_Id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_Id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_Id not between", value1, value2, "customerId");
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
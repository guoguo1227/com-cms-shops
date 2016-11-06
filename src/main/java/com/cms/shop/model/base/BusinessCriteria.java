package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BusinessCriteria() {
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

        public Criteria andBizIdIsNull() {
            addCriterion("biz_Id is null");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("biz_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBizIdEqualTo(Integer value) {
            addCriterion("biz_Id =", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotEqualTo(Integer value) {
            addCriterion("biz_Id <>", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThan(Integer value) {
            addCriterion("biz_Id >", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_Id >=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThan(Integer value) {
            addCriterion("biz_Id <", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThanOrEqualTo(Integer value) {
            addCriterion("biz_Id <=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdIn(List<Integer> values) {
            addCriterion("biz_Id in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotIn(List<Integer> values) {
            addCriterion("biz_Id not in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdBetween(Integer value1, Integer value2) {
            addCriterion("biz_Id between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_Id not between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizNameIsNull() {
            addCriterion("biz_Name is null");
            return (Criteria) this;
        }

        public Criteria andBizNameIsNotNull() {
            addCriterion("biz_Name is not null");
            return (Criteria) this;
        }

        public Criteria andBizNameEqualTo(String value) {
            addCriterion("biz_Name =", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotEqualTo(String value) {
            addCriterion("biz_Name <>", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameGreaterThan(String value) {
            addCriterion("biz_Name >", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameGreaterThanOrEqualTo(String value) {
            addCriterion("biz_Name >=", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLessThan(String value) {
            addCriterion("biz_Name <", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLessThanOrEqualTo(String value) {
            addCriterion("biz_Name <=", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLike(String value) {
            addCriterion("biz_Name like", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotLike(String value) {
            addCriterion("biz_Name not like", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameIn(List<String> values) {
            addCriterion("biz_Name in", values, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotIn(List<String> values) {
            addCriterion("biz_Name not in", values, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameBetween(String value1, String value2) {
            addCriterion("biz_Name between", value1, value2, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotBetween(String value1, String value2) {
            addCriterion("biz_Name not between", value1, value2, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizContentIsNull() {
            addCriterion("biz_Content is null");
            return (Criteria) this;
        }

        public Criteria andBizContentIsNotNull() {
            addCriterion("biz_Content is not null");
            return (Criteria) this;
        }

        public Criteria andBizContentEqualTo(String value) {
            addCriterion("biz_Content =", value, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentNotEqualTo(String value) {
            addCriterion("biz_Content <>", value, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentGreaterThan(String value) {
            addCriterion("biz_Content >", value, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentGreaterThanOrEqualTo(String value) {
            addCriterion("biz_Content >=", value, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentLessThan(String value) {
            addCriterion("biz_Content <", value, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentLessThanOrEqualTo(String value) {
            addCriterion("biz_Content <=", value, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentLike(String value) {
            addCriterion("biz_Content like", value, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentNotLike(String value) {
            addCriterion("biz_Content not like", value, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentIn(List<String> values) {
            addCriterion("biz_Content in", values, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentNotIn(List<String> values) {
            addCriterion("biz_Content not in", values, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentBetween(String value1, String value2) {
            addCriterion("biz_Content between", value1, value2, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizContentNotBetween(String value1, String value2) {
            addCriterion("biz_Content not between", value1, value2, "bizContent");
            return (Criteria) this;
        }

        public Criteria andBizStatusIsNull() {
            addCriterion("biz_Status is null");
            return (Criteria) this;
        }

        public Criteria andBizStatusIsNotNull() {
            addCriterion("biz_Status is not null");
            return (Criteria) this;
        }

        public Criteria andBizStatusEqualTo(Integer value) {
            addCriterion("biz_Status =", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotEqualTo(Integer value) {
            addCriterion("biz_Status <>", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusGreaterThan(Integer value) {
            addCriterion("biz_Status >", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("biz_Status >=", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLessThan(Integer value) {
            addCriterion("biz_Status <", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLessThanOrEqualTo(Integer value) {
            addCriterion("biz_Status <=", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusIn(List<Integer> values) {
            addCriterion("biz_Status in", values, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotIn(List<Integer> values) {
            addCriterion("biz_Status not in", values, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusBetween(Integer value1, Integer value2) {
            addCriterion("biz_Status between", value1, value2, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("biz_Status not between", value1, value2, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_Date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_Date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_Date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_Date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_Date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_Date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_Date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_Date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_Date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_Date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_Date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateIsNull() {
            addCriterion("offsell_Date is null");
            return (Criteria) this;
        }

        public Criteria andOffsellDateIsNotNull() {
            addCriterion("offsell_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOffsellDateEqualTo(Date value) {
            addCriterion("offsell_Date =", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateNotEqualTo(Date value) {
            addCriterion("offsell_Date <>", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateGreaterThan(Date value) {
            addCriterion("offsell_Date >", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateGreaterThanOrEqualTo(Date value) {
            addCriterion("offsell_Date >=", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateLessThan(Date value) {
            addCriterion("offsell_Date <", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateLessThanOrEqualTo(Date value) {
            addCriterion("offsell_Date <=", value, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateIn(List<Date> values) {
            addCriterion("offsell_Date in", values, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateNotIn(List<Date> values) {
            addCriterion("offsell_Date not in", values, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateBetween(Date value1, Date value2) {
            addCriterion("offsell_Date between", value1, value2, "offsellDate");
            return (Criteria) this;
        }

        public Criteria andOffsellDateNotBetween(Date value1, Date value2) {
            addCriterion("offsell_Date not between", value1, value2, "offsellDate");
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

        public Criteria andFileNameIsNull() {
            addCriterion("file_Name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_Name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_Name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_Name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_Name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_Name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_Name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_Name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_Name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_Name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_Name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_Name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_Name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andOnsellDateIsNull() {
            addCriterion("onsell_Date is null");
            return (Criteria) this;
        }

        public Criteria andOnsellDateIsNotNull() {
            addCriterion("onsell_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOnsellDateEqualTo(Date value) {
            addCriterion("onsell_Date =", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateNotEqualTo(Date value) {
            addCriterion("onsell_Date <>", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateGreaterThan(Date value) {
            addCriterion("onsell_Date >", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateGreaterThanOrEqualTo(Date value) {
            addCriterion("onsell_Date >=", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateLessThan(Date value) {
            addCriterion("onsell_Date <", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateLessThanOrEqualTo(Date value) {
            addCriterion("onsell_Date <=", value, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateIn(List<Date> values) {
            addCriterion("onsell_Date in", values, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateNotIn(List<Date> values) {
            addCriterion("onsell_Date not in", values, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateBetween(Date value1, Date value2) {
            addCriterion("onsell_Date between", value1, value2, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andOnsellDateNotBetween(Date value1, Date value2) {
            addCriterion("onsell_Date not between", value1, value2, "onsellDate");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andCreIdIsNull() {
            addCriterion("cre_Id is null");
            return (Criteria) this;
        }

        public Criteria andCreIdIsNotNull() {
            addCriterion("cre_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCreIdEqualTo(Integer value) {
            addCriterion("cre_Id =", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdNotEqualTo(Integer value) {
            addCriterion("cre_Id <>", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdGreaterThan(Integer value) {
            addCriterion("cre_Id >", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cre_Id >=", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdLessThan(Integer value) {
            addCriterion("cre_Id <", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdLessThanOrEqualTo(Integer value) {
            addCriterion("cre_Id <=", value, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdIn(List<Integer> values) {
            addCriterion("cre_Id in", values, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdNotIn(List<Integer> values) {
            addCriterion("cre_Id not in", values, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdBetween(Integer value1, Integer value2) {
            addCriterion("cre_Id between", value1, value2, "creId");
            return (Criteria) this;
        }

        public Criteria andCreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cre_Id not between", value1, value2, "creId");
            return (Criteria) this;
        }

        public Criteria andAudStatusIsNull() {
            addCriterion("aud_Status is null");
            return (Criteria) this;
        }

        public Criteria andAudStatusIsNotNull() {
            addCriterion("aud_Status is not null");
            return (Criteria) this;
        }

        public Criteria andAudStatusEqualTo(Integer value) {
            addCriterion("aud_Status =", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusNotEqualTo(Integer value) {
            addCriterion("aud_Status <>", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusGreaterThan(Integer value) {
            addCriterion("aud_Status >", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("aud_Status >=", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusLessThan(Integer value) {
            addCriterion("aud_Status <", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusLessThanOrEqualTo(Integer value) {
            addCriterion("aud_Status <=", value, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusIn(List<Integer> values) {
            addCriterion("aud_Status in", values, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusNotIn(List<Integer> values) {
            addCriterion("aud_Status not in", values, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusBetween(Integer value1, Integer value2) {
            addCriterion("aud_Status between", value1, value2, "audStatus");
            return (Criteria) this;
        }

        public Criteria andAudStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("aud_Status not between", value1, value2, "audStatus");
            return (Criteria) this;
        }

        public Criteria andFileName2IsNull() {
            addCriterion("file_Name_2 is null");
            return (Criteria) this;
        }

        public Criteria andFileName2IsNotNull() {
            addCriterion("file_Name_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFileName2EqualTo(String value) {
            addCriterion("file_Name_2 =", value, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2NotEqualTo(String value) {
            addCriterion("file_Name_2 <>", value, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2GreaterThan(String value) {
            addCriterion("file_Name_2 >", value, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2GreaterThanOrEqualTo(String value) {
            addCriterion("file_Name_2 >=", value, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2LessThan(String value) {
            addCriterion("file_Name_2 <", value, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2LessThanOrEqualTo(String value) {
            addCriterion("file_Name_2 <=", value, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2Like(String value) {
            addCriterion("file_Name_2 like", value, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2NotLike(String value) {
            addCriterion("file_Name_2 not like", value, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2In(List<String> values) {
            addCriterion("file_Name_2 in", values, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2NotIn(List<String> values) {
            addCriterion("file_Name_2 not in", values, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2Between(String value1, String value2) {
            addCriterion("file_Name_2 between", value1, value2, "fileName2");
            return (Criteria) this;
        }

        public Criteria andFileName2NotBetween(String value1, String value2) {
            addCriterion("file_Name_2 not between", value1, value2, "fileName2");
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
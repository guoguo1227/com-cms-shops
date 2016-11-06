package com.cms.shop.model.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerFileCriteria implements BaseCriteria {
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CustomerFileCriteria() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameIsNull() {
            addCriterion("NEW_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNewFileNameIsNotNull() {
            addCriterion("NEW_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNewFileNameEqualTo(String value) {
            addCriterion("NEW_FILE_NAME =", value, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameNotEqualTo(String value) {
            addCriterion("NEW_FILE_NAME <>", value, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameGreaterThan(String value) {
            addCriterion("NEW_FILE_NAME >", value, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_FILE_NAME >=", value, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameLessThan(String value) {
            addCriterion("NEW_FILE_NAME <", value, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameLessThanOrEqualTo(String value) {
            addCriterion("NEW_FILE_NAME <=", value, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameLike(String value) {
            addCriterion("NEW_FILE_NAME like", value, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameNotLike(String value) {
            addCriterion("NEW_FILE_NAME not like", value, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameIn(List<String> values) {
            addCriterion("NEW_FILE_NAME in", values, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameNotIn(List<String> values) {
            addCriterion("NEW_FILE_NAME not in", values, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameBetween(String value1, String value2) {
            addCriterion("NEW_FILE_NAME between", value1, value2, "newFileName");
            return (Criteria) this;
        }

        public Criteria andNewFileNameNotBetween(String value1, String value2) {
            addCriterion("NEW_FILE_NAME not between", value1, value2, "newFileName");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("FILE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("FILE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(Integer value) {
            addCriterion("FILE_TYPE =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(Integer value) {
            addCriterion("FILE_TYPE <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(Integer value) {
            addCriterion("FILE_TYPE >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILE_TYPE >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(Integer value) {
            addCriterion("FILE_TYPE <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(Integer value) {
            addCriterion("FILE_TYPE <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<Integer> values) {
            addCriterion("FILE_TYPE in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<Integer> values) {
            addCriterion("FILE_TYPE not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(Integer value1, Integer value2) {
            addCriterion("FILE_TYPE between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FILE_TYPE not between", value1, value2, "fileType");
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
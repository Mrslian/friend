package com.sd.friend.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysAttestationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysAttestationExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlIsNull() {
            addCriterion("Identity_z_url is null");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlIsNotNull() {
            addCriterion("Identity_z_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlEqualTo(String value) {
            addCriterion("Identity_z_url =", value, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlNotEqualTo(String value) {
            addCriterion("Identity_z_url <>", value, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlGreaterThan(String value) {
            addCriterion("Identity_z_url >", value, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Identity_z_url >=", value, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlLessThan(String value) {
            addCriterion("Identity_z_url <", value, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlLessThanOrEqualTo(String value) {
            addCriterion("Identity_z_url <=", value, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlLike(String value) {
            addCriterion("Identity_z_url like", value, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlNotLike(String value) {
            addCriterion("Identity_z_url not like", value, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlIn(List<String> values) {
            addCriterion("Identity_z_url in", values, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlNotIn(List<String> values) {
            addCriterion("Identity_z_url not in", values, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlBetween(String value1, String value2) {
            addCriterion("Identity_z_url between", value1, value2, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityZUrlNotBetween(String value1, String value2) {
            addCriterion("Identity_z_url not between", value1, value2, "identityZUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlIsNull() {
            addCriterion("Identity_f_url is null");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlIsNotNull() {
            addCriterion("Identity_f_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlEqualTo(String value) {
            addCriterion("Identity_f_url =", value, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlNotEqualTo(String value) {
            addCriterion("Identity_f_url <>", value, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlGreaterThan(String value) {
            addCriterion("Identity_f_url >", value, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Identity_f_url >=", value, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlLessThan(String value) {
            addCriterion("Identity_f_url <", value, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlLessThanOrEqualTo(String value) {
            addCriterion("Identity_f_url <=", value, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlLike(String value) {
            addCriterion("Identity_f_url like", value, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlNotLike(String value) {
            addCriterion("Identity_f_url not like", value, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlIn(List<String> values) {
            addCriterion("Identity_f_url in", values, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlNotIn(List<String> values) {
            addCriterion("Identity_f_url not in", values, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlBetween(String value1, String value2) {
            addCriterion("Identity_f_url between", value1, value2, "identityFUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityFUrlNotBetween(String value1, String value2) {
            addCriterion("Identity_f_url not between", value1, value2, "identityFUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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
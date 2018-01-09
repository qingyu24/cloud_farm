package com.fngame.farm.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMsgidIsNull() {
            addCriterion("msgid is null");
            return (Criteria) this;
        }

        public Criteria andMsgidIsNotNull() {
            addCriterion("msgid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgidEqualTo(Long value) {
            addCriterion("msgid =", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotEqualTo(Long value) {
            addCriterion("msgid <>", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThan(Long value) {
            addCriterion("msgid >", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidGreaterThanOrEqualTo(Long value) {
            addCriterion("msgid >=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThan(Long value) {
            addCriterion("msgid <", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidLessThanOrEqualTo(Long value) {
            addCriterion("msgid <=", value, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidIn(List<Long> values) {
            addCriterion("msgid in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotIn(List<Long> values) {
            addCriterion("msgid not in", values, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidBetween(Long value1, Long value2) {
            addCriterion("msgid between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andMsgidNotBetween(Long value1, Long value2) {
            addCriterion("msgid not between", value1, value2, "msgid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIsNull() {
            addCriterion("carinfoid is null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIsNotNull() {
            addCriterion("carinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidEqualTo(Long value) {
            addCriterion("carinfoid =", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotEqualTo(Long value) {
            addCriterion("carinfoid <>", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThan(Long value) {
            addCriterion("carinfoid >", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThanOrEqualTo(Long value) {
            addCriterion("carinfoid >=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThan(Long value) {
            addCriterion("carinfoid <", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThanOrEqualTo(Long value) {
            addCriterion("carinfoid <=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIn(List<Long> values) {
            addCriterion("carinfoid in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotIn(List<Long> values) {
            addCriterion("carinfoid not in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidBetween(Long value1, Long value2) {
            addCriterion("carinfoid between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotBetween(Long value1, Long value2) {
            addCriterion("carinfoid not between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andFromUseridIsNull() {
            addCriterion("from_userid is null");
            return (Criteria) this;
        }

        public Criteria andFromUseridIsNotNull() {
            addCriterion("from_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFromUseridEqualTo(Long value) {
            addCriterion("from_userid =", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridNotEqualTo(Long value) {
            addCriterion("from_userid <>", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridGreaterThan(Long value) {
            addCriterion("from_userid >", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("from_userid >=", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridLessThan(Long value) {
            addCriterion("from_userid <", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridLessThanOrEqualTo(Long value) {
            addCriterion("from_userid <=", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridIn(List<Long> values) {
            addCriterion("from_userid in", values, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridNotIn(List<Long> values) {
            addCriterion("from_userid not in", values, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridBetween(Long value1, Long value2) {
            addCriterion("from_userid between", value1, value2, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridNotBetween(Long value1, Long value2) {
            addCriterion("from_userid not between", value1, value2, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridIsNull() {
            addCriterion("to_userid is null");
            return (Criteria) this;
        }

        public Criteria andToUseridIsNotNull() {
            addCriterion("to_userid is not null");
            return (Criteria) this;
        }

        public Criteria andToUseridEqualTo(Long value) {
            addCriterion("to_userid =", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridNotEqualTo(Long value) {
            addCriterion("to_userid <>", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridGreaterThan(Long value) {
            addCriterion("to_userid >", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("to_userid >=", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridLessThan(Long value) {
            addCriterion("to_userid <", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridLessThanOrEqualTo(Long value) {
            addCriterion("to_userid <=", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridIn(List<Long> values) {
            addCriterion("to_userid in", values, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridNotIn(List<Long> values) {
            addCriterion("to_userid not in", values, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridBetween(Long value1, Long value2) {
            addCriterion("to_userid between", value1, value2, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridNotBetween(Long value1, Long value2) {
            addCriterion("to_userid not between", value1, value2, "toUserid");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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
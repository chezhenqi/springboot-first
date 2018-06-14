package com.learn.springboot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryNumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryNumberExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1IsNull() {
            addCriterion("lottery_number1 is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1IsNotNull() {
            addCriterion("lottery_number1 is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1EqualTo(Integer value) {
            addCriterion("lottery_number1 =", value, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1NotEqualTo(Integer value) {
            addCriterion("lottery_number1 <>", value, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1GreaterThan(Integer value) {
            addCriterion("lottery_number1 >", value, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1GreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_number1 >=", value, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1LessThan(Integer value) {
            addCriterion("lottery_number1 <", value, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1LessThanOrEqualTo(Integer value) {
            addCriterion("lottery_number1 <=", value, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1In(List<Integer> values) {
            addCriterion("lottery_number1 in", values, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1NotIn(List<Integer> values) {
            addCriterion("lottery_number1 not in", values, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1Between(Integer value1, Integer value2) {
            addCriterion("lottery_number1 between", value1, value2, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber1NotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_number1 not between", value1, value2, "lotteryNumber1");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2IsNull() {
            addCriterion("lottery_number2 is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2IsNotNull() {
            addCriterion("lottery_number2 is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2EqualTo(Integer value) {
            addCriterion("lottery_number2 =", value, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2NotEqualTo(Integer value) {
            addCriterion("lottery_number2 <>", value, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2GreaterThan(Integer value) {
            addCriterion("lottery_number2 >", value, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2GreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_number2 >=", value, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2LessThan(Integer value) {
            addCriterion("lottery_number2 <", value, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2LessThanOrEqualTo(Integer value) {
            addCriterion("lottery_number2 <=", value, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2In(List<Integer> values) {
            addCriterion("lottery_number2 in", values, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2NotIn(List<Integer> values) {
            addCriterion("lottery_number2 not in", values, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2Between(Integer value1, Integer value2) {
            addCriterion("lottery_number2 between", value1, value2, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber2NotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_number2 not between", value1, value2, "lotteryNumber2");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3IsNull() {
            addCriterion("lottery_number3 is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3IsNotNull() {
            addCriterion("lottery_number3 is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3EqualTo(Integer value) {
            addCriterion("lottery_number3 =", value, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3NotEqualTo(Integer value) {
            addCriterion("lottery_number3 <>", value, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3GreaterThan(Integer value) {
            addCriterion("lottery_number3 >", value, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3GreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_number3 >=", value, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3LessThan(Integer value) {
            addCriterion("lottery_number3 <", value, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3LessThanOrEqualTo(Integer value) {
            addCriterion("lottery_number3 <=", value, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3In(List<Integer> values) {
            addCriterion("lottery_number3 in", values, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3NotIn(List<Integer> values) {
            addCriterion("lottery_number3 not in", values, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3Between(Integer value1, Integer value2) {
            addCriterion("lottery_number3 between", value1, value2, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber3NotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_number3 not between", value1, value2, "lotteryNumber3");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4IsNull() {
            addCriterion("lottery_number4 is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4IsNotNull() {
            addCriterion("lottery_number4 is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4EqualTo(Integer value) {
            addCriterion("lottery_number4 =", value, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4NotEqualTo(Integer value) {
            addCriterion("lottery_number4 <>", value, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4GreaterThan(Integer value) {
            addCriterion("lottery_number4 >", value, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4GreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_number4 >=", value, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4LessThan(Integer value) {
            addCriterion("lottery_number4 <", value, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4LessThanOrEqualTo(Integer value) {
            addCriterion("lottery_number4 <=", value, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4In(List<Integer> values) {
            addCriterion("lottery_number4 in", values, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4NotIn(List<Integer> values) {
            addCriterion("lottery_number4 not in", values, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4Between(Integer value1, Integer value2) {
            addCriterion("lottery_number4 between", value1, value2, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber4NotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_number4 not between", value1, value2, "lotteryNumber4");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5IsNull() {
            addCriterion("lottery_number5 is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5IsNotNull() {
            addCriterion("lottery_number5 is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5EqualTo(Integer value) {
            addCriterion("lottery_number5 =", value, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5NotEqualTo(Integer value) {
            addCriterion("lottery_number5 <>", value, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5GreaterThan(Integer value) {
            addCriterion("lottery_number5 >", value, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5GreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_number5 >=", value, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5LessThan(Integer value) {
            addCriterion("lottery_number5 <", value, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5LessThanOrEqualTo(Integer value) {
            addCriterion("lottery_number5 <=", value, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5In(List<Integer> values) {
            addCriterion("lottery_number5 in", values, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5NotIn(List<Integer> values) {
            addCriterion("lottery_number5 not in", values, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5Between(Integer value1, Integer value2) {
            addCriterion("lottery_number5 between", value1, value2, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andLotteryNumber5NotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_number5 not between", value1, value2, "lotteryNumber5");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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
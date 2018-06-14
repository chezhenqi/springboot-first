package com.learn.springboot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryResultRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryResultRecordExample() {
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

        public Criteria andLotteryIdIsNull() {
            addCriterion("lottery_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("lottery_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(Integer value) {
            addCriterion("lottery_id =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(Integer value) {
            addCriterion("lottery_id <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(Integer value) {
            addCriterion("lottery_id >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_id >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(Integer value) {
            addCriterion("lottery_id <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(Integer value) {
            addCriterion("lottery_id <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<Integer> values) {
            addCriterion("lottery_id in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<Integer> values) {
            addCriterion("lottery_id not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(Integer value1, Integer value2) {
            addCriterion("lottery_id between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_id not between", value1, value2, "lotteryId");
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

        public Criteria andActiveCategoryIsNull() {
            addCriterion("active_category is null");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryIsNotNull() {
            addCriterion("active_category is not null");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryEqualTo(String value) {
            addCriterion("active_category =", value, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryNotEqualTo(String value) {
            addCriterion("active_category <>", value, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryGreaterThan(String value) {
            addCriterion("active_category >", value, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("active_category >=", value, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryLessThan(String value) {
            addCriterion("active_category <", value, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryLessThanOrEqualTo(String value) {
            addCriterion("active_category <=", value, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryLike(String value) {
            addCriterion("active_category like", value, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryNotLike(String value) {
            addCriterion("active_category not like", value, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryIn(List<String> values) {
            addCriterion("active_category in", values, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryNotIn(List<String> values) {
            addCriterion("active_category not in", values, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryBetween(String value1, String value2) {
            addCriterion("active_category between", value1, value2, "activeCategory");
            return (Criteria) this;
        }

        public Criteria andActiveCategoryNotBetween(String value1, String value2) {
            addCriterion("active_category not between", value1, value2, "activeCategory");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdIsNull() {
            addCriterion("giving_user_id is null");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdIsNotNull() {
            addCriterion("giving_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdEqualTo(String value) {
            addCriterion("giving_user_id =", value, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdNotEqualTo(String value) {
            addCriterion("giving_user_id <>", value, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdGreaterThan(String value) {
            addCriterion("giving_user_id >", value, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("giving_user_id >=", value, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdLessThan(String value) {
            addCriterion("giving_user_id <", value, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdLessThanOrEqualTo(String value) {
            addCriterion("giving_user_id <=", value, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdLike(String value) {
            addCriterion("giving_user_id like", value, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdNotLike(String value) {
            addCriterion("giving_user_id not like", value, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdIn(List<String> values) {
            addCriterion("giving_user_id in", values, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdNotIn(List<String> values) {
            addCriterion("giving_user_id not in", values, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdBetween(String value1, String value2) {
            addCriterion("giving_user_id between", value1, value2, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andGivingUserIdNotBetween(String value1, String value2) {
            addCriterion("giving_user_id not between", value1, value2, "givingUserId");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNull() {
            addCriterion("award_name is null");
            return (Criteria) this;
        }

        public Criteria andAwardNameIsNotNull() {
            addCriterion("award_name is not null");
            return (Criteria) this;
        }

        public Criteria andAwardNameEqualTo(String value) {
            addCriterion("award_name =", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotEqualTo(String value) {
            addCriterion("award_name <>", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThan(String value) {
            addCriterion("award_name >", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameGreaterThanOrEqualTo(String value) {
            addCriterion("award_name >=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThan(String value) {
            addCriterion("award_name <", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLessThanOrEqualTo(String value) {
            addCriterion("award_name <=", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameLike(String value) {
            addCriterion("award_name like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotLike(String value) {
            addCriterion("award_name not like", value, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameIn(List<String> values) {
            addCriterion("award_name in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotIn(List<String> values) {
            addCriterion("award_name not in", values, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameBetween(String value1, String value2) {
            addCriterion("award_name between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andAwardNameNotBetween(String value1, String value2) {
            addCriterion("award_name not between", value1, value2, "awardName");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrl2IsNull() {
            addCriterion("img_url2 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl2IsNotNull() {
            addCriterion("img_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl2EqualTo(String value) {
            addCriterion("img_url2 =", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotEqualTo(String value) {
            addCriterion("img_url2 <>", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThan(String value) {
            addCriterion("img_url2 >", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("img_url2 >=", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThan(String value) {
            addCriterion("img_url2 <", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThanOrEqualTo(String value) {
            addCriterion("img_url2 <=", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2Like(String value) {
            addCriterion("img_url2 like", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotLike(String value) {
            addCriterion("img_url2 not like", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2In(List<String> values) {
            addCriterion("img_url2 in", values, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotIn(List<String> values) {
            addCriterion("img_url2 not in", values, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2Between(String value1, String value2) {
            addCriterion("img_url2 between", value1, value2, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotBetween(String value1, String value2) {
            addCriterion("img_url2 not between", value1, value2, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNull() {
            addCriterion("isdiscount is null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNotNull() {
            addCriterion("isdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountEqualTo(Integer value) {
            addCriterion("isdiscount =", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotEqualTo(Integer value) {
            addCriterion("isdiscount <>", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThan(Integer value) {
            addCriterion("isdiscount >", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdiscount >=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThan(Integer value) {
            addCriterion("isdiscount <", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThanOrEqualTo(Integer value) {
            addCriterion("isdiscount <=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIn(List<Integer> values) {
            addCriterion("isdiscount in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotIn(List<Integer> values) {
            addCriterion("isdiscount not in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountBetween(Integer value1, Integer value2) {
            addCriterion("isdiscount between", value1, value2, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("isdiscount not between", value1, value2, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtIsNull() {
            addCriterion("invest_total_amt is null");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtIsNotNull() {
            addCriterion("invest_total_amt is not null");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtEqualTo(String value) {
            addCriterion("invest_total_amt =", value, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtNotEqualTo(String value) {
            addCriterion("invest_total_amt <>", value, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtGreaterThan(String value) {
            addCriterion("invest_total_amt >", value, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtGreaterThanOrEqualTo(String value) {
            addCriterion("invest_total_amt >=", value, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtLessThan(String value) {
            addCriterion("invest_total_amt <", value, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtLessThanOrEqualTo(String value) {
            addCriterion("invest_total_amt <=", value, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtLike(String value) {
            addCriterion("invest_total_amt like", value, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtNotLike(String value) {
            addCriterion("invest_total_amt not like", value, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtIn(List<String> values) {
            addCriterion("invest_total_amt in", values, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtNotIn(List<String> values) {
            addCriterion("invest_total_amt not in", values, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtBetween(String value1, String value2) {
            addCriterion("invest_total_amt between", value1, value2, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestTotalAmtNotBetween(String value1, String value2) {
            addCriterion("invest_total_amt not between", value1, value2, "investTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvestIdIsNull() {
            addCriterion("invest_id is null");
            return (Criteria) this;
        }

        public Criteria andInvestIdIsNotNull() {
            addCriterion("invest_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvestIdEqualTo(String value) {
            addCriterion("invest_id =", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdNotEqualTo(String value) {
            addCriterion("invest_id <>", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdGreaterThan(String value) {
            addCriterion("invest_id >", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdGreaterThanOrEqualTo(String value) {
            addCriterion("invest_id >=", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdLessThan(String value) {
            addCriterion("invest_id <", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdLessThanOrEqualTo(String value) {
            addCriterion("invest_id <=", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdLike(String value) {
            addCriterion("invest_id like", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdNotLike(String value) {
            addCriterion("invest_id not like", value, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdIn(List<String> values) {
            addCriterion("invest_id in", values, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdNotIn(List<String> values) {
            addCriterion("invest_id not in", values, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdBetween(String value1, String value2) {
            addCriterion("invest_id between", value1, value2, "investId");
            return (Criteria) this;
        }

        public Criteria andInvestIdNotBetween(String value1, String value2) {
            addCriterion("invest_id not between", value1, value2, "investId");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIsNull() {
            addCriterion("award_amount is null");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIsNotNull() {
            addCriterion("award_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAwardAmountEqualTo(BigDecimal value) {
            addCriterion("award_amount =", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotEqualTo(BigDecimal value) {
            addCriterion("award_amount <>", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountGreaterThan(BigDecimal value) {
            addCriterion("award_amount >", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_amount >=", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountLessThan(BigDecimal value) {
            addCriterion("award_amount <", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_amount <=", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIn(List<BigDecimal> values) {
            addCriterion("award_amount in", values, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotIn(List<BigDecimal> values) {
            addCriterion("award_amount not in", values, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_amount between", value1, value2, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_amount not between", value1, value2, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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
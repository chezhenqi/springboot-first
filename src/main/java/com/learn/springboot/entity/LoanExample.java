package com.learn.springboot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdIsNull() {
            addCriterion("borrower_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdIsNotNull() {
            addCriterion("borrower_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdEqualTo(String value) {
            addCriterion("borrower_id =", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotEqualTo(String value) {
            addCriterion("borrower_id <>", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdGreaterThan(String value) {
            addCriterion("borrower_id >", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("borrower_id >=", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLessThan(String value) {
            addCriterion("borrower_id <", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLessThanOrEqualTo(String value) {
            addCriterion("borrower_id <=", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLike(String value) {
            addCriterion("borrower_id like", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotLike(String value) {
            addCriterion("borrower_id not like", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdIn(List<String> values) {
            addCriterion("borrower_id in", values, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotIn(List<String> values) {
            addCriterion("borrower_id not in", values, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdBetween(String value1, String value2) {
            addCriterion("borrower_id between", value1, value2, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotBetween(String value1, String value2) {
            addCriterion("borrower_id not between", value1, value2, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesIsNull() {
            addCriterion("loan_purposes is null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesIsNotNull() {
            addCriterion("loan_purposes is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesEqualTo(String value) {
            addCriterion("loan_purposes =", value, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesNotEqualTo(String value) {
            addCriterion("loan_purposes <>", value, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesGreaterThan(String value) {
            addCriterion("loan_purposes >", value, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesGreaterThanOrEqualTo(String value) {
            addCriterion("loan_purposes >=", value, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesLessThan(String value) {
            addCriterion("loan_purposes <", value, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesLessThanOrEqualTo(String value) {
            addCriterion("loan_purposes <=", value, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesLike(String value) {
            addCriterion("loan_purposes like", value, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesNotLike(String value) {
            addCriterion("loan_purposes not like", value, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesIn(List<String> values) {
            addCriterion("loan_purposes in", values, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesNotIn(List<String> values) {
            addCriterion("loan_purposes not in", values, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesBetween(String value1, String value2) {
            addCriterion("loan_purposes between", value1, value2, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andLoanPurposesNotBetween(String value1, String value2) {
            addCriterion("loan_purposes not between", value1, value2, "loanPurposes");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNull() {
            addCriterion("project_description is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNotNull() {
            addCriterion("project_description is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionEqualTo(String value) {
            addCriterion("project_description =", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotEqualTo(String value) {
            addCriterion("project_description <>", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThan(String value) {
            addCriterion("project_description >", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("project_description >=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThan(String value) {
            addCriterion("project_description <", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThanOrEqualTo(String value) {
            addCriterion("project_description <=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLike(String value) {
            addCriterion("project_description like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotLike(String value) {
            addCriterion("project_description not like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIn(List<String> values) {
            addCriterion("project_description in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotIn(List<String> values) {
            addCriterion("project_description not in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionBetween(String value1, String value2) {
            addCriterion("project_description between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotBetween(String value1, String value2) {
            addCriterion("project_description not between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("project_type like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("project_type not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNull() {
            addCriterion("loan_period is null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNotNull() {
            addCriterion("loan_period is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodEqualTo(Integer value) {
            addCriterion("loan_period =", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotEqualTo(Integer value) {
            addCriterion("loan_period <>", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThan(Integer value) {
            addCriterion("loan_period >", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_period >=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThan(Integer value) {
            addCriterion("loan_period <", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("loan_period <=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIn(List<Integer> values) {
            addCriterion("loan_period in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotIn(List<Integer> values) {
            addCriterion("loan_period not in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodBetween(Integer value1, Integer value2) {
            addCriterion("loan_period between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_period not between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodIsNull() {
            addCriterion("lockup_period is null");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodIsNotNull() {
            addCriterion("lockup_period is not null");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodEqualTo(Integer value) {
            addCriterion("lockup_period =", value, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodNotEqualTo(Integer value) {
            addCriterion("lockup_period <>", value, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodGreaterThan(Integer value) {
            addCriterion("lockup_period >", value, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("lockup_period >=", value, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodLessThan(Integer value) {
            addCriterion("lockup_period <", value, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("lockup_period <=", value, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodIn(List<Integer> values) {
            addCriterion("lockup_period in", values, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodNotIn(List<Integer> values) {
            addCriterion("lockup_period not in", values, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodBetween(Integer value1, Integer value2) {
            addCriterion("lockup_period between", value1, value2, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andLockupPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("lockup_period not between", value1, value2, "lockupPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayIsNull() {
            addCriterion("repayment_way is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayIsNotNull() {
            addCriterion("repayment_way is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayEqualTo(String value) {
            addCriterion("repayment_way =", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayNotEqualTo(String value) {
            addCriterion("repayment_way <>", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayGreaterThan(String value) {
            addCriterion("repayment_way >", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_way >=", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayLessThan(String value) {
            addCriterion("repayment_way <", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayLessThanOrEqualTo(String value) {
            addCriterion("repayment_way <=", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayLike(String value) {
            addCriterion("repayment_way like", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayNotLike(String value) {
            addCriterion("repayment_way not like", value, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayIn(List<String> values) {
            addCriterion("repayment_way in", values, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayNotIn(List<String> values) {
            addCriterion("repayment_way not in", values, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayBetween(String value1, String value2) {
            addCriterion("repayment_way between", value1, value2, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andRepaymentWayNotBetween(String value1, String value2) {
            addCriterion("repayment_way not between", value1, value2, "repaymentWay");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNull() {
            addCriterion("loan_rate is null");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNotNull() {
            addCriterion("loan_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanRateEqualTo(BigDecimal value) {
            addCriterion("loan_rate =", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotEqualTo(BigDecimal value) {
            addCriterion("loan_rate <>", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThan(BigDecimal value) {
            addCriterion("loan_rate >", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_rate >=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThan(BigDecimal value) {
            addCriterion("loan_rate <", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_rate <=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateIn(List<BigDecimal> values) {
            addCriterion("loan_rate in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotIn(List<BigDecimal> values) {
            addCriterion("loan_rate not in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_rate between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_rate not between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andPercentIsNull() {
            addCriterion("percent is null");
            return (Criteria) this;
        }

        public Criteria andPercentIsNotNull() {
            addCriterion("percent is not null");
            return (Criteria) this;
        }

        public Criteria andPercentEqualTo(BigDecimal value) {
            addCriterion("percent =", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotEqualTo(BigDecimal value) {
            addCriterion("percent <>", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThan(BigDecimal value) {
            addCriterion("percent >", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("percent >=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThan(BigDecimal value) {
            addCriterion("percent <", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("percent <=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentIn(List<BigDecimal> values) {
            addCriterion("percent in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotIn(List<BigDecimal> values) {
            addCriterion("percent not in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("percent between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("percent not between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andHasMortgageIsNull() {
            addCriterion("has_mortgage is null");
            return (Criteria) this;
        }

        public Criteria andHasMortgageIsNotNull() {
            addCriterion("has_mortgage is not null");
            return (Criteria) this;
        }

        public Criteria andHasMortgageEqualTo(Boolean value) {
            addCriterion("has_mortgage =", value, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageNotEqualTo(Boolean value) {
            addCriterion("has_mortgage <>", value, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageGreaterThan(Boolean value) {
            addCriterion("has_mortgage >", value, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_mortgage >=", value, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageLessThan(Boolean value) {
            addCriterion("has_mortgage <", value, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageLessThanOrEqualTo(Boolean value) {
            addCriterion("has_mortgage <=", value, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageIn(List<Boolean> values) {
            addCriterion("has_mortgage in", values, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageNotIn(List<Boolean> values) {
            addCriterion("has_mortgage not in", values, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageBetween(Boolean value1, Boolean value2) {
            addCriterion("has_mortgage between", value1, value2, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andHasMortgageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_mortgage not between", value1, value2, "hasMortgage");
            return (Criteria) this;
        }

        public Criteria andMinNumberIsNull() {
            addCriterion("min_number is null");
            return (Criteria) this;
        }

        public Criteria andMinNumberIsNotNull() {
            addCriterion("min_number is not null");
            return (Criteria) this;
        }

        public Criteria andMinNumberEqualTo(Integer value) {
            addCriterion("min_number =", value, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberNotEqualTo(Integer value) {
            addCriterion("min_number <>", value, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberGreaterThan(Integer value) {
            addCriterion("min_number >", value, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_number >=", value, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberLessThan(Integer value) {
            addCriterion("min_number <", value, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberLessThanOrEqualTo(Integer value) {
            addCriterion("min_number <=", value, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberIn(List<Integer> values) {
            addCriterion("min_number in", values, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberNotIn(List<Integer> values) {
            addCriterion("min_number not in", values, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberBetween(Integer value1, Integer value2) {
            addCriterion("min_number between", value1, value2, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMinNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("min_number not between", value1, value2, "minNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNull() {
            addCriterion("max_number is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNotNull() {
            addCriterion("max_number is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberEqualTo(Integer value) {
            addCriterion("max_number =", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotEqualTo(Integer value) {
            addCriterion("max_number <>", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThan(Integer value) {
            addCriterion("max_number >", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_number >=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThan(Integer value) {
            addCriterion("max_number <", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThanOrEqualTo(Integer value) {
            addCriterion("max_number <=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIn(List<Integer> values) {
            addCriterion("max_number in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotIn(List<Integer> values) {
            addCriterion("max_number not in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberBetween(Integer value1, Integer value2) {
            addCriterion("max_number between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("max_number not between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andBidAwardIsNull() {
            addCriterion("bid_award is null");
            return (Criteria) this;
        }

        public Criteria andBidAwardIsNotNull() {
            addCriterion("bid_award is not null");
            return (Criteria) this;
        }

        public Criteria andBidAwardEqualTo(BigDecimal value) {
            addCriterion("bid_award =", value, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardNotEqualTo(BigDecimal value) {
            addCriterion("bid_award <>", value, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardGreaterThan(BigDecimal value) {
            addCriterion("bid_award >", value, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bid_award >=", value, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardLessThan(BigDecimal value) {
            addCriterion("bid_award <", value, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bid_award <=", value, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardIn(List<BigDecimal> values) {
            addCriterion("bid_award in", values, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardNotIn(List<BigDecimal> values) {
            addCriterion("bid_award not in", values, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bid_award between", value1, value2, "bidAward");
            return (Criteria) this;
        }

        public Criteria andBidAwardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bid_award not between", value1, value2, "bidAward");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNull() {
            addCriterion("overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(Integer value) {
            addCriterion("overdue_days =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(Integer value) {
            addCriterion("overdue_days <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(Integer value) {
            addCriterion("overdue_days >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_days >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(Integer value) {
            addCriterion("overdue_days <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_days <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<Integer> values) {
            addCriterion("overdue_days in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<Integer> values) {
            addCriterion("overdue_days not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("overdue_days between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_days not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIsNull() {
            addCriterion("loan_status is null");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIsNotNull() {
            addCriterion("loan_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStatusEqualTo(String value) {
            addCriterion("loan_status =", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotEqualTo(String value) {
            addCriterion("loan_status <>", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusGreaterThan(String value) {
            addCriterion("loan_status >", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusGreaterThanOrEqualTo(String value) {
            addCriterion("loan_status >=", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLessThan(String value) {
            addCriterion("loan_status <", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLessThanOrEqualTo(String value) {
            addCriterion("loan_status <=", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusLike(String value) {
            addCriterion("loan_status like", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotLike(String value) {
            addCriterion("loan_status not like", value, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusIn(List<String> values) {
            addCriterion("loan_status in", values, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotIn(List<String> values) {
            addCriterion("loan_status not in", values, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusBetween(String value1, String value2) {
            addCriterion("loan_status between", value1, value2, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andLoanStatusNotBetween(String value1, String value2) {
            addCriterion("loan_status not between", value1, value2, "loanStatus");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Boolean value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Boolean value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Boolean value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Boolean value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Boolean> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Boolean> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathIsNull() {
            addCriterion("project_image_path is null");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathIsNotNull() {
            addCriterion("project_image_path is not null");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathEqualTo(String value) {
            addCriterion("project_image_path =", value, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathNotEqualTo(String value) {
            addCriterion("project_image_path <>", value, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathGreaterThan(String value) {
            addCriterion("project_image_path >", value, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("project_image_path >=", value, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathLessThan(String value) {
            addCriterion("project_image_path <", value, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathLessThanOrEqualTo(String value) {
            addCriterion("project_image_path <=", value, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathLike(String value) {
            addCriterion("project_image_path like", value, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathNotLike(String value) {
            addCriterion("project_image_path not like", value, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathIn(List<String> values) {
            addCriterion("project_image_path in", values, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathNotIn(List<String> values) {
            addCriterion("project_image_path not in", values, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathBetween(String value1, String value2) {
            addCriterion("project_image_path between", value1, value2, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andProjectImagePathNotBetween(String value1, String value2) {
            addCriterion("project_image_path not between", value1, value2, "projectImagePath");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysIsNull() {
            addCriterion("financing_days is null");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysIsNotNull() {
            addCriterion("financing_days is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysEqualTo(Integer value) {
            addCriterion("financing_days =", value, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysNotEqualTo(Integer value) {
            addCriterion("financing_days <>", value, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysGreaterThan(Integer value) {
            addCriterion("financing_days >", value, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("financing_days >=", value, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysLessThan(Integer value) {
            addCriterion("financing_days <", value, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysLessThanOrEqualTo(Integer value) {
            addCriterion("financing_days <=", value, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysIn(List<Integer> values) {
            addCriterion("financing_days in", values, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysNotIn(List<Integer> values) {
            addCriterion("financing_days not in", values, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysBetween(Integer value1, Integer value2) {
            addCriterion("financing_days between", value1, value2, "financingDays");
            return (Criteria) this;
        }

        public Criteria andFinancingDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("financing_days not between", value1, value2, "financingDays");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyIsNull() {
            addCriterion("guarantee_company is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyIsNotNull() {
            addCriterion("guarantee_company is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyEqualTo(String value) {
            addCriterion("guarantee_company =", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyNotEqualTo(String value) {
            addCriterion("guarantee_company <>", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyGreaterThan(String value) {
            addCriterion("guarantee_company >", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_company >=", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyLessThan(String value) {
            addCriterion("guarantee_company <", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyLessThanOrEqualTo(String value) {
            addCriterion("guarantee_company <=", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyLike(String value) {
            addCriterion("guarantee_company like", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyNotLike(String value) {
            addCriterion("guarantee_company not like", value, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyIn(List<String> values) {
            addCriterion("guarantee_company in", values, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyNotIn(List<String> values) {
            addCriterion("guarantee_company not in", values, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyBetween(String value1, String value2) {
            addCriterion("guarantee_company between", value1, value2, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCompanyNotBetween(String value1, String value2) {
            addCriterion("guarantee_company not between", value1, value2, "guaranteeCompany");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentIsNull() {
            addCriterion("guarantee_comment is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentIsNotNull() {
            addCriterion("guarantee_comment is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentEqualTo(String value) {
            addCriterion("guarantee_comment =", value, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentNotEqualTo(String value) {
            addCriterion("guarantee_comment <>", value, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentGreaterThan(String value) {
            addCriterion("guarantee_comment >", value, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_comment >=", value, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentLessThan(String value) {
            addCriterion("guarantee_comment <", value, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentLessThanOrEqualTo(String value) {
            addCriterion("guarantee_comment <=", value, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentLike(String value) {
            addCriterion("guarantee_comment like", value, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentNotLike(String value) {
            addCriterion("guarantee_comment not like", value, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentIn(List<String> values) {
            addCriterion("guarantee_comment in", values, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentNotIn(List<String> values) {
            addCriterion("guarantee_comment not in", values, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentBetween(String value1, String value2) {
            addCriterion("guarantee_comment between", value1, value2, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCommentNotBetween(String value1, String value2) {
            addCriterion("guarantee_comment not between", value1, value2, "guaranteeComment");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoIsNull() {
            addCriterion("mortgage_info is null");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoIsNotNull() {
            addCriterion("mortgage_info is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoEqualTo(String value) {
            addCriterion("mortgage_info =", value, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoNotEqualTo(String value) {
            addCriterion("mortgage_info <>", value, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoGreaterThan(String value) {
            addCriterion("mortgage_info >", value, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_info >=", value, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoLessThan(String value) {
            addCriterion("mortgage_info <", value, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoLessThanOrEqualTo(String value) {
            addCriterion("mortgage_info <=", value, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoLike(String value) {
            addCriterion("mortgage_info like", value, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoNotLike(String value) {
            addCriterion("mortgage_info not like", value, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoIn(List<String> values) {
            addCriterion("mortgage_info in", values, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoNotIn(List<String> values) {
            addCriterion("mortgage_info not in", values, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoBetween(String value1, String value2) {
            addCriterion("mortgage_info between", value1, value2, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andMortgageInfoNotBetween(String value1, String value2) {
            addCriterion("mortgage_info not between", value1, value2, "mortgageInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoIsNull() {
            addCriterion("lawsuit_info is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoIsNotNull() {
            addCriterion("lawsuit_info is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoEqualTo(String value) {
            addCriterion("lawsuit_info =", value, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoNotEqualTo(String value) {
            addCriterion("lawsuit_info <>", value, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoGreaterThan(String value) {
            addCriterion("lawsuit_info >", value, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoGreaterThanOrEqualTo(String value) {
            addCriterion("lawsuit_info >=", value, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoLessThan(String value) {
            addCriterion("lawsuit_info <", value, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoLessThanOrEqualTo(String value) {
            addCriterion("lawsuit_info <=", value, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoLike(String value) {
            addCriterion("lawsuit_info like", value, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoNotLike(String value) {
            addCriterion("lawsuit_info not like", value, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoIn(List<String> values) {
            addCriterion("lawsuit_info in", values, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoNotIn(List<String> values) {
            addCriterion("lawsuit_info not in", values, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoBetween(String value1, String value2) {
            addCriterion("lawsuit_info between", value1, value2, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andLawsuitInfoNotBetween(String value1, String value2) {
            addCriterion("lawsuit_info not between", value1, value2, "lawsuitInfo");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeIsNull() {
            addCriterion("money_purpose is null");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeIsNotNull() {
            addCriterion("money_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeEqualTo(String value) {
            addCriterion("money_purpose =", value, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeNotEqualTo(String value) {
            addCriterion("money_purpose <>", value, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeGreaterThan(String value) {
            addCriterion("money_purpose >", value, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("money_purpose >=", value, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeLessThan(String value) {
            addCriterion("money_purpose <", value, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeLessThanOrEqualTo(String value) {
            addCriterion("money_purpose <=", value, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeLike(String value) {
            addCriterion("money_purpose like", value, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeNotLike(String value) {
            addCriterion("money_purpose not like", value, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeIn(List<String> values) {
            addCriterion("money_purpose in", values, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeNotIn(List<String> values) {
            addCriterion("money_purpose not in", values, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeBetween(String value1, String value2) {
            addCriterion("money_purpose between", value1, value2, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andMoneyPurposeNotBetween(String value1, String value2) {
            addCriterion("money_purpose not between", value1, value2, "moneyPurpose");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIsNull() {
            addCriterion("repayment_source is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIsNotNull() {
            addCriterion("repayment_source is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceEqualTo(String value) {
            addCriterion("repayment_source =", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotEqualTo(String value) {
            addCriterion("repayment_source <>", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceGreaterThan(String value) {
            addCriterion("repayment_source >", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_source >=", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLessThan(String value) {
            addCriterion("repayment_source <", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLessThanOrEqualTo(String value) {
            addCriterion("repayment_source <=", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceLike(String value) {
            addCriterion("repayment_source like", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotLike(String value) {
            addCriterion("repayment_source not like", value, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceIn(List<String> values) {
            addCriterion("repayment_source in", values, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotIn(List<String> values) {
            addCriterion("repayment_source not in", values, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceBetween(String value1, String value2) {
            addCriterion("repayment_source between", value1, value2, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andRepaymentSourceNotBetween(String value1, String value2) {
            addCriterion("repayment_source not between", value1, value2, "repaymentSource");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundIsNull() {
            addCriterion("enterprise_background is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundIsNotNull() {
            addCriterion("enterprise_background is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundEqualTo(String value) {
            addCriterion("enterprise_background =", value, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundNotEqualTo(String value) {
            addCriterion("enterprise_background <>", value, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundGreaterThan(String value) {
            addCriterion("enterprise_background >", value, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_background >=", value, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundLessThan(String value) {
            addCriterion("enterprise_background <", value, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundLessThanOrEqualTo(String value) {
            addCriterion("enterprise_background <=", value, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundLike(String value) {
            addCriterion("enterprise_background like", value, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundNotLike(String value) {
            addCriterion("enterprise_background not like", value, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundIn(List<String> values) {
            addCriterion("enterprise_background in", values, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundNotIn(List<String> values) {
            addCriterion("enterprise_background not in", values, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundBetween(String value1, String value2) {
            addCriterion("enterprise_background between", value1, value2, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBackgroundNotBetween(String value1, String value2) {
            addCriterion("enterprise_background not between", value1, value2, "enterpriseBackground");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsIsNull() {
            addCriterion("operating_conditions is null");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsIsNotNull() {
            addCriterion("operating_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsEqualTo(String value) {
            addCriterion("operating_conditions =", value, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsNotEqualTo(String value) {
            addCriterion("operating_conditions <>", value, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsGreaterThan(String value) {
            addCriterion("operating_conditions >", value, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("operating_conditions >=", value, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsLessThan(String value) {
            addCriterion("operating_conditions <", value, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsLessThanOrEqualTo(String value) {
            addCriterion("operating_conditions <=", value, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsLike(String value) {
            addCriterion("operating_conditions like", value, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsNotLike(String value) {
            addCriterion("operating_conditions not like", value, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsIn(List<String> values) {
            addCriterion("operating_conditions in", values, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsNotIn(List<String> values) {
            addCriterion("operating_conditions not in", values, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsBetween(String value1, String value2) {
            addCriterion("operating_conditions between", value1, value2, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andOperatingConditionsNotBetween(String value1, String value2) {
            addCriterion("operating_conditions not between", value1, value2, "operatingConditions");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("legal_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("legal_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("legal_name =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("legal_name <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("legal_name >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_name >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("legal_name <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("legal_name <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("legal_name like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("legal_name not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("legal_name in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("legal_name not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("legal_name between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("legal_name not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalIdIsNull() {
            addCriterion("legal_id is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdIsNotNull() {
            addCriterion("legal_id is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdEqualTo(String value) {
            addCriterion("legal_id =", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdNotEqualTo(String value) {
            addCriterion("legal_id <>", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdGreaterThan(String value) {
            addCriterion("legal_id >", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdGreaterThanOrEqualTo(String value) {
            addCriterion("legal_id >=", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdLessThan(String value) {
            addCriterion("legal_id <", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdLessThanOrEqualTo(String value) {
            addCriterion("legal_id <=", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdLike(String value) {
            addCriterion("legal_id like", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdNotLike(String value) {
            addCriterion("legal_id not like", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdIn(List<String> values) {
            addCriterion("legal_id in", values, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdNotIn(List<String> values) {
            addCriterion("legal_id not in", values, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdBetween(String value1, String value2) {
            addCriterion("legal_id between", value1, value2, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdNotBetween(String value1, String value2) {
            addCriterion("legal_id not between", value1, value2, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalNoIsNull() {
            addCriterion("legal_no is null");
            return (Criteria) this;
        }

        public Criteria andLegalNoIsNotNull() {
            addCriterion("legal_no is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNoEqualTo(String value) {
            addCriterion("legal_no =", value, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoNotEqualTo(String value) {
            addCriterion("legal_no <>", value, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoGreaterThan(String value) {
            addCriterion("legal_no >", value, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoGreaterThanOrEqualTo(String value) {
            addCriterion("legal_no >=", value, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoLessThan(String value) {
            addCriterion("legal_no <", value, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoLessThanOrEqualTo(String value) {
            addCriterion("legal_no <=", value, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoLike(String value) {
            addCriterion("legal_no like", value, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoNotLike(String value) {
            addCriterion("legal_no not like", value, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoIn(List<String> values) {
            addCriterion("legal_no in", values, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoNotIn(List<String> values) {
            addCriterion("legal_no not in", values, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoBetween(String value1, String value2) {
            addCriterion("legal_no between", value1, value2, "legalNo");
            return (Criteria) this;
        }

        public Criteria andLegalNoNotBetween(String value1, String value2) {
            addCriterion("legal_no not between", value1, value2, "legalNo");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("begin_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("begin_date =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("begin_date <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("begin_date >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_date >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("begin_date <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("begin_date <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("begin_date in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("begin_date not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("begin_date between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("begin_date not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIsNull() {
            addCriterion("industry_type is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIsNotNull() {
            addCriterion("industry_type is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeEqualTo(String value) {
            addCriterion("industry_type =", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotEqualTo(String value) {
            addCriterion("industry_type <>", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeGreaterThan(String value) {
            addCriterion("industry_type >", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("industry_type >=", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeLessThan(String value) {
            addCriterion("industry_type <", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeLessThanOrEqualTo(String value) {
            addCriterion("industry_type <=", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeLike(String value) {
            addCriterion("industry_type like", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotLike(String value) {
            addCriterion("industry_type not like", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIn(List<String> values) {
            addCriterion("industry_type in", values, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotIn(List<String> values) {
            addCriterion("industry_type not in", values, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeBetween(String value1, String value2) {
            addCriterion("industry_type between", value1, value2, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotBetween(String value1, String value2) {
            addCriterion("industry_type not between", value1, value2, "industryType");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNull() {
            addCriterion("review_date is null");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNotNull() {
            addCriterion("review_date is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDateEqualTo(Date value) {
            addCriterion("review_date =", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotEqualTo(Date value) {
            addCriterion("review_date <>", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThan(Date value) {
            addCriterion("review_date >", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThanOrEqualTo(Date value) {
            addCriterion("review_date >=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThan(Date value) {
            addCriterion("review_date <", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThanOrEqualTo(Date value) {
            addCriterion("review_date <=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIn(List<Date> values) {
            addCriterion("review_date in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotIn(List<Date> values) {
            addCriterion("review_date not in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateBetween(Date value1, Date value2) {
            addCriterion("review_date between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotBetween(Date value1, Date value2) {
            addCriterion("review_date not between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIsNull() {
            addCriterion("credit_level is null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIsNotNull() {
            addCriterion("credit_level is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelEqualTo(String value) {
            addCriterion("credit_level =", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotEqualTo(String value) {
            addCriterion("credit_level <>", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelGreaterThan(String value) {
            addCriterion("credit_level >", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelGreaterThanOrEqualTo(String value) {
            addCriterion("credit_level >=", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelLessThan(String value) {
            addCriterion("credit_level <", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelLessThanOrEqualTo(String value) {
            addCriterion("credit_level <=", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelLike(String value) {
            addCriterion("credit_level like", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotLike(String value) {
            addCriterion("credit_level not like", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIn(List<String> values) {
            addCriterion("credit_level in", values, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotIn(List<String> values) {
            addCriterion("credit_level not in", values, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelBetween(String value1, String value2) {
            addCriterion("credit_level between", value1, value2, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotBetween(String value1, String value2) {
            addCriterion("credit_level not between", value1, value2, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdIsNull() {
            addCriterion("parent_loan_id is null");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdIsNotNull() {
            addCriterion("parent_loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdEqualTo(String value) {
            addCriterion("parent_loan_id =", value, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdNotEqualTo(String value) {
            addCriterion("parent_loan_id <>", value, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdGreaterThan(String value) {
            addCriterion("parent_loan_id >", value, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_loan_id >=", value, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdLessThan(String value) {
            addCriterion("parent_loan_id <", value, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdLessThanOrEqualTo(String value) {
            addCriterion("parent_loan_id <=", value, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdLike(String value) {
            addCriterion("parent_loan_id like", value, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdNotLike(String value) {
            addCriterion("parent_loan_id not like", value, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdIn(List<String> values) {
            addCriterion("parent_loan_id in", values, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdNotIn(List<String> values) {
            addCriterion("parent_loan_id not in", values, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdBetween(String value1, String value2) {
            addCriterion("parent_loan_id between", value1, value2, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andParentLoanIdNotBetween(String value1, String value2) {
            addCriterion("parent_loan_id not between", value1, value2, "parentLoanId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(String value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(String value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(String value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(String value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLike(String value) {
            addCriterion("payment_id like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotLike(String value) {
            addCriterion("payment_id not like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<String> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<String> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(String value1, String value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(String value1, String value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNull() {
            addCriterion("loan_type is null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNotNull() {
            addCriterion("loan_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeEqualTo(String value) {
            addCriterion("loan_type =", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotEqualTo(String value) {
            addCriterion("loan_type <>", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThan(String value) {
            addCriterion("loan_type >", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_type >=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThan(String value) {
            addCriterion("loan_type <", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThanOrEqualTo(String value) {
            addCriterion("loan_type <=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLike(String value) {
            addCriterion("loan_type like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotLike(String value) {
            addCriterion("loan_type not like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIn(List<String> values) {
            addCriterion("loan_type in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotIn(List<String> values) {
            addCriterion("loan_type not in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeBetween(String value1, String value2) {
            addCriterion("loan_type between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotBetween(String value1, String value2) {
            addCriterion("loan_type not between", value1, value2, "loanType");
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

        public Criteria andManageFeeIsNull() {
            addCriterion("manage_fee is null");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNotNull() {
            addCriterion("manage_fee is not null");
            return (Criteria) this;
        }

        public Criteria andManageFeeEqualTo(BigDecimal value) {
            addCriterion("manage_fee =", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotEqualTo(BigDecimal value) {
            addCriterion("manage_fee <>", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThan(BigDecimal value) {
            addCriterion("manage_fee >", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_fee >=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThan(BigDecimal value) {
            addCriterion("manage_fee <", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manage_fee <=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeIn(List<BigDecimal> values) {
            addCriterion("manage_fee in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotIn(List<BigDecimal> values) {
            addCriterion("manage_fee not in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_fee between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manage_fee not between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdIsNull() {
            addCriterion("loan_source_type_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdIsNotNull() {
            addCriterion("loan_source_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdEqualTo(String value) {
            addCriterion("loan_source_type_id =", value, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdNotEqualTo(String value) {
            addCriterion("loan_source_type_id <>", value, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdGreaterThan(String value) {
            addCriterion("loan_source_type_id >", value, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("loan_source_type_id >=", value, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdLessThan(String value) {
            addCriterion("loan_source_type_id <", value, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdLessThanOrEqualTo(String value) {
            addCriterion("loan_source_type_id <=", value, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdLike(String value) {
            addCriterion("loan_source_type_id like", value, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdNotLike(String value) {
            addCriterion("loan_source_type_id not like", value, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdIn(List<String> values) {
            addCriterion("loan_source_type_id in", values, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdNotIn(List<String> values) {
            addCriterion("loan_source_type_id not in", values, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdBetween(String value1, String value2) {
            addCriterion("loan_source_type_id between", value1, value2, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIdNotBetween(String value1, String value2) {
            addCriterion("loan_source_type_id not between", value1, value2, "loanSourceTypeId");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIsNull() {
            addCriterion("loan_source_type is null");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIsNotNull() {
            addCriterion("loan_source_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeEqualTo(Integer value) {
            addCriterion("loan_source_type =", value, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeNotEqualTo(Integer value) {
            addCriterion("loan_source_type <>", value, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeGreaterThan(Integer value) {
            addCriterion("loan_source_type >", value, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_source_type >=", value, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeLessThan(Integer value) {
            addCriterion("loan_source_type <", value, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("loan_source_type <=", value, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeIn(List<Integer> values) {
            addCriterion("loan_source_type in", values, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeNotIn(List<Integer> values) {
            addCriterion("loan_source_type not in", values, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("loan_source_type between", value1, value2, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andLoanSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_source_type not between", value1, value2, "loanSourceType");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyIsNull() {
            addCriterion("borrow_company is null");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyIsNotNull() {
            addCriterion("borrow_company is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyEqualTo(String value) {
            addCriterion("borrow_company =", value, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyNotEqualTo(String value) {
            addCriterion("borrow_company <>", value, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyGreaterThan(String value) {
            addCriterion("borrow_company >", value, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_company >=", value, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyLessThan(String value) {
            addCriterion("borrow_company <", value, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyLessThanOrEqualTo(String value) {
            addCriterion("borrow_company <=", value, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyLike(String value) {
            addCriterion("borrow_company like", value, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyNotLike(String value) {
            addCriterion("borrow_company not like", value, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyIn(List<String> values) {
            addCriterion("borrow_company in", values, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyNotIn(List<String> values) {
            addCriterion("borrow_company not in", values, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyBetween(String value1, String value2) {
            addCriterion("borrow_company between", value1, value2, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowCompanyNotBetween(String value1, String value2) {
            addCriterion("borrow_company not between", value1, value2, "borrowCompany");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressIsNull() {
            addCriterion("borrow_address is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressIsNotNull() {
            addCriterion("borrow_address is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressEqualTo(String value) {
            addCriterion("borrow_address =", value, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressNotEqualTo(String value) {
            addCriterion("borrow_address <>", value, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressGreaterThan(String value) {
            addCriterion("borrow_address >", value, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_address >=", value, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressLessThan(String value) {
            addCriterion("borrow_address <", value, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressLessThanOrEqualTo(String value) {
            addCriterion("borrow_address <=", value, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressLike(String value) {
            addCriterion("borrow_address like", value, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressNotLike(String value) {
            addCriterion("borrow_address not like", value, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressIn(List<String> values) {
            addCriterion("borrow_address in", values, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressNotIn(List<String> values) {
            addCriterion("borrow_address not in", values, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressBetween(String value1, String value2) {
            addCriterion("borrow_address between", value1, value2, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowAddressNotBetween(String value1, String value2) {
            addCriterion("borrow_address not between", value1, value2, "borrowAddress");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileIsNull() {
            addCriterion("borrow_mobile is null");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileIsNotNull() {
            addCriterion("borrow_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileEqualTo(String value) {
            addCriterion("borrow_mobile =", value, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileNotEqualTo(String value) {
            addCriterion("borrow_mobile <>", value, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileGreaterThan(String value) {
            addCriterion("borrow_mobile >", value, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_mobile >=", value, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileLessThan(String value) {
            addCriterion("borrow_mobile <", value, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileLessThanOrEqualTo(String value) {
            addCriterion("borrow_mobile <=", value, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileLike(String value) {
            addCriterion("borrow_mobile like", value, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileNotLike(String value) {
            addCriterion("borrow_mobile not like", value, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileIn(List<String> values) {
            addCriterion("borrow_mobile in", values, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileNotIn(List<String> values) {
            addCriterion("borrow_mobile not in", values, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileBetween(String value1, String value2) {
            addCriterion("borrow_mobile between", value1, value2, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andBorrowMobileNotBetween(String value1, String value2) {
            addCriterion("borrow_mobile not between", value1, value2, "borrowMobile");
            return (Criteria) this;
        }

        public Criteria andEduTypeIsNull() {
            addCriterion("edu_type is null");
            return (Criteria) this;
        }

        public Criteria andEduTypeIsNotNull() {
            addCriterion("edu_type is not null");
            return (Criteria) this;
        }

        public Criteria andEduTypeEqualTo(Integer value) {
            addCriterion("edu_type =", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotEqualTo(Integer value) {
            addCriterion("edu_type <>", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeGreaterThan(Integer value) {
            addCriterion("edu_type >", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_type >=", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeLessThan(Integer value) {
            addCriterion("edu_type <", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeLessThanOrEqualTo(Integer value) {
            addCriterion("edu_type <=", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeIn(List<Integer> values) {
            addCriterion("edu_type in", values, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotIn(List<Integer> values) {
            addCriterion("edu_type not in", values, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeBetween(Integer value1, Integer value2) {
            addCriterion("edu_type between", value1, value2, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_type not between", value1, value2, "eduType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNull() {
            addCriterion("borrow_type is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNotNull() {
            addCriterion("borrow_type is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeEqualTo(Integer value) {
            addCriterion("borrow_type =", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotEqualTo(Integer value) {
            addCriterion("borrow_type <>", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThan(Integer value) {
            addCriterion("borrow_type >", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_type >=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThan(Integer value) {
            addCriterion("borrow_type <", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_type <=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIn(List<Integer> values) {
            addCriterion("borrow_type in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotIn(List<Integer> values) {
            addCriterion("borrow_type not in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeBetween(Integer value1, Integer value2) {
            addCriterion("borrow_type between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_type not between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNull() {
            addCriterion("income_type is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNotNull() {
            addCriterion("income_type is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeEqualTo(Integer value) {
            addCriterion("income_type =", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotEqualTo(Integer value) {
            addCriterion("income_type <>", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThan(Integer value) {
            addCriterion("income_type >", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("income_type >=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThan(Integer value) {
            addCriterion("income_type <", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("income_type <=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIn(List<Integer> values) {
            addCriterion("income_type in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotIn(List<Integer> values) {
            addCriterion("income_type not in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeBetween(Integer value1, Integer value2) {
            addCriterion("income_type between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("income_type not between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNull() {
            addCriterion("credit_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("credit_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(BigDecimal value) {
            addCriterion("credit_limit =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(BigDecimal value) {
            addCriterion("credit_limit <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(BigDecimal value) {
            addCriterion("credit_limit >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_limit >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(BigDecimal value) {
            addCriterion("credit_limit <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_limit <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<BigDecimal> values) {
            addCriterion("credit_limit in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<BigDecimal> values) {
            addCriterion("credit_limit not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_limit between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_limit not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeIsNull() {
            addCriterion("married_type is null");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeIsNotNull() {
            addCriterion("married_type is not null");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeEqualTo(Integer value) {
            addCriterion("married_type =", value, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeNotEqualTo(Integer value) {
            addCriterion("married_type <>", value, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeGreaterThan(Integer value) {
            addCriterion("married_type >", value, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("married_type >=", value, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeLessThan(Integer value) {
            addCriterion("married_type <", value, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeLessThanOrEqualTo(Integer value) {
            addCriterion("married_type <=", value, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeIn(List<Integer> values) {
            addCriterion("married_type in", values, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeNotIn(List<Integer> values) {
            addCriterion("married_type not in", values, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeBetween(Integer value1, Integer value2) {
            addCriterion("married_type between", value1, value2, "marriedType");
            return (Criteria) this;
        }

        public Criteria andMarriedTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("married_type not between", value1, value2, "marriedType");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(Integer value) {
            addCriterion("activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(Integer value) {
            addCriterion("activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(Integer value) {
            addCriterion("activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(Integer value) {
            addCriterion("activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(Integer value) {
            addCriterion("activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<Integer> values) {
            addCriterion("activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<Integer> values) {
            addCriterion("activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(Integer value1, Integer value2) {
            addCriterion("activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(Integer value1, Integer value2) {
            addCriterion("activity not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andTicketRuleIsNull() {
            addCriterion("ticket_rule is null");
            return (Criteria) this;
        }

        public Criteria andTicketRuleIsNotNull() {
            addCriterion("ticket_rule is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRuleEqualTo(Integer value) {
            addCriterion("ticket_rule =", value, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleNotEqualTo(Integer value) {
            addCriterion("ticket_rule <>", value, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleGreaterThan(Integer value) {
            addCriterion("ticket_rule >", value, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_rule >=", value, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleLessThan(Integer value) {
            addCriterion("ticket_rule <", value, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_rule <=", value, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleIn(List<Integer> values) {
            addCriterion("ticket_rule in", values, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleNotIn(List<Integer> values) {
            addCriterion("ticket_rule not in", values, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleBetween(Integer value1, Integer value2) {
            addCriterion("ticket_rule between", value1, value2, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andTicketRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_rule not between", value1, value2, "ticketRule");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityIsNull() {
            addCriterion("has_invest_security is null");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityIsNotNull() {
            addCriterion("has_invest_security is not null");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityEqualTo(Boolean value) {
            addCriterion("has_invest_security =", value, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityNotEqualTo(Boolean value) {
            addCriterion("has_invest_security <>", value, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityGreaterThan(Boolean value) {
            addCriterion("has_invest_security >", value, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_invest_security >=", value, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityLessThan(Boolean value) {
            addCriterion("has_invest_security <", value, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityLessThanOrEqualTo(Boolean value) {
            addCriterion("has_invest_security <=", value, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityIn(List<Boolean> values) {
            addCriterion("has_invest_security in", values, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityNotIn(List<Boolean> values) {
            addCriterion("has_invest_security not in", values, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityBetween(Boolean value1, Boolean value2) {
            addCriterion("has_invest_security between", value1, value2, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andHasInvestSecurityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_invest_security not between", value1, value2, "hasInvestSecurity");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdIsNull() {
            addCriterion("ump_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdIsNotNull() {
            addCriterion("ump_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdEqualTo(String value) {
            addCriterion("ump_user_id =", value, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdNotEqualTo(String value) {
            addCriterion("ump_user_id <>", value, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdGreaterThan(String value) {
            addCriterion("ump_user_id >", value, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ump_user_id >=", value, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdLessThan(String value) {
            addCriterion("ump_user_id <", value, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdLessThanOrEqualTo(String value) {
            addCriterion("ump_user_id <=", value, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdLike(String value) {
            addCriterion("ump_user_id like", value, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdNotLike(String value) {
            addCriterion("ump_user_id not like", value, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdIn(List<String> values) {
            addCriterion("ump_user_id in", values, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdNotIn(List<String> values) {
            addCriterion("ump_user_id not in", values, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdBetween(String value1, String value2) {
            addCriterion("ump_user_id between", value1, value2, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andUmpUserIdNotBetween(String value1, String value2) {
            addCriterion("ump_user_id not between", value1, value2, "umpUserId");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andGrantDateIsNull() {
            addCriterion("grant_date is null");
            return (Criteria) this;
        }

        public Criteria andGrantDateIsNotNull() {
            addCriterion("grant_date is not null");
            return (Criteria) this;
        }

        public Criteria andGrantDateEqualTo(Date value) {
            addCriterion("grant_date =", value, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateNotEqualTo(Date value) {
            addCriterion("grant_date <>", value, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateGreaterThan(Date value) {
            addCriterion("grant_date >", value, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateGreaterThanOrEqualTo(Date value) {
            addCriterion("grant_date >=", value, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateLessThan(Date value) {
            addCriterion("grant_date <", value, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateLessThanOrEqualTo(Date value) {
            addCriterion("grant_date <=", value, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateIn(List<Date> values) {
            addCriterion("grant_date in", values, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateNotIn(List<Date> values) {
            addCriterion("grant_date not in", values, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateBetween(Date value1, Date value2) {
            addCriterion("grant_date between", value1, value2, "grantDate");
            return (Criteria) this;
        }

        public Criteria andGrantDateNotBetween(Date value1, Date value2) {
            addCriterion("grant_date not between", value1, value2, "grantDate");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeIsNull() {
            addCriterion("hujinxh_product_code is null");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeIsNotNull() {
            addCriterion("hujinxh_product_code is not null");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeEqualTo(String value) {
            addCriterion("hujinxh_product_code =", value, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeNotEqualTo(String value) {
            addCriterion("hujinxh_product_code <>", value, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeGreaterThan(String value) {
            addCriterion("hujinxh_product_code >", value, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hujinxh_product_code >=", value, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeLessThan(String value) {
            addCriterion("hujinxh_product_code <", value, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeLessThanOrEqualTo(String value) {
            addCriterion("hujinxh_product_code <=", value, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeLike(String value) {
            addCriterion("hujinxh_product_code like", value, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeNotLike(String value) {
            addCriterion("hujinxh_product_code not like", value, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeIn(List<String> values) {
            addCriterion("hujinxh_product_code in", values, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeNotIn(List<String> values) {
            addCriterion("hujinxh_product_code not in", values, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeBetween(String value1, String value2) {
            addCriterion("hujinxh_product_code between", value1, value2, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andHujinxhProductCodeNotBetween(String value1, String value2) {
            addCriterion("hujinxh_product_code not between", value1, value2, "hujinxhProductCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCountIsNull() {
            addCriterion("payment_count is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCountIsNotNull() {
            addCriterion("payment_count is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCountEqualTo(Integer value) {
            addCriterion("payment_count =", value, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountNotEqualTo(Integer value) {
            addCriterion("payment_count <>", value, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountGreaterThan(Integer value) {
            addCriterion("payment_count >", value, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_count >=", value, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountLessThan(Integer value) {
            addCriterion("payment_count <", value, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountLessThanOrEqualTo(Integer value) {
            addCriterion("payment_count <=", value, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountIn(List<Integer> values) {
            addCriterion("payment_count in", values, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountNotIn(List<Integer> values) {
            addCriterion("payment_count not in", values, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountBetween(Integer value1, Integer value2) {
            addCriterion("payment_count between", value1, value2, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andPaymentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_count not between", value1, value2, "paymentCount");
            return (Criteria) this;
        }

        public Criteria andDayRateIsNull() {
            addCriterion("day_rate is null");
            return (Criteria) this;
        }

        public Criteria andDayRateIsNotNull() {
            addCriterion("day_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDayRateEqualTo(BigDecimal value) {
            addCriterion("day_rate =", value, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateNotEqualTo(BigDecimal value) {
            addCriterion("day_rate <>", value, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateGreaterThan(BigDecimal value) {
            addCriterion("day_rate >", value, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("day_rate >=", value, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateLessThan(BigDecimal value) {
            addCriterion("day_rate <", value, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("day_rate <=", value, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateIn(List<BigDecimal> values) {
            addCriterion("day_rate in", values, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateNotIn(List<BigDecimal> values) {
            addCriterion("day_rate not in", values, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_rate between", value1, value2, "dayRate");
            return (Criteria) this;
        }

        public Criteria andDayRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("day_rate not between", value1, value2, "dayRate");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableIsNull() {
            addCriterion("loan_amount_available is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableIsNotNull() {
            addCriterion("loan_amount_available is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableEqualTo(BigDecimal value) {
            addCriterion("loan_amount_available =", value, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount_available <>", value, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableGreaterThan(BigDecimal value) {
            addCriterion("loan_amount_available >", value, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount_available >=", value, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableLessThan(BigDecimal value) {
            addCriterion("loan_amount_available <", value, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount_available <=", value, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableIn(List<BigDecimal> values) {
            addCriterion("loan_amount_available in", values, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount_available not in", values, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount_available between", value1, value2, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andLoanAmountAvailableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount_available not between", value1, value2, "loanAmountAvailable");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdIsNull() {
            addCriterion("drools_rules_id is null");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdIsNotNull() {
            addCriterion("drools_rules_id is not null");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdEqualTo(String value) {
            addCriterion("drools_rules_id =", value, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdNotEqualTo(String value) {
            addCriterion("drools_rules_id <>", value, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdGreaterThan(String value) {
            addCriterion("drools_rules_id >", value, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdGreaterThanOrEqualTo(String value) {
            addCriterion("drools_rules_id >=", value, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdLessThan(String value) {
            addCriterion("drools_rules_id <", value, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdLessThanOrEqualTo(String value) {
            addCriterion("drools_rules_id <=", value, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdLike(String value) {
            addCriterion("drools_rules_id like", value, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdNotLike(String value) {
            addCriterion("drools_rules_id not like", value, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdIn(List<String> values) {
            addCriterion("drools_rules_id in", values, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdNotIn(List<String> values) {
            addCriterion("drools_rules_id not in", values, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdBetween(String value1, String value2) {
            addCriterion("drools_rules_id between", value1, value2, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andDroolsRulesIdNotBetween(String value1, String value2) {
            addCriterion("drools_rules_id not between", value1, value2, "droolsRulesId");
            return (Criteria) this;
        }

        public Criteria andRiskWarningIsNull() {
            addCriterion("risk_warning is null");
            return (Criteria) this;
        }

        public Criteria andRiskWarningIsNotNull() {
            addCriterion("risk_warning is not null");
            return (Criteria) this;
        }

        public Criteria andRiskWarningEqualTo(String value) {
            addCriterion("risk_warning =", value, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningNotEqualTo(String value) {
            addCriterion("risk_warning <>", value, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningGreaterThan(String value) {
            addCriterion("risk_warning >", value, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningGreaterThanOrEqualTo(String value) {
            addCriterion("risk_warning >=", value, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningLessThan(String value) {
            addCriterion("risk_warning <", value, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningLessThanOrEqualTo(String value) {
            addCriterion("risk_warning <=", value, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningLike(String value) {
            addCriterion("risk_warning like", value, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningNotLike(String value) {
            addCriterion("risk_warning not like", value, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningIn(List<String> values) {
            addCriterion("risk_warning in", values, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningNotIn(List<String> values) {
            addCriterion("risk_warning not in", values, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningBetween(String value1, String value2) {
            addCriterion("risk_warning between", value1, value2, "riskWarning");
            return (Criteria) this;
        }

        public Criteria andRiskWarningNotBetween(String value1, String value2) {
            addCriterion("risk_warning not between", value1, value2, "riskWarning");
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
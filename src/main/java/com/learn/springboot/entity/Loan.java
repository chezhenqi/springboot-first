package com.learn.springboot.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Loan implements Serializable {
	private String id;

	private String borrowerId;

	private String projectName;

	private String loanPurposes;

	private String projectDescription;

	private String projectType;

	private Integer loanPeriod;

	private Integer lockupPeriod;

	private String repaymentWay;

	private BigDecimal loanAmount;

	private BigDecimal loanRate;

	private BigDecimal percent;

	private Boolean hasMortgage;

	private Integer minNumber;

	private Integer maxNumber;

	private BigDecimal bidAward;

	private Integer overdueDays;

	private String loanStatus;

	private Boolean recommend;

	private String projectImagePath;

	private String createBy;

	private Date createDate;

	private String updateBy;

	private Date updateDate;

	private String remarks;

	private String delFlag;

	private Integer financingDays;

	private String guaranteeCompany;

	private String guaranteeComment;

	private String mortgageInfo;

	private String lawsuitInfo;

	private String moneyPurpose;

	private String repaymentSource;

	private String enterpriseBackground;

	private String businessScope;

	private String operatingConditions;

	private String legalName;

	private String legalId;

	private String legalNo;

	private Date beginDate;

	private String industryType;

	private Date reviewDate;

	private String creditLevel;

	private String parentLoanId;

	private String paymentId;

	private String loanType;

	private BigDecimal discountAmount;

	private BigDecimal manageFee;

	private String loanSourceTypeId;

	private Integer loanSourceType;

	private String borrowCompany;

	private String borrowAddress;

	private String borrowMobile;

	private Integer eduType;

	private Integer borrowType;

	private Integer incomeType;

	private BigDecimal creditLimit;

	private Integer marriedType;

	private Integer activity;

	private String linkman;

	private Integer ticketRule;

	private Boolean hasInvestSecurity;

	private String umpUserId;

	private Integer sort;

	private Date grantDate;

	private String hujinxhProductCode;

	private Integer paymentCount;

	private BigDecimal dayRate;

	private BigDecimal loanAmountAvailable;

	private String droolsRulesId;

	private String riskWarning;

	private String riskControlInfo;

	private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId == null ? null : borrowerId.trim();
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName == null ? null : projectName.trim();
	}

	public String getLoanPurposes() {
		return loanPurposes;
	}

	public void setLoanPurposes(String loanPurposes) {
		this.loanPurposes = loanPurposes == null ? null : loanPurposes.trim();
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription == null ? null : projectDescription.trim();
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType == null ? null : projectType.trim();
	}

	public Integer getLoanPeriod() {
		return loanPeriod;
	}

	public void setLoanPeriod(Integer loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

	public Integer getLockupPeriod() {
		return lockupPeriod;
	}

	public void setLockupPeriod(Integer lockupPeriod) {
		this.lockupPeriod = lockupPeriod;
	}

	public String getRepaymentWay() {
		return repaymentWay;
	}

	public void setRepaymentWay(String repaymentWay) {
		this.repaymentWay = repaymentWay == null ? null : repaymentWay.trim();
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getLoanRate() {
		return loanRate;
	}

	public void setLoanRate(BigDecimal loanRate) {
		this.loanRate = loanRate;
	}

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}

	public Boolean getHasMortgage() {
		return hasMortgage;
	}

	public void setHasMortgage(Boolean hasMortgage) {
		this.hasMortgage = hasMortgage;
	}

	public Integer getMinNumber() {
		return minNumber;
	}

	public void setMinNumber(Integer minNumber) {
		this.minNumber = minNumber;
	}

	public Integer getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(Integer maxNumber) {
		this.maxNumber = maxNumber;
	}

	public BigDecimal getBidAward() {
		return bidAward;
	}

	public void setBidAward(BigDecimal bidAward) {
		this.bidAward = bidAward;
	}

	public Integer getOverdueDays() {
		return overdueDays;
	}

	public void setOverdueDays(Integer overdueDays) {
		this.overdueDays = overdueDays;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus == null ? null : loanStatus.trim();
	}

	public Boolean getRecommend() {
		return recommend;
	}

	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public String getProjectImagePath() {
		return projectImagePath;
	}

	public void setProjectImagePath(String projectImagePath) {
		this.projectImagePath = projectImagePath == null ? null : projectImagePath.trim();
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy == null ? null : updateBy.trim();
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag == null ? null : delFlag.trim();
	}

	public Integer getFinancingDays() {
		return financingDays;
	}

	public void setFinancingDays(Integer financingDays) {
		this.financingDays = financingDays;
	}

	public String getGuaranteeCompany() {
		return guaranteeCompany;
	}

	public void setGuaranteeCompany(String guaranteeCompany) {
		this.guaranteeCompany = guaranteeCompany == null ? null : guaranteeCompany.trim();
	}

	public String getGuaranteeComment() {
		return guaranteeComment;
	}

	public void setGuaranteeComment(String guaranteeComment) {
		this.guaranteeComment = guaranteeComment == null ? null : guaranteeComment.trim();
	}

	public String getMortgageInfo() {
		return mortgageInfo;
	}

	public void setMortgageInfo(String mortgageInfo) {
		this.mortgageInfo = mortgageInfo == null ? null : mortgageInfo.trim();
	}

	public String getLawsuitInfo() {
		return lawsuitInfo;
	}

	public void setLawsuitInfo(String lawsuitInfo) {
		this.lawsuitInfo = lawsuitInfo == null ? null : lawsuitInfo.trim();
	}

	public String getMoneyPurpose() {
		return moneyPurpose;
	}

	public void setMoneyPurpose(String moneyPurpose) {
		this.moneyPurpose = moneyPurpose == null ? null : moneyPurpose.trim();
	}

	public String getRepaymentSource() {
		return repaymentSource;
	}

	public void setRepaymentSource(String repaymentSource) {
		this.repaymentSource = repaymentSource == null ? null : repaymentSource.trim();
	}

	public String getEnterpriseBackground() {
		return enterpriseBackground;
	}

	public void setEnterpriseBackground(String enterpriseBackground) {
		this.enterpriseBackground = enterpriseBackground == null ? null : enterpriseBackground.trim();
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope == null ? null : businessScope.trim();
	}

	public String getOperatingConditions() {
		return operatingConditions;
	}

	public void setOperatingConditions(String operatingConditions) {
		this.operatingConditions = operatingConditions == null ? null : operatingConditions.trim();
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName == null ? null : legalName.trim();
	}

	public String getLegalId() {
		return legalId;
	}

	public void setLegalId(String legalId) {
		this.legalId = legalId == null ? null : legalId.trim();
	}

	public String getLegalNo() {
		return legalNo;
	}

	public void setLegalNo(String legalNo) {
		this.legalNo = legalNo == null ? null : legalNo.trim();
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType == null ? null : industryType.trim();
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getCreditLevel() {
		return creditLevel;
	}

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel == null ? null : creditLevel.trim();
	}

	public String getParentLoanId() {
		return parentLoanId;
	}

	public void setParentLoanId(String parentLoanId) {
		this.parentLoanId = parentLoanId == null ? null : parentLoanId.trim();
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId == null ? null : paymentId.trim();
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType == null ? null : loanType.trim();
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public BigDecimal getManageFee() {
		return manageFee;
	}

	public void setManageFee(BigDecimal manageFee) {
		this.manageFee = manageFee;
	}

	public String getLoanSourceTypeId() {
		return loanSourceTypeId;
	}

	public void setLoanSourceTypeId(String loanSourceTypeId) {
		this.loanSourceTypeId = loanSourceTypeId == null ? null : loanSourceTypeId.trim();
	}

	public Integer getLoanSourceType() {
		return loanSourceType;
	}

	public void setLoanSourceType(Integer loanSourceType) {
		this.loanSourceType = loanSourceType;
	}

	public String getBorrowCompany() {
		return borrowCompany;
	}

	public void setBorrowCompany(String borrowCompany) {
		this.borrowCompany = borrowCompany == null ? null : borrowCompany.trim();
	}

	public String getBorrowAddress() {
		return borrowAddress;
	}

	public void setBorrowAddress(String borrowAddress) {
		this.borrowAddress = borrowAddress == null ? null : borrowAddress.trim();
	}

	public String getBorrowMobile() {
		return borrowMobile;
	}

	public void setBorrowMobile(String borrowMobile) {
		this.borrowMobile = borrowMobile == null ? null : borrowMobile.trim();
	}

	public Integer getEduType() {
		return eduType;
	}

	public void setEduType(Integer eduType) {
		this.eduType = eduType;
	}

	public Integer getBorrowType() {
		return borrowType;
	}

	public void setBorrowType(Integer borrowType) {
		this.borrowType = borrowType;
	}

	public Integer getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(Integer incomeType) {
		this.incomeType = incomeType;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Integer getMarriedType() {
		return marriedType;
	}

	public void setMarriedType(Integer marriedType) {
		this.marriedType = marriedType;
	}

	public Integer getActivity() {
		return activity;
	}

	public void setActivity(Integer activity) {
		this.activity = activity;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman == null ? null : linkman.trim();
	}

	public Integer getTicketRule() {
		return ticketRule;
	}

	public void setTicketRule(Integer ticketRule) {
		this.ticketRule = ticketRule;
	}

	public Boolean getHasInvestSecurity() {
		return hasInvestSecurity;
	}

	public void setHasInvestSecurity(Boolean hasInvestSecurity) {
		this.hasInvestSecurity = hasInvestSecurity;
	}

	public String getUmpUserId() {
		return umpUserId;
	}

	public void setUmpUserId(String umpUserId) {
		this.umpUserId = umpUserId == null ? null : umpUserId.trim();
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Date getGrantDate() {
		return grantDate;
	}

	public void setGrantDate(Date grantDate) {
		this.grantDate = grantDate;
	}

	public String getHujinxhProductCode() {
		return hujinxhProductCode;
	}

	public void setHujinxhProductCode(String hujinxhProductCode) {
		this.hujinxhProductCode = hujinxhProductCode == null ? null : hujinxhProductCode.trim();
	}

	public Integer getPaymentCount() {
		return paymentCount;
	}

	public void setPaymentCount(Integer paymentCount) {
		this.paymentCount = paymentCount;
	}

	public BigDecimal getDayRate() {
		return dayRate;
	}

	public void setDayRate(BigDecimal dayRate) {
		this.dayRate = dayRate;
	}

	public BigDecimal getLoanAmountAvailable() {
		return loanAmountAvailable;
	}

	public void setLoanAmountAvailable(BigDecimal loanAmountAvailable) {
		this.loanAmountAvailable = loanAmountAvailable;
	}

	public String getDroolsRulesId() {
		return droolsRulesId;
	}

	public void setDroolsRulesId(String droolsRulesId) {
		this.droolsRulesId = droolsRulesId == null ? null : droolsRulesId.trim();
	}

	public String getRiskWarning() {
		return riskWarning;
	}

	public void setRiskWarning(String riskWarning) {
		this.riskWarning = riskWarning == null ? null : riskWarning.trim();
	}

	public String getRiskControlInfo() {
		return riskControlInfo;
	}

	public void setRiskControlInfo(String riskControlInfo) {
		this.riskControlInfo = riskControlInfo == null ? null : riskControlInfo.trim();
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", borrowerId=" + borrowerId + ", projectName=" + projectName + ", loanPurposes="
				+ loanPurposes + ", projectDescription=" + projectDescription + ", projectType=" + projectType
				+ ", loanPeriod=" + loanPeriod + ", lockupPeriod=" + lockupPeriod + ", repaymentWay=" + repaymentWay
				+ ", loanAmount=" + loanAmount + ", loanRate=" + loanRate + ", percent=" + percent + ", hasMortgage="
				+ hasMortgage + ", minNumber=" + minNumber + ", maxNumber=" + maxNumber + ", bidAward=" + bidAward
				+ ", overdueDays=" + overdueDays + ", loanStatus=" + loanStatus + ", recommend=" + recommend
				+ ", projectImagePath=" + projectImagePath + ", createBy=" + createBy + ", createDate=" + createDate
				+ ", updateBy=" + updateBy + ", updateDate=" + updateDate + ", remarks=" + remarks + ", delFlag="
				+ delFlag + ", financingDays=" + financingDays + ", guaranteeCompany=" + guaranteeCompany
				+ ", guaranteeComment=" + guaranteeComment + ", mortgageInfo=" + mortgageInfo + ", lawsuitInfo="
				+ lawsuitInfo + ", moneyPurpose=" + moneyPurpose + ", repaymentSource=" + repaymentSource
				+ ", enterpriseBackground=" + enterpriseBackground + ", businessScope=" + businessScope
				+ ", operatingConditions=" + operatingConditions + ", legalName=" + legalName + ", legalId=" + legalId
				+ ", legalNo=" + legalNo + ", beginDate=" + beginDate + ", industryType=" + industryType
				+ ", reviewDate=" + reviewDate + ", creditLevel=" + creditLevel + ", parentLoanId=" + parentLoanId
				+ ", paymentId=" + paymentId + ", loanType=" + loanType + ", discountAmount=" + discountAmount
				+ ", manageFee=" + manageFee + ", loanSourceTypeId=" + loanSourceTypeId + ", loanSourceType="
				+ loanSourceType + ", borrowCompany=" + borrowCompany + ", borrowAddress=" + borrowAddress
				+ ", borrowMobile=" + borrowMobile + ", eduType=" + eduType + ", borrowType=" + borrowType
				+ ", incomeType=" + incomeType + ", creditLimit=" + creditLimit + ", marriedType=" + marriedType
				+ ", activity=" + activity + ", linkman=" + linkman + ", ticketRule=" + ticketRule
				+ ", hasInvestSecurity=" + hasInvestSecurity + ", umpUserId=" + umpUserId + ", sort=" + sort
				+ ", grantDate=" + grantDate + ", hujinxhProductCode=" + hujinxhProductCode + ", paymentCount="
				+ paymentCount + ", dayRate=" + dayRate + ", loanAmountAvailable=" + loanAmountAvailable
				+ ", droolsRulesId=" + droolsRulesId + ", riskWarning=" + riskWarning + ", riskControlInfo="
				+ riskControlInfo + "]";
	}

}
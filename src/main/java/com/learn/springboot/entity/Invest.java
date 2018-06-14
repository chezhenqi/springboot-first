package com.learn.springboot.entity;

import java.io.Serializable;
import java.util.Date;

public class Invest implements Serializable {
	private String id;

	private String loanId;

	private String userId;

	private Long investAmount;

	private String createBy;

	private Date createDate;

	private String updateBy;

	private Date updateDate;

	private String remarks;

	private String delFlag;

	private String investStatus;

	private String auto;

	private String couponId;

	private Integer channel;

	private String morerateId;

	private String ticketId;

	private String investApplyId;

	private String loanPoolId;

	private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId == null ? null : loanId.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public Long getInvestAmount() {
		return investAmount;
	}

	public void setInvestAmount(Long investAmount) {
		this.investAmount = investAmount;
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

	public String getInvestStatus() {
		return investStatus;
	}

	public void setInvestStatus(String investStatus) {
		this.investStatus = investStatus == null ? null : investStatus.trim();
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto == null ? null : auto.trim();
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId == null ? null : couponId.trim();
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public String getMorerateId() {
		return morerateId;
	}

	public void setMorerateId(String morerateId) {
		this.morerateId = morerateId == null ? null : morerateId.trim();
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId == null ? null : ticketId.trim();
	}

	public String getInvestApplyId() {
		return investApplyId;
	}

	public void setInvestApplyId(String investApplyId) {
		this.investApplyId = investApplyId == null ? null : investApplyId.trim();
	}

	public String getLoanPoolId() {
		return loanPoolId;
	}

	public void setLoanPoolId(String loanPoolId) {
		this.loanPoolId = loanPoolId == null ? null : loanPoolId.trim();
	}

	@Override
	public String toString() {
		return "Invest [id=" + id + ", loanId=" + loanId + ", userId=" + userId + ", investAmount=" + investAmount
				+ ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate="
				+ updateDate + ", remarks=" + remarks + ", delFlag=" + delFlag + ", investStatus=" + investStatus
				+ ", auto=" + auto + ", couponId=" + couponId + ", channel=" + channel + ", morerateId=" + morerateId
				+ ", ticketId=" + ticketId + ", investApplyId=" + investApplyId + ", loanPoolId=" + loanPoolId + "]";
	}

}
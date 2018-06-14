package com.learn.springboot.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LotteryResultRecord implements Serializable {
	private Integer id;

	private String userId;

	private Integer lotteryId;

	private Date date;

	private String activeCategory;

	private Integer type;

	private Integer status;

	private String givingUserId;

	private String awardName;

	private String imgUrl;

	private String imgUrl2;

	private Integer number;

	private Integer isdiscount;

	private BigDecimal discountAmount;

	private String investTotalAmt;

	private String investId;

	private BigDecimal awardAmount;

	private String source;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public Integer getLotteryId() {
		return lotteryId;
	}

	public void setLotteryId(Integer lotteryId) {
		this.lotteryId = lotteryId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getActiveCategory() {
		return activeCategory;
	}

	public void setActiveCategory(String activeCategory) {
		this.activeCategory = activeCategory == null ? null : activeCategory.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getGivingUserId() {
		return givingUserId;
	}

	public void setGivingUserId(String givingUserId) {
		this.givingUserId = givingUserId == null ? null : givingUserId.trim();
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName == null ? null : awardName.trim();
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	public String getImgUrl2() {
		return imgUrl2;
	}

	public void setImgUrl2(String imgUrl2) {
		this.imgUrl2 = imgUrl2 == null ? null : imgUrl2.trim();
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getIsdiscount() {
		return isdiscount;
	}

	public void setIsdiscount(Integer isdiscount) {
		this.isdiscount = isdiscount;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getInvestTotalAmt() {
		return investTotalAmt;
	}

	public void setInvestTotalAmt(String investTotalAmt) {
		this.investTotalAmt = investTotalAmt == null ? null : investTotalAmt.trim();
	}

	public String getInvestId() {
		return investId;
	}

	public void setInvestId(String investId) {
		this.investId = investId == null ? null : investId.trim();
	}

	public BigDecimal getAwardAmount() {
		return awardAmount;
	}

	public void setAwardAmount(BigDecimal awardAmount) {
		this.awardAmount = awardAmount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source == null ? null : source.trim();
	}

	@Override
	public String toString() {
		return "LotteryResultRecord [id=" + id + ", userId=" + userId + ", lotteryId=" + lotteryId + ", date=" + date
				+ ", activeCategory=" + activeCategory + ", type=" + type + ", status=" + status + ", givingUserId="
				+ givingUserId + ", awardName=" + awardName + ", imgUrl=" + imgUrl + ", imgUrl2=" + imgUrl2
				+ ", number=" + number + ", isdiscount=" + isdiscount + ", discountAmount=" + discountAmount
				+ ", investTotalAmt=" + investTotalAmt + ", investId=" + investId + ", awardAmount=" + awardAmount
				+ ", source=" + source + "]";
	}

}
package com.learn.springboot.entity;

import java.io.Serializable;
import java.util.Date;

public class LotteryNumber implements Serializable {
	private Integer id;

	private String userId;

	private Integer lotteryNumber1;

	private Integer lotteryNumber2;

	private Integer lotteryNumber3;

	private Integer lotteryNumber4;

	private Integer lotteryNumber5;

	private Integer type;

	private Date createDate;

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

	public Integer getLotteryNumber1() {
		return lotteryNumber1;
	}

	public void setLotteryNumber1(Integer lotteryNumber1) {
		this.lotteryNumber1 = lotteryNumber1;
	}

	public Integer getLotteryNumber2() {
		return lotteryNumber2;
	}

	public void setLotteryNumber2(Integer lotteryNumber2) {
		this.lotteryNumber2 = lotteryNumber2;
	}

	public Integer getLotteryNumber3() {
		return lotteryNumber3;
	}

	public void setLotteryNumber3(Integer lotteryNumber3) {
		this.lotteryNumber3 = lotteryNumber3;
	}

	public Integer getLotteryNumber4() {
		return lotteryNumber4;
	}

	public void setLotteryNumber4(Integer lotteryNumber4) {
		this.lotteryNumber4 = lotteryNumber4;
	}

	public Integer getLotteryNumber5() {
		return lotteryNumber5;
	}

	public void setLotteryNumber5(Integer lotteryNumber5) {
		this.lotteryNumber5 = lotteryNumber5;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "LotteryNumber [id=" + id + ", userId=" + userId + ", lotteryNumber1=" + lotteryNumber1
				+ ", lotteryNumber2=" + lotteryNumber2 + ", lotteryNumber3=" + lotteryNumber3 + ", lotteryNumber4="
				+ lotteryNumber4 + ", lotteryNumber5=" + lotteryNumber5 + ", type=" + type + ", createDate="
				+ createDate + "]";
	}

}
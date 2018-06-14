package com.learn.springboot.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private String id;

    private Integer merchantId;

    private String companyId;

    private String officeId;

    private String loginName;

    private String password;

    private String no;

    private String name;

    private String email;

    private String phone;

    private String mobile;

    private String userType;

    private String userPlatformType;

    private String loginIp;

    private String ip;

    private Date loginDate;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private Integer status;

    private String activateCode;

    private String qq;

    private String weibo;

    private String smsCode;

    private String referrer;

    private Integer hasInvest;

    private Integer channel;

    private Integer userCompanyPerson;

    private String rqtUnique;

    private Date loginDate2;

    private String fbabaUid;

    private String htangUid;

    private String ztkUid;

    private String img;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserPlatformType() {
        return userPlatformType;
    }

    public void setUserPlatformType(String userPlatformType) {
        this.userPlatformType = userPlatformType == null ? null : userPlatformType.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getActivateCode() {
        return activateCode;
    }

    public void setActivateCode(String activateCode) {
        this.activateCode = activateCode == null ? null : activateCode.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode == null ? null : smsCode.trim();
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer == null ? null : referrer.trim();
    }

    public Integer getHasInvest() {
        return hasInvest;
    }

    public void setHasInvest(Integer hasInvest) {
        this.hasInvest = hasInvest;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getUserCompanyPerson() {
        return userCompanyPerson;
    }

    public void setUserCompanyPerson(Integer userCompanyPerson) {
        this.userCompanyPerson = userCompanyPerson;
    }

    public String getRqtUnique() {
        return rqtUnique;
    }

    public void setRqtUnique(String rqtUnique) {
        this.rqtUnique = rqtUnique == null ? null : rqtUnique.trim();
    }

    public Date getLoginDate2() {
        return loginDate2;
    }

    public void setLoginDate2(Date loginDate2) {
        this.loginDate2 = loginDate2;
    }

    public String getFbabaUid() {
        return fbabaUid;
    }

    public void setFbabaUid(String fbabaUid) {
        this.fbabaUid = fbabaUid == null ? null : fbabaUid.trim();
    }

    public String getHtangUid() {
        return htangUid;
    }

    public void setHtangUid(String htangUid) {
        this.htangUid = htangUid == null ? null : htangUid.trim();
    }

    public String getZtkUid() {
        return ztkUid;
    }

    public void setZtkUid(String ztkUid) {
        this.ztkUid = ztkUid == null ? null : ztkUid.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

	@Override
	public String toString() {
		return "SysUser [id=" + id + ", merchantId=" + merchantId + ", companyId=" + companyId + ", officeId="
				+ officeId + ", loginName=" + loginName + ", password=" + password + ", no=" + no + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", mobile=" + mobile + ", userType=" + userType
				+ ", userPlatformType=" + userPlatformType + ", loginIp=" + loginIp + ", ip=" + ip + ", loginDate="
				+ loginDate + ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy=" + updateBy
				+ ", updateDate=" + updateDate + ", remarks=" + remarks + ", delFlag=" + delFlag + ", status=" + status
				+ ", activateCode=" + activateCode + ", qq=" + qq + ", weibo=" + weibo + ", smsCode=" + smsCode
				+ ", referrer=" + referrer + ", hasInvest=" + hasInvest + ", channel=" + channel
				+ ", userCompanyPerson=" + userCompanyPerson + ", rqtUnique=" + rqtUnique + ", loginDate2=" + loginDate2
				+ ", fbabaUid=" + fbabaUid + ", htangUid=" + htangUid + ", ztkUid=" + ztkUid + ", img=" + img + "]";
	}
    
}
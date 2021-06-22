package com.solar.office.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 用户
 */
public class User {
    private Long uid;

    private String userName;

    private String password;

    private Long roleId;

    private String creator;

    @ApiModelProperty(value = "创建日期", required = false, example = "2018-09-10 00:00:00")
    private Date createdDate;

    @ApiModelProperty(value = "密码过期日期", required = false, example = "2019-09-10 00:00:00")
    private Date expirationDate;

    @ApiModelProperty(value = "产品id", required = true, example = "A01")
    private String productId;

    private Date lastUpdate;

    private String lastUpdateBy;

    private String remark;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
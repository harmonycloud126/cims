package com.harmonycloud.entity;

import javax.persistence.Entity;

/**
 * @author qidong
 * @date 2019/2/13
 */

public class UserUserrole {
    private Integer userRoleId;
    private Integer userId;

    public UserUserrole() {
    }

    public UserUserrole(Integer userRoleId, Integer userId) {
        this.userRoleId = userRoleId;
        this.userId = userId;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

package com.harmonycloud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author qidong
 * @date 2019/2/13
 */
@Entity
@Table(name = "user_role")
public class UserUserrole {
    @Id
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

package com.harmonycloud.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author qidong
 * @date 2019/2/13
 */


@Entity
@Table(name = "role")
public class UserRole {
    @Id
    private Integer userRoleId;
    private String userRoleName;
    private String userRoleDesc;
    private String userRoleStatus;

    public UserRole() {
    }

    public UserRole(Integer userRoleId, String userRoleName, String userRoleDesc,
                    String userRoleStatus) {
        this.userRoleId = userRoleId;
        this.userRoleName = userRoleName;
        this.userRoleDesc = userRoleDesc;
        this.userRoleStatus = userRoleStatus;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public String getUserRoleDesc() {
        return userRoleDesc;
    }

    public void setUserRoleDesc(String userRoleDesc) {
        this.userRoleDesc = userRoleDesc;
    }

    public String getUserRoleStatus() {
        return userRoleStatus;
    }

    public void setUserRoleStatus(String userRoleStatus) {
        this.userRoleStatus = userRoleStatus;
    }
}

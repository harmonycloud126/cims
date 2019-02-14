package com.harmonycloud.entity;

import javax.persistence.Entity;

/**
 * @author qidong
 * @date 2019/2/13
 */

public class UserClinic {
    private Integer userId;
    private Integer clinicId;

    public UserClinic() {
    }

    public UserClinic(Integer userId, Integer clinicId) {
        this.userId = userId;
        this.clinicId = clinicId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }
}

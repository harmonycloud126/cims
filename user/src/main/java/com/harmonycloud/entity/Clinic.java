package com.harmonycloud.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @author qidong
 * @date 2019/2/13
 */
//@Entity
//@Table(name = "clinic")
public class Clinic {
//    @Id
    private Integer clinicId;
    private String clinicName;

    public Clinic() {
    }

    public Clinic(Integer clinicId, String clinicName) {
        this.clinicId = clinicId;
        this.clinicName = clinicName;
    }

    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }
}

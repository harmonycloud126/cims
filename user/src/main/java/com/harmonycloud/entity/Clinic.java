package com.harmonycloud.entity;

/**
 * @author qidong
 * @date 2019/2/13
 */
public class Clinic {
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

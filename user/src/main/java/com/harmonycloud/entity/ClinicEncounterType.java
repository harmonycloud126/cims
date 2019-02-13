package com.harmonycloud.entity;

/**
 * @author qidong
 * @date 2019/2/13
 */
public class ClinicEncounterType {
    private Integer clinicId;
    private Integer encounterTypeId;

    public ClinicEncounterType() {
    }

    public ClinicEncounterType(Integer clinicId, Integer encounterTypeId) {
        this.clinicId = clinicId;
        this.encounterTypeId = encounterTypeId;
    }

    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    public Integer getEncounterTypeId() {
        return encounterTypeId;
    }

    public void setEncounterTypeId(Integer encounterTypeId) {
        this.encounterTypeId = encounterTypeId;
    }
}

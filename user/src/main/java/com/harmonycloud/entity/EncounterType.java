package com.harmonycloud.entity;

/**
 * @author qidong
 * @date 2019/2/13
 */
public class EncounterType {
    private Integer encounterTypeId;
    private String encounterType;

    public EncounterType() {
    }

    public EncounterType(Integer encounterTypeId, String encounterType) {
        this.encounterTypeId = encounterTypeId;
        this.encounterType = encounterType;
    }

    public Integer getEncounterTypeId() {
        return encounterTypeId;
    }

    public void setEncounterTypeId(Integer encounterTypeId) {
        this.encounterTypeId = encounterTypeId;
    }

    public String getEncounterType() {
        return encounterType;
    }

    public void setEncounterType(String encounterType) {
        this.encounterType = encounterType;
    }
}

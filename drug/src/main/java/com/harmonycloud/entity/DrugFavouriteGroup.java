package com.harmonycloud.entity;

/**
 * @author qidong
 * @date 2019/2/13
 */
public class DrugFavouriteGroup {
    private Integer drugFavouriteGroupId;
    private String groupName;
    private Integer encounterTypeId;

    public DrugFavouriteGroup() {
    }

    public DrugFavouriteGroup(Integer drugFavouriteGroupId, String groupName, Integer encounterTypeId) {
        this.drugFavouriteGroupId = drugFavouriteGroupId;
        this.groupName = groupName;
        this.encounterTypeId = encounterTypeId;
    }

    public Integer getId() {
        return drugFavouriteGroupId;
    }

    public void setId(Integer drugFavouriteGroupId) {
        this.drugFavouriteGroupId = drugFavouriteGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getEncounterTypeId() {
        return encounterTypeId;
    }

    public void setEncounterTypeId(Integer encounterTypeId) {
        this.encounterTypeId = encounterTypeId;
    }
}

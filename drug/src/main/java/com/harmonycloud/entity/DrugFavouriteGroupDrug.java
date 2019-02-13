package com.harmonycloud.entity;

/**
 * @author qidong
 * @date 2019/2/13
 */
public class DrugFavouriteGroupDrug {
    private Integer drugFavouriteGroupId;
    private Integer drugId;
    private String regimenLine;

    public DrugFavouriteGroupDrug() {
    }

    public DrugFavouriteGroupDrug(Integer drugFavouriteGroupId, Integer drugId, String regimenLine) {
        this.drugFavouriteGroupId = drugFavouriteGroupId;
        this.drugId = drugId;
        this.regimenLine = regimenLine;
    }

    public Integer getDrugFavouriteGroupId() {
        return drugFavouriteGroupId;
    }

    public void setDrugFavouriteGroupId(Integer drugFavouriteGroupId) {
        this.drugFavouriteGroupId = drugFavouriteGroupId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getRegimenLine() {
        return regimenLine;
    }

    public void setRegimenLine(String regimenLine) {
        this.regimenLine = regimenLine;
    }
}

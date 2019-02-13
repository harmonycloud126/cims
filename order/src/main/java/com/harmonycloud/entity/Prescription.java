package com.harmonycloud.entity;

import java.util.Date;

/**
 *
 * @author qidong
 * @date 2019/2/13
 */
public class Prescription {
    private Integer prescriptionId;
    private String regimenLine;
    private Integer encounterId;
    private Date createDate;
    private String creatBy;

    public Prescription() {

    }

    public Prescription(Integer prescriptionId, String regimenLine, Integer encounterId, Date createDate, String creaetBy) {
        this.prescriptionId = prescriptionId;
        this.regimenLine = regimenLine;
        this.encounterId = encounterId;
        this.createDate = createDate;
        creatBy = creaetBy;
    }

    public Integer getId() {
        return prescriptionId;
    }

    public void setId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getRegimenLine() {
        return regimenLine;
    }

    public void setRegimenLine(String regimenLine) {
        this.regimenLine = regimenLine;
    }

    public Integer getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(Integer encounterId) {
        this.encounterId = encounterId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreaetBy() {
        return creatBy;
    }

    public void setCreaetBy(String creaetBy) {
        creatBy = creaetBy;
    }
}

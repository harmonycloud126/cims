package com.harmonycloud.entity;

import java.util.Date;

/**
 * @author qidong
 * @date 2019/2/13
 */
public class ClinicalNote {
    private Integer clinicalNoteId;
    private Integer encounterId;
    private String noteContent;
    private String createBy;
    private Date createDate;

    public ClinicalNote() {
    }

    public ClinicalNote(Integer clinicalNoteId, Integer encounterId,
                        String noteContent, String createBy, Date createDate) {
        this.clinicalNoteId = clinicalNoteId;
        this.encounterId = encounterId;
        this.noteContent = noteContent;
        this.createBy = createBy;
        this.createDate = createDate;
    }

    public Integer getClinicalNoteId() {
        return clinicalNoteId;
    }

    public void setClinicalNoteId(Integer clinicalNoteId) {
        this.clinicalNoteId = clinicalNoteId;
    }

    public Integer getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(Integer encounterId) {
        this.encounterId = encounterId;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

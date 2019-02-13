package com.harmonycloud.entity;


/**
 * @author qidong
 * @date 2019/2/13
 */
public class ClinicalNoteTemplate {
    private Integer clinicalNoteTemplateId;
    private Integer encounterTypeId;
    private String templateName;
    private String templateContent;
    private String createBy;

    public ClinicalNoteTemplate() {
    }

    public ClinicalNoteTemplate(Integer clinicalNoteTemplateId, Integer encounterTypeId,
                                String templateName, String templateContent, String createBy) {
        this.clinicalNoteTemplateId = clinicalNoteTemplateId;
        this.encounterTypeId = encounterTypeId;
        this.templateName = templateName;
        this.templateContent = templateContent;
        this.createBy = createBy;
    }

    public Integer getClinicalNoteTemplateId() {
        return clinicalNoteTemplateId;
    }

    public void setClinicalNoteTemplateId(Integer clinicalNoteTemplateId) {
        this.clinicalNoteTemplateId = clinicalNoteTemplateId;
    }

    public Integer getEncounterTypeId() {
        return encounterTypeId;
    }

    public void setEncounterTypeId(Integer encounterTypeId) {
        this.encounterTypeId = encounterTypeId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}

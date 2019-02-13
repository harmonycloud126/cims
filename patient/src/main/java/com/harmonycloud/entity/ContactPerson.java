package com.harmonycloud.entity;

/**
 * @author qidong
 * @date 2019/2/13
 */
public class ContactPerson {
    private Integer contactPersonId;
    private Integer patientId;
    private String relationship;
    private String englishName;
    private String chineseName;
    private Long mobilePhoneAreaCode;
    private Long mobilePhone;
    private Long otherPhoneAreaCode;
    private Long otherPhone;
    private String email;
    private Integer displayOrder;

    public ContactPerson() {
    }

    public ContactPerson(Integer contactPersonId, Integer patientId, String relationship,
                         String englishName, String chineseName, Long mobilePhoneAreaCode,
                         Long mobilePhone, Long otherPhoneAreaCode, Long otherPhone, String email,
                         Integer displayOrder) {
        this.contactPersonId = contactPersonId;
        this.patientId = patientId;
        this.relationship = relationship;
        this.englishName = englishName;
        this.chineseName = chineseName;
        this.mobilePhoneAreaCode = mobilePhoneAreaCode;
        this.mobilePhone = mobilePhone;
        this.otherPhoneAreaCode = otherPhoneAreaCode;
        this.otherPhone = otherPhone;
        this.email = email;
        this.displayOrder = displayOrder;
    }

    public Integer getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(Integer contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public Long getMobilePhoneAreaCode() {
        return mobilePhoneAreaCode;
    }

    public void setMobilePhoneAreaCode(Long mobilePhoneAreaCode) {
        this.mobilePhoneAreaCode = mobilePhoneAreaCode;
    }

    public Long getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Long getOtherPhoneAreaCode() {
        return otherPhoneAreaCode;
    }

    public void setOtherPhoneAreaCode(Long otherPhoneAreaCode) {
        this.otherPhoneAreaCode = otherPhoneAreaCode;
    }

    public Long getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(Long otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }
}

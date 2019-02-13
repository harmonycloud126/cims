package com.harmonycloud.entity;

import java.sql.Date;

/**
 * @author qidong
 * @date 2019/2/13
 */
public class Patient {
    private Integer patientId;
    private String documentType;
    private Integer documentNumber;
    private String englishSurname;
    private String englishGivenName;
    private String chineseName;
    private Date dateOrBirth;
    private String sex;
    private Long mobilePhoneAreaCode;
    private Long mobilePhone;
    private Long homePhoneAreaCode;
    private Long homePhone;
    private Integer room;
    private Integer floor;
    private String block;
    private String building;
    private String estate;
    private String street;
    private String region;
    private String district;

    public Patient() {
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getEnglishSurname() {
        return englishSurname;
    }

    public void setEnglishSurname(String englishSurname) {
        this.englishSurname = englishSurname;
    }

    public String getEnglishGivenName() {
        return englishGivenName;
    }

    public void setEnglishGivenName(String englishGivenName) {
        this.englishGivenName = englishGivenName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public Date getDateOrBirth() {
        return dateOrBirth;
    }

    public void setDateOrBirth(Date dateOrBirth) {
        this.dateOrBirth = dateOrBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public Long getHomePhoneAreaCode() {
        return homePhoneAreaCode;
    }

    public void setHomePhoneAreaCode(Long homePhoneAreaCode) {
        this.homePhoneAreaCode = homePhoneAreaCode;
    }

    public Long getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(Long homePhone) {
        this.homePhone = homePhone;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}

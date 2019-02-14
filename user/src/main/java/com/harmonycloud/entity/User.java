package com.harmonycloud.entity;

import javax.persistence.*;


/**
 * @author qidong
 * @date 2019/2/13
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    private Integer userId;
    @Column(name = "english_surname")
    private String englishSurname;
    @Column(name = "english_given_name")
    private String englishGivenName;
    @Column(name="login_name")
    private String loginName;
    @Column(name = "email")
    private String email;
    @Column(name = "user_status")
    private String userStatus;
    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(Integer userId, String englishSurname, String englishGivenName,
                String loginName, String email, String userStatus) {
        this.userId = userId;
        this.englishSurname = englishSurname;
        this.englishGivenName = englishGivenName;
        this.loginName = loginName;
        this.email = email;
        this.userStatus = userStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

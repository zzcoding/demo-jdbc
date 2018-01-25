package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * com.example.demo.entity
 *
 * @author zhaoguang
 * @date 2018/1/16 17:14
 * @description
 */
public class TbUserEntity {
    private int uId;
    private String uName;
    private String uAccountName;
    private String uPassword;
    private Integer uDeleteStatus;
    private Integer uLocked;
    private String uDescription;
    private String uCredentialsSalt;
    private String uCreatorName;
    private Timestamp uCreateTime;
    private Timestamp uUpdateTime;
    private Long u1;
    private Short u2;
    private Boolean u3;
    private Double uU;
    private Byte uU1;
    private String username;
    private String passWord;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAccountName() {
        return uAccountName;
    }

    public void setuAccountName(String uAccountName) {
        this.uAccountName = uAccountName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getuDeleteStatus() {
        return uDeleteStatus;
    }

    public void setuDeleteStatus(Integer uDeleteStatus) {
        this.uDeleteStatus = uDeleteStatus;
    }

    public Integer getuLocked() {
        return uLocked;
    }

    public void setuLocked(Integer uLocked) {
        this.uLocked = uLocked;
    }

    public String getuDescription() {
        return uDescription;
    }

    public void setuDescription(String uDescription) {
        this.uDescription = uDescription;
    }

    public String getuCredentialsSalt() {
        return uCredentialsSalt;
    }

    public void setuCredentialsSalt(String uCredentialsSalt) {
        this.uCredentialsSalt = uCredentialsSalt;
    }

    public String getuCreatorName() {
        return uCreatorName;
    }

    public void setuCreatorName(String uCreatorName) {
        this.uCreatorName = uCreatorName;
    }

    public Timestamp getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Timestamp uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public Timestamp getuUpdateTime() {
        return uUpdateTime;
    }

    public void setuUpdateTime(Timestamp uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
    }

    public Long getU1() {
        return u1;
    }

    public void setU1(Long u1) {
        this.u1 = u1;
    }

    public Short getU2() {
        return u2;
    }

    public void setU2(Short u2) {
        this.u2 = u2;
    }

    public Boolean getU3() {
        return u3;
    }

    public void setU3(Boolean u3) {
        this.u3 = u3;
    }

    public Double getuU() {
        return uU;
    }

    public void setuU(Double uU) {
        this.uU = uU;
    }

    public Byte getuU1() {
        return uU1;
    }

    public void setuU1(Byte uU1) {
        this.uU1 = uU1;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUserEntity that = (TbUserEntity) o;

        if (uId != that.uId) return false;
        if (uName != null ? !uName.equals(that.uName) : that.uName != null) return false;
        if (uAccountName != null ? !uAccountName.equals(that.uAccountName) : that.uAccountName != null) return false;
        if (uPassword != null ? !uPassword.equals(that.uPassword) : that.uPassword != null) return false;
        if (uDeleteStatus != null ? !uDeleteStatus.equals(that.uDeleteStatus) : that.uDeleteStatus != null)
            return false;
        if (uLocked != null ? !uLocked.equals(that.uLocked) : that.uLocked != null) return false;
        if (uDescription != null ? !uDescription.equals(that.uDescription) : that.uDescription != null) return false;
        if (uCredentialsSalt != null ? !uCredentialsSalt.equals(that.uCredentialsSalt) : that.uCredentialsSalt != null)
            return false;
        if (uCreatorName != null ? !uCreatorName.equals(that.uCreatorName) : that.uCreatorName != null) return false;
        if (uCreateTime != null ? !uCreateTime.equals(that.uCreateTime) : that.uCreateTime != null) return false;
        if (uUpdateTime != null ? !uUpdateTime.equals(that.uUpdateTime) : that.uUpdateTime != null) return false;
        if (u1 != null ? !u1.equals(that.u1) : that.u1 != null) return false;
        if (u2 != null ? !u2.equals(that.u2) : that.u2 != null) return false;
        if (u3 != null ? !u3.equals(that.u3) : that.u3 != null) return false;
        if (uU != null ? !uU.equals(that.uU) : that.uU != null) return false;
        if (uU1 != null ? !uU1.equals(that.uU1) : that.uU1 != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (passWord != null ? !passWord.equals(that.passWord) : that.passWord != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uId;
        result = 31 * result + (uName != null ? uName.hashCode() : 0);
        result = 31 * result + (uAccountName != null ? uAccountName.hashCode() : 0);
        result = 31 * result + (uPassword != null ? uPassword.hashCode() : 0);
        result = 31 * result + (uDeleteStatus != null ? uDeleteStatus.hashCode() : 0);
        result = 31 * result + (uLocked != null ? uLocked.hashCode() : 0);
        result = 31 * result + (uDescription != null ? uDescription.hashCode() : 0);
        result = 31 * result + (uCredentialsSalt != null ? uCredentialsSalt.hashCode() : 0);
        result = 31 * result + (uCreatorName != null ? uCreatorName.hashCode() : 0);
        result = 31 * result + (uCreateTime != null ? uCreateTime.hashCode() : 0);
        result = 31 * result + (uUpdateTime != null ? uUpdateTime.hashCode() : 0);
        result = 31 * result + (u1 != null ? u1.hashCode() : 0);
        result = 31 * result + (u2 != null ? u2.hashCode() : 0);
        result = 31 * result + (u3 != null ? u3.hashCode() : 0);
        result = 31 * result + (uU != null ? uU.hashCode() : 0);
        result = 31 * result + (uU1 != null ? uU1.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        return result;
    }
}

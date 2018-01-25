package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * com.example.demo.entity
 *
 * @author zhaoguang
 * @date 2018/1/23 17:55
 * @description
 */
public class TbLoginInfoEntity {
    private int lId;
    private Integer uId;
    private String uAccountName;
    private String lIp;
    private Timestamp lLoginTime;

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuAccountName() {
        return uAccountName;
    }

    public void setuAccountName(String uAccountName) {
        this.uAccountName = uAccountName;
    }

    public String getlIp() {
        return lIp;
    }

    public void setlIp(String lIp) {
        this.lIp = lIp;
    }

    public Timestamp getlLoginTime() {
        return lLoginTime;
    }

    public void setlLoginTime(Timestamp lLoginTime) {
        this.lLoginTime = lLoginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbLoginInfoEntity that = (TbLoginInfoEntity) o;

        if (lId != that.lId) return false;
        if (uId != null ? !uId.equals(that.uId) : that.uId != null) return false;
        if (uAccountName != null ? !uAccountName.equals(that.uAccountName) : that.uAccountName != null) return false;
        if (lIp != null ? !lIp.equals(that.lIp) : that.lIp != null) return false;
        if (lLoginTime != null ? !lLoginTime.equals(that.lLoginTime) : that.lLoginTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lId;
        result = 31 * result + (uId != null ? uId.hashCode() : 0);
        result = 31 * result + (uAccountName != null ? uAccountName.hashCode() : 0);
        result = 31 * result + (lIp != null ? lIp.hashCode() : 0);
        result = 31 * result + (lLoginTime != null ? lLoginTime.hashCode() : 0);
        return result;
    }
}

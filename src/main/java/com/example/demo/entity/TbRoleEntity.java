package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * com.example.demo.entity
 *
 * @author zhaoguang
 * @date 2018/1/11 14:22
 * @description
 */
public class TbRoleEntity {
    private long rId;
    private String rName;
    private String rKey;
    private Integer rStatus;
    private String rDescription;
    private Timestamp rCreateTime;
    private Timestamp rUpdateTime;

    public long getrId() {
        return rId;
    }

    public void setrId(long rId) {
        this.rId = rId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbRoleEntity that = (TbRoleEntity) o;

        if (rId != that.rId) return false;
        if (rName != null ? !rName.equals(that.rName) : that.rName != null) return false;
        if (rKey != null ? !rKey.equals(that.rKey) : that.rKey != null) return false;
        if (rStatus != null ? !rStatus.equals(that.rStatus) : that.rStatus != null) return false;
        if (rDescription != null ? !rDescription.equals(that.rDescription) : that.rDescription != null) return false;
        if (rCreateTime != null ? !rCreateTime.equals(that.rCreateTime) : that.rCreateTime != null) return false;
        return rUpdateTime != null ? rUpdateTime.equals(that.rUpdateTime) : that.rUpdateTime == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (rId ^ (rId >>> 32));
        result = 31 * result + (rName != null ? rName.hashCode() : 0);
        result = 31 * result + (rKey != null ? rKey.hashCode() : 0);
        result = 31 * result + (rStatus != null ? rStatus.hashCode() : 0);
        result = 31 * result + (rDescription != null ? rDescription.hashCode() : 0);
        result = 31 * result + (rCreateTime != null ? rCreateTime.hashCode() : 0);
        result = 31 * result + (rUpdateTime != null ? rUpdateTime.hashCode() : 0);
        return result;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrKey() {
        return rKey;
    }

    public void setrKey(String rKey) {
        this.rKey = rKey;
    }

    public Integer getrStatus() {
        return rStatus;
    }

    public void setrStatus(Integer rStatus) {
        this.rStatus = rStatus;
    }

    public String getrDescription() {
        return rDescription;
    }

    public void setrDescription(String rDescription) {
        this.rDescription = rDescription;
    }

    public Timestamp getrCreateTime() {
        return rCreateTime;
    }

    public void setrCreateTime(Timestamp rCreateTime) {
        this.rCreateTime = rCreateTime;
    }

    public Timestamp getrUpdateTime() {
        return rUpdateTime;
    }

    public void setrUpdateTime(Timestamp rUpdateTime) {
        this.rUpdateTime = rUpdateTime;
    }


}

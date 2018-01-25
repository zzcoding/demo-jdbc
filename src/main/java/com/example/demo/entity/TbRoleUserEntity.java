package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * com.example.demo.entity
 *
 * @author zhaoguang
 * @date 2018/1/11 14:22
 * @description
 */
public class TbRoleUserEntity {
    private int id;
    private Integer rId;
    private Integer uId;
    private Timestamp tCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Timestamp gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(Timestamp tCreateTime) {
        this.tCreateTime = tCreateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbRoleUserEntity that = (TbRoleUserEntity) o;

        if (id != that.id) return false;
        if (rId != null ? !rId.equals(that.rId) : that.rId != null) return false;
        if (uId != null ? !uId.equals(that.uId) : that.uId != null) return false;
        if (tCreateTime != null ? !tCreateTime.equals(that.tCreateTime) : that.tCreateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (rId != null ? rId.hashCode() : 0);
        result = 31 * result + (uId != null ? uId.hashCode() : 0);
        result = 31 * result + (tCreateTime != null ? tCreateTime.hashCode() : 0);
        return result;
    }
}

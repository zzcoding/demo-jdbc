package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * com.example.demo.entity
 *
 * @author zhaoguang
 * @date 2018/1/11 14:22
 * @description
 */
public class TbResourcesRoleEntity {
    private int id;
    private Integer sId;
    private Integer rId;
    private Timestamp tCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
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

        TbResourcesRoleEntity that = (TbResourcesRoleEntity) o;

        if (id != that.id) return false;
        if (sId != null ? !sId.equals(that.sId) : that.sId != null) return false;
        if (rId != null ? !rId.equals(that.rId) : that.rId != null) return false;
        if (tCreateTime != null ? !tCreateTime.equals(that.tCreateTime) : that.tCreateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sId != null ? sId.hashCode() : 0);
        result = 31 * result + (rId != null ? rId.hashCode() : 0);
        result = 31 * result + (tCreateTime != null ? tCreateTime.hashCode() : 0);
        return result;
    }
}

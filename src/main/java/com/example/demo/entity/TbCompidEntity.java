package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * com.example.demo.entity
 *
 * @author zhaoguang
 * @date 2018/1/25 11:31
 * @description
 */
public class TbCompidEntity {
    private String comidA1A;
    private String comidB1B;
    private String name;
    private Timestamp cTime;

    public String getComidA1A() {
        return comidA1A;
    }

    public void setComidA1A(String comidA1A) {
        this.comidA1A = comidA1A;
    }

    public String getComidB1B() {
        return comidB1B;
    }

    public void setComidB1B(String comidB1B) {
        this.comidB1B = comidB1B;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getcTime() {
        return cTime;
    }

    public void setcTime(Timestamp cTime) {
        this.cTime = cTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCompidEntity that = (TbCompidEntity) o;

        if (comidA1A != null ? !comidA1A.equals(that.comidA1A) : that.comidA1A != null) return false;
        if (comidB1B != null ? !comidB1B.equals(that.comidB1B) : that.comidB1B != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (cTime != null ? !cTime.equals(that.cTime) : that.cTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = comidA1A != null ? comidA1A.hashCode() : 0;
        result = 31 * result + (comidB1B != null ? comidB1B.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cTime != null ? cTime.hashCode() : 0);
        return result;
    }
}

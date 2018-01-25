package com.example.demo.entity;

import java.io.Serializable;

/**
 * com.example.demo.entity
 *
 * @author zhaoguang
 * @date 2018/1/25 11:31
 * @description
 */
public class TbCompidEntityPK implements Serializable {
    private String comidA1A;
    private String comidB1B;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCompidEntityPK pk = (TbCompidEntityPK) o;

        if (comidA1A != null ? !comidA1A.equals(pk.comidA1A) : pk.comidA1A != null) return false;
        if (comidB1B != null ? !comidB1B.equals(pk.comidB1B) : pk.comidB1B != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = comidA1A != null ? comidA1A.hashCode() : 0;
        result = 31 * result + (comidB1B != null ? comidB1B.hashCode() : 0);
        return result;
    }
}

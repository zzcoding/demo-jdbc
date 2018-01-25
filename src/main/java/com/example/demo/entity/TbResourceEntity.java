package com.example.demo.entity;

import java.sql.Timestamp;

/**
 * com.example.demo.entity
 *
 * @author zhaoguang
 * @date 2018/1/11 14:22
 * @description
 */
public class TbResourceEntity {
    private int sId;
    private Integer sParentId;
    private String sName;
    private String sSourceKey;
    private int sType;
    private String sSourceUrl;
    private Integer sLevel;
    private String sIcon;
    private Integer sIsHide;
    private String sDescription;
    private Timestamp sCreateTime;
    private Timestamp sUpdateTime;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public Integer getsParentId() {
        return sParentId;
    }

    public void setsParentId(Integer sParentId) {
        this.sParentId = sParentId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSourceKey() {
        return sSourceKey;
    }

    public void setsSourceKey(String sSourceKey) {
        this.sSourceKey = sSourceKey;
    }

    public int getsType() {
        return sType;
    }

    public void setsType(int sType) {
        this.sType = sType;
    }

    public String getsSourceUrl() {
        return sSourceUrl;
    }

    public void setsSourceUrl(String sSourceUrl) {
        this.sSourceUrl = sSourceUrl;
    }

    public Integer getsLevel() {
        return sLevel;
    }

    public void setsLevel(Integer sLevel) {
        this.sLevel = sLevel;
    }

    public String getsIcon() {
        return sIcon;
    }

    public void setsIcon(String sIcon) {
        this.sIcon = sIcon;
    }

    public Integer getsIsHide() {
        return sIsHide;
    }

    public void setsIsHide(Integer sIsHide) {
        this.sIsHide = sIsHide;
    }

    public String getsDescription() {
        return sDescription;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public Timestamp getsCreateTime() {
        return sCreateTime;
    }

    public void setsCreateTime(Timestamp sCreateTime) {
        this.sCreateTime = sCreateTime;
    }

    public Timestamp getsUpdateTime() {
        return sUpdateTime;
    }

    public void setsUpdateTime(Timestamp sUpdateTime) {
        this.sUpdateTime = sUpdateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbResourceEntity that = (TbResourceEntity) o;

        if (sId != that.sId) return false;
        if (sType != that.sType) return false;
        if (sParentId != null ? !sParentId.equals(that.sParentId) : that.sParentId != null) return false;
        if (sName != null ? !sName.equals(that.sName) : that.sName != null) return false;
        if (sSourceKey != null ? !sSourceKey.equals(that.sSourceKey) : that.sSourceKey != null) return false;
        if (sSourceUrl != null ? !sSourceUrl.equals(that.sSourceUrl) : that.sSourceUrl != null) return false;
        if (sLevel != null ? !sLevel.equals(that.sLevel) : that.sLevel != null) return false;
        if (sIcon != null ? !sIcon.equals(that.sIcon) : that.sIcon != null) return false;
        if (sIsHide != null ? !sIsHide.equals(that.sIsHide) : that.sIsHide != null) return false;
        if (sDescription != null ? !sDescription.equals(that.sDescription) : that.sDescription != null) return false;
        if (sCreateTime != null ? !sCreateTime.equals(that.sCreateTime) : that.sCreateTime != null) return false;
        if (sUpdateTime != null ? !sUpdateTime.equals(that.sUpdateTime) : that.sUpdateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sId;
        result = 31 * result + (sParentId != null ? sParentId.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sSourceKey != null ? sSourceKey.hashCode() : 0);
        result = 31 * result + sType;
        result = 31 * result + (sSourceUrl != null ? sSourceUrl.hashCode() : 0);
        result = 31 * result + (sLevel != null ? sLevel.hashCode() : 0);
        result = 31 * result + (sIcon != null ? sIcon.hashCode() : 0);
        result = 31 * result + (sIsHide != null ? sIsHide.hashCode() : 0);
        result = 31 * result + (sDescription != null ? sDescription.hashCode() : 0);
        result = 31 * result + (sCreateTime != null ? sCreateTime.hashCode() : 0);
        result = 31 * result + (sUpdateTime != null ? sUpdateTime.hashCode() : 0);
        return result;
    }
}

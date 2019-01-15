package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Studentassignment {
    private Integer ljxTid;

    private String ljxTitle;

    private String ljxClass;

    private String ljxClasses;

    private Date ljxDatetime;

    private Date ljxDate;

    private Date ljxTime;

    private Integer ljxUid;

    private Integer ljxType;

    private String ljxWenjid;

    private Integer ljxJid;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    public Integer getLjxTid() {
        return ljxTid;
    }

    public void setLjxTid(Integer ljxTid) {
        this.ljxTid = ljxTid;
    }

    public String getLjxTitle() {
        return ljxTitle;
    }

    public void setLjxTitle(String ljxTitle) {
        this.ljxTitle = ljxTitle;
    }

    public String getLjxClass() {
        return ljxClass;
    }

    public void setLjxClass(String ljxClass) {
        this.ljxClass = ljxClass;
    }

    public String getLjxClasses() {
        return ljxClasses;
    }

    public void setLjxClasses(String ljxClasses) {
        this.ljxClasses = ljxClasses;
    }

    public Date getLjxDatetime() {
        return ljxDatetime;
    }

    public void setLjxDatetime(Date ljxDatetime) {
        this.ljxDatetime = ljxDatetime;
    }

    public Date getLjxDate() {
        return ljxDate;
    }

    public void setLjxDate(Date ljxDate) {
        this.ljxDate = ljxDate;
    }

    public String getLjxTime() {
    	return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ljxTime);
    }

    public void setLjxTime(Date ljxTime) {
        this.ljxTime = ljxTime;
    }

    public Integer getLjxUid() {
        return ljxUid;
    }

    public void setLjxUid(Integer ljxUid) {
        this.ljxUid = ljxUid;
    }

    public Integer getLjxType() {
        return ljxType;
    }

    public void setLjxType(Integer ljxType) {
        this.ljxType = ljxType;
    }

    public String getLjxWenjid() {
        return ljxWenjid;
    }

    public void setLjxWenjid(String ljxWenjid) {
        this.ljxWenjid = ljxWenjid;
    }

    public Integer getLjxJid() {
        return ljxJid;
    }

    public void setLjxJid(Integer ljxJid) {
        this.ljxJid = ljxJid;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }
}
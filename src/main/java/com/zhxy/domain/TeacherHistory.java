package com.zhxy.domain;

import java.util.Date;
import java.util.List;

public class TeacherHistory {
    private Integer id;

    private Integer pid;

    private Integer cid;

    private Date begin;

    private Date end;

    private Boolean isban;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;
    
    private List<Clazz> list;
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Boolean getIsban() {
        return isban;
    }

    public void setIsban(Boolean isban) {
        this.isban = isban;
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

	public List<Clazz> getList() {
		return list;
	}

	public void setList(List<Clazz> list) {
		this.list = list;
	}
}
package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WhetherAccomplish {
    private Integer ljxwid;

    private Integer ljxtid;

    private String ljxyesno;

    private Integer ljxuid;

    private Date ljxdate;

    private String name1;

    private String name2;

    private String name3;

    private String name4;

    private String name5;
    
    private List<Studentassignment> stulist;
    
    private List<CpStudent> cpstudent;

    public List<CpStudent> getCpstudent() {
		return cpstudent;
	}

	public void setCpstudent(List<CpStudent> cpstudent) {
		this.cpstudent = cpstudent;
	}

	public Integer getLjxwid() {
        return ljxwid;
    }

    public void setLjxwid(Integer ljxwid) {
        this.ljxwid = ljxwid;
    }

    public Integer getLjxtid() {
        return ljxtid;
    }

    public void setLjxtid(Integer ljxtid) {
        this.ljxtid = ljxtid;
    }

    public String getLjxyesno() {
        return ljxyesno;
    }

    public void setLjxyesno(String ljxyesno) {
        this.ljxyesno = ljxyesno;
    }

    public Integer getLjxuid() {
        return ljxuid;
    }

    public void setLjxuid(Integer ljxuid) {
        this.ljxuid = ljxuid;
    }

    public String getLjxdate() {
         return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ljxdate);
    }

    public void setLjxdate(Date ljxdate) {
        this.ljxdate = ljxdate;
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

	public List<Studentassignment> getStulist() {
		return stulist;
	}

	public void setStulist(List<Studentassignment> stulist) {
		this.stulist = stulist;
	}
	
	public WhetherAccomplish() {
		this.ljxdate=new Date();
	}
}
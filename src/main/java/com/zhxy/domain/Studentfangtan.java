package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Studentfangtan {
	
    private Integer id;

    private Integer studentid;

    private String content;

    private Date date;
    
    private String dateStr;

    private String time;
    
    public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public String getTime() {
		return time;
	}

	public void setTime(Date date) {
		SimpleDateFormat  datatime =  new SimpleDateFormat("yyyy年MM月dd日");
		this.time = datatime.format(date);
	}
    
    private Integer staffid;

    private String name3;

    private String name4;

    private String name5;
    
    private Integer fangtanstatus;
      
    private CpStudent stuname;
    
    private CpStaff staname;
    
    private FangtanType stype;

    
    
	public Integer getFangtanstatus() {
		return fangtanstatus;
	}

	public void setFangtanstatus(Integer fangtanstatus) {
		this.fangtanstatus = fangtanstatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		this.setTime(date);
	}

	public Integer getStaffid() {
		return staffid;
	}

	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
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

	public CpStudent getStuname() {
		return stuname;
	}

	public void setStuname(CpStudent stuname) {
		this.stuname = stuname;
	}

	public CpStaff getStaname() {
		return staname;
	}

	public void setStaname(CpStaff staname) {
		this.staname = staname;
	}

	public FangtanType getStype() {
		return stype;
	}

	public void setStype(FangtanType stype) {
		this.stype = stype;
	}
    
    

   
}
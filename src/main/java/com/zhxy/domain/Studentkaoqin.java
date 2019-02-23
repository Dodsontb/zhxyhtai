package com.zhxy.domain;

import java.text.SimpleDateFormat;
import java.util.*;

public class Studentkaoqin {
	
    private Integer id;

    private Integer studentid;  //学生ID

    private Integer kaoqinstatus;//考勤状态
    
    private Date date;
    
    private String time;

    public String getTime() {
		return time;
	}

	public void setTime(Date date) {
		SimpleDateFormat  datatime =  new SimpleDateFormat("yyyy年MM月dd日");
		this.time = datatime.format(date);
	}

	private Integer classid;  //班级ID

    private String staffname;  //班主任姓名

    private String name3;

    private String name4;

    private String name5;
    
    
    private CpStudent stuname; 
    
    private Statuastype status;
    
    private Classs className;

    
    
	public CpStudent getStuname() {
		return stuname;
	}

	public void setStuname(CpStudent stuname) {
		this.stuname = stuname;
	}

	public Statuastype getStatus() {
		return status;
	}

	public void setStatus(Statuastype status) {
		this.status = status;
	}

	public Classs getClassName() {
		return className;
	}

	public void setClassName(Classs className) {
		this.className = className;
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

	public Integer getKaoqinstatus() {
		return kaoqinstatus;
	}

	public void setKaoqinstatus(Integer kaoqinstatus) {
		this.kaoqinstatus = kaoqinstatus;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		this.setTime(date);
	}

	public Integer getClassid() {
		return classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
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
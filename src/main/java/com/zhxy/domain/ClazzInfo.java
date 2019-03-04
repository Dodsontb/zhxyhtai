package com.zhxy.domain;

import java.util.List;

import com.zhxy.utils.MyUtils;

public class ClazzInfo {

	private int id;
	
	private String name;
	
	private Grade grade;
	
	private Major major;

	private List<Student> allStudents;
	
	private List<Data> sexs;
	
	private List<Data> ages;
	
	private List<Data> edus;
	
	private int pagenum;
	
	private String date;
	
	private String start;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public List<Student> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(List<Student> allStudents) {
		this.allStudents = allStudents;
		this.pagenum=allStudents.size()%10==0?allStudents.size()/10:allStudents.size()/10+1;
		this.sexs=MyUtils.sexData(allStudents);
		this.ages=MyUtils.ageDatas(allStudents);
		this.edus=MyUtils.eduData(allStudents);
	}

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	public List<Data> getSexs() {
		return sexs;
	}

	public void setSexs(List<Data> sexs) {
		this.sexs = sexs;
	}

	public List<Data> getAges() {
		return ages;
	}

	public void setAges(List<Data> ages) {
		this.ages = ages;
	}

	public List<Data> getEdus() {
		return edus;
	}

	public void setEdus(List<Data> edus) {
		this.edus = edus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
		this.start=MyUtils.dayAfter(date, 3);
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

}

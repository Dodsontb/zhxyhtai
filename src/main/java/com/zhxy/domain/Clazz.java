package com.zhxy.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Clazz implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Integer cid;
	private Integer tid;
	private String name;
	private Grade grade;
	private People teacher;
	private People nowTeacher;
	private People ban;
	@DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8") 
	private Date begin;
	private Version version;
	private Student monitor;
	private Curriculum curr;
	private Curriculum nowCurr;
	private int planNum;
	private int weekNum;
	private int num;
	private int people;
	private Plan am;
	private Plan pm;
	private Major major;
	private List<Student> students;
	private List<Plan> plans;
	private Event event;
	private boolean finish;
	private Integer bid;
	private Integer teacherid;
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(Integer teacherid) {
		this.teacherid = teacherid;
	}
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
	public People getTeacher() {
		return teacher;
	}
	public void setTeacher(People teacher) {
		this.teacher = teacher;
	}
	public Curriculum getCurr() {
		return curr;
	}
	public void setCurr(Curriculum curr) {
		this.curr = curr;
	}
	
	public Clazz() {
		this.name="";
		this.curr=new Curriculum();
		this.teacher=new People();
		this.tid=null;
		this.cid=null;
	}
	public Clazz(Clazz clazz) {
		// TODO Auto-generated constructor stub
		this.id=clazz.getId();
		this.name=clazz.getName();
		this.teacher=clazz.getTeacher();
		this.curr=clazz.getCurr();
		this.grade=clazz.getGrade();
	}
	public int getPlanNum() {
		return planNum;
	}
	public void setPlanNum(int planNum) {
		this.planNum = planNum;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Plan getAm() {
		return am;
	}
	public void setAm(Plan am) {
		this.am = am;
	}
	public Plan getPm() {
		return pm;
	}
	public void setPm(Plan pm) {
		this.pm = pm;
	}
	public List<Plan> getPlans() {
		return plans;
	}
	public void setPlans(List<Plan> plans) {
		this.plans = plans;
		for (Plan plan : plans) {
			if(plan.isAp()) {
				this.pm=plan;
			}else {
				this.am=plan;
			}
		}
	}
	public int getWeekNum() {
		return weekNum;
	}
	public void setWeekNum(int weekNum) {
		this.weekNum = weekNum;
	}
	public Event getEvent() {
		return event;
	}
	
	public void setEvent(Event event) {
		this.event = event;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public People getBan() {
		return ban;
	}
	public void setBan(People ban) {
		this.ban = ban;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
	public Student getMonitor() {
		return monitor;
	}
	public void setMonitor(Student monitor) {
		this.monitor = monitor;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Curriculum getNowCurr() {
		return nowCurr;
	}
	public void setNowCurr(Curriculum nowCurr) {
		this.nowCurr = nowCurr;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public People getNowTeacher() {
		return nowTeacher;
	}
	public void setNowTeacher(People nowTeacher) {
		this.nowTeacher = nowTeacher;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
}

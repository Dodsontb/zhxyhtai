package com.zhxy.domain;

import java.io.Serializable;
import java.util.List;

public class People implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String allname;
	private int rid;
	private String role;
	private int position;
	private List<People> peoples;
	
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
		this.allname=name;
		this.name = name.length()>4?name.substring(0, 4)+".. ":name+" ";
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	public People() {
		this.name="";
		this.id=-1;
	}
	public List<People> getPeoples() {
		return peoples;
	}
	public void setPeoples(List<People> peoples) {
		this.peoples = peoples;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getAllname() {
		return allname;
	}
	public void setAllname(String allname) {
		this.allname = allname;
	}
}

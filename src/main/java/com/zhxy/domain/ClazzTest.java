package com.zhxy.domain;

import java.util.List;

public class ClazzTest {

	private int id;
	
	private List<Student> cores;
	
	private List<Student> fails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Student> getCores() {
		return cores;
	}

	public void setCores(List<Student> cores) {
		this.cores = cores;
	}

	public List<Student> getFails() {
		return fails;
	}

	public void setFails(List<Student> fails) {
		this.fails = fails;
	}
}

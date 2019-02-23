package com.zhxy.domain;

import java.util.List;

import com.zhxy.domain.CpStudent;

public class StuListData {
	
	private List<CpStudent> stuList;

	public List<CpStudent> getStuList() {
		return stuList;
	}

	public void setStuList(List<CpStudent> stuList) {
		this.stuList = stuList;
	}

	public StuListData(List<CpStudent> stuList) {
		super();
		this.stuList = stuList;
	}
	
}

package com.zhxy.domain;

import java.util.List;

public class ExamStatistim {
	private Integer id;
	
	private List<KSeriesData> ksDataList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKsDataList() {
		for (KSeriesData data : ksDataList) {
			
		}
		return "";
	}

	public void setKsDataList(List<KSeriesData> ksDataList) {
		this.ksDataList = ksDataList;
	}
	
	
}

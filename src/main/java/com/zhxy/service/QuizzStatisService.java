package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.CpStudent;
import com.zhxy.domain.BarStatisData;

public interface QuizzStatisService {
	
	public BarStatisData queryQuizzCount(Integer stuid);
	
	public BarStatisData queryDailyCount(Integer classid);

	public List<CpStudent> getStuList();
}

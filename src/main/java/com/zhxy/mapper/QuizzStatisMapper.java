package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.CpStudent;
import com.zhxy.domain.BarStatisData;
@Mapper
public interface QuizzStatisMapper {

	public BarStatisData queryQuizzCount(Integer stuid);
	public BarStatisData queryDailyCount(Integer classid);
	public List<CpStudent> getStuList();
}

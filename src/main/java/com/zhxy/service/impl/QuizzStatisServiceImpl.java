package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.QuizzStatisMapper;
import com.zhxy.domain.CpStudent;
import com.zhxy.domain.BarStatisData;
import com.zhxy.service.QuizzStatisService;

@Service
public class QuizzStatisServiceImpl implements QuizzStatisService {

	@Autowired
	QuizzStatisMapper qsMapper;
	
	@Override
	public BarStatisData queryQuizzCount(Integer stuid) {
		return qsMapper.queryQuizzCount(stuid);
	}

	public List<CpStudent> getStuList(){
		return qsMapper.getStuList();
	}
	
	public BarStatisData queryDailyCount(Integer classid) {
		return qsMapper.queryDailyCount(classid);
	}
}

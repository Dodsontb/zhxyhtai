package com.zhxy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.ExamStatisMapper;
import com.alibaba.fastjson.JSON;
import com.zhxy.domain.BarChartArisData;
import com.zhxy.domain.KSeriesData;
import com.zhxy.domain.LearningClazzVO;
import com.zhxy.domain.Template;
import com.zhxy.service.ExamStatisService;

@Service
public class ExamStatisServiceImpl implements ExamStatisService{

	@Autowired
	ExamStatisMapper examMapper;
	
	@Override
	public List<KSeriesData> queryKSeriesData(){
		return examMapper.queryKSeriesDataByTemplateId(11);
	}
	
	@Override
	public List<KSeriesData> queryKSeriesDataByClassId(Integer classId){
		return examMapper.queryKSeriesDataByClassId(classId);
	}
	
	public List<KSeriesData> queryKSeriesDataByTemplateId(Integer templateId){
		return examMapper.queryKSeriesDataByTemplateId(templateId);
	}
	
	public BarChartArisData queryLearningCountBySimpleTid(Template template) {
		return examMapper.queryLearningCountBySimpleTid(template);
	}

	public List<LearningClazzVO> queryLearningClazzByTemplateId(Integer templateId){
		return examMapper.queryLearningClazzByTemplateId(templateId);
	}
}

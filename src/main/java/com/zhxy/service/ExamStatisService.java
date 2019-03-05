package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.BarChartArisData;
import com.zhxy.domain.KSeriesData;
import com.zhxy.domain.LearningClazzVO;
import com.zhxy.domain.Template;

public interface ExamStatisService {
	public List<KSeriesData> queryKSeriesData();
	public List<KSeriesData> queryKSeriesDataByClassId(Integer classId);
	public List<KSeriesData> queryKSeriesDataByTemplateId(Integer templateId);
	public BarChartArisData queryLearningCountBySimpleTid(Template template);
	public List<LearningClazzVO> queryLearningClazzByTemplateId(Integer templateId);
}

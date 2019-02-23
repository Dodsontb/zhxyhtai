package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.KSeriesData;

public interface ExamStatisService {
	public List<KSeriesData> queryKSeriesData();
	public List<KSeriesData> queryKSeriesDataByClassId(Integer classId);
	public List<KSeriesData> queryKSeriesDataByTemplateId(Integer templateId);
}

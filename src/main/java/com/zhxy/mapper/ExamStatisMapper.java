package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.BarChartArisData;
import com.zhxy.domain.KSeriesData;
import com.zhxy.domain.LearningClazzVO;
import com.zhxy.domain.Template;
import com.zhxy.domain.TemplateListVO;
@Mapper
public interface ExamStatisMapper {
	public List<KSeriesData> queryKSeriesData(List<Integer> temlist);
	public List<KSeriesData> queryKSeriesDataByClassId(Integer classId);
	public List<KSeriesData> queryKSeriesDataByTemplateId(Integer templateId);
	public BarChartArisData queryLearningCountBySimpleTid(Template template);
	public List<LearningClazzVO> queryLearningClazzByTemplateId(Integer templateId);
	public List<TemplateListVO> queryLearningListByName(String param);
}

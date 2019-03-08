package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zhxy.domain.BarChartArisData;
import com.zhxy.domain.ChartData;
import com.zhxy.domain.KSeriesData;
import com.zhxy.domain.LearningClazzVO;
import com.zhxy.domain.Template;
import com.zhxy.domain.TemplateListVO;
import com.zhxy.service.ExamStatisService;

@Controller
public class ExamStatisController {
	
	@Autowired
	ExamStatisService ess;
	
	@RequestMapping("/getKSChart_easy")
	@ResponseBody
	public ChartData getKSChart_easy() {
		ChartData chartData = new ChartData(ess.queryKSeriesData());
		return chartData;
	}
	
	@RequestMapping("/getKSChart")
	@ResponseBody
	public ChartData getKSChart() {
		ChartData chartData = new ChartData(ess.queryKSeriesData());
		return chartData;
	}
	
	@RequestMapping("/getKSChartByClassId")
	@ResponseBody
	public ChartData getKSChartByClassId(Integer id) {
		ChartData chartData = new ChartData(ess.queryKSeriesDataByClassId(id));
		return chartData;
	}
	
	@RequestMapping("/getKSChartByTemplateId")
	@ResponseBody
	public ChartData getKSChartByTemplateId(Integer id) {
		ChartData chartData = new ChartData(ess.queryKSeriesDataByTemplateId(id));
		return chartData;
	}
	
	@RequestMapping("/getLearningCountBySimpleTid")
	@ResponseBody
	public BarChartArisData queryLearningCountBySimpleTid(Template template) {
		if (template==null) {
			template = new Template();
		}
		return ess.queryLearningCountBySimpleTid(template);
	}
	
	@RequestMapping("/getLearningClazzByTemplateId")
	@ResponseBody
	public List<LearningClazzVO> queryLearningClazzByTemplateId(Integer templateId) {
		return ess.queryLearningClazzByTemplateId(templateId);
	}
	
	@RequestMapping("/getLearningListByName")
	@ResponseBody
	public List<TemplateListVO> queryLearningListByName(String param) {
		return ess.queryLearningListByName(param);
	}
}

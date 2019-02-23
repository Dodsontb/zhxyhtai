package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.ChartData;
import com.zhxy.domain.KSeriesData;
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
}
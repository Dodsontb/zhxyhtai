package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.BarStatisData;
import com.zhxy.domain.ChartData;
import com.zhxy.domain.KSeriesData;
import com.zhxy.service.ExamStatisService;

@Controller
public class PageForwardStatisController {
	
	@RequestMapping("/StatisticsMainPage")
	public String StatisticsMainPage() {
		return "lyl/StatisticsMainPage";
	}
	
	@RequestMapping("/ExamPage")
	public String ExamPage() {
		return "lyl/ExamPage";
	}
	
	@RequestMapping("/ExamSearch")
	public String ExamSearch() {
		return "lyl/ExamSearch";
	}
	
	@RequestMapping("/ClassPage")
	public String ClassPage() {
		return "lyl/ClassPage";
	}
	
	@RequestMapping("/ClazzExtra")
	public String ClazzExtra() {
		return "lyl/ClazzExtra";
	}
	
	@RequestMapping("/ClazzPage")
	public String ClazzPage() {
		return "lyl/ClazzPage";
	}
	
	@RequestMapping("/DailyExtra")
	public String DailyExtra() {
		return "lyl/DailyExtra";
	}
	
	@RequestMapping("/DailyPage")
	public String DailyPage() {
		return "lyl/DailyPage";
	}
	
	@RequestMapping("/InternalPage")
	public String InternalPage() {
		return "lyl/InternalPage";
	}
	
	@RequestMapping("/MyClass-stu")
	public String MyClass_stu() {
		return "lyl/MyClass-stu";
	}
	
	@RequestMapping("/MyClass-tea")
	public String MyClass_tea() {
		return "lyl/MyClass-tea";
	}
	
	@RequestMapping("/MyClazz")
	public String MyClazz() {
		return "lyl/MyClazz";
	}
	
	@RequestMapping("/MyDaily")
	public String MyDaily() {
		return "lyl/MyDaily";
	}
	
	@RequestMapping("/MyExam")
	public String MyExam() {
		return "lyl/MyExam";
	}
	
	@RequestMapping("/QuestionPage")
	public String QuestionPage() {
		return "lyl/QuestionPage";
	}
	
	@RequestMapping("/KSeriesChart")
	public String KSeriesChart() {
		return "lyl/KSeriesChart";
	}
	
	@RequestMapping("/BarChart")
	public String BarChart() {
		return "lyl/BarChart";
	}
	
	@RequestMapping("/ExamDetail")
	public String ExamDetail() {
		return "lyl/ExamDetail";
	}
	
	
	//测试用
	@RequestMapping("/BarChart2")
	public String BarChart2() {
		return "lyl/BarChart2";
	}
	
	//测试用
		@RequestMapping("/BarChart3")
		public String BarChart3() {
			return "lyl/BarChart3";
		}
		
		
		@RequestMapping("/LineChart")
		public String LineChart() {
			
			
			return "lyl/LineChart";
		}
	/*
	
	
	
	
	@RequestMapping("/KSeriesChart")
	public String KSChart() {
		return "KSeriesChart";
	}
	
	@RequestMapping("/KSeriesChart")
	public String KSChart() {
		return "KSeriesChart";
	}
	
	@RequestMapping("/KSeriesChart")
	public String KSChart() {
		return "KSeriesChart";
	}
	
	@RequestMapping("/KSeriesChart")
	public String KSChart() {
		return "KSeriesChart";
	}
	
	@RequestMapping("/KSeriesChart")
	public String KSChart() {
		return "KSeriesChart";
	}*/
}

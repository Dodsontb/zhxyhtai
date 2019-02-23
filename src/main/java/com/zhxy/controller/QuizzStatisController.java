package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.KSeriesData;
import com.zhxy.domain.BarStatisData;
import com.zhxy.domain.StuListData;
import com.zhxy.service.QuizzStatisService;


@Controller
public class QuizzStatisController {

	@Autowired
	QuizzStatisService qss;

	
	@RequestMapping("/getBarChart_easy")
	@ResponseBody
	public String getBarChart_easy() {
		Integer stuid = 121;
		BarStatisData qs = qss.queryQuizzCount(stuid);
		System.out.println(qs.getStuid()+","+qs.getQuizzCountList());
		return "["+qs.getQuizzCountList()+"]";
	}
	
	@RequestMapping("/getBarChart")
	@ResponseBody
	public String getBarChart(String key, Integer id) {
		if ("quizzcount".equals(key)) {			
			BarStatisData qs = qss.queryQuizzCount(id);
			/*System.out.println(qs.getStuid()+","+qs.getQuizzCountList());*/
			return "[["+qs.getQuizzCountList()+"],["+qs.getQuizzCountUncList()+"]]";
		} else if ("dailycount".equals(key)) {
			BarStatisData qs = qss.queryDailyCount(id);
			/*System.out.println(qs.getStuid()+","+qs.getQuizzCountList());*/
		}
		return null;
	}
	
	@RequestMapping("/getQuizzCount")
	@ResponseBody
	public BarStatisData getQuizzCount(Integer stuid) {
		return qss.queryQuizzCount(stuid);
	}
	
	//获取学生编号，可能会重复
	@RequestMapping("/getStuList")
	@ResponseBody
	public StuListData getStuList() {
		return new StuListData(qss.getStuList());
		
	}
}

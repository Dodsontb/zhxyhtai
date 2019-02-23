package com.zhxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.BarStatisListData;
import com.zhxy.domain.ChartData;
import com.zhxy.service.KaoqinStatisService;

@Controller
public class KaoqinStatisController {

	@Autowired
	KaoqinStatisService kss;
	
	@RequestMapping("/getKaoqinStatisByClassId")
	@ResponseBody
	public BarStatisListData getKaoqinStatisByClassId(String classId, String dateCondition, String date1, String date2) {
		return kss.queryKaoqinStatisByClassId(classId, dateCondition, date1, date2);
		
	}
}

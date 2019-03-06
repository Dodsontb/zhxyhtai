package com.zhxy.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Record;
import com.zhxy.domain.Softtype;
import com.zhxy.service.Softtypeservice;
import com.zhxy.service.recordservice;

@Controller
public class recordController {

	
	@Autowired
	recordservice rr;
	@RequestMapping("insertSelective")
	@ResponseBody
	public  int insertSelective(Record record) {
		System.out.println();
		return rr.insertSelective(record);
	}
	
	@RequestMapping("insertxuan")
	@ResponseBody
	public int insertxuan(@RequestBody List<Record> record) {
		return rr.insertxuan(record);
	}
}

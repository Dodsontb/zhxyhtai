package com.zhxy.controller;

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
	
	
	@RequestMapping("updata_scorex")
	@ResponseBody
	public int updata_scorex(Record record) {
		return rr.updata_scorex(record);
	}
	@RequestMapping("updata_scoret")
	@ResponseBody
	public int updata_scoret(Record record) {
		return rr.updata_scoret(record);
	}
	@RequestMapping("updata_scorey")
	@ResponseBody
	public int updata_scorey(Record record) {
		return rr.updata_scorey(record);
	}
	@RequestMapping("selectxuan")
	@ResponseBody
	public List<Record> selectxuan(Record record) {
		return rr.selectxuan(record);
	}
}

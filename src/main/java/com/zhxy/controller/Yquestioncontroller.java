package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Yquestion;
import com.zhxy.service.Yquestionservice;
@Controller
public class Yquestioncontroller {

	@Autowired
	Yquestionservice ys;
	
	@RequestMapping("queryYquestion")
	@ResponseBody
	public List<Yquestion> queryYquestion(int qid) {
		List<Yquestion> list = ys.queryYquestion(qid);
		return list;
	}
	@RequestMapping("insertYquestion")
	@ResponseBody
	public int insertYquestion(Yquestion record) {
		return ys.insertYquestion(record);
	}
	//错题+1
	@RequestMapping("updataYquestion")
	@ResponseBody
	public int updataYquestion(int id) {
		return ys.updataYquestion(id);
	}
}

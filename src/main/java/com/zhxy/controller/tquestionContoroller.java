package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Tquestion;
import com.zhxy.service.Tquestionservice;
@Controller
public class tquestionContoroller {

	@Autowired
	Tquestionservice ts;
	
	@RequestMapping("queryTquestion")
	@ResponseBody
	public List<Tquestion> queryTquestion(int qid) {
		return ts.queryTquestion(qid);
	}
	@RequestMapping("insertTquestion")
	@ResponseBody
	public int insertTquestion(Tquestion record) {
		return ts.insertTquestion(record);
	}
	//错题+1
	@RequestMapping("updateTquestion")
	@ResponseBody
	public int updateTquestion(int id) {
		return ts.updateTquestion(id);
	}
}

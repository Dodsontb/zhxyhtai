package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Cquestion;
import com.zhxy.domain.Questionbank;
import com.zhxy.service.Cquestionservice;
import com.zhxy.service.Questionbankservice;
@Controller
public class cquestionController {

	@Autowired
	Cquestionservice ct;
	
	@RequestMapping("queryCquestion")
	@ResponseBody
	public List<Cquestion> queryCquestion(int qid) {
		return ct.queryCquestion(qid);
	}
	
	@RequestMapping("insertCquestion")
	@ResponseBody
	public int insertCquestion(Cquestion obj) {
		System.out.println();
		return ct.insertCquestion(obj);
	}
}

package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Cquestion;
import com.zhxy.domain.Softtype;
import com.zhxy.service.Cquestionservice;
import com.zhxy.service.Softtypeservice;

@Controller
public class softtypecontroller {

	@Autowired
	Softtypeservice ss;
	@RequestMapping("query")
	@ResponseBody
	public  List<Softtype> query() {
		System.out.println();
		return ss.query();
	}
}

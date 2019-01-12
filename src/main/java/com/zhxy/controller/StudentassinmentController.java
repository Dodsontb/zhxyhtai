package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Studentassignment;
import com.zhxy.domain.WhetherAccomplish;
import com.zhxy.service.Service_Studentassinment;
import com.zhxy.service.Service_WhetherAccomplish;

@Controller
public class StudentassinmentController {

	public StudentassinmentController() {
		System.out.println("StudentAssinment>>>>>>>>");
	}
	
	
	@Autowired
	Service_Studentassinment ser;
	
	@Autowired
	Service_WhetherAccomplish serW;
	
	@RequestMapping("/yiyi")
	public String b() {
		return "studentassinment";
	}
	
	@RequestMapping("/query")
	@ResponseBody
	public List<Studentassignment> stuquery() {
		List<Studentassignment> list = ser.stuquery();
		for (Studentassignment b : list) {
			System.out.println(b.getLjxTitle());
		}
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("/whetherstu")
	@ResponseBody
	public List<WhetherAccomplish> whetherstu(){
		List<WhetherAccomplish> list = serW.whether();
		System.out.println(list);
		return list;
	}
}

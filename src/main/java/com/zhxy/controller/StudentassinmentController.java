package com.zhxy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhxy.service.Service_Studentassinment;

@Controller
public class StudentassinmentController {

	public StudentassinmentController() {
		System.out.println("StudentAssinment>>>>>>>>");
	}
	
	
	@Autowired
	Service_Studentassinment ser;
	
	@RequestMapping("yiyi")
	public String b() {
		System.out.println("nima>>>>>>>>>>>>>>>>>>>>.");
		return "ljxfabu/Studentassinment";
	}
	
	/*@RequestMapping("/query")
	@ResponseBody
	public List<Studentassignment> stuquery() {
		List<Studentassignment> list = ser.stuquery();
		for (Studentassignment b : list) {
			System.out.println(b.getLjxTitle());
		}
		System.out.println(list);
		return list;
	}*/
}

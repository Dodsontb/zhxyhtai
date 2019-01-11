package com.zhxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/UO")
public class UO {

	@RequestMapping("/aaa")
	public String aaa() {
		return "write";
	}
	
	@RequestMapping("/bbb")
	@ResponseBody
	public String bbb() {
		return "{'a':'123'}";
		
		
	}
}

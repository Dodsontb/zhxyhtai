package com.zhxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UO {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/bbb")
	@ResponseBody
	public String bbb() {
		return "{'a':'123'}";
		
		
	}
}

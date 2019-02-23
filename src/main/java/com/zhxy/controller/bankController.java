package com.zhxy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhxy.domain.Questionbank;
import com.zhxy.service.Questionbankservice;
@Controller
public class bankController {

	@Autowired
	Questionbankservice qk;
	
	@RequestMapping("/selectByid")
	public Questionbank selectByid(int pid) {
		return qk.selectByid(pid);
	}
}

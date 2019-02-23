package com.zhxy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.CpUser;
import com.zhxy.service.cpUserservice;

@Controller
public class UO {

	
	@Autowired
	cpUserservice cus;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/choosing")
	public String choosing() {
		return "choosing";
	}
	
	@RequestMapping("/typo")
	public String typo() {
		return "typo";
	}
	
	@RequestMapping("/questions")
	public String questions() {
		return "questions";
	}
	
	@RequestMapping("/bbb")
	@ResponseBody
	public String bbb() {
		return "{'a':'123'}";
	}
	
	@RequestMapping("/tologin")
	public String tologin(String username,String password,HttpSession session) {
		CpUser userinfo=cus.login(username, password);
		
		if(userinfo!=null) {
			System.out.println("登录成功");
			session.setAttribute("user", userinfo);
			
			return "redirect:cp_index";
		}else {
			System.out.println("登录失败");
		}
		CpUser cc=(CpUser)session.getAttribute("user");
		System.out.println(cc);
		return null;
	}
	
	@RequestMapping("cp_index")
	public String cp_index(HttpSession session) {
		return "cp_index";
	}
	@RequestMapping("selectTest")
	public String selectTest() {
		return "selectTest";
	}
	
	@RequestMapping("cp_select")
	public String cp_select(String templateid,Model model) {
		model.addAttribute("templateid",templateid);
		return "cp_select";
	}
	
}

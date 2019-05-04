package com.zhxy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zhxy.domain.CpUser;
import com.zhxy.domain.Section;
import com.zhxy.domain.StuClazz;
import com.zhxy.mapper.StuClazzMapper;
import com.zhxy.service.SectionService;
import com.zhxy.service.cpUserservice;

@Controller
public class UO {

	
	@Autowired
	cpUserservice cus;
	@Autowired
	SectionService sectionService;
	@Autowired
	StuClazzMapper sm;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/choosing")
	public String choosing() {
		return "choosing";
	}
	
	@RequestMapping("/typo")
	public String typo(Integer templateid,Integer uid,HttpSession session) {
		session.setAttribute("templateid", templateid);
		session.setAttribute("uid", uid);
		return "redirect:typo";
	}
	
	@RequestMapping("/correct")
	public String correct() {
		return "correct";
	}
	
	@RequestMapping("/questions")
	public String questions() {
		return "questions";
	}
	@RequestMapping("/stu_ling")
	public String stu_ling() {
		return "stu_ling";
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
	
	@RequestMapping("/cp_index")
	public String cp_index(HttpSession session) {
		return "cp_index";
	}

	@RequestMapping("/selectTest")
	public String selectTest() {
		return "selectTest";
	}
	//后台获取sission对象
	@RequestMapping("/getcpusersission")
	@ResponseBody
	public CpUser getsission(HttpSession session) {
		System.out.println("静茹");
		CpUser u=(CpUser) session.getAttribute("user");
		System.out.println(JSON.toJSONString(u));
		return u;
	}
	
	@RequestMapping("/cp_select")
	public String cp_select(String templateid,Model model) {
		model.addAttribute("templateid",templateid);
		return "cp_select";
	}
	
	@RequestMapping("querySection")
	@ResponseBody
	public List<Section> querySections(Integer gid,Integer mid,Integer cid){
		return sectionService.query(gid, mid, cid);
	}
	//根据班级id查询所有学生
	@RequestMapping("clazzbysid")
	@ResponseBody
	public List<StuClazz> clazzbysid(Integer cid){
		return sm.clazzbysid(cid);
	}
	
}

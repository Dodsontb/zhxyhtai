package com.zhxy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Template;
import com.zhxy.service.Templateservice;

@Controller
public class Templatecontroller {

	@Autowired
	Templateservice ts;
	@RequestMapping("queryTemplate")
	@ResponseBody
	public Template queryTemplate(int id) {
		return ts.queryTemplate(id);
	}
	@RequestMapping("insertTemplate")
	@ResponseBody
	public int insertTemplate(Template record) {
		return ts.insertTemplate(record);
	}
	//List<Template> querybytype(Integer softtypeid);
	@RequestMapping("querybytype")
	@ResponseBody
	public List<Template> querybytype(Integer softtypeid) {
		return ts.querybytype(softtypeid);
	}
	//查询全部laila
	@RequestMapping("cp_queryall")
	@ResponseBody
	public List<Template> cp_queryall() {
		return ts.cp_queryall();
	}
	//按班级查询
	@RequestMapping("cp_querybyname1")
	@ResponseBody
	public List<Template> cp_querybyname1(String name1) {
		System.out.println("laila");
		return ts.cp_querybyname1(name1);
	}
}

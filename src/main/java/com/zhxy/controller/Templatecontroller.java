package com.zhxy.controller;


import java.util.Date;
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
		Date d=new Date();
		int y=d.getYear()+1900;
		int m=d.getMonth()+1;
		int day=d.getDate();
		int h=d.getHours();
		int mi=d.getMinutes();
		int s=d.getSeconds();
		String goudan=y+"-"+m+"-"+day+" "+h+":"+mi+":"+s; 
		System.out.println("当前系统时间"+goudan);
		record.setCreation(goudan);
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
	public List<Template> cp_queryall(String name2) {
		return ts.cp_queryall(name2);
	}
	//按班级查询
	@RequestMapping("cp_querybyname1")
	@ResponseBody
	public List<Template> cp_querybyname1(String name1) {
		System.out.println("laila");
		return ts.cp_querybyname1(name1);
	}
	//List<Template> cp_querycquestion(Integer id)
	//List<Template> cp_querytquestion(Integer id)
	//List<Template> cp_queryyquestion(Integer id)
	//查询一张模板的选择题试卷
	//选择题
	@RequestMapping("cp_querycquestion")
	@ResponseBody
	public Template cp_querycquestion(Integer id) {
		return ts.cp_querycquestion(id);
	}
	//填空题
	@RequestMapping("cp_querytquestion")
	@ResponseBody
	public Template cp_querytquestion(Integer id) {
		return ts.cp_querytquestion(id);
	}
	//应用题
	@RequestMapping("cp_queryyquestion")
	@ResponseBody
	public Template cp_queryyquestion(Integer id) {
		return ts.cp_queryyquestion(id);
	}
}

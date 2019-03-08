package com.zhxy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.ClazzTest;
import com.zhxy.domain.MyNotice;
import com.zhxy.domain.Student;
import com.zhxy.service.ClazzService;
import com.zhxy.service.StudentService;

@ResponseBody
@Controller
@RequestMapping("ajax/page")
@SuppressWarnings("all")
public class PageController {
	
	@Autowired
	StudentService studentService;
	@Autowired
	ClazzService clazzService;
	@Autowired
	HttpSession session;
	
	@RequestMapping("/mynotice")
	public PageInfo<MyNotice> notices(int id,int page){
		return clazzService.queryNotices(id, page);
	}
	
	@RequestMapping("/allClazz")
	public PageInfo<Clazz> clazzs(int page,int size){
		return clazzService.queryAll(page, size);
	}
	
	@RequestMapping("/finishCore")
	public PageInfo<Student> finishCore(int page,int cid){
		ClazzTest clazzTest=(ClazzTest)session.getAttribute("finishClazz");
		return studentService.notInThis(page, cid, clazzTest.getFails());
	}
	
	
	@RequestMapping("/finishFail")
	public PageInfo<Student> finishFail(int page,int cid){
		ClazzTest clazzTest=(ClazzTest)session.getAttribute("finishClazz");
		return studentService.notInThis(page, cid, clazzTest.getCores());
	}
}


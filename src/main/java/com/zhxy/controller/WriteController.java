package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.dao.NoticeMapper;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.Grade;
import com.zhxy.domain.Notice;
import com.zhxy.domain.Noticetype;
import com.zhxy.service.History_hxk;

@Controller
public class WriteController {

			@Autowired
			History_hxk service;
			@Autowired
			NoticeMapper noticeMapper;
			
			@RequestMapping("/hxk_message")
			public String hxk_message() {
				return "hxk_message";
			}
			
			@RequestMapping("/hxk_history")
			public String history() {
				return "hxk_history";
			}
			
			@RequestMapping("/hxk_details")
			public String hxk_details() {
				return "hxk_details";
			}
			
			@RequestMapping("/hxk_write")
			public String hxk_write() {
				return "hxk_write";
			}
			@RequestMapping("/queryNoticeAll")
			@ResponseBody
			public List<Notice> queryNoticeAll(Model model) {
				List<Notice> list=service.queryNoticeAll();
				model.addAttribute("list", list);
				return list;
			}
			
			
			@RequestMapping("/queryByHead")
			@ResponseBody
			public List<Notice> queryByHead(Model model,Notice notice) {
				List<Notice> list=service.queryByHead(notice);
				model.addAttribute("list", list);
				return list;
			}
			
			@RequestMapping("/queryGrade")
			@ResponseBody
			public List<Grade> queryGrade(Model model) {
				List<Grade> list=service.queryGrade();
				model.addAttribute("list", list);
				return list;
			}
			
			@RequestMapping("/queryClazz")
			@ResponseBody
			public List<Clazz> queryClazz(Model model,String name) {
				List<Clazz> list=service.queryClazz(name);
				model.addAttribute("list", list);
				return list;
			}
				
			
			@RequestMapping("/queryNoticeById")
			@ResponseBody
			public Notice queryNoticeById(Model model, int Notice_Id) {
				Notice list=service.queryNoticeById(Notice_Id);
				model.addAttribute("list", list);
				return list;
			}
			
			
			
			
			@RequestMapping("/s")
			@ResponseBody
			public List<Noticetype> s(){
				return noticeMapper.plqueryNoticeType(1);
			}
			
			
			
}

package com.zhxy.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Cquestion;
import com.zhxy.domain.Section;
import com.zhxy.service.Cquestionservice;
import com.zhxy.service.SectionService;
@Controller
public class cquestionController {

	@Autowired
	Cquestionservice ct;
	@Autowired
	SectionService sm;
	
	@RequestMapping("queryCquestion")
	@ResponseBody
	public List<Cquestion> queryCquestion(int qid) {
		return ct.queryCquestion(qid);
	}
	
	@RequestMapping("insertCquestion")
	@ResponseBody
	public int insertCquestion(Cquestion obj) {
		System.out.println();
		return ct.insertCquestion(obj);
	}
	//错题+1
	@RequestMapping("updatefrequency")
	@ResponseBody
	public int updatefrequency(int id) {
		System.out.println();
		return ct.updatefrequency(id);
	}
	
	@RequestMapping("queryqid")
	@ResponseBody
	public List<Section> query(@Param("mid")Integer mid,@Param("gid")Integer gid,@Param("cid")Integer cid) {
		return sm.query(gid, mid, cid);
	}
}

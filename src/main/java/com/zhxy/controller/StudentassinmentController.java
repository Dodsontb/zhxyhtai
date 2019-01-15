package com.zhxy.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.Studentassignment;
import com.zhxy.domain.WhetherAccomplish;
import com.zhxy.service.Service_AssignmentPutoff;
import com.zhxy.service.Service_Studentassinment;
import com.zhxy.service.Service_WhetherAccomplish;

@Controller
public class StudentassinmentController {

	public StudentassinmentController() {
		System.out.println("StudentAssinment>>>>>>>>");
	}
	
	
	@Autowired
	Service_Studentassinment ser;//任务（主）
	
	@Autowired
	Service_WhetherAccomplish serW;//是否完成任务
	
	@Autowired
	Service_AssignmentPutoff sers;//推迟任务
	
	@RequestMapping("yiyi")
	public String b() {
		System.out.println();
		return "Studentassinment";
	}
	
	@RequestMapping("/query")
	@ResponseBody
	public List<Studentassignment> stuquery(Integer ljxTid) {
		List<Studentassignment> list = ser.stuquery(ljxTid);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("/whetherstu")
	@ResponseBody
	public List<WhetherAccomplish> whetherstu(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno){
		System.out.println(ljxYesno);
		List<WhetherAccomplish> list = serW.whether(1,ljxYesno);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("/putoff")
	@ResponseBody
	public List<AssignmentPutOff> putoff(Integer ljxUid){//到时候改session
		List<AssignmentPutOff> list = sers.putoff(1);
		System.out.println(list);
		return list;
	}
	
	
	@RequestMapping("/putoffinsert")
	@ResponseBody
	public int putoffinsert(AssignmentPutOff assignmentputoff) {
		int count = sers.putoffinsert(assignmentputoff);
		return count;
	}
}

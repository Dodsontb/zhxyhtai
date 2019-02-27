package com.zhxy.controller;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.Studentassignment;
import com.zhxy.domain.TeacherHistory;
import com.zhxy.domain.WhetherAccomplish;
import com.zhxy.hxktask.DynamicTaskJobs;
import com.zhxy.service.Service_AssignmentPutoff;
import com.zhxy.service.Service_Studentassinment;
import com.zhxy.service.Service_WhetherAccomplish;
import com.zhxy.task.LJX_ExamTaskJob;
import com.zhxy.task.Ljxputoff;

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
	
	@Autowired
    DynamicTaskJobs dynamicTaskJobs;

    @Autowired
    LJX_ExamTaskJob examJob;
    @Autowired
    Ljxputoff ljxputoff;
    
	@RequestMapping("yiyi")
	public String b() {
		System.out.println();
		String time = "2019-01-19 10:23:00";
        dynamicTaskJobs.addTaskJob(examJob,time);
        //dynamicTaskJobs.addTaskTimerJob(examJob,"*/5 * * * * *");
		return "Studentassinment";
	}
	
	@RequestMapping("teacher")
	public String teacher() {
		System.out.println();
		return "Ljxpublish";
	}
	
	@RequestMapping("ljx/query")
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
		if(count>0) {
			serW.deletestu(assignmentputoff.getLjxtid(), assignmentputoff.getLjxtuid());
		}
		return count;
	}
	
	/*@RequestMapping("/stutype")
	@ResponseBody
	public List<Studentassignment> stutype(@Param("ljxtype")Integer ljxtype,@Param("ljxyesno")String ljxyesno) {
		System.out.println(ljxtype+">>>>>>>>>>"+ljxyesno);
		List<Studentassignment> list = ser.stuType(ljxtype, ljxyesno, 1);
		System.out.println(list);
		return list;
	}*/
	
	@RequestMapping("/whetherstu2")
	@ResponseBody
	public List<WhetherAccomplish> whetherstu2(@Param("ljxljxtype")Integer ljxljxtype,@Param("ljxYesno")String ljxYesno){
		System.out.println(ljxYesno);
		List<WhetherAccomplish> list = serW.whether2(1,ljxYesno,ljxljxtype);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("/whetherstu3")
	@ResponseBody
	public List<WhetherAccomplish> whetherstu3(){
		List<WhetherAccomplish> list = serW.whether3(1);
		System.out.println(list);
		return list;
	}
	
	/*
	 * 发布任务
	 * */
	@RequestMapping("/stuinsert")
	@ResponseBody
	public int stuinsert(Studentassignment stu){
		int count = 0;
		if(stu.getName1()!=null && stu.getName1().length()!=0) {
			dynamicTaskJobs.addTaskJob(ljxputoff,stu.getName1());
		}else {
			count = ser.stuinsert(stu);
			if(count >0) {
				List<AssignmentPutOff> u = sers.putoff(1);
				serW.pilinsert(stu.getLjxtid(), u);
			}
		}
		
		return count;
	}
	
	//老师所带的班级
	@RequestMapping("/teacher_history")
	@ResponseBody
	public List<TeacherHistory> teacher_history() {
		List<TeacherHistory> list = serW.teacher_history();
		return list;
	}
	
	//学生是否完成任务
	@RequestMapping("/cpstudent")
	@ResponseBody
	public List<Studentassignment> cpstudent(String name,String yesno) {
		List<Studentassignment> list = ser.fuzao(1,name,yesno);
		return list;
	}
}

package com.zhxy.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.AssignmentType;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.CpStudent;
import com.zhxy.domain.Grade;
import com.zhxy.domain.PutOffExamine;
import com.zhxy.domain.Studentassignment;
import com.zhxy.domain.TeacherHistory;
import com.zhxy.domain.Template;
import com.zhxy.domain.WhetherAccomplish;
import com.zhxy.hxktask.DynamicTaskJobs;
import com.zhxy.service.Service_AssignmentPutoff;
import com.zhxy.service.Service_Studentassinment;
import com.zhxy.service.Service_WhetherAccomplish;
import com.zhxy.service.Templateservice;
import com.zhxy.task.LJX_ExamTaskJob;
import com.zhxy.task.Ljxputoff;

@Controller
public class StudentassinmentController {

	public StudentassinmentController() {
		System.out.println("StudentAssinment>>>>>>>>");
	}
	
	
	@Autowired
	Service_Studentassinment ser;//任务（主�?
	
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
	
	//学员查看自己的推迟任务
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
	public int stuinsert(Studentassignment stu,String at,String cl){
		int count = 0;
		String [] s = at.split(",");
		for (String string : s) {
			System.out.println(string);
			if(stu.getName1()!=null && stu.getName1().length()!=0) {
				String time = stu.getName1();
				time = time.replace("T", " ")+":00";
				stu.setLjxclasses(string);
				count = ser.stuinsert(stu);
				if(count >0) {
					//List<Studentassignment> list = ser.stuquery(stu.getLjxtid());
					//for (Studentassignment t : list) {
						List<CpStudent> u = ser.cpsudentclazz(string);
						if(u!=null) {
							serW.pilinsert(stu.getLjxtid(), u,"0");
						}
					//}
				}
				dynamicTaskJobs.addTaskJob(ljxputoff,time);
			}else {
				stu.setLjxclasses(string);
				count = ser.stuinsert(stu);
				if(count >0) {
					//List<Studentassignment> list = ser.stuquery(stu.getLjxtid());
					//for (Studentassignment t : list) {
						List<CpStudent> u = ser.cpsudentclazz(string);
						if(u!=null) {
							serW.pilinsert(stu.getLjxtid(), u,"否");
						}
					//}
				}
			}
		}
		return count;
	}
	
	//老师�?带的班级
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
	
	//查询的年级和班级
	@RequestMapping("/querygrade")
	@ResponseBody
	public List<Grade> querygrade() {
		return ser.queryreade();
	}
	
	@RequestMapping("/queryclazz")
	@ResponseBody
	public List<Clazz> queryclazz(HttpSession session,Integer gradeid) {
		List<Clazz> list = ser.queryclazz(1, gradeid);
		return list;
	}
	
	//历史任务
	@RequestMapping("/studentnyj")
	@ResponseBody
	public List<Studentassignment> studentnyj(String ljxTname){
		List<Studentassignment> list = ser.naljxcla(ljxTname);
		return list;	
	}
	
	//推迟的任务
	@RequestMapping("/tuichiquery")
	@ResponseBody
	public List<Studentassignment> tuichiquery(String ljxclaname){
		List<Studentassignment> list = ser.tuichiquery(ljxclaname);
		return list;
	}
	
	//推迟任务的详细信息
	@RequestMapping("/xiangx")
	@ResponseBody
	public List<AssignmentPutOff> xiangx (Integer ljxTuid){
		List<AssignmentPutOff> list = sers.xiangx(ljxTuid);
		return list;
	}
	
	//审核
	@RequestMapping("/einsert")
	@ResponseBody
	public int einsert(HttpSession session,Integer tuid,Integer uid,String yesno) {
		PutOffExamine p = new PutOffExamine();
		p.setLjxtuid(tuid);
		p.setLjxuid(uid);
		p.setLjxyesno(yesno);
		p.setLjxuname("唐勇");
		int count = sers.einsert(p);
		return count;
	}
	
	//任务类型
	@RequestMapping("/typequery")
	@ResponseBody
	public List<AssignmentType> typequery(){
		List<AssignmentType> list = ser.typequery();
		return list;
	}
	
	//板块
	@Autowired
	Templateservice sert;
	@RequestMapping("/queryfabu")
	@ResponseBody
	public List<Template> queryfabu(String name2){
		List<Template> list = sert.queryfabu(name2);
		return list;
	}
}

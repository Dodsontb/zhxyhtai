package com.zhxy.service.sx;

import java.util.List;

import com.zhxy.domain.Qingjiatype;
import com.zhxy.domain.Studentqingjia;
import io.lettuce.core.dynamic.annotation.Param;

public interface QingJiaService {
	List<Studentqingjia>  queryAllStu();  //查询所有学生请假信息
	
	Studentqingjia queryByStuId(Integer id);//根据学生ID查询请假信息
	
	int updateStu(Integer id,Integer StuStatus);//根据学生ID修改学生请假状态

	List<Studentqingjia> queryByStudentName(String name); //根据学生姓名查询学生请假信息
	
	List<Studentqingjia> queryByStudentNameAndStudentStatu(Integer StuStatus,String name);//根据学生姓名和学生请假状态查询学生请假信息
	
	List<Qingjiatype> queryAllStatus(Integer id); //查询所有请假状态
	
	Studentqingjia queryByStaffid(Integer id);//根据员工ID查询
	
	List<Studentqingjia> queryByStaffName(String name); //根据员工姓名查询
	
	int deleteStu(Integer id);   //根据学生ID删除学生请假信息
	
	int insert(Studentqingjia stu); //学生申请请假
}

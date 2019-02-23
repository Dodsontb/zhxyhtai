package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.Classs;
import com.zhxy.domain.Statuastype;
import com.zhxy.domain.Studentkaoqin;

import io.lettuce.core.dynamic.annotation.Param;
@Mapper
public interface StudentkaoqinMapper {
	
 
	 List<Studentkaoqin> queryAll();//查询所有学生考勤记录
	  
	 List<Studentkaoqin> queryByStudentName(String stuName); //根据学生姓名查询学生信息	 
	 
	 Studentkaoqin queryByStuId(Integer id);//根据学生ID查询
	 	 
	 //根据学生姓名以及学生状态 查询学生信息
	 List<Studentkaoqin> queryByClassNameAndStuStatus(@Param("StuStatus")Integer StuStatus,@Param("name")String name);
	 
	 int updateStu(Integer id,Integer StuStatus);//根据学生ID修改学生考勤状态
 	 	  
	 Statuastype queryAllStatus(Integer id);  //查询所有的考勤状态
	 
	 Classs queryAllClass(Integer id);//查询所有的班级


}
package com.zhxy.service.sx;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhxy.domain.Classs;
import com.zhxy.domain.Statuastype;
import com.zhxy.domain.Studentkaoqin;

public interface KaoQinService {
	
	PageInfo<Studentkaoqin> queryAll();//查询所有学生
	 
	 List<Studentkaoqin> queryByStudentName(String stuName);
	 
	 
	 Studentkaoqin queryByStuId(Integer id);//根据学生ID查询
	 
	 
	 //根据班级名称以及学生状态查询学生信息
	 PageInfo<Studentkaoqin> queryByClassNameAndStuStatus(Integer classID, String StuStatus,Integer page);
	 
	 int updateStu(Integer id,Integer StuStatus);//根据学生id修改学生考勤状态
	 
	 
	 Statuastype queryAllStatus(Integer id);  //查询所有的考勤状态
	 
	 Classs queryAllClass(Integer id);//查询所有的班级

}

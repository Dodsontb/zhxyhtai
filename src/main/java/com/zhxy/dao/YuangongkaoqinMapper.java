package com.zhxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.CpPosition;
import com.zhxy.domain.Statuastype;
import com.zhxy.domain.Yuangongkaoqin;

import io.lettuce.core.dynamic.annotation.Param;
@Mapper
public interface YuangongkaoqinMapper {
	
	 List<Yuangongkaoqin> queryAllyg();//查询所有员工
	  
	 List<Yuangongkaoqin> queryByYuangongName(String ygName); //根据学生姓名查询学生信息	 
	 
	 Yuangongkaoqin queryByYgId(Integer id);//根据员工ID查询
	 	 
	 //根据员工名称以及员工状态 查询学生信息
	 List<Yuangongkaoqin> queryByYgNameAndStuStatus(@Param("StuStatus")Integer StuStatus,@Param("name")String name);
	 
	 int updateYg(Integer id,Integer StuStatus);//根据员工ID修改员工考勤状态
 	 	  
	 Statuastype queryAllStatus(Integer id);  //查询所有的考勤状态
	 
	 CpPosition queryAllPosition(Integer id);//查询所有的职位名称
	 
	 int insertForeach(List<Yuangongkaoqin> list);
	  
}
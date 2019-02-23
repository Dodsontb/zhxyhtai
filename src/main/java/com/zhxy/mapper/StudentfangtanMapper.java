package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.CpStaff;
import com.zhxy.domain.CpStudent;
import com.zhxy.domain.FangtanType;
import com.zhxy.domain.Studentfangtan;

import io.lettuce.core.dynamic.annotation.Param;
@Mapper
public interface StudentfangtanMapper {
	
	List<Studentfangtan> queryAll(); //查询所有学生访谈记录
	
	CpStudent queryByStuId(Integer id);//根据学生ID查询学生姓名
	
	List<FangtanType> queryAllStatus(Integer id); //查询所有访谈状态
	
	int updateStu(Integer id,Integer Status);
	
	int delete(Integer id);
	
	int insert(Studentfangtan stu);
	
	CpStaff queryByStaffId(Integer id); //根据员工ID查询员工
	
	
	
	List<Studentfangtan> queryByStuNameAndStatus(@Param("name")String name,@Param("Status")Integer Status);
	
	List<Studentfangtan> queryByStuName(String name);
	
	
	
	
	
}
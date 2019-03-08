package com.zhxy.service.sx;

import java.util.List;

import com.zhxy.domain.Qingjiatype;
import com.zhxy.domain.Yuangongqingjia;

import io.lettuce.core.dynamic.annotation.Param;

public interface YuangongQingjiaService {
	
	
	List<Yuangongqingjia> queryAll(); //查询所有员工请假信息
	
	Yuangongqingjia queryById(Integer id);//根据员工ID查询员工请假信息
	
	List<Yuangongqingjia> queryByName(String name);//根据员工姓名查询请假信息
	
	List<Qingjiatype> queryAllStatus(Integer id); //查询所有请假状态
	
	int updateYuan(Integer id,Integer Status); //根据员工ID修改员工请假信息
	
	int delele(Integer id);
	
	Yuangongqingjia queryBypositionid(Integer id);
	
	int insert(Yuangongqingjia yg);
	
	List<Yuangongqingjia> queryByNameAndStatus(@Param("name")String name,@Param("Status")Integer Status);
}

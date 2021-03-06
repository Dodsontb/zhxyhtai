package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.Grade;

@Mapper
public interface GradeMapper {

	Grade queryById(int id);
	
	List<Grade> findGrade(List<Integer> ids);

	List<Grade> grades(int mid);
	
	List<Grade> allGrade();
	
	boolean existGrade();
	
	List<Grade> gradeList();
}

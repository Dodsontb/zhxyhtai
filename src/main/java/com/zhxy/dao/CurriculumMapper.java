package com.zhxy.dao;

import com.zhxy.domain.Curriculum;

public interface CurriculumMapper {
    int deleteByPrimaryKey(Integer id);

	int insert(Curriculum record);

	int insertSelective(Curriculum record);

	Curriculum selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Curriculum record);

	int updateByPrimaryKey(Curriculum record);	
}
package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.Question;


public interface QuestionMapper {

	List<Question> findList(Question Question);
	
	Question findById(@Param("id") Integer id);
	
	Integer insert(Question Question);
	
    
}

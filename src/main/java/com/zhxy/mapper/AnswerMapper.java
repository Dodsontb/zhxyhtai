package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.Answer;
import com.zhxy.domain.AnswerDto;


public interface AnswerMapper {

	List<Answer> findList(Answer Answer);
	
	AnswerDto findById(@Param("id") Integer id);
	
	Integer insert(Answer Answer);
	
    
}

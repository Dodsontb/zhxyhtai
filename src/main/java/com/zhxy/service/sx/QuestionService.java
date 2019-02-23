package com.zhxy.service.sx;

import java.util.List;

import com.zhxy.domain.Question;

public interface QuestionService {
	
	List<Question> findList(Question Question);
	
	Question findById(Integer id);
	
	Integer insert(Question Question);
	
}

package com.zhxy.service.sx;

import java.util.List;

import com.zhxy.domain.Answer;
import com.zhxy.domain.AnswerDto;

public interface AnswerService {
	
	List<Answer> findList(Answer Answer);
	
	AnswerDto findById(Integer id);
	
	Integer insert(Answer Answer);
	
}

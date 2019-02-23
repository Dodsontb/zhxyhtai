package com.zhxy.service.sx;

import java.util.List;

import com.zhxy.domain.CpStaff;
import com.zhxy.domain.Qingjiatype;
import com.zhxy.domain.Question;
import com.zhxy.domain.Studentqingjia;
import io.lettuce.core.dynamic.annotation.Param;

public interface QuestionService {
	
	List<Question> findList(Question Question);
	
	Question findById(Integer id);
	
	Integer insert(Question Question);
	
}

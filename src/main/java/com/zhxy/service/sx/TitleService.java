package com.zhxy.service.sx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.Answer;
import com.zhxy.domain.AnswerDto;
import com.zhxy.domain.Title;

public interface TitleService {
	
	List<Title> findList();
	
	Title findById(Integer id);
	
	Integer insert(Title title);
	
	
}

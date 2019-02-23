package com.zhxy.service.sx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.Answer;
import com.zhxy.domain.AnswerDto;
import com.zhxy.domain.Reply;
import com.zhxy.domain.ReplyDto;

public interface ReplyService {
	
	List<Reply> findList();
	
	Reply findById(Integer id);
	
	Integer insert(Reply reply);
	
	ReplyDto findDtoById(Integer id);
	
}

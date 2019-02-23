package com.zhxy.service.sx;

import java.util.List;

import com.zhxy.domain.Reply;
import com.zhxy.domain.ReplyDto;

public interface ReplyService {
	
	List<Reply> findList();
	
	Reply findById(Integer id);
	
	Integer insert(Reply reply);
	
	ReplyDto findDtoById(Integer id);
	
}

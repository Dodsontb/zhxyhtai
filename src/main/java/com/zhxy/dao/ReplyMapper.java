package com.zhxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.Reply;
import com.zhxy.domain.ReplyDto;


public interface ReplyMapper {

	List<Reply> findList();
	
	Reply findById(@Param("id") Integer id);
	
	Integer insert(Reply reply);
	
	ReplyDto findDtoById(@Param("id") Integer id);
	
    
}

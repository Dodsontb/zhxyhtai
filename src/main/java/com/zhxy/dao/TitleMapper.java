package com.zhxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.Title;


public interface TitleMapper {

	List<Title> findList();
	
	Title findById(@Param("id") Integer id);
	
	Integer insert(Title title);
	
    
}

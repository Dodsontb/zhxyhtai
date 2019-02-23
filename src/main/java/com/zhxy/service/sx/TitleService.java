package com.zhxy.service.sx;

import java.util.List;

import com.zhxy.domain.Title;

public interface TitleService {
	
	List<Title> findList();
	
	Title findById(Integer id);
	
	Integer insert(Title title);
	
	
}

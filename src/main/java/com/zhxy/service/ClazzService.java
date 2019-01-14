package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Clazz;

public interface ClazzService {

	List<Clazz> clazz(List<Integer> id);
	
	List<Clazz> clazz(List<Integer> id,int gradeid);
}

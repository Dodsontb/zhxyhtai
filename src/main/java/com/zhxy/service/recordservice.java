package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Record;

public interface recordservice {

	int insertSelective(Record record);
	
	int insertxuan(List<Record> record);
}

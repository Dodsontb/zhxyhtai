package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Record;

public interface recordservice {

	int insertSelective(Record record);
	
	int insertxuan(List<Record> record);
	//选择题
	int updata_scorex(Record record);
	//填空题
	int updata_scoret(Record record);
	//应用题
	int updata_scorey(Record record);
	
	List<Record> selectxuan(Record record);
}

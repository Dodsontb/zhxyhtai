package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Tquestion;

public interface Tquestionservice {

	List<Tquestion> queryTquestion(int qid);
	int insertTquestion(Tquestion record);
	int updateTquestion(int id);
}

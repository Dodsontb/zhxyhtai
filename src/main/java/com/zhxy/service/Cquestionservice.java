package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Cquestion;

import io.lettuce.core.dynamic.annotation.Param;

public interface Cquestionservice {

	List<Cquestion> queryCquestion(int qid);
	
	int insertCquestion(Cquestion obj);
	
	int updatefrequency(int id);
	
	Cquestion self_motion(@Param("sid")Integer sid,Integer tid);
}

package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Cquestion;

public interface Cquestionservice {

	List<Cquestion> queryCquestion(int qid);
	
	int insertCquestion(Cquestion obj);
}

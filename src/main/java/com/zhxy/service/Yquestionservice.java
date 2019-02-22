package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Yquestion;

public interface Yquestionservice {

	List<Yquestion> queryYquestion(int qid);
	int insertYquestion(Yquestion record);
}

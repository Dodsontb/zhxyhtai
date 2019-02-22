package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.dao.YquestionMapper;
import com.zhxy.domain.Yquestion;
import com.zhxy.service.Yquestionservice;
@Service
public class Yquestionserviceimpl implements Yquestionservice{

	@Autowired
	YquestionMapper ym;
	@Override
	public List<Yquestion> queryYquestion(int qid) {
		// TODO Auto-generated method stub
		return ym.queryYquestion(qid);
	}
	@Override
	public int insertYquestion(Yquestion record) {
		// TODO Auto-generated method stub
		return ym.insertYquestion(record);
	}
	

}

package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.domain.Tquestion;
import com.zhxy.mapper.TquestionMapper;
import com.zhxy.service.Tquestionservice;
@Service
@Transactional
public class Tquestionserviceimpl implements Tquestionservice{
	@Autowired
	TquestionMapper tm;
	@Override
	public List<Tquestion> queryTquestion(int qid) {
		// TODO Auto-generated method stub
		return tm.queryTquestion(qid);
	}
	@Override
	public int insertTquestion(Tquestion record) {
		// TODO Auto-generated method stub
		return tm.insertTquestion(record);
	}

}

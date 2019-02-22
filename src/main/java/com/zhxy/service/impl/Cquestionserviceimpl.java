package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.domain.Cquestion;
import com.zhxy.mapper.CquestionMapper;
import com.zhxy.service.Cquestionservice;
@Service
@Transactional
public class Cquestionserviceimpl implements Cquestionservice{

	
	@Autowired
	CquestionMapper ct;
	@Override
	public List<Cquestion> queryCquestion(int qid) {
		// TODO Auto-generated method stub
		return ct.queryCquestion(qid);
	}
	@Override
	public int insertCquestion(Cquestion obj) {
		// TODO Auto-generated method stub
		return ct.insertCquestion(obj);
	}

}

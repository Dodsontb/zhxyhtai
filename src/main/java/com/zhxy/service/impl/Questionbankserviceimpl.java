package com.zhxy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.domain.Questionbank;
import com.zhxy.mapper.QuestionbankMapper;
import com.zhxy.service.Questionbankservice;
@Service
@Transactional
public class Questionbankserviceimpl implements Questionbankservice{

	@Autowired
	QuestionbankMapper qq;
	@Override
	public Questionbank selectByid(int pid) {
		return qq.selectByid(pid);
	}

}

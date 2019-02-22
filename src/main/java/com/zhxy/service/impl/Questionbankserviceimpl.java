package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.dao.QuestionbankMapper;
import com.zhxy.domain.Questionbank;
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

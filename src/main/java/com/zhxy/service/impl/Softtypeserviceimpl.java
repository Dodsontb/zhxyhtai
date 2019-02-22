package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.dao.QuestionbankMapper;
import com.zhxy.dao.SofttypeMapper;
import com.zhxy.domain.Softtype;
import com.zhxy.service.Softtypeservice;
@Service
@Transactional
public class Softtypeserviceimpl implements Softtypeservice{

	@Autowired
	SofttypeMapper ss;
	@Override
	public List<Softtype> query() {
		// TODO Auto-generated method stub
		return ss.query();
	}

}

package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.domain.Learning;
import com.zhxy.mapper.LearningMapper;
import com.zhxy.service.learningservice;
@Service
@Transactional
public class learningserviceimpl implements learningservice{

	@Autowired
	LearningMapper lm;
	@Override
	public List<Learning> cp_selectBycid(Integer cid, Integer templateid) {
		// TODO Auto-generated method stub
		return lm.cp_selectBycid(cid, templateid);
	}

}

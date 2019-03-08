package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.domain.StuClazz;
import com.zhxy.mapper.StuClazzMapper;
import com.zhxy.service.stuclazzservice;
@Service
@Transactional
public class stuclazzserviceimpl implements stuclazzservice{
	@Autowired
	StuClazzMapper sm;
	@Override
	public List<StuClazz> clazzbysid(Integer cid) {
		// TODO Auto-generated method stub
		return sm.clazzbysid(cid);
	}

}

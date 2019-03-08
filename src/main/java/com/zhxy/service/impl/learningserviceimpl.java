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
	@Override
	public Learning sumupdate(Learning learning) {
		// TODO Auto-generated method stub
		return lm.sumupdate(learning);
	}
	@Override
	public int updateStatuslearning(Integer uid,Integer templateid) {
		// TODO Auto-generated method stub
		return lm.updateStatuslearning(uid,templateid);
	}
	@Override
	public int insertSelective(Learning learning) {
		// TODO Auto-generated method stub
		return lm.insertSelective(learning);
	}
	@Override
	public List<Learning> selectstulearning(int uid) {
		// TODO Auto-generated method stub
		return lm.selectstulearning(uid);
	}

}

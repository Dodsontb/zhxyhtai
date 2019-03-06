package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.domain.Record;
import com.zhxy.mapper.RecordMapper;
import com.zhxy.service.recordservice;

@Service
@Transactional
public class recordserviceimpl implements recordservice{

	@Autowired
	RecordMapper recordMapper;
	@Override
	public int insertSelective(Record record) {
		// TODO Auto-generated method stub
		return recordMapper.insertSelective(record);
	}
	@Override
	public int insertxuan(List<Record> record) {
		// TODO Auto-generated method stub
		return recordMapper.insertxuan(record);
	}

}

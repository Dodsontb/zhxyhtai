package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.PutOffExamine;
import com.zhxy.mapper.AssignmentPutOffMapper;
import com.zhxy.service.Service_AssignmentPutoff;

@Service
public class AssignmentPutoff_impl implements Service_AssignmentPutoff{
	
	@Autowired
	AssignmentPutOffMapper mapper;

	@Override
	public List<AssignmentPutOff> putoff(Integer ljxUid) {
		// TODO Auto-generated method stub
		return mapper.putoff(ljxUid);
	}

	@Override
	public int putoffinsert(AssignmentPutOff assignmentputoff) {
		// TODO Auto-generated method stub
		return mapper.putoffinsert(assignmentputoff);
	}

	@Override
	public List<AssignmentPutOff> xiangx(Integer ljxTuid) {
		// TODO Auto-generated method stub
		return mapper.xiangx(ljxTuid);
	}

	@Override
	public int einsert(PutOffExamine put) {
		// TODO Auto-generated method stub
		return mapper.einsert(put);
	}

}

package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.domain.AssignmentPutOff;
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

}

package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.domain.Studentassignment;
import com.zhxy.mapper.StudentassignmentMapper;
import com.zhxy.service.Service_Studentassinment;
@Service
public class Studentassinment_impl implements Service_Studentassinment{

	@Autowired
	StudentassignmentMapper mapper;
	
	@Override
	public List<Studentassignment> stuquery() {
		
		return null;
	}

}

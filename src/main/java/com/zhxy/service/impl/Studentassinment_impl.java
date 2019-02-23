package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.dao.StudentassignmentMapper;
import com.zhxy.domain.Studentassignment;
import com.zhxy.service.Service_Studentassinment;
@Service
public class Studentassinment_impl implements Service_Studentassinment{

	@Autowired
	StudentassignmentMapper mapper;
	
	@Override
	public List<Studentassignment> stuquery(Integer ljxTid) {
		
		return mapper.stuquery(ljxTid);
	}

	@Override
	public void schediled() {
		System.out.println("真好定时发布");
	}

	@Override
	public int stuinsert(Studentassignment stu) {
		// TODO Auto-generated method stub
		
		return mapper.stuinsert(stu);
	}

	/*@Override
	public List<Studentassignment> stuType(Integer ljxtype, String ljxyesno, Integer ljxuid) {
		// TODO Auto-generated method stub
		return mapper.stuType(ljxtype, ljxyesno, ljxuid);
	}*/
	public List<Studentassignment> stuquery() {
		
		return null;
	}

}

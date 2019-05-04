package com.zhxy.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.domain.AssignmentType;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.CpStudent;
import com.zhxy.domain.Grade;
import com.zhxy.domain.Studentassignment;
import com.zhxy.mapper.StudentassignmentMapper;
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

	@Override
	public List<Studentassignment> fuzao(@Param("teacherid")Integer teacherid,@Param("name")String name,@Param("yesno")String yesno) {
		List<Studentassignment> list = mapper.fuzao( teacherid,name,yesno);
		return list;
	}

	@Override
	public List<CpStudent> cpsudentclazz(String clazz) {
		// TODO Auto-generated method stub
		return mapper.cpsudentclazz(clazz);
	}

	@Override
	public List<Grade> queryreade() {
		// TODO Auto-generated method stub
		return mapper.queryreade();
	}

	@Override
	public List<Clazz> queryclazz(Integer teacherid, Integer gradeid) {
		// TODO Auto-generated method stub
		return mapper.queryclazz(teacherid, gradeid);
	}

	@Override
	public List<Studentassignment> naljxcla(String ljxTname) {
		// TODO Auto-generated method stub
		return mapper.naljxcla(ljxTname);
	}

	@Override
	public List<Studentassignment> tuichiquery(String ljxclaname) {
		// TODO Auto-generated method stub
		return mapper.tuichiquery(ljxclaname);
	}

	@Override
	public List<AssignmentType> typequery() {
		// TODO Auto-generated method stub
		return mapper.typequery();
	}

}

package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.domain.Template;
import com.zhxy.mapper.TemplateMapper;
import com.zhxy.service.Templateservice;
@Service
@Transactional
public class Templateserviceimpl implements Templateservice{
	@Autowired
	TemplateMapper tm;
	@Override
	public Template queryTemplate(Integer id) {
		// TODO Auto-generated method stub
		return tm.queryTemplate(id);
	}
	@Override
	public int insertTemplate(Template record) {
		// TODO Auto-generated method stub
		return tm.insertTemplate(record);
	}
	@Override
	public List<Template> querybytype(Integer softtypeid) {
		// TODO Auto-generated method stub
		return tm.querybytype(softtypeid);
	}
	@Override
	public List<Template> cp_queryall() {
		// TODO Auto-generated method stub
		return tm.cp_queryall();
	}
	@Override
	public List<Template> cp_querybyname1(String name1) {
		// TODO Auto-generated method stub
		return tm.cp_querybyname1(name1);
	}

}

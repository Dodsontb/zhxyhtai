package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Template;

public interface Templateservice {

	Template queryTemplate(Integer id);
	
	int insertTemplate(Template record);
	
	 List<Template> querybytype(Integer softtypeid);
	 
	 List<Template> cp_queryall();
	 
	 List<Template> cp_querybyname1(String name1);
}

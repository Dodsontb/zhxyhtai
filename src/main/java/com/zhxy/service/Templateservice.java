package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Template;

public interface Templateservice {

	Template queryTemplate(Integer id);
	
	int insertTemplate(Template record);
	
	 List<Template> querybytype(Integer softtypeid);
	 
	 List<Template> cp_queryall(String name2);
	 
	 List<Template> cp_querybyname1(String name1);
	 
	 Template cp_querycquestion(Integer id);
	 
	 Template cp_querytquestion(Integer id);
	 
	 Template cp_queryyquestion(Integer id);
}

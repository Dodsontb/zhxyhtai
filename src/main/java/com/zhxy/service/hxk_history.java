package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Clazz;
import com.zhxy.domain.Grade;
import com.zhxy.domain.Notice;
import com.zhxy.domain.Noticetype;

import io.lettuce.core.dynamic.annotation.Param;

public interface hxk_history {
	
	 List<Notice> queryNoticeAll();
	    
	    Notice queryNoticeById(int Notice_Id);
	    
	    List<Notice> queryByHead(Notice notice);
	    
	    
	    int deleteNotice(int nstate);
	    
	    List<Noticetype> plqueryNoticeType(int typeid);
	    
	    List<Grade> queryGrade();
	    
	    List<Clazz> queryClazz(@Param("name")String name);

}

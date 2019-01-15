package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Clazz;
import com.zhxy.domain.Grade;
import com.zhxy.domain.Notice;
import com.zhxy.domain.Noticetype;

import io.lettuce.core.dynamic.annotation.Param;

public interface History_hxk {
	
	
		List<Notice> queryNoticeAll();
	    
	    Notice queryNoticeById(int Notice_Id);
	    
	    List<Notice> queryByHead(Notice notice);
	    
	    
	    int deleteNotice(int nstate);
	    
	    List<Noticetype> plqueryNoticeType();
	    
	    List<Grade> queryGrade();
	    
	    List<Clazz> queryClazz(String name);
	    
	    int insertNotice(String headline,String ncontent,int TypeId,int uid);

}

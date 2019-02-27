package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Clazz;
import com.zhxy.domain.CpUser;
import com.zhxy.domain.Grade;
import com.zhxy.domain.HxkPageBean;
import com.zhxy.domain.Message;
import com.zhxy.domain.MessageReception;
import com.zhxy.domain.Notice;
import com.zhxy.domain.Noticetype;

import io.lettuce.core.dynamic.annotation.Param;

public interface hxk_history {
	
	 List<Notice> queryNoticeAll();
	    
	    Notice queryNoticeById(int Notice_Id);
	    
	    HxkPageBean<Notice> queryByHead(String name,int typeid,int currpage);
	    
	    int deleteNotice(int Notice_Id);
	    
	    List<Noticetype> plqueryNoticeType();
	    
	    List<Grade> queryGrade();
	    
	    /*List<Clazz> queryClazz(@Param("name")String name);*/
	    List<Clazz> queryClazz();
	    
	  /*  int insertNotice(String headline,String ncontent,int typeid,int uid,int[] cid,List<String> urls);*/
	    
	    void insertNotice(Notice notice,int[] cid,List<String> urls,String dtime);
	    
	    List<Message> queryMessage();
	    
	    List<Message> queryByMessageName(String username,int receiver);
	    
	    int updataNotice();
	    
	    List<CpUser> queryUserGetId();
	    
	    List<CpUser> queryCpUserByName(String username);
	    
	  /*  int deleteMessage(int messageId);*/
	    
	    int insertMessage(Message message);
	    
	    List<Message> getChatRecord(int sendid,int receiver);
	    
	   /* int insertReception(Message message);*/
	    /*List<CpUser> getChatList(Integer userid);*/
	    
	    List<CpUser> getUserlist(Integer chatid,Integer userid);
	    
	    List<Message> getChatRecordList(int receiver);
	    
	    int updateDiv(int Message_Id);
	    

}

package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.CpUser;
import com.zhxy.domain.Message;
import com.zhxy.domain.MessageReception;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer messageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
    
    List<Message> queryMessage();
    
    List<Message> queryByMessageName(String username,int receiver);
    
    List<CpUser> queryUserGetId();
    
    List<CpUser> queryCpUserByName(String username);
    
   /* int deleteMessage(int messageId);*/
    
    int insertMessage(Message message);
    
    List<Message> getChatRecord(int sendid,int receiver);
    
    int insertReception(Message message);
    
  //获取联系人列表
  /*	List<CpUser> getChatList(Integer userid);*/
  	
  	List<CpUser> getUserlist(Integer chatid,Integer userid);
  	
  	List<Message> getChatRecordList(int receiver);
  	
  	int updateDiv(int Message_Id);
  
}
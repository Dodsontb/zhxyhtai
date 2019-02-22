package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.CpUser;
import com.zhxy.domain.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer messageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
    
    List<Message> queryMessage();
    
    List<Message> queryByMessageName(String username);
    
    List<CpUser> queryCpUser();
    
    List<CpUser> queryCpUserByName(String username);
    
    int deleteMessage(int messageId);
    
    int insertMessage(Message message);
    
    List<Message> getChatRecord(int sendid,int receiver);
    
    Message selectUid(int uid);
}
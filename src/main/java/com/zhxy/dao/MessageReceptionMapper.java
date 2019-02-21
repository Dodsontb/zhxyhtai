package com.zhxy.dao;

import com.zhxy.domain.Message;
import com.zhxy.domain.MessageReception;

public interface MessageReceptionMapper {
    int deleteByPrimaryKey(Integer receptionId);

    int insert(MessageReception record);

    int insertSelective(MessageReception record);

    MessageReception selectByPrimaryKey(Integer receptionId);

    int updateByPrimaryKeySelective(MessageReception record);

    int updateByPrimaryKey(MessageReception record);
    
    int insertReception(Message message);
}
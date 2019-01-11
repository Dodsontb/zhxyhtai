package com.zhxy.dao;

import com.zhxy.domain.MessageType;

public interface MessageTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(MessageType record);

    int insertSelective(MessageType record);

    MessageType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(MessageType record);

    int updateByPrimaryKey(MessageType record);
}
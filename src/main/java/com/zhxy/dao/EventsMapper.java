package com.zhxy.dao;

import com.zhxy.domain.Events;

public interface EventsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Events record);

    int insertSelective(Events record);

    Events selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Events record);

    int updateByPrimaryKey(Events record);
}
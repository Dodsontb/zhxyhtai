package com.zhxy.mapper;

import com.zhxy.domain.Statuastype;

public interface StatuastypeMapper {
    int deleteByPrimaryKey(Integer statuastype);

    int insert(Statuastype record);

    int insertSelective(Statuastype record);

    Statuastype selectByPrimaryKey(Integer statuastype);

    int updateByPrimaryKeySelective(Statuastype record);

    int updateByPrimaryKey(Statuastype record);
}
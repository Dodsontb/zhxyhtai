package com.zhxy.mapper;

import com.zhxy.domain.Messageimg;

public interface MessageimgMapper {
    int deleteByPrimaryKey(Integer imgid);

    int insert(Messageimg record);

    int insertSelective(Messageimg record);

    Messageimg selectByPrimaryKey(Integer imgid);

    int updateByPrimaryKeySelective(Messageimg record);

    int updateByPrimaryKey(Messageimg record);
}
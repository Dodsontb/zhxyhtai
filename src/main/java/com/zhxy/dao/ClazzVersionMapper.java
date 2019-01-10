package com.zhxy.dao;

import com.zhxy.domain.ClazzVersion;

public interface ClazzVersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClazzVersion record);

    int insertSelective(ClazzVersion record);

    ClazzVersion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClazzVersion record);

    int updateByPrimaryKey(ClazzVersion record);
}
package com.zhxy.dao;

import com.zhxy.domain.ClazzPosition;

public interface ClazzPositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClazzPosition record);

    int insertSelective(ClazzPosition record);

    ClazzPosition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClazzPosition record);

    int updateByPrimaryKey(ClazzPosition record);
}
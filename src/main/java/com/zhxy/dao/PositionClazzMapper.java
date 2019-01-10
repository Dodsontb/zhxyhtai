package com.zhxy.dao;

import com.zhxy.domain.PositionClazz;

public interface PositionClazzMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PositionClazz record);

    int insertSelective(PositionClazz record);

    PositionClazz selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PositionClazz record);

    int updateByPrimaryKey(PositionClazz record);
}
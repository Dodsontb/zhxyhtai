package com.zhxy.dao;

import com.zhxy.domain.CpPosition;

public interface CpPositionMapper {
    int deleteByPrimaryKey(Integer positionid);

    int insert(CpPosition record);

    int insertSelective(CpPosition record);

    CpPosition selectByPrimaryKey(Integer positionid);

    int updateByPrimaryKeySelective(CpPosition record);

    int updateByPrimaryKey(CpPosition record);
}
package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.CpPosition;

public interface CpPositionMapper {
    int deleteByPrimaryKey(Integer positionid);

    int insert(CpPosition record);

    int insertSelective(CpPosition record);

    CpPosition selectByPrimaryKey(Integer positionid);

    int updateByPrimaryKeySelective(CpPosition record);

    int updateByPrimaryKey(CpPosition record);
    
    List<CpPosition> selectAll();
}
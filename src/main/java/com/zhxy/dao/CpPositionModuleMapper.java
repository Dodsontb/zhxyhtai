package com.zhxy.dao;

import com.zhxy.domain.CpPositionModule;

public interface CpPositionModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpPositionModule record);

    int insertSelective(CpPositionModule record);

    CpPositionModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpPositionModule record);

    int updateByPrimaryKey(CpPositionModule record);
}
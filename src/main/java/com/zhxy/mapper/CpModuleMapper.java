package com.zhxy.mapper;

import com.zhxy.domain.CpModule;

public interface CpModuleMapper {
    int deleteByPrimaryKey(Integer moduleid);

    int insert(CpModule record);

    int insertSelective(CpModule record);

    CpModule selectByPrimaryKey(Integer moduleid);

    int updateByPrimaryKeySelective(CpModule record);

    int updateByPrimaryKey(CpModule record);
}
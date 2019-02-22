package com.zhxy.mapper;

import com.zhxy.domain.CpRoleModule;

public interface CpRoleModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpRoleModule record);

    int insertSelective(CpRoleModule record);

    CpRoleModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpRoleModule record);

    int updateByPrimaryKey(CpRoleModule record);
}
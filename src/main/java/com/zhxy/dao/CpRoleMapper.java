package com.zhxy.dao;

import com.zhxy.domain.CpRole;

public interface CpRoleMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(CpRole record);

    int insertSelective(CpRole record);

    CpRole selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(CpRole record);

    int updateByPrimaryKey(CpRole record);
}
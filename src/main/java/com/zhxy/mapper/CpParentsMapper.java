package com.zhxy.mapper;

import com.zhxy.domain.CpParents;

public interface CpParentsMapper {
    int deleteByPrimaryKey(Integer parentsid);

    int insert(CpParents record);

    int insertSelective(CpParents record);

    CpParents selectByPrimaryKey(Integer parentsid);

    int updateByPrimaryKeySelective(CpParents record);

    int updateByPrimaryKey(CpParents record);
}
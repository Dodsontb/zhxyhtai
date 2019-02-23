package com.zhxy.dao;

import com.zhxy.domain.Versions;

public interface VersionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Versions record);

    int insertSelective(Versions record);

    Versions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Versions record);

    int updateByPrimaryKey(Versions record);
}
package com.zhxy.dao;

import com.zhxy.domain.VersionCurr;

public interface VersionCurrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VersionCurr record);

    int insertSelective(VersionCurr record);

    VersionCurr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VersionCurr record);

    int updateByPrimaryKey(VersionCurr record);
}
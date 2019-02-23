package com.zhxy.dao;

import com.zhxy.domain.VersionInfo;

public interface VersionInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VersionInfo record);

    int insertSelective(VersionInfo record);

    VersionInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VersionInfo record);

    int updateByPrimaryKey(VersionInfo record);
}
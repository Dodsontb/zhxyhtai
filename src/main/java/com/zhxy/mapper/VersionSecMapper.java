package com.zhxy.dao;

import com.zhxy.domain.VersionSec;

public interface VersionSecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VersionSec record);

    int insertSelective(VersionSec record);

    VersionSec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VersionSec record);

    int updateByPrimaryKey(VersionSec record);
}
package com.zhxy.dao;

import com.zhxy.domain.Yuangongkaoqin;

public interface YuangongkaoqinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yuangongkaoqin record);

    int insertSelective(Yuangongkaoqin record);

    Yuangongkaoqin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yuangongkaoqin record);

    int updateByPrimaryKey(Yuangongkaoqin record);
}
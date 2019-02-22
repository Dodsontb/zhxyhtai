package com.zhxy.mapper;

import com.zhxy.domain.Yuangongqingjia;

public interface YuangongqingjiaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yuangongqingjia record);

    int insertSelective(Yuangongqingjia record);

    Yuangongqingjia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yuangongqingjia record);

    int updateByPrimaryKey(Yuangongqingjia record);
}
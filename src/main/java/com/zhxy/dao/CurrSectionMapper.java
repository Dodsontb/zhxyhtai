package com.zhxy.dao;

import com.zhxy.domain.CurrSection;

public interface CurrSectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CurrSection record);

    int insertSelective(CurrSection record);

    CurrSection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CurrSection record);

    int updateByPrimaryKey(CurrSection record);
}
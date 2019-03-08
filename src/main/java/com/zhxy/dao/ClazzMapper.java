package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.Clazz;

public interface ClazzMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
    
    List<Clazz> selectAll();
}
package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.StuClazz;

public interface StuClazzMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StuClazz record);

    int insertSelective(StuClazz record);

    StuClazz selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StuClazz record);

    int updateByPrimaryKey(StuClazz record);
    
    List<StuClazz> clazzbysid(Integer cid);
}
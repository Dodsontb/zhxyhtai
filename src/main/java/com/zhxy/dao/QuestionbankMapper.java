package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.Questionbank;

public interface QuestionbankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Questionbank record);

    int insertSelective(Questionbank record);

    Questionbank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Questionbank record);

    int updateByPrimaryKey(Questionbank record);
    
    Questionbank selectByid(int pid);
}
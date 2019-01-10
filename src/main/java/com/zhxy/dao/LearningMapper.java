package com.zhxy.dao;

import com.zhxy.domain.Learning;

public interface LearningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Learning record);

    int insertSelective(Learning record);

    Learning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Learning record);

    int updateByPrimaryKey(Learning record);
}
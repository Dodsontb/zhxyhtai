package com.zhxy.dao;

import com.zhxy.domain.Studentassignment;

public interface StudentassignmentMapper {
    int deleteByPrimaryKey(Integer ljxTid);

    int insert(Studentassignment record);

    int insertSelective(Studentassignment record);

    Studentassignment selectByPrimaryKey(Integer ljxTid);

    int updateByPrimaryKeySelective(Studentassignment record);

    int updateByPrimaryKey(Studentassignment record);
}
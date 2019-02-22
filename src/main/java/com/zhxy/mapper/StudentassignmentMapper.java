package com.zhxy.mapper;

import com.zhxy.domain.Studentassignment;

public interface StudentassignmentMapper {
    int deleteByPrimaryKey(Integer ljxtid);

    int insert(Studentassignment record);

    int insertSelective(Studentassignment record);

    Studentassignment selectByPrimaryKey(Integer ljxtid);

    int updateByPrimaryKeySelective(Studentassignment record);

    int updateByPrimaryKey(Studentassignment record);
}
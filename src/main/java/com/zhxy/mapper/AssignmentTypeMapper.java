package com.zhxy.mapper;

import com.zhxy.domain.AssignmentType;

public interface AssignmentTypeMapper {
    int deleteByPrimaryKey(Integer ljxtid);

    int insert(AssignmentType record);

    int insertSelective(AssignmentType record);

    AssignmentType selectByPrimaryKey(Integer ljxtid);

    int updateByPrimaryKeySelective(AssignmentType record);

    int updateByPrimaryKey(AssignmentType record);
}
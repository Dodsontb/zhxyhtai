package com.zhxy.dao;

import com.zhxy.domain.AssignmentType;

public interface AssignmentTypeMapper {
    int deleteByPrimaryKey(Integer ljxTid);

    int insert(AssignmentType record);

    int insertSelective(AssignmentType record);

    AssignmentType selectByPrimaryKey(Integer ljxTid);

    int updateByPrimaryKeySelective(AssignmentType record);

    int updateByPrimaryKey(AssignmentType record);
}
package com.zhxy.mapper;

import com.zhxy.domain.AssignmentPutOff;

public interface AssignmentPutOffMapper {
    int deleteByPrimaryKey(Integer ljxtuid);

    int insert(AssignmentPutOff record);

    int insertSelective(AssignmentPutOff record);

    AssignmentPutOff selectByPrimaryKey(Integer ljxtuid);

    int updateByPrimaryKeySelective(AssignmentPutOff record);

    int updateByPrimaryKey(AssignmentPutOff record);
}
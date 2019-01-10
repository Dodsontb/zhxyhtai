package com.zhxy.dao;

import com.zhxy.domain.AssignmentPutOff;

public interface AssignmentPutOffMapper {
    int deleteByPrimaryKey(Integer ljxTuid);

    int insert(AssignmentPutOff record);

    int insertSelective(AssignmentPutOff record);

    AssignmentPutOff selectByPrimaryKey(Integer ljxTuid);

    int updateByPrimaryKeySelective(AssignmentPutOff record);

    int updateByPrimaryKey(AssignmentPutOff record);
}
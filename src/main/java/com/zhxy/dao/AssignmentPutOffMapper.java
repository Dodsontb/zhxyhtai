package com.zhxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.AssignmentPutOff;

@Mapper
public interface AssignmentPutOffMapper {
    int deleteByPrimaryKey(Integer ljxtuid);

    int insert(AssignmentPutOff record);

    int insertSelective(AssignmentPutOff record);

    AssignmentPutOff selectByPrimaryKey(Integer ljxtuid);

    int updateByPrimaryKeySelective(AssignmentPutOff record);

    int updateByPrimaryKey(AssignmentPutOff record);
    
    List<AssignmentPutOff> putoff(Integer ljxUid);
    
    int putoffinsert(AssignmentPutOff assignmentputoff);
}
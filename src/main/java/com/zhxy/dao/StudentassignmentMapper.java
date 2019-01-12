package com.zhxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.Studentassignment;

@Mapper
public interface StudentassignmentMapper {
    int deleteByPrimaryKey(Integer ljxTid);

    int insert(Studentassignment record);

    int insertSelective(Studentassignment record);

    Studentassignment selectByPrimaryKey(Integer ljxTid);

    int updateByPrimaryKeySelective(Studentassignment record);

    int updateByPrimaryKey(Studentassignment record);
    
    List<Studentassignment> stuquery();
}
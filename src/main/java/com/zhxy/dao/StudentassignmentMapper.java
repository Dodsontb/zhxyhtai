package com.zhxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.Studentassignment;

@Mapper
public interface StudentassignmentMapper {
    int deleteByPrimaryKey(Integer ljxtid);

    int insert(Studentassignment record);

    int insertSelective(Studentassignment record);

    Studentassignment selectByPrimaryKey(Integer ljxtid);

    int updateByPrimaryKeySelective(Studentassignment record);

    int updateByPrimaryKey(Studentassignment record);
    
    List<Studentassignment> stuquery(Integer ljxTid);
    
    List<Studentassignment> stuType(@Param("ljxtype")Integer ljxtype,@Param("ljxTid")Integer ljxTid);
    
    List<Studentassignment> stutime();
    
    Integer stuinsert(Studentassignment stu);
}
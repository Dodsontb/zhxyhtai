package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.CpStudent;

public interface CpStudentMapper {
    int deleteByPrimaryKey(Integer studentid);

    int insert(CpStudent record);

    int insertSelective(CpStudent record);

    CpStudent selectByPrimaryKey(Integer studentid);

    int updateByPrimaryKeySelective(CpStudent record);

    int updateByPrimaryKey(CpStudent record);
    
    List<CpStudent> queryStudentAll();
    
    int insertStudent(CpStudent ss);
}
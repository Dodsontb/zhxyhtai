package com.zhxy.dao;

import com.zhxy.domain.TeacherAssignment;

public interface TeacherAssignmentMapper {
    int deleteByPrimaryKey(Integer ljxrid);

    int insert(TeacherAssignment record);

    int insertSelective(TeacherAssignment record);

    TeacherAssignment selectByPrimaryKey(Integer ljxrid);

    int updateByPrimaryKeySelective(TeacherAssignment record);

    int updateByPrimaryKey(TeacherAssignment record);
}
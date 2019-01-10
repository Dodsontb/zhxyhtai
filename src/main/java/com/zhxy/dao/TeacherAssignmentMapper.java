package com.zhxy.dao;

import com.zhxy.domain.TeacherAssignment;

public interface TeacherAssignmentMapper {
    int deleteByPrimaryKey(Integer ljxRid);

    int insert(TeacherAssignment record);

    int insertSelective(TeacherAssignment record);

    TeacherAssignment selectByPrimaryKey(Integer ljxRid);

    int updateByPrimaryKeySelective(TeacherAssignment record);

    int updateByPrimaryKey(TeacherAssignment record);
}
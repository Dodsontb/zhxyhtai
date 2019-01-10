package com.zhxy.dao;

import com.zhxy.domain.TeacherAssignmentTarget;

public interface TeacherAssignmentTargetMapper {
    int deleteByPrimaryKey(Integer ljxId);

    int insert(TeacherAssignmentTarget record);

    int insertSelective(TeacherAssignmentTarget record);

    TeacherAssignmentTarget selectByPrimaryKey(Integer ljxId);

    int updateByPrimaryKeySelective(TeacherAssignmentTarget record);

    int updateByPrimaryKey(TeacherAssignmentTarget record);
}
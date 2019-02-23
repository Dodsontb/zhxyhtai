package com.zhxy.mapper;

import com.zhxy.domain.TeacherAssignmentTarget;

public interface TeacherAssignmentTargetMapper {
    int deleteByPrimaryKey(Integer ljxid);

    int insert(TeacherAssignmentTarget record);

    int insertSelective(TeacherAssignmentTarget record);

    TeacherAssignmentTarget selectByPrimaryKey(Integer ljxid);

    int updateByPrimaryKeySelective(TeacherAssignmentTarget record);

    int updateByPrimaryKey(TeacherAssignmentTarget record);
}
package com.zhxy.mapper;

import com.zhxy.domain.TeacherHistory;

public interface TeacherHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherHistory record);

    int insertSelective(TeacherHistory record);

    TeacherHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherHistory record);

    int updateByPrimaryKey(TeacherHistory record);
}
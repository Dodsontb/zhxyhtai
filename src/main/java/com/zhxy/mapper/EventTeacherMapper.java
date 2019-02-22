package com.zhxy.mapper;

import com.zhxy.domain.EventTeacher;

public interface EventTeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EventTeacher record);

    int insertSelective(EventTeacher record);

    EventTeacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EventTeacher record);

    int updateByPrimaryKey(EventTeacher record);
}
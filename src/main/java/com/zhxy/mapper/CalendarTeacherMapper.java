package com.zhxy.mapper;

import com.zhxy.domain.CalendarTeacher;

public interface CalendarTeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CalendarTeacher record);

    int insertSelective(CalendarTeacher record);

    CalendarTeacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CalendarTeacher record);

    int updateByPrimaryKey(CalendarTeacher record);
}
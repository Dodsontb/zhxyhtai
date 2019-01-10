package com.zhxy.dao;

import com.zhxy.domain.ClassCalendar;

public interface ClassCalendarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassCalendar record);

    int insertSelective(ClassCalendar record);

    ClassCalendar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassCalendar record);

    int updateByPrimaryKey(ClassCalendar record);
}
package com.zhxy.dao;

import com.zhxy.domain.TeacherCore;

public interface TeacherCoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherCore record);

    int insertSelective(TeacherCore record);

    TeacherCore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherCore record);

    int updateByPrimaryKey(TeacherCore record);
}
package com.zhxy.mapper;

import com.zhxy.domain.GradeFloor;

public interface GradeFloorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GradeFloor record);

    int insertSelective(GradeFloor record);

    GradeFloor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GradeFloor record);

    int updateByPrimaryKey(GradeFloor record);
}
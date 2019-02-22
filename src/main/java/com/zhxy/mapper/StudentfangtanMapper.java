package com.zhxy.mapper;

import com.zhxy.domain.Studentfangtan;

public interface StudentfangtanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studentfangtan record);

    int insertSelective(Studentfangtan record);

    Studentfangtan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studentfangtan record);

    int updateByPrimaryKey(Studentfangtan record);
}
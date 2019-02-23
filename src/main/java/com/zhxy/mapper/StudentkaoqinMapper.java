package com.zhxy.mapper;

import com.zhxy.domain.Studentkaoqin;

public interface StudentkaoqinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studentkaoqin record);

    int insertSelective(Studentkaoqin record);

    Studentkaoqin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studentkaoqin record);

    int updateByPrimaryKey(Studentkaoqin record);
}
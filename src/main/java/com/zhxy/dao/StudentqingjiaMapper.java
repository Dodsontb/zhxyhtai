package com.zhxy.dao;

import com.zhxy.domain.Studentqingjia;

public interface StudentqingjiaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studentqingjia record);

    int insertSelective(Studentqingjia record);

    Studentqingjia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studentqingjia record);

    int updateByPrimaryKey(Studentqingjia record);
}
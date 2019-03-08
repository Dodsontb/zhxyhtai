package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.Classs;

public interface ClasssMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(Classs record);

    int insertSelective(Classs record);

    Classs selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(Classs record);

    int updateByPrimaryKey(Classs record);
    
    List<Classs> selectAll();
}
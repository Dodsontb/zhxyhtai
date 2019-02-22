package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.Softtype;

public interface SofttypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Softtype record);

    int insertSelective(Softtype record);

    Softtype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Softtype record);

    int updateByPrimaryKey(Softtype record);
    
    List<Softtype> query();
}
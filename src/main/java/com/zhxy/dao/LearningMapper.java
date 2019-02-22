package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.Learning;

import io.lettuce.core.dynamic.annotation.Param;

public interface LearningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Learning record);

    int insertSelective(Learning record);

    Learning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Learning record);

    int updateByPrimaryKey(Learning record);
    
    List<Learning> cp_selectBycid(@Param("cid")Integer cid,@Param("templateid")Integer templateid);
}
package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.Learning;

import io.lettuce.core.dynamic.annotation.Param;

@Mapper
public interface LearningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Learning record);

    int insertSelective(Learning record);

    Learning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Learning record);

    int updateByPrimaryKey(Learning record);
    
    List<Learning> cp_selectBycid(@Param("cid")Integer cid,@Param("templateid")Integer templateid);
    
    Learning sumupdate(Learning learning);
    
    int updateStatuslearning(Integer uid,Integer templateid);
    
    List<Learning> selectstulearning(int uid);
}
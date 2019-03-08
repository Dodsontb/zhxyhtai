package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.Cquestion;

import io.lettuce.core.dynamic.annotation.Param;

public interface CquestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cquestion record);

    int insertCquestion(Cquestion record);

    Cquestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cquestion record);

    int updateByPrimaryKey(Cquestion record);
    
    List<Cquestion> queryCquestion(int qid);
    
    int updatefrequency(int id);
    
    Cquestion self_motion(@Param("sid")Integer sid,Integer tid);
    
    
}
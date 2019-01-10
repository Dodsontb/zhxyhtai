package com.zhxy.dao;

import com.zhxy.domain.Cquestion;

public interface CquestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cquestion record);

    int insertSelective(Cquestion record);

    Cquestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cquestion record);

    int updateByPrimaryKey(Cquestion record);
}
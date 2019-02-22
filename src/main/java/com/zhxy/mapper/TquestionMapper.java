package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.Tquestion;

public interface TquestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tquestion record);

    int insertSelective(Tquestion record);

    Tquestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tquestion record);

    int updateByPrimaryKey(Tquestion record);
    
    List<Tquestion> queryTquestion(int qid);
    
    int insertTquestion(Tquestion record);
}
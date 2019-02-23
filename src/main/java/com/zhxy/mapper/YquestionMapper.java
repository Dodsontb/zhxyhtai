package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.Yquestion;

public interface YquestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yquestion record);

    int insertSelective(Yquestion record);

    Yquestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yquestion record);

    int updateByPrimaryKey(Yquestion record);
    List<Yquestion> queryYquestion(int qid);
    int insertYquestion(Yquestion record);
}
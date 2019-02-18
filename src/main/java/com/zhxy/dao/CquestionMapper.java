package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.Cquestion;
import com.zhxy.domain.Yquestion;

public interface CquestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cquestion record);

    int insertCquestion(Cquestion record);

    Cquestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cquestion record);

    int updateByPrimaryKey(Cquestion record);
    
    List<Cquestion> queryCquestion(int qid);
    
    
}
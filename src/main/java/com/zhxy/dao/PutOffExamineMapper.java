package com.zhxy.dao;

import com.zhxy.domain.PutOffExamine;

public interface PutOffExamineMapper {
    int deleteByPrimaryKey(Integer ljxSid);

    int insert(PutOffExamine record);

    int insertSelective(PutOffExamine record);

    PutOffExamine selectByPrimaryKey(Integer ljxSid);

    int updateByPrimaryKeySelective(PutOffExamine record);

    int updateByPrimaryKey(PutOffExamine record);
}
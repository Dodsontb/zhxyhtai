package com.zhxy.mapper;

import com.zhxy.domain.NoticeRelation;

public interface NoticeRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoticeRelation record);

    int insertSelective(NoticeRelation record);

    NoticeRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NoticeRelation record);

    int updateByPrimaryKey(NoticeRelation record);
}
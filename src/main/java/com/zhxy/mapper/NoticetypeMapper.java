package com.zhxy.mapper;

import com.zhxy.domain.Noticetype;

public interface NoticetypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(Noticetype record);

    int insertSelective(Noticetype record);

    Noticetype selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(Noticetype record);

    int updateByPrimaryKey(Noticetype record);
}
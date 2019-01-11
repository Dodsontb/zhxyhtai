package com.zhxy.dao;

import com.zhxy.domain.NoticeAffix;

public interface NoticeAffixMapper {
    int deleteByPrimaryKey(Integer affixId);

    int insert(NoticeAffix record);

    int insertSelective(NoticeAffix record);

    NoticeAffix selectByPrimaryKey(Integer affixId);

    int updateByPrimaryKeySelective(NoticeAffix record);

    int updateByPrimaryKey(NoticeAffix record);
}
package com.zhxy.dao;

import com.zhxy.domain.Committee;

public interface CommitteeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Committee record);

    int insertSelective(Committee record);

    Committee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Committee record);

    int updateByPrimaryKey(Committee record);
}
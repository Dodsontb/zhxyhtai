package com.zhxy.dao;

import com.zhxy.domain.Wenjuan;

public interface WenjuanMapper {
    int deleteByPrimaryKey(Integer wenjuanid);

    int insert(Wenjuan record);

    int insertSelective(Wenjuan record);

    Wenjuan selectByPrimaryKey(Integer wenjuanid);

    int updateByPrimaryKeySelective(Wenjuan record);

    int updateByPrimaryKey(Wenjuan record);
}
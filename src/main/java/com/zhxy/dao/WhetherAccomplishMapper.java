package com.zhxy.dao;

import com.zhxy.domain.WhetherAccomplish;

public interface WhetherAccomplishMapper {
    int deleteByPrimaryKey(Integer ljxWid);

    int insert(WhetherAccomplish record);

    int insertSelective(WhetherAccomplish record);

    WhetherAccomplish selectByPrimaryKey(Integer ljxWid);

    int updateByPrimaryKeySelective(WhetherAccomplish record);

    int updateByPrimaryKey(WhetherAccomplish record);
}
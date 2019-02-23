package com.zhxy.mapper;

import com.zhxy.domain.WhetherAccomplish;

public interface WhetherAccomplishMapper {
    int deleteByPrimaryKey(Integer ljxwid);

    int insert(WhetherAccomplish record);

    int insertSelective(WhetherAccomplish record);

    WhetherAccomplish selectByPrimaryKey(Integer ljxwid);

    int updateByPrimaryKeySelective(WhetherAccomplish record);

    int updateByPrimaryKey(WhetherAccomplish record);
}
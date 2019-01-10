package com.zhxy.dao;

import com.zhxy.domain.Qingjiatype;

public interface QingjiatypeMapper {
    int deleteByPrimaryKey(Integer qingjiatype);

    int insert(Qingjiatype record);

    int insertSelective(Qingjiatype record);

    Qingjiatype selectByPrimaryKey(Integer qingjiatype);

    int updateByPrimaryKeySelective(Qingjiatype record);

    int updateByPrimaryKey(Qingjiatype record);
}
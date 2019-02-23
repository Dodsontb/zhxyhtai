package com.zhxy.mapper;

import com.zhxy.domain.CpParentsStudent;

public interface CpParentsStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CpParentsStudent record);

    int insertSelective(CpParentsStudent record);

    CpParentsStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpParentsStudent record);

    int updateByPrimaryKey(CpParentsStudent record);
}
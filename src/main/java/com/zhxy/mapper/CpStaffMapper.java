package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.CpStaff;

public interface CpStaffMapper {
    int deleteByPrimaryKey(Integer staffid);

    int insert(CpStaff record);

    int insertSelective(CpStaff record);

    CpStaff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(CpStaff record);

    int updateByPrimaryKey(CpStaff record);
    
    List<CpStaff> findList();
}
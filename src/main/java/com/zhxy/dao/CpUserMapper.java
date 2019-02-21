package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.CpUser;

public interface CpUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(CpUser record);

    int insertSelective(CpUser record);

    CpUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(CpUser record);

    int updateByPrimaryKey(CpUser record);
    
    CpUser login(String username,String password);
    
    List<CpUser> getUserlist(Integer chatid,Integer userid);
    
    List<CpUser> queryUserGetId();
}
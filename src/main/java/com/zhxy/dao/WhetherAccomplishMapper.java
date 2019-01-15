package com.zhxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.WhetherAccomplish;

@Mapper
public interface WhetherAccomplishMapper {
    int deleteByPrimaryKey(Integer ljxWid);

    int insert(WhetherAccomplish record);

    int insertSelective(WhetherAccomplish record);

    WhetherAccomplish selectByPrimaryKey(Integer ljxWid);

    int updateByPrimaryKeySelective(WhetherAccomplish record);

    int updateByPrimaryKey(WhetherAccomplish record);
    
    List<WhetherAccomplish>whether(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno);
}
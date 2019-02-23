package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.KaoqinStatis;
@Mapper
public interface KaoqinStatisMapper {
	
	public List<KaoqinStatis> queryKaoqinStatisByClassId(@Param("classId")String classId, @Param("dateCondition")String dateCondition, @Param("date1")String date1, @Param("date2")String date2);
}

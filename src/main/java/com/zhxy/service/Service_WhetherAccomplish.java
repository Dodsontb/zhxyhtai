package com.zhxy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.WhetherAccomplish;

public interface Service_WhetherAccomplish {

	public List<WhetherAccomplish>whether(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno);
}

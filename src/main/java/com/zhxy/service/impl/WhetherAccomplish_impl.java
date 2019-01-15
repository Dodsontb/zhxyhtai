package com.zhxy.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.dao.WhetherAccomplishMapper;
import com.zhxy.domain.WhetherAccomplish;
import com.zhxy.service.Service_WhetherAccomplish;

@Service
public class WhetherAccomplish_impl implements Service_WhetherAccomplish{

	@Autowired
	WhetherAccomplishMapper mapper;
	
	public List<WhetherAccomplish> whether(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno){
		return mapper.whether(ljxUid,ljxYesno);
	}
}

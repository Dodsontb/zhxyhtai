package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Learning;

public interface learningservice {

	
	List<Learning> cp_selectBycid(Integer cid,Integer templateid);
	
	Learning sumupdate(Learning learning);
	
	int updateStatuslearning(Integer uid,Integer templateid);
	
	int insertSelective(Learning learning);
	
	List<Learning> selectstulearning(int uid);
}

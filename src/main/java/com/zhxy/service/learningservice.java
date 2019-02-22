package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.Learning;

public interface learningservice {

	
	List<Learning> cp_selectBycid(Integer cid,Integer templateid);
}

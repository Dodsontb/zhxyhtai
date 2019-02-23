package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.BarStatisListData;
import com.zhxy.domain.KaoqinStatis;

public interface KaoqinStatisService {
	
	public BarStatisListData queryKaoqinStatisByClassId(String classId, String dateCondition, String date1, String date2);

}

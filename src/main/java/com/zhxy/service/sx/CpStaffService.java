package com.zhxy.service.sx;

import java.util.List;

import com.zhxy.domain.CpStaff;
import com.zhxy.domain.Qingjiatype;
import com.zhxy.domain.Studentqingjia;
import io.lettuce.core.dynamic.annotation.Param;

public interface CpStaffService {
	 List<CpStaff> findList();
	 CpStaff querybyid(Integer id);
}

package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.CpStaffMapper;
import com.zhxy.domain.CpStaff;
import com.zhxy.service.sx.CpStaffService;
@Service
public class CpStaffServiceImpl implements CpStaffService {

	@Autowired
	CpStaffMapper cpStaffMapper;

	@Override
	public List<CpStaff> findList() {
		// TODO Auto-generated method stub
		return cpStaffMapper.findList();
	}

	

}

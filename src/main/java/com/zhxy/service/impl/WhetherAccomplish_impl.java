package com.zhxy.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.TeacherHistory;
import com.zhxy.domain.WhetherAccomplish;
import com.zhxy.mapper.WhetherAccomplishMapper;
import com.zhxy.service.Service_WhetherAccomplish;

@Service
public class WhetherAccomplish_impl implements Service_WhetherAccomplish{

	@Autowired
	WhetherAccomplishMapper mapper;
	
	public List<WhetherAccomplish> whether(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno){
		return mapper.whether(ljxUid,ljxYesno);
	}

	@Override
	public List<WhetherAccomplish> whether2(Integer ljxUid, String ljxYesno,Integer ljxtype) {
		// TODO Auto-generated method stub
		return mapper.whether2(ljxUid, ljxYesno,ljxtype);
	}

	@Override
	public List<WhetherAccomplish> whether3(Integer ljxuid) {
		// TODO Auto-generated method stub
		return mapper.whether3(ljxuid);
	}

	@Override
	public int udatew() {
		// TODO Auto-generated method stub
		return mapper.udatew();
	}

	@Override
	public int deletestu(Integer ljxtd, Integer ljxuid) {
		// TODO Auto-generated method stub
		return mapper.deletestu(ljxtd, ljxuid);
	}

	@Override
	public int pilinsert(Integer ljxtid, List<AssignmentPutOff> u) {
		// TODO Auto-generated method stub
		return mapper.pilinsert(ljxtid, u);
	}

	@Override
	public List<TeacherHistory> teacher_history() {
		// TODO Auto-generated method stub
		return mapper.teacher_history();
	}
	
}

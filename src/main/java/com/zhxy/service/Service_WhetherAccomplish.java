package com.zhxy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.CpStudent;
import com.zhxy.domain.TeacherHistory;
import com.zhxy.domain.WhetherAccomplish;

public interface Service_WhetherAccomplish {

	public List<WhetherAccomplish>whether(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno);
	List<WhetherAccomplish>whether2(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno,@Param("ljxtype")Integer ljxtype);
	List<WhetherAccomplish>whether3(Integer ljxuid);
	int udatew();
    int deletestu(@Param("ljxtid")Integer ljxtid,@Param("ljxuid")Integer ljxuid);
    int pilinsert(@Param("ljxtid")Integer ljxtid,@Param("u")List<CpStudent> u);
    
    List<TeacherHistory>teacher_history();
}

package com.zhxy.service;

import java.util.List;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.zhxy.domain.Studentassignment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public interface Service_Studentassinment {

	public List<Studentassignment> stuquery(Integer ljxTid);
	
/*	List<Studentassignment> stuType(@Param("ljxtype")Integer ljxtype,@Param("ljxyesno")String ljxyesno,@Param("ljxuid")Integer ljxuid);*/
	
	@Scheduled(cron = "/5 * ?")
	public void schediled();
	
	int stuinsert(Studentassignment stu);
=======
import com.zhxy.domain.Studentassignment;

public interface Service_Studentassinment {

	public List<Studentassignment> stuquery();
>>>>>>> branch 'master' of https://github.com/Dodsontb/zhxyhtai.git
}

package com.zhxy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.zhxy.domain.AssignmentType;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.CpStudent;
import com.zhxy.domain.Grade;
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
	
	List<Studentassignment> fuzao(@Param("teacherid")Integer teacherid,@Param("name")String name,@Param("yesno")String yesno);
	
	List<CpStudent> cpsudentclazz(String clazz);
	
	List<Grade> queryreade();
    
    List<Clazz> queryclazz(@Param("teacherid")Integer teacherid, @Param("gradeid") Integer gradeid);
    
    List<Studentassignment> naljxcla(String ljxTname);
    
    List<Studentassignment> tuichiquery(String ljxclaname);
    
    List<AssignmentType> typequery();
}

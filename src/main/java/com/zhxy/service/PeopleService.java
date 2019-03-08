package com.zhxy.service;

import com.zhxy.domain.People;

import java.util.Date;
import java.util.List;

public interface PeopleService {

	List<Integer> position(People people);
	
	List<People> bans();
	
	People queryById(int id);
	
	People butterTeacher();
	
	boolean existBan();
	
	boolean existTeacher(int gid,Integer mid);
	
	List<People> teachers(int cid);
	
	List<People> teachers(int cid,Integer[] lists);
	
	Integer tid(int id,Date date);
	
	People nowTeacher(int id);
}

package com.zhxy.service;

import java.util.Date;
import java.util.List;

import com.zhxy.domain.Curriculum;
import com.zhxy.domain.Section;

public interface CurrService {

	List<Curriculum> queryCurriculums(int mid,int gid);
	
	List<Curriculum> curriculums(Integer mid,Integer gid);
	
	Curriculum curriculum(Integer id);
	
	void addSection(List<Section> list);
	
	void addCurr(Curriculum curriculum);
	
	void deleteSec(Curriculum curriculum);
	
	void deleteCurr(Integer[] list);
	
	void updateCurr(Curriculum curriculum);
	
	List<Curriculum> restCurr(Integer vid,Integer mid,Integer gid);
	
	List<Curriculum> curriculums(Integer vid);
	
	List<Curriculum> versionCurr(int vid,int gid,Integer mid);
	
	boolean existCurr(int gid,Integer mid);
	
	void delCurr(int cid);
	
	void updateNowCurrStart(int id,Date date);

	void updateNowCurrEnd(int id,Date date);
	
	Integer nextCurr(int id,Date date);
	
	Integer nowId(int id,Date date);
	
	Integer nowId(int id);
}

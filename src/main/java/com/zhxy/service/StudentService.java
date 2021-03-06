package com.zhxy.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhxy.domain.Student;

public interface StudentService {

	boolean existStudent(Integer mid);
	
	List<Student> students(Integer mid);
	
	List<Student> students(int page, List<Student> list);
	
	PageInfo<Student> querys(int page,Integer mid, List<Student> list);
	
	PageInfo<Student> frees(int page,Integer mid, List<Student> list);
	
	PageInfo<Student> query(int page,int size);
	
	void stuNo(List<Student> students);
	
	PageInfo<Student> notInThis(int page,int cid,List<Student> list);
}

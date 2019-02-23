package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.StudentqingjiaMapper;
import com.zhxy.domain.Qingjiatype;
import com.zhxy.domain.Studentqingjia;
import com.zhxy.service.sx.QingJiaService;
@Service
public class QingJiaServiceImpl implements QingJiaService {

	@Autowired
		StudentqingjiaMapper StudentqingjiaMapper;

	@Override
	public List<Studentqingjia> queryAllStu() {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.queryAllStu();
	}

	@Override
	public Studentqingjia queryByStuId(Integer id) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.queryByStuId(id);
	}

	@Override
	public int updateStu(Integer id, Integer StuStatus) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.updateStu(id, StuStatus);
	}

	@Override
	public List<Studentqingjia> queryByStudentName(String name) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.queryByStudentName(name);
	}

	@Override
	public List<Studentqingjia> queryByStudentNameAndStudentStatu(Integer StuStatus,String name) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.queryByStudentNameAndStudentStatu(StuStatus, name);
	}

	@Override
	public List<Qingjiatype> queryAllStatus(Integer id) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.queryAllStatus(id);
	}

	@Override
	public Studentqingjia queryByStaffid(Integer id) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.queryByStaffid(id);
	}

	@Override
	public List<Studentqingjia> queryByStaffName(String name) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.queryByStaffName(name);
	}

	@Override
	public int deleteStu(Integer id) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.deleteStu(id);
	}

	@Override
	public int insert(Studentqingjia stu) {
		// TODO Auto-generated method stub
		return StudentqingjiaMapper.insert(stu);
	}
	

}

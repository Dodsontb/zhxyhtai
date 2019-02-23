package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhxy.mapper.*;
import com.zhxy.domain.Classs;
import com.zhxy.domain.Statuastype;
import com.zhxy.domain.Studentkaoqin;
import com.zhxy.service.sx.KaoQinService;

@Service
@Transactional
public class KaoQinServiceImpl implements KaoQinService{

	@Autowired
	StudentkaoqinMapper studentkaoqinMapper;

	@Override
	public PageInfo<Studentkaoqin> queryAll() {
		// TODO Auto-generated method stub
		PageHelper.startPage(1,2);
		List<Studentkaoqin> list = studentkaoqinMapper.queryAll();
		PageInfo<Studentkaoqin> pb = new PageInfo<Studentkaoqin>(list);
		List<Studentkaoqin> temp=pb.getList();
		for (Studentkaoqin studentkaoqin : list) {
			System.out.println(studentkaoqin.getStuname());
		}
		return pb;
	}

	@Override
	public List<Studentkaoqin> queryByStudentName(String stuName) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryByStudentName(stuName);
	}

	@Override
	public Studentkaoqin queryByStuId(Integer id) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryByStuId(id);
	}


	@Override
	public int updateStu(Integer id, Integer StuStatus) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.updateStu(id, StuStatus);
	}

	@Override
	public Statuastype queryAllStatus(Integer id) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryAllStatus(id);
	}

	@Override
	public Classs queryAllClass(Integer id) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryAllClass(id);
	}

	@Override
	public PageInfo<Studentkaoqin> queryByClassNameAndStuStatus(Integer classID, String StuStatus,Integer page) {
		// TODO Auto-generated method stub

		PageHelper.startPage(page, 2);
		return new PageInfo<Studentkaoqin>(studentkaoqinMapper.queryAll());
	}
}

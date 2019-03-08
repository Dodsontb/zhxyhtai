package com.zhxy.service.impl.sx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhxy.dao.*;
import com.zhxy.domain.Classs;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.CpStaff;
import com.zhxy.domain.CpStudent;
import com.zhxy.domain.Statuastype;
import com.zhxy.domain.Studentkaoqin;
import com.zhxy.domain.Yuangongkaoqin;
import com.zhxy.service.sx.KaoQinService;

@Service
@Transactional
public class KaoQinServiceImpl implements KaoQinService{

	@Autowired
	StudentkaoqinMapper studentkaoqinMapper;
	@Autowired
	CpStudentMapper studentMapper;
	@Autowired
	CpStaffMapper  cpstaffMapper;
	@Autowired
	ClazzMapper clazzMapper;
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
	public CpStaff queryAllteacher(Integer id) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryAllteacher(id);
	}

	@Override
	public CpStaff queryteacherByName(String teachName) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryteacherByName(teachName);
	}

	@Override
	public List<Studentkaoqin> queryAll() {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryAll();
	}

	@Override
	public List<Studentkaoqin> queryByClassNameAndStuStatus(Integer id, String name) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryByClassNameAndStuStatus(id, name);
	}

	@Override
	public void batchxs() {
        final List<CpStudent> cpStaffs = studentMapper.selectAll();
        List<Studentkaoqin> list = new ArrayList<>();

        for (int i = 0; i < cpStaffs.size(); i++) {
        	Studentkaoqin studentkaoqin = new Studentkaoqin();
        	studentkaoqin.setStudentid(cpStaffs.get(i).getStudentid());
        	studentkaoqin.setDate(new Date());
        	studentkaoqin.setKaoqinstatus(1);
        	studentkaoqin.setCid(cpStaffs.get(i).getClassid());
        	studentkaoqin.setStaffid(cpStaffs.get(i).getStaffid());
            list.add(studentkaoqin);
        }
        studentkaoqinMapper.insertForeachoh(list);
		
	}

	@Override
	public Clazz queryClass(Integer id) {
		// TODO Auto-generated method stub
		return studentkaoqinMapper.queryClass(id);
	}
}

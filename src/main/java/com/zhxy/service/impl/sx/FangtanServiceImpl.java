package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.StudentfangtanMapper;
import com.zhxy.domain.CpStaff;
import com.zhxy.domain.CpStudent;
import com.zhxy.domain.FangtanType;
import com.zhxy.domain.Studentfangtan;
import com.zhxy.service.sx.FangtanService;

@Service
public class FangtanServiceImpl  implements FangtanService{

	@Autowired
	StudentfangtanMapper StudentfangtanMapper;
	@Override
	public List<Studentfangtan> queryAll() {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.queryAll();
	}

	@Override
	public CpStudent queryByStuId(Integer id) {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.queryByStuId(id);
	}

	@Override
	public List<FangtanType> queryAllStatus(Integer id) {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.queryAllStatus(id);
	}

	@Override
	public int updateStu(Integer id, Integer Status) {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.updateStu(id, Status);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.delete(id);
	}

	@Override
	public List<Studentfangtan> queryByStuNameAndStatus(String name, Integer Status) {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.queryByStuNameAndStatus(name, Status);
	}

	@Override
	public List<Studentfangtan> queryByStuName(String name) {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.queryByStuName(name);
	}

	@Override
	public CpStaff queryByStaffId(Integer id) {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.queryByStaffId(id);
	}

	@Override
	public int insert(Studentfangtan stu) {
		// TODO Auto-generated method stub
		return StudentfangtanMapper.insert(stu);
	}

}

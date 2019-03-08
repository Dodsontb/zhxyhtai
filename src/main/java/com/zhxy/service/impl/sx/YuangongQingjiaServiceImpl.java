package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.mapper.YuangongqingjiaMapper;
import com.zhxy.domain.Qingjiatype;
import com.zhxy.domain.Yuangongqingjia;
import com.zhxy.service.sx.YuangongQingjiaService;

@Service
@Transactional
public class YuangongQingjiaServiceImpl implements YuangongQingjiaService{

	@Autowired
	YuangongqingjiaMapper YuangongqingjiaMapper;
	
	@Override
	public List<Yuangongqingjia> queryAll() {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.queryAll();
	}

	@Override
	public Yuangongqingjia queryById(Integer id) {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.queryById(id);
	}

	@Override
	public List<Yuangongqingjia> queryByName(String name) {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.queryByName(name);
	}

	@Override
	public List<Qingjiatype> queryAllStatus(Integer id) {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.queryAllStatus(id);
	}

	@Override
	public int updateYuan(Integer id, Integer Status) {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.updateYuan(id, Status);
	}

	@Override
	public int delele(Integer id) {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.delele(id);
	}

	@Override
	public List<Yuangongqingjia> queryByNameAndStatus(String name, Integer Status) {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.queryByNameAndStatus(name, Status);
	}

	@Override
	public int insert(Yuangongqingjia yg) {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.insert(yg);
	}

	@Override
	public Yuangongqingjia queryBypositionid(Integer id) {
		// TODO Auto-generated method stub
		return YuangongqingjiaMapper.queryBypositionid(id);
	}

}

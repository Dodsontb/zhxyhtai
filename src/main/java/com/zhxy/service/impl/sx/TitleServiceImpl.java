package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.TitleMapper;
import com.zhxy.domain.Title;
import com.zhxy.service.sx.TitleService;

@Service
public class TitleServiceImpl implements  TitleService {

	@Autowired
	 TitleMapper  titleMapper;

	@Override
	public List<Title> findList() {
		// TODO Auto-generated method stub
		return titleMapper.findList();
	}

	@Override
	public Title findById(Integer id) {
		// TODO Auto-generated method stub
		return titleMapper.findById(id);
	}

	@Override
	public Integer insert(Title title) {
		// TODO Auto-generated method stub
		return titleMapper.insert(title);
	}

	

	
	

}

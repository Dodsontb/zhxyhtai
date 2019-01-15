package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.dao.NoticeMapper;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.Grade;
import com.zhxy.domain.Notice;
import com.zhxy.domain.Noticetype;
import com.zhxy.service.hxk_history;


@Service
public class historyServiceImpl  implements hxk_history{
	
	@Autowired
	NoticeMapper mapper;
	
	@Override
	public List<Notice> queryNoticeAll() {
		// TODO Auto-generated method stub
		return mapper.queryNoticeAll();
	}

	@Override
	public Notice queryNoticeById(int Notice_Id) {
		// TODO Auto-generated method stub
		return mapper.queryNoticeById(Notice_Id);
	}

	@Override
	public List<Notice> queryByHead(Notice notice) {
		// TODO Auto-generated method stub
		return mapper.queryByHead(notice);
	}

	@Override
	public int deleteNotice(int nstate) {
		// TODO Auto-generated method stub
		return mapper.deleteNotice(nstate);
	}

	@Override
	public List<Noticetype> plqueryNoticeType(int typeid) {
		// TODO Auto-generated method stub
		return mapper.plqueryNoticeType(typeid);
	}

	@Override
	public List<Grade> queryGrade() {
		// TODO Auto-generated method stub
		return mapper.queryGrade();
	}

	@Override
	public List<Clazz> queryClazz(String name) {
		// TODO Auto-generated method stub
		return mapper.queryClazz(name);
	}

}

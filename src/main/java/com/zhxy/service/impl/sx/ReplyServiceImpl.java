package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.ReplyMapper;
import com.zhxy.domain.Reply;
import com.zhxy.domain.ReplyDto;
import com.zhxy.service.sx.ReplyService;

@Service
public class ReplyServiceImpl implements  ReplyService {

	@Autowired
	 ReplyMapper  replyMapper;

	@Override
	public List<Reply> findList() {
		// TODO Auto-generated method stub
		return replyMapper.findList();
	}

	@Override
	public Reply findById(Integer id) {
		// TODO Auto-generated method stub
		return replyMapper.findById(id);
	}

	@Override
	public Integer insert(Reply reply) {
		// TODO Auto-generated method stub
		return replyMapper.insert(reply);
	}

	@Override
	public ReplyDto findDtoById(Integer id) {
		// TODO Auto-generated method stub
		return replyMapper.findDtoById(id);
	}

	

	
	

}

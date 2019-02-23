package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.AnswerMapper;
import com.zhxy.domain.Answer;
import com.zhxy.domain.AnswerDto;
import com.zhxy.service.sx.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	AnswerMapper answerMapper;

	@Override
	public List<Answer> findList(Answer Answer) {
		// TODO Auto-generated method stub
		return answerMapper.findList(Answer);
	}

	@Override
	public AnswerDto findById(Integer id) {
		// TODO Auto-generated method stub
		return answerMapper.findById(id);
	}

	@Override
	public Integer insert(Answer Answer) {
		// TODO Auto-generated method stub
		return answerMapper.insert(Answer);
	}

	
	

}

package com.zhxy.service.impl.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.dao.QuestionMapper;
import com.zhxy.domain.CpStaff;
import com.zhxy.domain.Question;
import com.zhxy.service.sx.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionMapper questionMapper;

	@Override
	public List<Question> findList(Question Question) {
		// TODO Auto-generated method stub
		return questionMapper.findList(Question);
	}

	@Override
	public Question findById(Integer id) {
		// TODO Auto-generated method stub
		return questionMapper.findById(id);
	}

	@Override
	public Integer insert(Question Question) {
		// TODO Auto-generated method stub
		return questionMapper.insert(Question);
	}

	
	

}

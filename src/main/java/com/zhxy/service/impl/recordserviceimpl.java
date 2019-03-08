package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.domain.Cquestion;
import com.zhxy.domain.Record;
import com.zhxy.mapper.CquestionMapper;
import com.zhxy.mapper.RecordMapper;
import com.zhxy.mapper.LearningMapper;
import com.zhxy.service.recordservice;

@Service
@Transactional
public class recordserviceimpl implements recordservice{

	@Autowired
	RecordMapper recordMapper;
	@Autowired
	CquestionMapper cp;
	@Autowired
	LearningMapper LearningMapper;
	@Override
	public int insertSelective(Record record) {
		// TODO Auto-generated method stub
		return recordMapper.insertSelective(record);
	}
	@Override
	public int insertxuan(List<Record> record) {	
		int i=recordMapper.insertxuan(record);
		if(i>0) {
			for (Record record2 : record) {
				if(record2.getCid()==1) {
					Cquestion cc=cp.self_motion(record2.getSid(), record2.getTid());
					String t=cc.getCorrect();
					String f=cc.getName1();
					if(f.equals(t)) {
						System.out.println("正确");
					}else {
						recordMapper.updata_scorex(record2);//分数改为0
						cp.updatefrequency(record2.getTid());//错误一题加一次
					}
				}
			}
		}
		return i;
	}
	@Override
	public int updata_scorex(Record record) {
		// TODO Auto-generated method stub
		return recordMapper.updata_scorex(record);
	}
	@Override
	public int updata_scoret(Record record) {
		// TODO Auto-generated method stub
		return recordMapper.updata_scoret(record);
	}
	@Override
	public int updata_scorey(Record record) {
		// TODO Auto-generated method stub
		return recordMapper.updata_scorey(record);
	}
	@Override
	public List<Record> selectxuan(Record record) {
		// TODO Auto-generated method stub
		return recordMapper.selectxuan(record);
	}

}

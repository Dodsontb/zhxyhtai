package com.zhxy.mapper;

import java.util.List;

import com.zhxy.domain.Record;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);
    //新增做题表
    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
    
    int insertxuan(List<Record> record);
    
    int updata_scorex(Record record);
    
    int updata_scoret(Record record);
    
    int updata_scorey(Record record);
    
    List<Record> selectxuan(Record record);
}
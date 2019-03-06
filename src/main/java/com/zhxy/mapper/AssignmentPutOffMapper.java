package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.tomcat.util.descriptor.web.InjectionTarget;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.PutOffExamine;

@Mapper
public interface AssignmentPutOffMapper {
    int deleteByPrimaryKey(Integer ljxtuid);

    int insert(AssignmentPutOff record);

    int insertSelective(AssignmentPutOff record);

    AssignmentPutOff selectByPrimaryKey(Integer ljxtuid);

    int updateByPrimaryKeySelective(AssignmentPutOff record);

    int updateByPrimaryKey(AssignmentPutOff record);
    
    List<AssignmentPutOff> putoff(Integer ljxUid);
    
    int putoffinsert(AssignmentPutOff assignmentputoff);
    
    List<AssignmentPutOff> tuichiqueryA(Integer ljxTid);
    
    List<AssignmentPutOff> xiangx (Integer ljxTuid);
    
    int einsert(PutOffExamine put);
}
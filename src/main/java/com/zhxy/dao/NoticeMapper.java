package com.zhxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.Notice;
import com.zhxy.domain.Noticetype;

import io.lettuce.core.dynamic.annotation.Param;

@Mapper
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer noticeId);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
    
    List<Notice> queryNoticeAll();
    
    Notice queryNoticeById(int Notice_Id);
    
    List<Notice> queryByHead(Notice notice);
    
    
    int deleteNotice(int nstate);
    
    List<Noticetype> plqueryNoticeType(int typeid);
}
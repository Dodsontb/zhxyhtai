package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhxy.domain.Clazz;
import com.zhxy.domain.Grade;
import com.zhxy.domain.HxkPageBean;
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
    
    List<Notice> queryByHead(HxkPageBean<Notice> bean);

    int queryByHeadCount(HxkPageBean<Notice> bean);

    int deleteNotice(int nstate);
    
    List<Noticetype> plqueryNoticeType();
    
    List<Grade> queryGrade();
    
   /* List<Clazz> queryClazz(@Param("name")String name);*/
    List<Clazz> queryClazz();
    
    int insertNotice(Notice notice);
    
    int insertRelation(@Param("cid")int cid,@Param("Notice_Id")int Notice_Id);
    
    int insertImg(@Param("nurl")String nurl,@Param("Notice_Id") int Notice_Id);
    
    int updataNotice();
}
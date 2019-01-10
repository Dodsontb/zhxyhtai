package com.zhxy.dao;

import com.zhxy.domain.Noticeimg;

public interface NoticeimgMapper {
    int deleteByPrimaryKey(Integer imgid);

    int insert(Noticeimg record);

    int insertSelective(Noticeimg record);

    Noticeimg selectByPrimaryKey(Integer imgid);

    int updateByPrimaryKeySelective(Noticeimg record);

    int updateByPrimaryKey(Noticeimg record);
}
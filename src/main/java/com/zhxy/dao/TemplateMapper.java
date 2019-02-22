package com.zhxy.dao;

import java.util.List;

import com.zhxy.domain.Template;

public interface TemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Template record);

    int insertSelective(Template record);

    Template selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Template record);

    int updateByPrimaryKey(Template record);
    
    Template queryTemplate(Integer id);
    
    int insertTemplate(Template record);
    
    List<Template> querybytype(Integer softtypeid);
}
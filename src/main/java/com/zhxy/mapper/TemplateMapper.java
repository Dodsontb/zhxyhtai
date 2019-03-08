package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
    
    List<Template> cp_queryall(String name2);
    
    List<Template> cp_querybyname1(String name1);
    
    Template cp_querycquestion(Integer id);
    
    Template cp_querytquestion(Integer id);
    
    Template cp_queryyquestion(Integer id);
    
    int updatetemplateid(String end,String name1,int id);
    List<Template> queryfabu(@Param("name2")String name2);
}
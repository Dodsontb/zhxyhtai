package com.zhxy.mapper;

<<<<<<< HEAD
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.TeacherHistory;
import com.zhxy.domain.WhetherAccomplish;

@Mapper
public interface WhetherAccomplishMapper {
    int deleteByPrimaryKey(Integer ljxwid);

    int insert(WhetherAccomplish record);

    int insertSelective(WhetherAccomplish record);

    WhetherAccomplish selectByPrimaryKey(Integer ljxwid);

    int updateByPrimaryKeySelective(WhetherAccomplish record);

    int updateByPrimaryKey(WhetherAccomplish record);
    
    List<WhetherAccomplish>whether(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno);
    
    List<WhetherAccomplish>whether2(@Param("ljxUid")Integer ljxUid,@Param("ljxYesno")String ljxYesno,@Param("ljxType")Integer ljxType);
    
    List<WhetherAccomplish>whether3(Integer ljxuid);
    
    int udatew();
    
    int deletestu(@Param("ljxtid")Integer ljxtid,@Param("ljxuid")Integer ljxuid);
    
    int pilinsert(@Param("ljxtid")Integer ljxtid,@Param("u")List<AssignmentPutOff> u);
    
//    老师所带的班级
    
    List<TeacherHistory>teacher_history();
=======
import com.zhxy.domain.WhetherAccomplish;

public interface WhetherAccomplishMapper {
    int deleteByPrimaryKey(Integer ljxwid);

    int insert(WhetherAccomplish record);

    int insertSelective(WhetherAccomplish record);

    WhetherAccomplish selectByPrimaryKey(Integer ljxwid);

    int updateByPrimaryKeySelective(WhetherAccomplish record);

    int updateByPrimaryKey(WhetherAccomplish record);
>>>>>>> branch 'master' of https://github.com/Dodsontb/zhxyhtai.git
}
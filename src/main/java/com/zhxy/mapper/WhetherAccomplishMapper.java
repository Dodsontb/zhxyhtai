package com.zhxy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.CpStudent;
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
    
    int pilinsert(@Param("ljxtid")Integer ljxtid,@Param("u")List<CpStudent> u,@Param("ljxYesno")String ljxYesno);
    
//    老师所带的班级
    
    List<TeacherHistory>teacher_history();
    
    //查看是否完成任务的学生
    List<WhetherAccomplish> wcpstudent(@Param("ljxTid")Integer ljxTid,@Param("yesno")String yesno);
}
package com.zhxy.dao;

import com.zhxy.domain.AssignmentStage;

public interface AssignmentStageMapper {
    int insert(AssignmentStage record);

    int insertSelective(AssignmentStage record);
}
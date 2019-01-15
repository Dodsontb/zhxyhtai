package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.AssignmentPutOff;

public interface Service_AssignmentPutoff {

	List<AssignmentPutOff> putoff(Integer ljxUid);
    
    int putoffinsert(AssignmentPutOff assignmentputoff);
}

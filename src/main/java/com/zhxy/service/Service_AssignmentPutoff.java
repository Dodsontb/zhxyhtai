package com.zhxy.service;

import java.util.List;

import com.zhxy.domain.AssignmentPutOff;
import com.zhxy.domain.PutOffExamine;

public interface Service_AssignmentPutoff {

	List<AssignmentPutOff> putoff(Integer ljxUid);
    
    int putoffinsert(AssignmentPutOff assignmentputoff);
    
    List<AssignmentPutOff> xiangx (Integer ljxTuid);
    
    int einsert(PutOffExamine put);
}

package com.zhxy.hxktask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhxy.service.hxk_history;


@Component
public class ExamTaskJob extends Thread {

	@Autowired
	hxk_history ser;
	
    @Override
    public void run() {
    	ser.updataNotice();
        System.out.println("扫描考试表...........");
    }
    
    
}

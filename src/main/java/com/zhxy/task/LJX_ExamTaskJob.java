package com.zhxy.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhxy.service.Service_WhetherAccomplish;

@Component
public class LJX_ExamTaskJob extends Thread {

	@Autowired
	Service_WhetherAccomplish ser;

    @Override
    public void run() {
        System.out.println("扫描考试表...........");
        ser.udatew();
    }
}

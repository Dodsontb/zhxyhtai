package com.zhxy.hxktask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 动态任务
 */
@Component
public class DynamicTaskJobs {

    @Autowired
    ThreadPoolTaskScheduler threadPoolTaskScheduler;
    /**
     *
     * @param run
     * @param time 时间：2019-09-09 11:11:11
     */
        
        public void addTaskJob(Runnable run,String time){
        	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date targetTime = df.parse(time);
            threadPoolTaskScheduler.schedule(run,targetTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    /**
     * 指定轮询时间
     * @param run 对象
     * @param cron 规则
     */
    public void addTaskTimerJob(Runnable run,String cron){
        threadPoolTaskScheduler.schedule(run,new CronTrigger(cron));
    }
}


package com.xingxunlei.timebusker.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by xingmin on 2018/1/2.
 */
public class AutoQuartz implements Job{

    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 执行响应的任务.
        System.out.println("AutoQuartz.execute:任务执行类 _______  ," + new Date());
    }
}

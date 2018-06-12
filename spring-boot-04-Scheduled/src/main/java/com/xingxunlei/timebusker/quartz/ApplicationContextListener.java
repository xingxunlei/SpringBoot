package com.xingxunlei.timebusker.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by xingmin on 2018/1/2.
 */
@WebListener
public class ApplicationContextListener implements ServletContextListener{

    private Scheduler scheduler = null;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {

            /*
			 * 在 Quartz 中， scheduler 由 scheduler 工厂创建：DirectSchedulerFactory 或者
			 * StdSchedulerFactory。第二种工厂 StdSchedulerFactory 使用较多，因为
			 * DirectSchedulerFactory 使用起来不够方便，需要作许多详细的手工编码设置。
			 */

            // 获取Scheduler实例
            scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();

            System.out.println("scheduler.start");
            System.out.println(scheduler.getSchedulerName());

            // 注册任务
            JobDetail jobDetail = JobBuilder.newJob(AutoQuartz.class).withIdentity("AutoQuartzJob", "AutoQuartzGroup").build();

            // 设置触发时间(每5秒执行1次)
            SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger", "group").startNow().withSchedule(simpleScheduleBuilder).build();

            // 交由Scheduler安排触发
            scheduler.scheduleJob(jobDetail, trigger);

        } catch (SchedulerException e){
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        // 关闭定时任务调度器.
        try {
            scheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }
}

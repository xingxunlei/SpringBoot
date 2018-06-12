package com.xingxunlei.timebusker.springTask;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 动态修改定时任务的执行周期
 * Created by xingmin on 2018/1/2.
 */
@Component
@EnableScheduling
public class SpringTaskUpdateCron implements SchedulingConfigurer{

    public static String cron;

    public SpringTaskUpdateCron() {
        cron = "0/5 * * * * *";
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(30000);
                    cron = "0/1 * * * * *";
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {

        Runnable task = new Runnable() {
            @Override
            public void run() {
                /**
                 * 任务逻辑代码部分
                 */
                System.out.println("SpringTaskUpdateCron task is running ...... " + new Date());
            }
        };

        Trigger trigger = new Trigger() {
            public Date nextExecutionTime(TriggerContext triggerContext) {
                //任务触发，可修改任务的执行周期
                CronTrigger trigger = new CronTrigger(cron);
                Date nextExec = trigger.nextExecutionTime(triggerContext);
                return nextExec;
            }
        };
        scheduledTaskRegistrar.addTriggerTask(task, trigger);

    }
}

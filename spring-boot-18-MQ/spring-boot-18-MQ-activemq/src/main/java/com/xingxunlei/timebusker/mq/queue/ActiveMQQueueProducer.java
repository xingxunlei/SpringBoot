package com.xingxunlei.timebusker.mq.queue;

import java.util.Date;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by xingmin on 2018/1/2.
 */
@Component
@EnableScheduling
public class ActiveMQQueueProducer {
    /**
     * 使用JmsMessagingTemplate  进行消息的操作
     */
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue mineQueue;

    // 每3s执行1次
    @Scheduled(fixedDelay = 7000)
    public void send() {
        this.jmsMessagingTemplate.convertAndSend(this.mineQueue, "this is mineQueue activeMQ!\t" + new Date());
    }
}

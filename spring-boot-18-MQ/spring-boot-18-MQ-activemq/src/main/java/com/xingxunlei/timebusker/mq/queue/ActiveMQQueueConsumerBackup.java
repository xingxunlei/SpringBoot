package com.xingxunlei.timebusker.mq.queue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by xingmin on 2018/1/2.
 */
@Component
public class ActiveMQQueueConsumerBackup {

    /**
     * @JmsListener进行监听
     */
    @JmsListener(destination = "timebusker.queue")
    public void receiveQueue(String text) {
        System.out.println("Backup\t\t"+text);
    }
}

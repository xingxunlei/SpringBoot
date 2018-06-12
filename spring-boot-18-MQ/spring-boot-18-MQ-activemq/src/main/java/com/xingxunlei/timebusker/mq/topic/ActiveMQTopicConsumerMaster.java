package com.xingxunlei.timebusker.mq.topic;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by xingmin on 2018/1/2.
 */
@Component
public class ActiveMQTopicConsumerMaster {
    /**
     * @JmsListener进行监听
     */
    @JmsListener(destination = "timebusker.topic")
    public void receiveQueue(String text) {
        System.out.println("Master\t\t"+text);
    }
}

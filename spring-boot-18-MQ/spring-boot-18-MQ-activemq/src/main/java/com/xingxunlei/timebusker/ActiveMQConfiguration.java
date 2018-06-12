package com.xingxunlei.timebusker;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xingmin on 2018/1/2.
 */
@Configuration
public class ActiveMQConfiguration {

    @Bean("mineQueue")
    public Queue queue() {
        return new ActiveMQQueue("timebusker.queue");
    }

    @Bean("mineTopic")
    public Topic topic() {
        return new ActiveMQTopic("timebusker.topic");
    }
}

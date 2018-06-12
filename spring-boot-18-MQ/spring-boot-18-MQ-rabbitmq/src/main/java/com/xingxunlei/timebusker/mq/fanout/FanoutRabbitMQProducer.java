package com.xingxunlei.timebusker.mq.fanout;

import com.xingxunlei.timebusker.FanoutRabbitConfiguration;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by xingmin on 2018/1/2.
 */
@Component
public class FanoutRabbitMQProducer {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Scheduled(fixedRate = 5000)
    public void sendt() {
        String context = FanoutRabbitConfiguration.FANOUT_ROUTING_KEY_TIMEBUSKER + "\t";
        // 指定 消息交换机,路由关键字可以随意指定，但不能为空
        this.rabbitTemplate.convertAndSend(FanoutRabbitConfiguration.FANOUT_EXCHANGE, "", context);
    }

    @Scheduled(fixedRate = 5000)
    public void sendy() {
        String context = FanoutRabbitConfiguration.FANOUT_ROUTING_KEY_MINE + "\t";
        // 指定 消息交换机,路由关键字可以随意指定，但不能为空
        this.rabbitTemplate.convertAndSend(FanoutRabbitConfiguration.FANOUT_EXCHANGE, "", context);
    }

    @Scheduled(fixedRate = 5000)
    public void sendo() {
        String context = FanoutRabbitConfiguration.FANOUT_ROUTING_KEY_YUJIAOJIAO + "\t";
        // 指定 消息交换机,路由关键字可以随意指定，但不能为空
        this.rabbitTemplate.convertAndSend(FanoutRabbitConfiguration.FANOUT_EXCHANGE, "", context);
    }
}

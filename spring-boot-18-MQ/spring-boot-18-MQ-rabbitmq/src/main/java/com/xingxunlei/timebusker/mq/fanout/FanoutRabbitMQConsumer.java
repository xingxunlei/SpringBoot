package com.xingxunlei.timebusker.mq.fanout;

import com.xingxunlei.timebusker.FanoutRabbitConfiguration;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by xingmin on 2018/1/2.
 */
@Component
public class FanoutRabbitMQConsumer {
    /**
     * 监听方法传入的参数需要和消息生产者的一致
     */
    @RabbitHandler
    @RabbitListener(queues = FanoutRabbitConfiguration.FANOUT_ROUTING_KEY_YUJIAOJIAO)
    public void processt(String context) {
        System.out.println("Y\t"+context);
    }

    @RabbitHandler
    @RabbitListener(queues = FanoutRabbitConfiguration.FANOUT_ROUTING_KEY_MINE)
    public void processy(String context) {
        System.out.println("M\t"+context.toString());
    }

    @RabbitHandler
    @RabbitListener(queues = FanoutRabbitConfiguration.FANOUT_ROUTING_KEY_TIMEBUSKER)
    public void processo(String context) {
        System.out.println("T\t"+context);
    }
}

package com.xingxunlei.timebusker.mq.direct;

import com.xingxunlei.timebusker.DirectRabbitConfiguration;
import com.xingxunlei.timebusker.model.MessageEntity;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by xingmin on 2018/1/2.
 */
@Component
public class DirectRabbitMQProducer {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Scheduled(fixedRate = 1000000)
    public void sendt() {
        String context = DirectRabbitConfiguration.DIRECT_ROUTING_KEY_TIMEBUSKER + "\t******************************" + new Date();
        // 指定路由关键字，使用默认的 消息交换机，路由关键字也可以使用默认
        this.rabbitTemplate.convertAndSend(DirectRabbitConfiguration.DIRECT_ROUTING_KEY_TIMEBUSKER, context);
    }

    @Scheduled(fixedRate = 1000000)
    public void sendy() {
        String context = DirectRabbitConfiguration.DIRECT_ROUTING_KEY_YUJIAOJIAO + "\t******************************" + new Date();
        // 指定路由关键字，使用默认的 消息交换机，路由关键字也可以使用默认
        this.rabbitTemplate.convertAndSend(DirectRabbitConfiguration.DIRECT_ROUTING_KEY_YUJIAOJIAO, context);
    }

    @Scheduled(fixedRate = 1000000)
    public void sendo() {
        MessageEntity message = new MessageEntity();
        // 指定路由关键字，使用默认的 消息交换机，路由关键字也可以使用默认
        this.rabbitTemplate.convertAndSend(DirectRabbitConfiguration.DIRECT_ROUTING_KEY_OBJECT, message);
    }
}

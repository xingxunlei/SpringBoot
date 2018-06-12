package com.xingxunlei.timebusker;

import com.xingxunlei.timebusker.mq.sample.JmsConsumer;
import com.xingxunlei.timebusker.mq.sample.JmsProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xingmin on 2018/1/2.
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        // MQ简单模型
        JmsProducer.run();
        JmsConsumer.run();
        // spring boot实践
        SpringApplication.run(App.class, args);
    }
}

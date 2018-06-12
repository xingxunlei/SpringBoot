package com.xingxunlei.timebusker.service.order.impl;

import com.xingxunlei.timebusker.service.order.OrderInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by xingmin on 2018/1/2.
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService{

    private final static Logger logger = LoggerFactory.getLogger(OrderInfoServiceImpl.class);

    @Override
    public String addOrderInfo(String name) {
        logger.info("新增的订单名称是：" + name);
        return name + "O";
    }
}

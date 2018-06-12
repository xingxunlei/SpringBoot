package com.xingxunlei.timebusker.web;

import com.xingxunlei.timebusker.service.CommonService;
import com.xingxunlei.timebusker.service.order.OrderInfoService;
import com.xingxunlei.timebusker.service.user.UserInfoService;
import com.xingxunlei.timebusker.utils.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by xingmin on 2018/1/2.
 */
@RestController
public class IndexController {

    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Resource
    CommonService service;

    @Resource
    OrderInfoService orderService;

    @Resource
    UserInfoService userService;

    @RequestMapping(value = { "/**", "/" }, method = RequestMethod.GET)
    public Long testAop() {
        logger.info("\n=======================spring aop========================\n");
        int i = 1;
        i = CommonUtil.add(i);
        i = service.add(i);
        logger.info("\n====================处理结果为:" + i + "====================\n");
        String name = "#####";
        name = orderService.addOrderInfo(name);
        name = userService.addUserInfo(name);
        logger.info("\n====================名称为\t" + name + "====================\n");
        return System.currentTimeMillis();
    }
}

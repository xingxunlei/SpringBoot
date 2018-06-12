package com.xingxunlei.timebusker.service.user.impl;

import com.xingxunlei.timebusker.annotation.timebuskerMethod;
import com.xingxunlei.timebusker.service.user.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by xingmin on 2018/1/2.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    private final static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Override
    @timebuskerMethod
    public String addUserInfo(String name) {
        logger.info("新增的用户姓名是：" + name);
        return name + "U";
    }
}

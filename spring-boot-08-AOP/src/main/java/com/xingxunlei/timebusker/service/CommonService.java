package com.xingxunlei.timebusker.service;

import com.xingxunlei.timebusker.annotation.timebuskerBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by xingmin on 2018/1/2.
 */
@Service
@timebuskerBean
public class CommonService {

    private final static Logger logger = LoggerFactory.getLogger(CommonService.class);

    public int add(int i) {
        i = i + 1;
        logger.info("CommonService 的处理结果为：" + i);
        return i;
    }

}

package com.xingxunlei.timebusker.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xingmin on 2018/1/2.
 */
public class CommonUtil {

    private final static Logger logger = LoggerFactory.getLogger(CommonUtil.class);

    public static int add(int i) {
        i = i + 1;
        logger.info("CommonUtil 的处理结果为：" + i);
        return i;
    }
}

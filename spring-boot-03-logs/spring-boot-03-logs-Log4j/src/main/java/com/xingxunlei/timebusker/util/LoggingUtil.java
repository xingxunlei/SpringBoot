package com.xingxunlei.timebusker.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xingmin on 2017/12/29.
 */
public class LoggingUtil {

    private static final Logger logger = LoggerFactory.getLogger(LoggingUtil.class);

    public static void creatLogging() {
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
    }
}

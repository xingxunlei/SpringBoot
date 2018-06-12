package com.xingxunlei.timebusker.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xingmin on 2018/1/2.
 */
@RestController
public class LogsController {

    private final static Logger logger = LoggerFactory.getLogger(LogsController.class);

    @RequestMapping(value = { "/", "/" }, method = RequestMethod.GET)
    public Long createLogs() {
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
        return System.currentTimeMillis();
    }
}

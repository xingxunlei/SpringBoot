package com.xingxunlei.timebusker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xingmin on 2018/1/2.
 */
@RestController
public class IndexController {
    @RequestMapping(value = { "/**", "/" }, method = RequestMethod.GET)
    public Long createLogs() {
        return System.currentTimeMillis();
    }
}

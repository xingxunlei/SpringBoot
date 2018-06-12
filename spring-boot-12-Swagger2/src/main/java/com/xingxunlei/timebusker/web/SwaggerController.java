package com.xingxunlei.timebusker.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;

/**
 * Created by xingmin on 2018/1/2.
 */
@Api("SwaggerController接口测试")
@Controller
@RequestMapping("/api")
public class SwaggerController {

    @RequestMapping(value="",method = RequestMethod.GET)
    public String swagger() {
        return "index";
    }
}

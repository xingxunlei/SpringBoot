package com.xingxunlei.timebusker.web;

import com.xingxunlei.timebusker.conf.DefinitionConfig;
import com.xingxunlei.timebusker.conf.DubboConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by xingmin on 2017/12/29.
 */
@RestController
public class ConfController {

    @Resource
    DefinitionConfig conf;

    @Resource
    DubboConfig dubbo;

    /**
     * 测试自定义配置属性加载
     * @return
     */
    @RequestMapping("/conf")
    public String getConfig() {
        System.out.println(conf);
        return conf.toString();
    }

    /**
     * 测试自定义的额外文件的配置信息
     * @return
     */
    @RequestMapping("/dubbo")
    public String dubboConfig() {
        System.out.println(dubbo);
        return dubbo.toString();
    }

}

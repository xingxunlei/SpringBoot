package com.xingxunlei.timebusker.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 服务配置类
 * Created by xingmin on 2018/1/2.
 */
@ConfigurationProperties("calculate")
public class CalculateProperties {
    private int scale;

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }
}

package com.xingxunlei.timebusker.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by xingmin on 2018/1/2.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface timebuskerBean {
    public abstract String value() default "";
}

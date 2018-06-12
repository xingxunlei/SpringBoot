package com.xingxunlei.timebusker.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xingmin on 2018/1/2.
 */
public class DateUtil {

    public static String now() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateString = formatter.format(date);
        return dateString;
    }
}

package com.xingxunlei.timebusker.service;

import com.xingxunlei.timebusker.entity.DemoInfo;

import java.util.List;

/**
 * Created by xingmin on 2017/12/29.
 */
public interface DemoInfoService {

    List<DemoInfo> insertDemoInfo(DemoInfo demo);

    DemoInfo findDemoInfo(String id);

    List<DemoInfo> updateDemoInfo(DemoInfo demo);

    List<DemoInfo> deleteDemoInfo(DemoInfo demo);

    List<DemoInfo> findAll();
}

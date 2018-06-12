package com.xingxunlei.timebusker.service.impl;

import com.xingxunlei.timebusker.dao.DemoInfoDAO;
import com.xingxunlei.timebusker.entity.DemoInfo;
import com.xingxunlei.timebusker.service.DemoInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xingmin on 2017/12/29.
 */
@Service
public class DemoInfoServiceImpl implements DemoInfoService {

    @Resource
    DemoInfoDAO dao;

    @Override
    public List<DemoInfo> insertDemoInfo(DemoInfo demo) {
        return dao.insertDemoInfo(demo);
    }

    @Override
    public DemoInfo findDemoInfo(String id) {
        return dao.findDemoInfo(id);
    }

    @Override
    public List<DemoInfo> updateDemoInfo(DemoInfo demo) {
        return dao.updateDemoInfo(demo);
    }

    @Override
    public List<DemoInfo> deleteDemoInfo(DemoInfo demo) {
        return dao.deleteDemoInfo(demo);
    }

    @Override
    public List<DemoInfo> findAll() {
        return dao.findAll();
    }
}

package com.lggyx.service.impl;

import com.lggyx.mapper.DemoMapper;
import com.lggyx.pojo.Demo;
import com.lggyx.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoMapper demoMapper;
    @Override
    public Demo selectById(String id) {
        return demoMapper.selectById(id);
    }

    @Override
    public boolean add(Demo demo) {
        demo.setCreateTime(LocalDateTime.now());
        demo.setUpdateTime(LocalDateTime.now());
        return demoMapper.add(demo) > 0;
    }

}

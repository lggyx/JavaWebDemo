package com.lggyx.service;


import com.lggyx.pojo.Demo;

public interface DemoService {
    Demo selectById(String id);

    boolean add(Demo demo);
}

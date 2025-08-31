package com.lggyx.service;


import com.lggyx.pojo.Demo;

public interface DemoService {
    Demo selectById(String id);

    boolean add(Demo demo);

    boolean update(Demo demo);

    boolean delete(Integer id);

    boolean deletes(Integer[] ids);
}

package com.lggyx.service;


import com.lggyx.pojo.Demo;

import java.util.List;

public interface DemoService {
    Demo selectById(String id);

    boolean add(Demo demo);

    boolean update(Demo demo);

    boolean delete(Integer id);

    boolean deletes(List<Integer> ids);
}

package com.lggyx.mapper;

import com.lggyx.pojo.Demo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {
    Demo selectById(String id);

    int add(Demo demo);

    int update(Demo demo);

    int delete(Integer id);
}

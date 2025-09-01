package com.lggyx.mapper;

import com.lggyx.pojo.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {

    Demo selectById(String id);

    int add(Demo demo);

    int update(Demo demo);

    int delete(Integer id);

    int deletes(List<Integer> ids);
}

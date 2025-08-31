package com.lggyx.controller;

import com.lggyx.pojo.Demo;
import com.lggyx.pojo.Result;
import com.lggyx.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是一个样例，进行增删改查CRUD操作，同时还有分页查询
 */
@Slf4j
@RequestMapping("/Demo")
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    /**
     * 通过ID查询
     */
    @GetMapping("/{id}")
    public Result selectById(@PathVariable String id){
        log.info("通过ID查询");
        log.info("id:{}",id);
        Demo demo = demoService.selectById(id);
        return Result.success(demo);
    }

}

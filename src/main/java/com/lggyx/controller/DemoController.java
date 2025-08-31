package com.lggyx.controller;

import com.lggyx.pojo.Demo;
import com.lggyx.pojo.Result;
import com.lggyx.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Result add(@RequestBody Demo demo){
        log.info("添加{}",demo.getName());
        return demoService.add(demo) ? Result.success() : Result.error("添加失败");
    }

}

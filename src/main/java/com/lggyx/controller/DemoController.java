package com.lggyx.controller;

import com.lggyx.pojo.Demo;
import com.lggyx.pojo.Result;
import com.lggyx.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    /**
     * 添加
     */
    @PostMapping("/add")
    public Result add(@RequestBody Demo demo){
        log.info("添加{}",demo.getName());
        return demoService.add(demo) ? Result.success() : Result.error("添加失败");
    }
    /**
     * 修改
     */
    @PostMapping("/update")
    public Result update(@RequestBody Demo demo){
        log.info("修改{}",demo.getName());
        return demoService.update(demo) ? Result.success() : Result.error("修改失败");
    }
    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除{}",id);
        return demoService.delete(id) ? Result.success() : Result.error("删除失败");
    }
    /**
     * 批量删除，有两种方法，一种利用Java语言，一种利用MyBatis
     */
    @DeleteMapping("/deletes/{ids}")
    public Result deletes(@PathVariable List<Integer> ids){
        log.info("批量删除{}", ids);
        return demoService.deletes(ids) ? Result.success() : Result.error("批量删除失败");
    }
}

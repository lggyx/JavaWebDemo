package com.lggyx;

import com.lggyx.controller.DemoController;
import com.lggyx.pojo.Demo;
import com.lggyx.pojo.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JavaWebDemoApplicationTests {

    @Autowired
    private DemoController demoController;

    @Test
    public void demoSelectById() {
        Result result = demoController.selectById("1");
        System.out.println(result);
    }

    @Test
    public void demoAdd() {
        Demo demo = new Demo(
                null,
                "测试",
                "测试",
                1,
                "测试",
                "测试",
                null,
                null);
        Result result = demoController.add(demo);
        System.out.println(result);
    }

    @Test
    public void demoUpdate() {
        Demo demo = new Demo(
                7,
                "测试000",
                "测试000",
                1,
                "测试000",
                "https://fastly.picsum.photos/id/515/200/300.jpg?hmac=vFZxSlHgQLs0ROgtBCrqBiYOVaKSOrWGCyHjQclmjh8",
                null,
                null);
        Result result = demoController.update(demo);
        System.out.println(result);
    }
    @Test
    public void demoDelete() {
        Result result = demoController.delete(7);
        System.out.println(result);
    }
    @Test
    public void demoDeletes() {
        List<Integer> ids = List.of(1,2,3);
        Result result = demoController.deletes(ids);
        System.out.println(result);
    }

}

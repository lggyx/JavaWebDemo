package com.lggyx;

import com.lggyx.controller.DemoController;
import com.lggyx.pojo.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaWebDemoApplicationTests {

    @Autowired
    private DemoController demoController;
    @Test
    public void demoSelectById(){
        Result result = demoController.selectById("1");
        System.out.println(result);
    }

}

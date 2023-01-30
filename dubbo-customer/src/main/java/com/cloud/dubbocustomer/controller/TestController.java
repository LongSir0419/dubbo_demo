package com.cloud.dubbocustomer.controller;

import com.cloud.dubboapi.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ext.wanghailong6
 * @email ext.wanghailong6@jd.com
 * @date 2023-01-29 11:31
 */
@RestController
public class TestController {

    @DubboReference
    private TestService testService;

    @GetMapping("/test")
    public String sayHello(String name) {
        return testService.sayHello(name);
    }
}

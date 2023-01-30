package com.cloud.dubboprovider.service.impl;

import com.cloud.dubboapi.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author ext.wanghailong6
 * @email ext.wanghailong6@jd.com
 * @date 2023-01-29 11:16
 */
@DubboService
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        System.out.println("消费者被调用了");
        return "你好啊,hello" + name;
    }
}

package com.cloud.dubboprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
//@ImportResource(locations = {"classpath:spring-dubbo.xml"})
public class DubooProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubooProviderApplication.class, args);
    }

}

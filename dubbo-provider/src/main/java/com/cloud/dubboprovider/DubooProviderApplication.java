package com.cloud.dubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring-dubbo.xml"})
public class DubooProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubooProviderApplication.class, args);
    }

}

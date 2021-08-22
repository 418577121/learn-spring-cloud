package com.iwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.iwin"})
@EnableEurekaClient // 将自己作为微服务 注册进Eureka
@EnableFeignClients // 开启openFeign接口调用
public class AserviceRbacApplication {

    public static void main(String[] args) {
        SpringApplication.run(AserviceRbacApplication.class, args);
    }

}

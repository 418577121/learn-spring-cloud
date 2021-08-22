package com.iwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Eureka 自己也是一个微服务
public class CloudServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerEurekaApplication.class, args);
    }

}

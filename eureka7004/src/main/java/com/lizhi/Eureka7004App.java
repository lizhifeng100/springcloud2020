package com.lizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Date 2021/4/6 15:37
 * @Created by 荔枝/260494
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7004App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7004App.class);
    }
}

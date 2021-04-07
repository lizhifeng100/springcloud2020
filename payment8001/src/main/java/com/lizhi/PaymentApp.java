package com.lizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description TODO
 * @Date 2021/4/1 11:05
 * @Created by 荔枝/260494
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApp {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp.class);
    }
}

package com.lizhi.controller;

import entity.Payment;
import entity.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Date 2021/4/2 10:51
 * @Created by 荔枝/260494
 */
@RestController
public class OrderController {

    private final static String url = "http://spring-cloud-payment/selectAll";
    @Resource
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @GetMapping("/AllOrder")
    public Response<List<Payment>> selectAll() {
        System.out.println("port:" + port);
        return restTemplate.getForObject(url, Response.class);
//        return restTemplate.getForObject("http://localhost:8001/selectAll", Response.class);
    }

}

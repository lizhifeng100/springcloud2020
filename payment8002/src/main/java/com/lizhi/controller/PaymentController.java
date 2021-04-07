package com.lizhi.controller;

import entity.Payment;
import entity.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lizhi.service.PaymentSer;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Date 2021/4/1 15:44
 * @Created by 荔枝/260494
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentSer paymentSer;

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test() {
        System.out.println("aaaa" + "bbb");
        return "hello";
    }

    @GetMapping("/selectAll")
    public Response<List<Payment>> selectAll() {
        System.out.println("port:" + port);
        return new Response<>("成功", "200", paymentSer.selectAll());
    }

}

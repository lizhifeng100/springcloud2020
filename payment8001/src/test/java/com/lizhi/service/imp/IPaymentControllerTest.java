package com.lizhi.service.imp;

import com.lizhi.service.PaymentSer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description TODO
 * @Date 2021/4/1 14:15
 * @Created by 荔枝/260494
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class IPaymentControllerTest {

    @Resource
    private PaymentSer paymentSer;

    @Test
    void insert() {
    }

    @Test
    void deleteById() {


    }

    @Test
    void selectAll() {
        paymentSer.selectAll().forEach(System.out::println);
    }
}
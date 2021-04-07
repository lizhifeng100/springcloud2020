package com.lizhi.service;

import entity.Payment;

import java.util.List;

/**
 * @Description TODO
 * @Date 2021/4/1 14:05
 * @Created by 荔枝/260494
 */
public interface PaymentSer {

    Integer insert(PaymentSer paymentSer);

    Integer deleteById(Integer id);

    List<Payment> selectAll();
}

package com.lizhi.dao;

import entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import com.lizhi.service.PaymentSer;

import java.util.List;

/**
 * @Description TODO
 * @Date 2021/4/1 14:11
 * @Created by 荔枝/260494
 */
@Mapper
public interface PaymentMapper {

    Integer insert(PaymentSer paymentSer);

    Integer deleteById(Integer id);

    List<Payment> selectAll();
}

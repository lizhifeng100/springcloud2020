package com.lizhi.service.imp;

import com.lizhi.dao.PaymentMapper;
import entity.Payment;
import org.springframework.stereotype.Service;
import com.lizhi.service.PaymentSer;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Date 2021/4/1 14:09
 * @Created by 荔枝/260494
 */
@Service
public class IPayment implements PaymentSer {


    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public Integer insert(PaymentSer paymentSer) {
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }

    @Override
    public List<Payment> selectAll() {
        return paymentMapper.selectAll();
    }
}

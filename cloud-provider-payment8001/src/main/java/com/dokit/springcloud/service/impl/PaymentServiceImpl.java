package com.dokit.springcloud.service.impl;
import com.dokit.springcloud.dao.PaymentDao;
import com.dokit.springcloud.entity.Payment;
import com.dokit.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}

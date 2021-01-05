package com.dokit.springcloud.service;

import com.dokit.springcloud.entity.Payment;

public interface PaymentService {

    public int create(Payment payment);

    Payment getPaymentById(Long id);
}

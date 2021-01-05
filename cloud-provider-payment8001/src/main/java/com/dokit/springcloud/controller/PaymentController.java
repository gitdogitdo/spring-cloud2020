package com.dokit.springcloud.controller;

import com.dokit.springcloud.entity.Payment;
import com.dokit.springcloud.service.PaymentService;
import com.dokit.springcloud.web.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @Author dokit
 * @Since 2020/3/9 12:06
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;
    @PostMapping(value="/payment/create")
    public ApiResponse create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果:" + result);
        if(result > 0){
            return ApiResponse.success().setData("插入数据库成功,serverPort: " +serverPort);
        } else {
            return ApiResponse.error().setData("插入数据库失败");
        }
    }

    @GetMapping(value="/payment/get/{id}")
    public ApiResponse getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果:" + payment);
        if(payment != null){
            return ApiResponse.success().setMessage("查询成功,serverPort: " +serverPort).setData(payment);
        } else {
            return ApiResponse.error().setMessage("没有对应记录,查询ID: " +id);
        }
    }



}

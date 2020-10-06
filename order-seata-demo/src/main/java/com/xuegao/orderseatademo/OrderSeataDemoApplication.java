package com.xuegao.orderseatademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients(basePackages = "com.xuegao.orderseatademo.openfeign")
public class OrderSeataDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderSeataDemoApplication.class, args);
    }

}

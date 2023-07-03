package com.example.demopartie1.service;

import com.example.demopartie1.entity.Order;
import org.springframework.stereotype.Service;

/*@Service
public class PaymentService {

    public void processPayment(Order order) {

    }
}*/
public interface PaymentService {
    public void processPayment(Order order);
}
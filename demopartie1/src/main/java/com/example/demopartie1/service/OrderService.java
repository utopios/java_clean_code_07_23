package com.example.demopartie1.service;

import com.example.demopartie1.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public OrderService(PaymentService paymentService, DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
        this.paymentService = paymentService;
    }

    public void processOrder(Order order) {
        paymentService.processPayment(order);
        deliveryService.processDelivery(order);
    }
}

package com.example.demopartie1.service;

import com.example.demopartie1.entity.Order;
import org.springframework.stereotype.Service;

/*@Service
public class DeliveryService {
    public void processDelivery(Order order) {
        //
    }
}*/

public interface DeliveryService {
    public void processDelivery(Order order);
}
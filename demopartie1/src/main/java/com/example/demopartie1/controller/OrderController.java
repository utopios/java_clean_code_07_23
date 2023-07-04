package com.example.demopartie1.controller;

import com.example.demopartie1.entity.Customer;
import com.example.demopartie1.entity.Order;
import com.example.demopartie1.repository.CustomerRepository;
import com.example.demopartie1.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order order, @RequestParam Long customerId) {
        Optional<Customer> customerOptional = customerRepository.findById(customerId);
        /*if (customerOptional.isPresent()) {
            Customer customer = customerOptional.get();
            *//*order.setCustomer(customer);
            order.setDate(new Date());
            order.setStatus("CREATED");
            Order savedOrder = orderRepository.save(order);*//*
            return ResponseEntity.ok(prepareOrder(order, customer));
        } else {
            return ResponseEntity.notFound().build();
        }*/
        return ResponseEntity.ok(prepareOrder(order, customerOptional.get()));
    }

    private Order prepareOrder(Order order, Customer customer){
        order.setCustomer(customer);
        order.setDate(new Date());
        order.setStatus("CREATED");
        Order savedOrder = orderRepository.save(order);
        return savedOrder;
    }
}
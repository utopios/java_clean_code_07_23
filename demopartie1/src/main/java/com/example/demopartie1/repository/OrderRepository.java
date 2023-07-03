package com.example.demopartie1.repository;

import com.example.demopartie1.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}

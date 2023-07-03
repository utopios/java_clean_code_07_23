package com.example.demopartie1.repository;

import com.example.demopartie1.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

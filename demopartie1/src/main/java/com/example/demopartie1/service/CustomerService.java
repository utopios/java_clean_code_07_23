package com.example.demopartie1.service;


import com.example.demopartie1.entity.Customer;
import com.example.demopartie1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer createCustomer(Customer customer) {
        // Logique de création de client
        return customerRepository.save(customer);
    }
    /*public double calculateAverageRevenue(List<Customer> customers) {
        // Logique pour calculer le revenu moyen à partir d'une liste de clients
        return 0;
    }
    public double calculateProfitMargin(List<Customer> customers) {
        // Logique pour calculer la marge bénéficiaire à partir d'une liste de clients
        return 0;
    }*/
}

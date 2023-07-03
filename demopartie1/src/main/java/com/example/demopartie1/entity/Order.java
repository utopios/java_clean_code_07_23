package com.example.demopartie1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
public class Order {
    @Id
    private Long id;

    @ManyToOne
    private Customer customer;

    private Date date;

    private String status;
}

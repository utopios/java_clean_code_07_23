package com.example.demopartie1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Book {

    @Id
    private Long id;
}

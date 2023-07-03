package com.example.demopartie1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserDetails {
    @Id
    private int id;
}

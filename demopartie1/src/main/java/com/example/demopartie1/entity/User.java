package com.example.demopartie1.entity;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class User {

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @jakarta.persistence.Id
    public Long getId() {
        return id;
    }
}

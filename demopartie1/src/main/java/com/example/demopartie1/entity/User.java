package com.example.demopartie1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import org.springframework.data.annotation.Id;

@Entity
public class User {

    @Id
    private Long id;
    @OneToOne
    private UserDetails details;

    public void setId(Long id) {
        this.id = id;
    }

    @jakarta.persistence.Id
    public Long getId() {
        return id;
    }

    public void setDetails(UserDetails details) {
        this.details = details;
    }


    public UserDetails getDetails() {
        return details;
    }
}

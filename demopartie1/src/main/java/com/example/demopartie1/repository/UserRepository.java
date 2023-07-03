package com.example.demopartie1.repository;

import com.example.demopartie1.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

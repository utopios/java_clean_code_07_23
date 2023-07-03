package com.example.demopartie1.repository;

import com.example.demopartie1.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}

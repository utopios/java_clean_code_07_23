package com.example.demopartie1.service.impl;

import com.example.demopartie1.entity.Book;
import com.example.demopartie1.service.BookService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAllBooks() {
        return null;
    }
}

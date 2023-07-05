package com.example.demobdd.service;

import com.example.demobdd.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books;

    public BookService() {
        books = new ArrayList<>();
    }
    
    public void save(Book book) {
        books.add(book);
    }

    public List<Book> getAll() {
        return books;
    }
}

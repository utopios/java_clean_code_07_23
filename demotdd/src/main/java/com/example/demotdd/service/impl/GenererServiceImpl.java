package com.example.demotdd.service.impl;

import com.example.demotdd.service.GenererService;
import org.springframework.stereotype.Service;

@Service
public class GenererServiceImpl implements GenererService {
    @Override
    public String generer() {
        return "toto";
    }
}

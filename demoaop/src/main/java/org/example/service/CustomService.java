package org.example.service;

import org.example.aspect.Loggable;
import org.example.aspect.Performance;
import org.example.aspect.Transaction;

public class CustomService {

    @Loggable
    @Performance
    public void methode() {
        System.out.println("Methode A");
    }


    @Transaction(value = "HIGH")
    public void methodeTransactional() {

    }
}

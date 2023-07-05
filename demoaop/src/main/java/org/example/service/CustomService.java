package org.example.service;

import org.example.aspect.Loggable;

public class CustomService {

    @Loggable
    public void methode() {
        System.out.println("Methode A");
    }
}

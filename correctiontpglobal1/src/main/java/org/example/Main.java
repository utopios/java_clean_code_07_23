package org.example;

import org.example.repository.impl.InMemoryReservationRepositoryImpl;
import org.example.service.impl.ReservationServiceImpl;
import org.example.util.CliInterface;

public class Main {
    public static void main(String[] args) {
        new CliInterface(new ReservationServiceImpl(new InMemoryReservationRepositoryImpl()));
    }
}
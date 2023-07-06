package org.example.repository.impl;

import org.example.entity.Reservation;
import org.example.repository.ReservationRepository;

import java.util.List;
import java.util.ArrayList;

public class InMemoryReservationRepositoryImpl implements ReservationRepository {

    List<Reservation> reservations = new ArrayList<>();
    @Override
    public Reservation save(Reservation reservation) {
        reservations.add(reservation);
        return Reservation.builder().clientName(reservation.getClientName()).reservationDate(reservation.getReservationDate()).tableSize(reservation.getTableSize()).build();
    }

    @Override
    public Reservation findByClientName(String clientName) {
        return reservations.stream().filter(r -> r.getClientName().equals(clientName)).findFirst().orElse(null);
    }
}

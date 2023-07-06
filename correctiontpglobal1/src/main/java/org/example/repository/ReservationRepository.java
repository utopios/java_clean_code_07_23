package org.example.repository;

import org.example.entity.Reservation;

public interface ReservationRepository {
    Reservation save(Reservation reservation);
}

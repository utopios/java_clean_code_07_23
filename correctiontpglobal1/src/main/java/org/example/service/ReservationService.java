package org.example.service;

import org.example.entity.Reservation;

public interface ReservationService {

    Reservation createReservation(String clientName, String reservationDate, int tableSize);
}

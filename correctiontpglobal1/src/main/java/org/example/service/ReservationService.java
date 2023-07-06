package org.example.service;

import org.example.entity.Reservation;
import org.example.exception.InvalidReservationException;
import org.example.exception.ReservationNotFoundException;

public interface ReservationService {

    Reservation createReservation(String clientName, String reservationDate, int tableSize) throws InvalidReservationException;
    Reservation getReservation(String clientName) throws ReservationNotFoundException;
}

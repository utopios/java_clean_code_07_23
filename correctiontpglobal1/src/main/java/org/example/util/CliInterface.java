package org.example.util;

import org.example.annotation.HandleException;
import org.example.entity.Reservation;
import org.example.exception.InvalidReservationException;
import org.example.exception.ReservationNotFoundException;
import org.example.service.ReservationService;

public class CliInterface {

    private ReservationService reservationService;

    public CliInterface(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @HandleException
    public void start() throws InvalidReservationException, ReservationNotFoundException {
        String clientName = "toto tata";
        String reservationDate = "2023-07-07";
        int tableSize = 5;
        reservationService.createReservation(null, reservationDate, tableSize);

        Reservation reservation = reservationService.getReservation(clientName);

        System.out.println(reservation);
    }
}

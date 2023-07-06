package org.example.service.impl;

import org.example.entity.Reservation;
import org.example.repository.ReservationRepository;
import org.example.service.ReservationService;

public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRespository;
    public ReservationServiceImpl(ReservationRepository reservationRespository) {
        this.reservationRespository = reservationRespository;
    }
    @Override
    public Reservation createReservation(String clientName, String reservationDate, int tableSize) {
        Reservation reservation = new Reservation();
        Reservation createdReservation = reservationRespository.save(reservation);
        return createdReservation;
    }
}

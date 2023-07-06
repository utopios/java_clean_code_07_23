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
    public void createReservation(String clientName, String reservationDate, int tableSize) {
        reservationRespository.save(new Reservation());
    }
}

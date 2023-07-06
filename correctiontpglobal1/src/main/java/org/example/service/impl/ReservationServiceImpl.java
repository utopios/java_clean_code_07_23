package org.example.service.impl;

import org.example.entity.Reservation;
import org.example.exception.InvalidReservationException;
import org.example.repository.ReservationRepository;
import org.example.service.ReservationService;

public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRespository;
    public ReservationServiceImpl(ReservationRepository reservationRespository) {
        this.reservationRespository = reservationRespository;
    }
    @Override
    public Reservation createReservation(String clientName, String reservationDate, int tableSize) throws InvalidReservationException {
        if(clientName == null)
            throw new InvalidReservationException();
        Reservation reservation = Reservation.builder().clientName(clientName).reservationDate(reservationDate).tableSize(tableSize).build();
        Reservation createdReservation = reservationRespository.save(reservation);
        return createdReservation;
    }

    @Override
    public Reservation getReservation(String clientName) {
        Reservation reservation = reservationRespository.findByClientName(clientName);
        return reservation;
    }
}

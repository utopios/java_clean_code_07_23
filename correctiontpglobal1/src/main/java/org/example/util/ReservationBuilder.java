package org.example.util;

import org.example.entity.Reservation;

public class ReservationBuilder {
    private String clientName;
    private String reservationDate;
    private int tableSize;

    public ReservationBuilder clientName(String clientName) {
        this.clientName= clientName;
        return this;
    }
    public ReservationBuilder reservationDate(String reservationDate) {
        this.reservationDate= reservationDate;
        return this;
    }

    public ReservationBuilder tableSize(int tableSize) {
        this.tableSize= tableSize;
        return this;
    }

    public Reservation build() {
        return new Reservation(this.clientName, this.reservationDate, this.tableSize);
    }
}

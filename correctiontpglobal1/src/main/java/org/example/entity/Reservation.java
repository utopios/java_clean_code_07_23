package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.util.ReservationBuilder;


public class Reservation {
    private String clientName;
    private String reservationDate;
    private int tableSize;

    public Reservation(String clientName, String reservationDate, int tableSize) {
        this.clientName = clientName;
        this.reservationDate = reservationDate;
        this.tableSize = tableSize;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getTableSize() {
        return tableSize;
    }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
    }

    public static ReservationBuilder builder() {
        return new ReservationBuilder();
    }

}


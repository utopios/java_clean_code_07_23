package org.example.entity;

import lombok.Data;

@Data
public class Reservation {
    private String clientName;
    private String reservationDate;
    private int tableSize;
}

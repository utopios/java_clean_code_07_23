package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.entity.Reservation;
import org.example.exception.InvalidReservationException;
import org.example.repository.ReservationRepository;
import org.example.service.ReservationService;
import org.example.service.impl.ReservationServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ReservationServiceSteps {
    private ReservationService reservationService;
    private ReservationRepository reservationRepository;
    private String clientName;
    private String reservationDate;
    private int tableSize;

    private Reservation createdReservation;

    public ReservationServiceSteps() {
        reservationRepository = Mockito.mock(ReservationRepository.class);
        reservationService = new ReservationServiceImpl(reservationRepository);
    }
    @Given("a client named {string} and reservation date {string} for table size {int}")
    public void aClientNamedAndReservationDateForTableSize(String clientName, String reservationDate, int tableSize) {
        this.clientName = clientName;
        this.reservationDate = reservationDate;
        this.tableSize = tableSize;
    }

    @When("I create a new reservation")
    public void iCreateANewReservation() throws InvalidReservationException {
        Mockito.when(reservationRepository.save(Mockito.any(Reservation.class))).thenReturn(Reservation.builder().clientName(clientName).build());
        createdReservation = reservationService.createReservation(clientName, reservationDate, tableSize);
    }

    @Then("the reservation should be saved correctly")
    public void theReservationShouldBeSavedCorrectly() {
        Mockito.verify(reservationRepository, Mockito.times(1)).save(Mockito.any(Reservation.class));
        Assertions.assertEquals(clientName, createdReservation.getClientName());
    }
}

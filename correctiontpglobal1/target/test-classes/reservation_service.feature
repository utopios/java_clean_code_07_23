Feature: Reservation Service
  Scenario: Create a new reservation
    Given a client named "Ihab ABADI" and reservation date "2023-07-06" for table size 4
    When I create a new reservation
    Then the reservation should be saved correctly
  Scenario: Try to create a new reservation with a invalid client name
    Given an invalid client name and reservation date "2023-07-06" for table size 4
    When I create a new reservation
    Then the reservation should not be saved and an InvalidReservationException should be thrown

  Scenario: Get a reservation
    Given a client name "Ihab ABADI" with a reservation
    When I get the reservation for "Ihab ABADI"
    Then I should get the reservation for "Ihab ABADI"
  Scenario: Try the get a reservation with an invalid client name
    Given an invalid client name
    When I get the reservation for invalid client name
    Then an InvalidReservation should be thrown


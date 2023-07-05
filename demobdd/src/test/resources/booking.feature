Feature: Booking Conference rooms
  Scenario: User books o free conference room
    Given a conference room named "freeRoom" with status <status>
    And a user named "Toto"
    When toto books freeRoom from "2023-07-05T14:00" to "2023-07-05T18:00"
    Then the booking should be successful
  Scenario: User tries to book a conference room is already booked
    Given a user named "Toto"
    And a user named "Tata"
    And a conference room named "Room"
    And Toto has already booked Room with status from "2023-07-05T14:00" to "2023-07-05T18:00"
    When Tata books Room from "2023-07-05T14:00" to "2023-07-05T18:00"
    Then the booking should fail with an error
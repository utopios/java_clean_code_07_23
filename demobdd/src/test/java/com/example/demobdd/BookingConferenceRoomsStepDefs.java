package com.example.demobdd;

import com.example.demobdd.exception.BookingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberTestApplication.class)
public class BookingConferenceRoomsStepDefs {

    private BookingException bookingException;

    @Given("a conference room named {string} with status {bool}")
    public void aConferenceRoomNamedWithStatus(String name, boolean status) {
        //use service to save conference room as free
    }

    @Given("a user named {string}")
    public void aUserNamed(String name) {
        // use service to save user
    }

    @When("{string} books {string} from {string} to {string}")
    public void booksRoomFromTo(String userName, String roomName, String startDateTime, String endDateTime) {
        //Use userService to get User with name => username
        //Use roomServie to get Conference Room with name => roomName

        try {
            //Use bookingService to save the booking with user and conference room
        }catch (BookingException ex) {
            bookingException = ex;
        }
    }

    @Then("the booking should be successful")
    public void theBookingShouldBeSuccessful() {
        Assertions.assertEquals(null, bookingException);
    }
}

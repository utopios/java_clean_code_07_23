package com.example.demobdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


@CucumberContextConfiguration
@SpringBootTest(classes = CucumberTestApplication.class)
public class FindAllBooksStepDefs {

    @Given("there are some books in the library")
    public void thereAreSomeBooksInTheLibrary() {
        //save some books for example 2
    }
    @When("I ask for all books")
    public void iAskForAllBooks() {
        //get Actual books
    }

    @Then("all books should be returned")
    public void allBookShouldBeReturned() {
        //Assert that size of actual books is 2
    }
}

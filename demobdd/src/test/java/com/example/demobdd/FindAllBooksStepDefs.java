package com.example.demobdd;

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

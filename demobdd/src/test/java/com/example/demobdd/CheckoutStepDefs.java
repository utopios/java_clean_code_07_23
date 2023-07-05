package com.example.demobdd;

public class CheckoutStepDefs {

    @Given("The Book {string} cost {double}")
    public void theBookCost(String name, double price) {
        //save cost of book in the cart
    }
    @When("buy {int} of the Book {string}}")
    public void buyQtyOfTheBook(int qty, String name) {
        // cost of cart's book's line
    }

    @Then("total of {string} checkout is {double}")
    public void allBookShouldBeReturned(String name, double total) {
        //Assert of total cart's line
    }
}

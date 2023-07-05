package com.example.demobdd;

import com.example.demobdd.model.Book;
import com.example.demobdd.service.BookService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@CucumberContextConfiguration
@SpringBootTest(classes = CucumberTestApplication.class)
public class FindAllBooksStepDefs {

    private BookService bookService;
    private List<Book> actualBooks;

    public FindAllBooksStepDefs() {
        bookService = new BookService();
    }

    @Given("there are some books in the library")
    public void thereAreSomeBooksInTheLibrary() {
        bookService.save(Book.builder().title("t1").author("a1").build());
        bookService.save(Book.builder().title("t2").author("a2").build());

    }
    @When("I ask for all books")
    public void iAskForAllBooks() {
        //get Actual books
        actualBooks = bookService.getAll();
    }

    @Then("all books should be returned")
    public void allBookShouldBeReturned() {
        //Assert that size of actual books is 2
        Assertions.assertEquals(actualBooks.size(), 2);
    }
}

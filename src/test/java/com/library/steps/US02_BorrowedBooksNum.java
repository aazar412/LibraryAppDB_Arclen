package com.library.steps;

import com.library.pages.DashBoardPage;
import com.library.utility.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US02_BorrowedBooksNum {

    String ActualBorrowedBooksNumber;

DashBoardPage dashBoardPage = new DashBoardPage();

    @When("the librarian gets borrowed books number")
    public void the_librarian_gets_borrowed_books_number() {
        ActualBorrowedBooksNumber = dashBoardPage.borrowedBooksNumber.getText();
        System.out.println("dashBoardPage.borrowedBooksNumber = " + ActualBorrowedBooksNumber);

    }
    @Then("borrowed books number information must match with DB")
    public void borrowed_books_number_information_must_match_with_db() {
        String query= "select count(*) from book_borrow\n" +
                "where is_returned=0";
        DB_Util.runQuery(query);
        String expectedBorrowedBooksNum = DB_Util.getFirstRowFirstColumn();

        Assert.assertEquals(expectedBorrowedBooksNum,ActualBorrowedBooksNumber);
    }

}

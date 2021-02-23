package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.StudentLandinPage;
import com.LibraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class borrowinBooks_stepDefinitions {

    StudentLandinPage studentLandinPage = new StudentLandinPage();

    @When("the user click on the borrowing books")
    public void the_user_click_on_the_borrowing_books() {
        BrowserUtils.sleep(1);
        studentLandinPage.BorrowingBooks.click();

    }


    @Then("the user should see the following table colums")
    public void the_user_should_see_the_following_table_colums(List<String> expected) {
        List<String> actual = new ArrayList<>();
        BrowserUtils.sleep(1);

        for (WebElement each : studentLandinPage.BorrowingBooksTableHeaders) {
            actual.add(each.getText());
        }
        BrowserUtils.sleep(1);

        Assert.assertEquals(expected, actual);
    }


}

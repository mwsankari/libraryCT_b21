package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.BookCategoriesPage;
import com.LibraryCT.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookCategories_StepDefinitions {

    BookCategoriesPage bookCategoriesPage = new BookCategoriesPage();
    LoginPage loginPage = new LoginPage();

    @Given("User logged in as a student")
    public void user_logged_in_as_a_student(){

        loginPage.loginToLibraryApp_Student();
    }


    @When("User click all book categories")
    public void user_click_all_book_categories() {

        bookCategoriesPage.searchCategoriesBox.click();


    }
    @Then("User able to see below list of books categories")
    public void user_able_to_see_below_list_of_books_categories(List<String> ExpectedList) {

        Select select = new Select(bookCategoriesPage.dropdownCategories);
        List<WebElement> book=select.getOptions();

        List<String> bookstr = new ArrayList<>();

        for(WebElement each : book){
            bookstr.add(each.getText());
        }

        Assert.assertTrue(ExpectedList.equals(bookstr));
    }

}

package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.BookCategoriesPage;
import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.utilities.BrowserUtils;
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
        BrowserUtils.sleep(3);
    }


    @Then("User able to see below list of books categories")
    public void user_able_to_see_below_list_of_books_categories(List<String> ExpectedList) {
        Select select=new Select(bookCategoriesPage.searchCategoriesBox);
        List<WebElement> bookWebElement=select.getOptions();
        List<String> bookString=new ArrayList<>();
        for (WebElement each : bookWebElement) {
            bookString.add(each.getText());

        }
        //Assertion will compare the size of the lists first, if it is not equal it will fail the test.
        //If sizes are equal, than it will compare each element in the list
        Assert.assertTrue(ExpectedList.equals(bookString));

        //bookCategoriesPage.searchCategoriesBox.click();
       // List<String> actualList=new ArrayList<>();

       // for(WebElement each : bookCategoriesPage.dropdownCategories){
        //    actualList.add(each.getText());


        //Assert.assertTrue(ExpectedList.equals(actualList));
    }

}

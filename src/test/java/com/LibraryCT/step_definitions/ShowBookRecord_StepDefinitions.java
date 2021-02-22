package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.pages.MainPage;
import com.LibraryCT.pages.UsersPage;
import com.LibraryCT.utilities.BrowserUtils;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShowBookRecord_StepDefinitions {
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    UsersPage usersPage=new UsersPage();
    Select select;
    @Given("User logged in as librarian")
    public void user_logged_in_as_librarian() {
    loginPage.loginToLibraryApp_Librarian();
        BrowserUtils.sleep(2);
    }


    @When("User click on {string} link")
    public void user_click_on_link(String string) {
        switch (string.toLowerCase()){
            case "dashboard":
                mainPage.dashboardPageLink.click();
                break;
            case "books":
                mainPage.booksPageLink.click();
                break;
            case "users":
                mainPage.usersPageLink.click();
                break;

        }


    }
    @Then("Show record default value should be {int}")
    public void show_record_default_value_should_be(Integer int1) {
        BrowserUtils.sleep(2);
        select=new Select(usersPage.showRecordDropDown);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, String.valueOf(int1));
    }







    @Then("Show records for {string} option see {string} of books")
    public void showRecordsForOptionSeeOfBooks(String arg0, String arg1) {
        BrowserUtils.sleep(2);
        usersPage.showRecordDropDown.click();
        switch (arg0){
            case "5":
                usersPage.count5option.click();
                break;
            case "10":
                usersPage.count10option.click();
                break;
            case "15":
                usersPage.count15option.click();
                break;
            case "50":
                usersPage.count50option.click();
                break;
            case "100":
                usersPage.count100option.click();
                break;
            case "200":
                usersPage.count200option.click();
                break;
            case "500":
                usersPage.count500option.click();
                break;

        }
        //Assert.assertEquals(usersPage.allRows.size(),arg1);
        System.out.println(usersPage.allRows.size());
        BrowserUtils.sleep(3);





    }


    @And("Show records for {string}")
    public void showRecordsFor(String arg0) {
    }

    @Then("option see {string} of books")
    public void optionSeeOfBooks(String arg0) {
    }
}

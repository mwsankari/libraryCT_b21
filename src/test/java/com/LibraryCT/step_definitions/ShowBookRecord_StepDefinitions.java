package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.pages.MainPage;
import com.LibraryCT.pages.UsersPage;
import com.LibraryCT.utilities.BrowserUtils;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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




    @Then("Show records for {string} option")
    public void show_records_for_option(List<String> count ) {
        select =new Select(usersPage.showRecordDropDown);
        List<WebElement> webElements= select.getOptions();
        List<String> actualText= BrowserUtils.getElementsText(webElements);
        Assert.assertEquals(count,actualText);

    }



}

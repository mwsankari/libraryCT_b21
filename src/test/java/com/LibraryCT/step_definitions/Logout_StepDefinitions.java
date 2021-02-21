package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.pages.Logout_Page;
import com.LibraryCT.utilities.BrowserUtils;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {

    Logout_Page logoutPage = new Logout_Page();
    Login_StepDefinitions login = new Login_StepDefinitions();
    LoginPage loginPage = new LoginPage();

    @Given("user should login successfully")
    public void user_should_login_successfully() {
        loginPage.loginToLibraryApp_Librarian();
    }


    @When("user should see main page")
    public void user_should_see_main_page() {
        BrowserUtils.sleep(1);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("user logs out from application")
    public void user_logs_out_from_application() {
        BrowserUtils.sleep(1);
        logoutPage.dropDownButton.click();
        BrowserUtils.sleep(1);
        logoutPage.logoutButton.click();

    }

    @Then("user should see login page")
    public void user_should_see_login_page() {
        BrowserUtils.sleep(1);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Login - Library";
        Assert.assertEquals(actualTitle,expectedTitle);

        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }
}

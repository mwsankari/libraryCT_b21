package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.utilities.ConfigurationReader;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    //For Librarians
    @Given("the user is on the log in page")
    public void the_user_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("the user inputs username")
    public void the_user_inputs_username() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("usernameL20"));
    }

    @When("the user inputs password")
    public void the_user_inputs_password() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("passwordL20"));
        loginPage.loginButton.click();

    }

    @Then("the user is logged in to main page")
    public void the_user_is_logged_in_to_main_page() {

        String expectedTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


    //For Students
    @When("the user inputs student username")
    public void theUserInputsStudentUsername() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("usernameS110"));

    }

    @When("the user inputs student password")
    public void theUserInputsStudentPassword() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("passwordS110"));
        loginPage.loginButton.click();


    }
}

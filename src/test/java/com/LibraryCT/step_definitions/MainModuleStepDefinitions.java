package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.pages.MainModulePage;
import com.LibraryCT.utilities.ConfigurationReader;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class MainModuleStepDefinitions {
    MainModulePage mainModules = new MainModulePage();
    LoginPage loginPage = new LoginPage();


    @Given("Student is on the home page")
    public void user_logged_in_as_student() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginToLibraryApp_Student();
        String expectedTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Logged in!");
        } else {
            System.err.println("Not home page");
        }
    }

    @Then("User should see two modules: Books and Borrowing Books")
    public void student_modules_displayed() {
        Assert.assertTrue(mainModules.booksModule.isDisplayed());
        Assert.assertTrue(mainModules.borrowingBooksModule.isDisplayed());
    }


    @Given("Librarian is on the home page")
    public void user_logged_in_as_librarian(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginToLibraryApp_Librarian();
    }

    @Then("User should see the following modules: Dashboard, Books, and Borrowing Books")
    public void librarian_modules_displayed(){
        Assert.assertTrue(mainModules.dashboardModule.isDisplayed());
        Assert.assertTrue(mainModules.booksModule.isDisplayed());
        Assert.assertTrue(mainModules.borrowingBooksModule.isDisplayed());
    }
}



package com.LibraryCT.step_definitions;


import com.LibraryCT.pages.AddPage;
import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.utilities.BrowserUtils;
import com.LibraryCT.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddUsers_Stepdefinition {

    LoginPage loginPage = new LoginPage();
    AddPage webelement = new AddPage();
    Faker faker = new Faker();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.loginToLibraryApp_Librarian();
        BrowserUtils.sleep(1);

    }

    @Then("libarian should able to see main page")
    public void libarian_should_able_to_see_main_page() {

        String actualtitle = Driver.getDriver().getTitle();
        String expectedtitle = "Library";

        Assert.assertEquals(actualtitle, expectedtitle);


    }

    @Given("librarian should able click user module")
    public void librarian_should_able_click_user_module() {
        BrowserUtils.sleep(1);
        webelement.user_module.click();


    }

    @When("librarian click need to on the add user button")
    public void librarian_click_need_to_on_the_add_user_button() {
        BrowserUtils.sleep(1);
        webelement.add_user_button.click();

    }

    @When("librarian should fill up the information about new student")
    public void librarian_should_fill_up_the_information_about_new_student() {
        BrowserUtils.sleep(1);
        webelement.user_fullname.sendKeys(faker.name().fullName());
        webelement.user_password.sendKeys(faker.internet().password());
        webelement.user_email.sendKeys(faker.internet().emailAddress());
        webelement.user_group.click();
        webelement.select_user_for_users_group.click();
        webelement.users_status.click();
        webelement.status_active.click();
        webelement.user_address.sendKeys(faker.address().fullAddress());
        BrowserUtils.sleep(1);

    }

    @Then("librarian should click save button")
    public void librarian_should_click_save_button() {
        BrowserUtils.sleep(1);
        webelement.save_button.click();
    }

    @Given("liabarian should able to click user module")
    public void liabarian_should_able_to_click_user_module() {
        BrowserUtils.sleep(1);
        webelement.user_module.click();

    }

    @When("liabraian should able to click close button")
    public void liabraian_should_able_to_click_close_button() {
        BrowserUtils.sleep(1);
        webelement.close_button.click();
    }

    @Then("librarian should see user page")
    public void librarian_should_see_user_page() {
        BrowserUtils.sleep(1);
        String actualtitle = Driver.getDriver().getTitle();
        String expectedtitle = "Library";

        Assert.assertEquals(actualtitle, expectedtitle);


    }

    @Given("librarian should able to click module")
    public void librarian_should_able_to_click_module() {
        BrowserUtils.sleep(1);
        webelement.user_module.click();

    }

    @When("libraian able to click edit user button")
    public void libraian_able_to_click_edit_user_button() {
        BrowserUtils.sleep(1);
        webelement.edit_userbutton.click();
    }

}


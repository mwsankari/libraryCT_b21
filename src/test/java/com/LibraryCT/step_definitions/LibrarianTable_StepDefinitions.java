package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LibrarianLandingPage;
import com.LibraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LibrarianTable_StepDefinitions {
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();

    @Then("user see defaul table info below")
    public void user_see_defaul_table_info_below(List<String> excpected) {

        List<String> actual = new ArrayList<>();
BrowserUtils.sleep(2);
        for (WebElement each : librarianLandingPage.LibrarianTable) {
            actual.add(each.getText());
        }
        Assert.assertEquals(excpected, actual);




    }


    @And("the user click on the users")
    public void theUserClickOnTheUsers() {
        BrowserUtils.sleep(2);
        librarianLandingPage.users.click();


    }
}

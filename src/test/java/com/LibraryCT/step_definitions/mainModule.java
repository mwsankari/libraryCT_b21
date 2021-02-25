package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LibrarianLandingPage;
import com.LibraryCT.utilities.BrowserUtils;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class mainModule {
    LibrarianLandingPage librarianLandingPage = new LibrarianLandingPage();


    @Then("user should see the main module below")
    public void user_should_see_the_main_module_below(List<String> Expected) {





        BrowserUtils.sleep(2);
        List<String> ActualModule = new ArrayList<>();
        BrowserUtils.sleep(2);
        for (WebElement each : librarianLandingPage.ActualResult) {
            ActualModule.add(each.getText());
        }


        Assert.assertEquals(Expected,ActualModule);



    }


}

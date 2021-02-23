package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.UserStatusPage;
import com.LibraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UserStatus_StepDefinition {

    UserStatusPage userStatusPage = new UserStatusPage();

    @When("the user click Status dropdown")
    public void the_user_click_status_dropdown() {
        BrowserUtils.sleep(3);
        userStatusPage.clickDropdownStatus.click();
    }




    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expected ) {
        Select select = new Select(userStatusPage.clickDropdownStatus);
        BrowserUtils.sleep(3);

        List<String> actual1 = new ArrayList<>();

        List<WebElement> actual = select.getOptions();

        for (WebElement each : actual){
            actual1.add(each.getText());
        }

        Assert.assertEquals(expected, actual1);


    }
}

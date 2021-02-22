package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.GroupCategoryPage;
import com.LibraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class GroupCategory_StepDefinition {

    GroupCategoryPage categoryPage = new GroupCategoryPage();



    @When("the user click user module")
    public void the_user_click_user_module() {
        BrowserUtils.sleep(3);
        categoryPage.users.click();

    }

    @When("the user click User Group dropdown")
    public void the_user_click_user_group_dropdown() {

        BrowserUtils.sleep(3);
        categoryPage.clickDropdown.click();

    }

    @Then("the user should see the following")
    public void the_user_should_see_the_following(List<String> expected ) {

        Select select = new Select(categoryPage.clickDropdown);
        BrowserUtils.sleep(3);

        List<String> actual1 = new ArrayList<>();

        List<WebElement> actual = select.getOptions();

        for (WebElement each : actual){
            actual1.add(each.getText());
        }

        Assert.assertEquals(expected, actual1);

    }

}

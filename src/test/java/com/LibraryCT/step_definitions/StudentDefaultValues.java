package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.StudentLandinPage;
import com.LibraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class StudentDefaultValues {
    StudentLandinPage studentLandinPage = new StudentLandinPage();

    @Then("the user shoul see the default info below")
    public void the_user_shoul_see_the_default_info_below(List<String> expected) {
        List<String> actual = new ArrayList<>();
        BrowserUtils.sleep(2);
        for (WebElement each : studentLandinPage.tableInfo) {
            actual.add(each.getText());
        }
        BrowserUtils.sleep(2);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);

    }

}

package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {

    public   String actualTitle = Driver.getDriver().getTitle();
    public   String expectedTitle = "Library";

    public Logout_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "navbarDropdown")
    public WebElement dropDownButton;

    @FindBy(className = "dropdown-item")
    public WebElement logoutButton;


}

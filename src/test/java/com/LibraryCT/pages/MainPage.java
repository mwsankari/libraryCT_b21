package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Users")
    public WebElement usersPageLink;
    @FindBy(linkText = "Books")
    public WebElement booksPageLink;
    @FindBy(linkText = "Dashboard")
    public WebElement dashboardPageLink;
}

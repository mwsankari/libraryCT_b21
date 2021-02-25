package com.LibraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainModulePage {

    @FindBy(xpath = " ")
    public WebElement booksModule;

    @FindBy(xpath = " ")
    public WebElement borrowingBooksModule;

    @FindBy(xpath = " ")
    public WebElement dashboardModule;
}

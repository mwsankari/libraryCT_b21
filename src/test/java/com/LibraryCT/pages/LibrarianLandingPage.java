package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarianLandingPage {

    public LibrarianLandingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement users;

    @FindBy(xpath = "//th")
    public List<WebElement> LibrarianTable;

@FindBy(xpath = "//span[@class='title']")
    public List<WebElement>ActualResult;





}

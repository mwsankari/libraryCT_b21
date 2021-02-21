package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage {
    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecordDropDown;
    @FindBy(xpath = "//option[@value='5']")
    public WebElement count5option;
    @FindBy(xpath = "//option[@value='10']")
    public WebElement count10option;
    @FindBy(xpath = "//option[@value='15']")
    public WebElement count15option;
    @FindBy(xpath = "//option[@value='50']")
    public WebElement count50option;
    @FindBy(xpath = "//option[@value='100']")
    public WebElement count100option;
    @FindBy(xpath = "//option[@value='200']")
    public WebElement count200option;
    @FindBy(xpath = "//option[@value='500']")
    public WebElement count500option;
    @FindBy(xpath = "//tr[@role='row']//td/a")
    public List<WebElement> allRows;


}

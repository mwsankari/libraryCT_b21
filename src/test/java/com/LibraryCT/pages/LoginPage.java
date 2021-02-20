package com.LibraryCT.pages;

import com.LibraryCT.utilities.ConfigurationReader;
import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);



    }

    @FindBy (id = "inputEmail")
    public WebElement usernameBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement loginButton;

    public void loginToLibraryApp_Librarian(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        usernameBox.sendKeys(ConfigurationReader.getProperty("usernameL20"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("passwordL20"));
        loginButton.click();

    }
    public void loginToLibraryApp_Student(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        usernameBox.sendKeys(ConfigurationReader.getProperty("usernameS110"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("passwordS110"));
        loginButton.click();

    }

}

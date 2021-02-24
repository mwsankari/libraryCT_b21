package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStatusPage {

    public UserStatusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user_status")
    public WebElement clickDropdownStatus;

}

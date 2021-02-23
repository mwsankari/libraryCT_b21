package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupCategoryPage {

   public GroupCategoryPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement users;

  @FindBy(id="user_groups")
    public WebElement clickDropdown;

}

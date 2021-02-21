package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPage {

    public AddPage() {
     PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement user_module;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement add_user_button;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement user_fullname;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement user_password;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement user_email;

    @FindBy(xpath = "//select[@id='user_group_id']")
    public WebElement user_group;

    @FindBy(xpath = "(//option[@value='2'])[1]")
    public WebElement select_librarian_for_users_group;

    @FindBy(xpath = "(//option[@value='3'])[1]")
    public WebElement select_user_for_users_group;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    public WebElement users_status;

    @FindBy(xpath = "(//option[@value='ACTIVE'])[2]")
    public WebElement status_active;

    @FindBy(xpath = "(//option[@value='INACTIVE'])[2]")
    public WebElement status_inactive;

    @FindBy(xpath = "//textarea[@id='address']")
    public WebElement user_address;

    @FindBy(xpath = "//button[@type='cancel']")
    public WebElement close_button;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save_button;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement edit_userbutton;


}

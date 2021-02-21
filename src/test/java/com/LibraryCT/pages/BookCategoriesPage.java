package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookCategoriesPage {

    public BookCategoriesPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id ="book_categories")
    public WebElement searchCategoriesBox;

    @FindBy(xpath ="//select[@id=‘book_categories’]//option")
    public List<WebElement> dropdownCategories;




}

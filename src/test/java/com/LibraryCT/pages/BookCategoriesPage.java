package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BookCategoriesPage {

    public BookCategoriesPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
}

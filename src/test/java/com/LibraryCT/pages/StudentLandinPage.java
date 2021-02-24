package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StudentLandinPage {
    public StudentLandinPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th")
    public List<WebElement> tableInfo;

    @FindBy(xpath = "//a[@href='#borrowing-books']")
    public WebElement BorrowingBooks;

    @FindBy(xpath = "//th")
    public List<WebElement> BorrowingBooksTableHeaders;


}

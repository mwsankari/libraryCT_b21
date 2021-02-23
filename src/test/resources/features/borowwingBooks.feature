Feature: borrowing books feature
  As a user i should see borrowing books table columns

@BorrowingBooks
  Scenario:user browwing books table column
  Given the user is on the log in page
  When the user inputs student username
  When the user inputs student password
  Then the user is logged in to main page
    When the user click on the borrowing books
    Then the user should see the following table colums
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date        |
      | Is Returned ?       |
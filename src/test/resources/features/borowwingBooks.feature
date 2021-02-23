Feature: borrowing books feature
  As a user i should see borrowing books table columns


  Scenario:user browwing books table column
    Given the user is on the log in page
    When the user inputs username
    When the user inputs password
    When the user is logged in to main page
    When the user click on the borrowing books
    Then the user should see the following table colums
      | Action              |
      | Book Name           |
      | Borrowed Data       |
      | Planned Return Data |
      | Return Data         |
      | Is Returned         |
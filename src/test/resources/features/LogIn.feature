Feature:LibraryApp Login Feature

  @Librarian
  Scenario: As a librarian, I should be able to log in with username and password
    Given the user is on the log in page
    When the user inputs username
    When the user inputs password
    Then the user is logged in to main page

  @Student
  Scenario: As a student, I should be able to log in with username and password
    Given the user is on the log in page
    When the user inputs student username
    When the user inputs student password
    Then the user is logged in to main page


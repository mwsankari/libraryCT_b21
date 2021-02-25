Feature: the user should able to see main module when logged in


  As a user ,I should be able to see the main module when logged in

  @librarian123
  Scenario: As a librarian, I should be able to see main module after login
    Given the user is on the log in page
    When the user inputs username
    When the user inputs password
    When the user is logged in to main page
    Then  user should see the main module below
      | Dashboard |
      | Users     |
      | Books     |
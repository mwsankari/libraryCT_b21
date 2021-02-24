
Feature: user should be able to see default info
  As a student, I should be able to see tables with default info

  Scenario: As a student, I should be able to log in with username and password
    Given the user is on the log in page
    And the user inputs student username
    And the user inputs student password
    And the user is logged in to main page
    Then the user shoul see the default info below
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |
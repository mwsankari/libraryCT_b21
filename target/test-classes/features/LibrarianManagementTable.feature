@Wip
Feature: Librarian see management table

  Scenario: As a librarian, I should be able to log in with username and password
    Given the user is on the log in page
    And the user inputs username
    And the user inputs password
    When the user is logged in to main page
    And the user click on the users
    Then user see defaul table info below
      | Actions    |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
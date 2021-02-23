@wip02
Feature:User group category features

  Scenario: As a librarian user should verify categories
    Given the user is on the log in page
    When the user inputs username
    When the user inputs password
    When the user is logged in to main page
    And the user click user module
    And the user click User Group dropdown
    Then the user should see the following

      | ALL       |
      | Librarian |
      | Students  |






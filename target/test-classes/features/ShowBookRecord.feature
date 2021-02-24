@1
Feature:  As a librarian, I should be able to see book records on user page

  @ww
  Scenario: Verify that the default record is 10
    Given User logged in as librarian
    When User click on "Users" link
    And Show record default value should be 10
    Then show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |

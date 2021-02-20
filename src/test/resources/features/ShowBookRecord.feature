@1
Feature:  As a librarian, I should be able to see book records on user page

  Scenario: Verify that the default record is 10
    Given User logged in as librarian
    When User click on "Users" link
    Then Show record default value should be 10


  Scenario:  Show records for count options
    Given User logged in as librarian
    When User click on "Users" link
    Then Show records for "<count>" option
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |

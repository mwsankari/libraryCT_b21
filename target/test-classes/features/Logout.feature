@logout
Feature: Library app logout feature

  Scenario: user as logout successfully
    Given user should login successfully
    When user should see main page
    Then user logs out from application
    And user should see login page

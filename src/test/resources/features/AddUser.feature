Feature: library should be able to add a new user, and edit user information
  agile story : as a librarian i should be able to add a user and edit users information, from users page
  acounts are :only librarian

  Background: user should be login with valid username and password
    Given user is on the login page
    Then libarian should able to see main page

  @Add_user
 Scenario: librarian can add new user
    Given librarian should able click user module
    When librarian click need to on the add user button
    And librarian should fill up the information about new student
    Then librarian should click save button

@cancel_user
Scenario: librarian should able click close button on the add users page
  Given liabarian should able to click user module
  When  librarian click need to on the add user button
  And   liabraian should able to click close button
  Then librarian should see user page


  @edit_user
  Scenario: librarian should able to edit users on the users page
    Given librarian should able to click module
    When libraian able to click edit user button
    When librarian should click save button
    Then librarian should see user page


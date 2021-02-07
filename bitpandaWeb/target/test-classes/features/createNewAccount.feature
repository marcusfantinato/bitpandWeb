Feature: Login

  Scenario: 01 - Creating user account

    Given the user is on Authentication page
    When fills in the e-mail address
    And clicks on Create
    And fills all the mandatory fields
    And clicks on Register
    Then the system create new account

    
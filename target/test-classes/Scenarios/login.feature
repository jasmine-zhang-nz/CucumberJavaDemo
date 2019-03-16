Feature: Login Feature

  Scenario Outline:
    Given When user is on the login page
    When user enters "username" and "password"
    And  user clicks on login button
    Then user is on Login Page

    Examples:
    |username|password|
    |        |        |
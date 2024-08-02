Feature: login functionality

  Background: user on the login page
    Given user on the login page

  Scenario: login with valid credentials
    When user enters "sa.amingaliev@gmail.com" email
    And user enters "220300Sa" password
    And user clicks on log in button
    Then user url should be different
    And close browser
Feature: Schedule Page functionalities

  Background:
    Given the user is on "https://batch-6.studymate.us/admin/students?size=10&page=1"
    And user logs in
    And User clicks on Schedule Page

  @Abduvohid
  Scenario: User clicks outside of log out confirmation box
    When user clicks on log out icon
    Then user clicks outside the log out confirmation box
    Then the url before click and after click should not match

  @Abduvohid
  Scenario: User successfully logs out
    When user clicks on log out icon
    Then user clicks on log out inside confirmation box
    Then the url should match with login page url











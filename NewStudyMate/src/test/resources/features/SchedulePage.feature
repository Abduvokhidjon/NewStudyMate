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

  @Ruslan
  Scenario: User successfully changed URL
    When user clicks on kufhk button
    Then the URL should be different then schedule page URL
    And close browser

  @Ruslan
  Scenario: User can see scheduled notes for whole month
    When user click on month button
    Then user should see planned schedule notes
    And close browser

  @Ruslan
  Scenario: User can see notes for one week
    When user clicks switch month to week
    Then user should see notes for one week
    And close browser

  @Ruslan
  Scenario: user will be able to see notes for one day
    When user click on day button
    Then user should see notes for one day
    And close browser




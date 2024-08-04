Feature: courses functionality

  Background: user logged in
    Given user on the my courses page

  Scenario: user can see lessons of a course
    When user clicks on the course "Team5"
    Then user should see all lessons
    And close browser

  Scenario: user can see video of the lesson
    When user clicks on the course "Team5"
    And user click on the lesson "Lesson1"
    And user clicks on video lesson button
    Then user should see videos
    And close browser

  Scenario: user can see presentations of the lesson
    When user clicks on the course "Team5"
    And user click on the lesson "Lesson1"
    And user clicks on presentation button
    Then user should see presentations
    And close browser

  Scenario: user can see tasks of the lesson
    When user clicks on the course "Team5"
    And user click on the lesson "Lesson1"
    And user clicks on task button
    Then user should see tasks
    And close browser

  Scenario: user can see links of the lesson
    When user clicks on the course "Team5"
    And user click on the lesson "Lesson1"
    And user clicks on links button
    Then user should see links
    And close browser

  Scenario: user can see tests of the lesson
    When user clicks on the course "Team5"
    And user click on the lesson "Lesson1"
    And user clicks on test button
    Then user should see tests
    And close browser



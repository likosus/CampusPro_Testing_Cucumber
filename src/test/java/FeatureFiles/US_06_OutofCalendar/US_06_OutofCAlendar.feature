Feature: US_06_MakePlan

    Background:

    Given Navigate to Campus
    When Enter username and password and click the login button
    Then User should login successfully

    Scenario: Create a course Out of calendar
    Given Click Calendar
    When Click second Calendar Button
    And Click on Add button
    When Click on event type and choose Meeting
    And Click on Apply Button






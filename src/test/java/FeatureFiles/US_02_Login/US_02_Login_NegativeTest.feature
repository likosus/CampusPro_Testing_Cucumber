Feature: US_02_Login_NegativeTest

  Scenario: Login on campus

    Given Navigate to Campus
    When Enter the wrong username or password and click the login button
    Then user should get error while logging in


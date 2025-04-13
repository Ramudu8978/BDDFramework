Feature: Login Feature

  Scenario Outline: Login with multiple users
    Given User is on login page
    When User enters username "<username>" and password "<password>"
    Then User should be logged in successfully
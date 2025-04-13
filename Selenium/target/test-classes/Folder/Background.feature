Feature: Test Functionality

  Background: 
    Given user is logged in

  Scenario: check logout link
    When user clicks on login link
    Then logout link is displayed

  Scenario: verify quick launch
    When user clicks on page link
    Then quick launch browser

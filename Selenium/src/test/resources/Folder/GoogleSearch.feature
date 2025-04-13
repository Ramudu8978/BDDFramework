Feature: Check google Search

  @smoke
  Scenario: validate google is working
    Given open browser
    And user is on google search page
    When user enter a text
    And hits enter
    Then user redirect to search result

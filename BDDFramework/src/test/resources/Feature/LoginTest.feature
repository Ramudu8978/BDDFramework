Feature: Login Functionality
Scenario: check logins successful with valid credentials
Given User is login page
When User enter valid username and password
And click on login
Then user navigate to home page
And close the browser
Feature: Check the Facebook Login

  Scenario Outline: Login with valids credentials
    Given user is on facebook login page
    When user enters "<username>" and "<password>"
    Then successfull login to facebook
    
    Examples: 
    | username | password |
    | mohanrajeee6@gmail.com | mohanrajeee6@gmail.com |
    | mohanrajeee6@gmail.com | mohanrajeee6@gmail.com |

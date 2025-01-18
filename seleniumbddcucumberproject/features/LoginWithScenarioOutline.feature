#Created by Bharath - This file belongs to Login feature
Feature: Login feature of Demo Blaze application

  Scenario Outline: Verify the successful login functionality when logged with valid credentials
    Given user opened the browser
    When user navigated to Demo Blaze login page
    And user clicks on login link
    And user enter user name as '<username>' and password as '<password>'
    And user clicks on Login button
    Then Demo Blaze home page should be displayed with logout link

    Examples: 
      | username    | password |
      | bharathedu1 |   123456 |
      | bharathedu2 | welcome1 |

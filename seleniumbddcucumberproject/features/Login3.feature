#Created by Bharath - This file belongs to Login feature
Feature: Login feature of Demo Blaze application

  Background: 
    Given user opened the browser
    When user navigated to Demo Blaze login page
    And user clicks on login link

  Scenario: Verify the successful login functionality when logged with valid credentials
    And user enter user name as 'bharathedu1' and password as '123456'
    And user clicks on Login button
    Then Demo Blaze home page should be displayed with logout link

  Scenario: Verify the login functionality when logged with invalid credentials
    And user enter user name as 'bharathedu1' and password as 'welcme1'
    And user clicks on Login button
    Then error popup should be displayed

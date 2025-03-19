@login
Feature: To Test the Login page functionality
  This feature will test all login testcases


Background: Update password in DB
Given I Connect to Database
Then I update the passsword for all users throught update query

@smoke @TC001
  Scenario: Login with valid user and password
    Given I launch Facebook page
    When I enter username "Bala" and password "Test@123"
    And I click Submit button
    Then I validated the home page title "Facebook"

@regression @TC002
  Scenario: Login with Invalid user and password
    Given I launch Facebook page
    When I enter username "Bala" and password "Test@123"
    And I click Submit button
    Then I validated the error message "Plz enter valid username and pssword"
    And I click forgetPassword link

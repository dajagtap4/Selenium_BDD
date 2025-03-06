
Feature: Feature

@login
Scenario: check user test 1

Given user is on login page
When user enter username and password
And click on login button
Then user is navigated to homepage

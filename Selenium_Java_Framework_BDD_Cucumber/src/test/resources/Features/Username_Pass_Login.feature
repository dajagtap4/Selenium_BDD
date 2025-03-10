
Feature: test login functionality
@login
Scenario: check sucessfull with valid Creds

Given browser is open by user
When user is on login page page
And user entered <username> and <password>
And user click login button
Then user navigated to homepage

Examples:
|username   | password    | 

|student    | Password123 | 
|dummyStu   | dummypass   | 

Feature: Feature to test google search functionality

@google
  Scenario: Validate google search is working  1
    Given Browser is open
    And user is on google search page
    When user enter text in serach box
    And hit enter
    Then user is navigated to result page

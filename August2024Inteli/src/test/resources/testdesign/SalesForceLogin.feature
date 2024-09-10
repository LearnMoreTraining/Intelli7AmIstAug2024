Feature: Functional validation of salesforce login page

  @sc01 @lmti
  Scenario: validation of login functionality
    Given user navigates to salesforce login page
    When user enter the username "lmti" and password "abc"
    And user clicks the login button
    Then user validates the navigation to the homepage

    @sc02 @lmti
  Scenario: validation of error message
    Given user navigates to salesforce login page
    When user enter the username "learnmore" and password "xyz"
    And user clicks the login button
    Then user validate the error message
Feature: Learn More Page Automation

  @lmti01
    #before
  Scenario: Window Handling
    #beforestep
    Given user switch to child window
    #afterstep
    #beforeStep
    Then verify the title
    #afterstep
    #after

@lmti02
  Scenario: Handling of Alert
    Given user click on confirm Box
    And verify the confirm box message
    Then click on cancel button
    And verify the Ui text

  @lmti03
  Scenario: waits
    Given user clicks on change text button
    Then verify the text
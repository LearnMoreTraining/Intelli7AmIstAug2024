Feature: Amazon Homepage validations

  @amazon01
  Scenario: validation of search functionality
    Given user navigates to amazon homepage
    When user enter the product name "laptop"
    And user clicks the search icon
    Then user verify the title of page

   @amazon02
  Scenario: Dropdown validation
    Given user navigates to amazon homepage
    When user extracts all the values
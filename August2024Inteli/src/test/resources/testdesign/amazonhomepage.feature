Feature: Amazon Homepage

  @amazon01
  Scenario: validation of search functionality
    Given user navigates to amazon homepage
    When user enter the product name "laptop"
    And user clicks the search icon
    Then user verify the title of page


   @amazon02
  Scenario: Dropdown validation
    Given user selects the value from the category dropdown
    When user extracts all the values


     @amazon03
  Scenario: Baby wish list validation
   Given user navigates to baby wishlist page
   Then verify the baby wishlist text

   @drag
  Scenario:  drag and drop
   Given user perform drag and drop operation


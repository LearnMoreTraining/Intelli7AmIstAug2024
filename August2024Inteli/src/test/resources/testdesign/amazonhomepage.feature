Feature: Amazon Homepage
  #before
  @amazon01
  Scenario: validation of search functionality
    Given user navigates to amazon homepage
    When user enter the product name "laptop"
    And user clicks the search icon
    Then user verify the title of page

    #before
   @amazon02
  Scenario: Dropdown validation
     #beforestep
    Given user selects the value from the category dropdown
     #afterstep
     #beforestep
    When user extracts all the values
     #afterstep
  #after

     @amazon03
  Scenario: Baby wish list validation
   Given user navigates to baby wishlist page
   Then verify the baby wishlist text

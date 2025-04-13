

Feature: Check the offers displayed in the offer page

  @offerPage
  Scenario: Validate the product name and offer displayed
    Given  User is already in Green Kart home page.
    And    User enter a product name in the search bar.   
  	       |ProductName| Cucumber |
    When   Product is displayed with the user entered proudct name.
    Then 	 User clicks on the top deals page.
    And 	 User checks the displayed product offer details.

 

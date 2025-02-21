
Feature: Select product from Ecommerce website

  @tag1
  Scenario: Product selection and add to cart
     Given User is already in Green Kart home page.
     And   User enter a product name in the search bar.   
  	|ProductName| Cucumber |
     When  Product is displayed with the user entered proudct name.
     Then  User add the product for multiple times.
     And   User clicks on Add to cart.
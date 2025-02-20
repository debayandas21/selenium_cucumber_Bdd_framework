
Feature: Select product from Ecommerce website

  @tag1
  Scenario: Product selection and add to cart
     Given User is already in Green Kart home page.
     And   User enter a product name "Cucumber" in the search bar.
     When  Product is displayed with the user entered proudct name.
     Then  User add the product for 3 times.
     And   User clicks on Add to cart.
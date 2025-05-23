Feature: Add product to cart after user is already logged in

  Scenario: Add tablet product to cart after login
    Given user is logged in and on the homepage
    When user clicks on "TABLETS" category
    And user selects a tablet product
    And user clicks on "Add to Cart" button
    And user clicks on cart icon at top
    Then user should see the added product in the cart

Feature: Laptop And Notebooks Page Test



  @sanity @regression
  Scenario: User should see the Product price display in High to Low order from Sort by
    Given I am on home page
    When I Mouse hover on Laptops & Notebooks Tab and click
    And Click on Show All Laptops & Notebooks
    And I Select Sort By Price (High > Low)
    Then I should see Product price is arrange in High to Low order.

  @smoke @regression
  Scenario: User should place the order successfully
    Given I am on home page
    When I Mouse hover on Laptops & Notebooks Tab and click
    And I Click on Show All Laptops & Notebooks
    And I Select Sort By Price (High > Low)
    And I Select Product MacBook
    Then I should see Product name MacBook
    And I Click on Add To Cart button
    Then I should see message Success: You have added MacBook to your shopping cart!
    And I click on link shopping cart display into success message
    And I click on currency tab
    And I change currency to £ sterling
    Then I should see Shopping Cart
    And I should see Product name is MacBook
    And I Change Quantity to 2
    And I click on Update tab
    Then I should see message Success: You have modified your shopping cart!
    And I should see the updated price £737.45
    And I click on Checkout button
    Then I should see text Checkout
    And I should see text New Customer
    And I click on Guest Checkout radio button
    And I click on Continue tab
    Then I fill all the mandatory details
    And I click on Continue
    And I enter Comments about order into text field
    And I  Click on check the Terms & Conditions check box
    And I Click on Continues
    Then I should see message Warning: Payment method required
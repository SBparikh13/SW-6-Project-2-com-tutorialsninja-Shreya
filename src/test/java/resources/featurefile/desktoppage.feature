Feature: Desktop page test
  As a User I want to verify desktop page on tutorailsninja website
  @sanity @regression
  Scenario: User should be able to verify Product Arrange In AlphaBatical Order on desktop page
    Given I am on home page
    When  I mouse hover on desktop tab
    And   I mouse hover and click on Show all Desktops
    And   I select sort filter Name: Z to A
    Then  I verify products are arranged in descending order


   @smoke @regression
  Scenario: User should be able to verify Product Added To Shopping Cart SuccessFully
    Given I am on home page
    When  I mouse hover on desktop tab
    And   I mouse hover and click on Show all Desktops
    And   I select sort filter Name : A to Z
    Then  I Select product “<HP LP3065>”
    And   I verify the product text
    And   I Select Delivery Date "<2023-11-13>"
    And   I Click on “<Add to Cart>” button
    And   I verify success messege
    And   I click on shooping cart link
    And   I Verify the text "<Shopping Cart>"
    Then  I click on change currenct tab
    And   I change the currency to  £ sterling
    And   I Verify the Product name "HP LP3065"
    And   I Verify the Delivery Date "2023-11-30"
    And   I Verify the Model "Product21"
    And   I Verify the Todal "£74.73"




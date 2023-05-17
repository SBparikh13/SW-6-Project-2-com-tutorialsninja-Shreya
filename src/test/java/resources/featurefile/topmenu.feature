Feature: Top Menu Test on HomePage



  @sanity @regression
  Scenario: User should navigate to Desktop Page Successfully
    Given I am on home page
    When I mouse hover on Desktop tab and Click
    And I click on Show All Desktops
    Then I should see text Desktops

  @smoke @regression
  Scenario: User should navigate to Laptop and Notebooks Page Successfully
    Given I am on home page
    When I Mouse hover on Laptops & Notebooks Tab and click
    And Click on Show All Laptops & Notebooks
    Then I should see text Laptops & Notebooks

  @regression
  Scenario: User should navigate to Components Page Successfully
    Given I am on home page
    When I Mouse hover on Components Tab and click
    And  I Click on Show All Components
    Then I should see text Components
Feature: Account login page Test
  AS a user I should navigate to login page
  @sanity @regression
  Scenario: User should be able to navigate to loginpage successfully
    Given I am on home page
    When  I click on My Account Link.
    And   I select and click on login tab
    Then  I Verify the text “Returning Customer”
  @smoke @regression
  Scenario: User should be able to Login And Logout Successfully
    Given I am on home page
    When  I click on My Account Link.
    And   I select login tab
    Then  I Enter Email address "<kp1309@gmail.com>" in emailfield
    And   I Enter password "<Tango456>" in password field
    Then  I click on login button
    And   I Verify text “<My Account>”
    And   I click on My Account Link again
    Then  I select and click on logout tab
    And   I Verify the text “<Account Logout>”
    Then  I click on continue button





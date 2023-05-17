Feature: Register page test
  As a user I want to register on tutorialsninja site
@sanity @regression
 Scenario: User should be able to Navigate To Register Page Successfully
  Given: I am on Homepage
  When  I click on My Account Link.
  And   I select and click on register tab
  Then  I Verify the text “<Register Account>”


  @smoke @regression
  Scenario: User should be able Register Account Successfully
  Given: I am on Homepage
    When  I click on My Account Link.
    And   I select and click on register tab
    Then  I enter first name "<Shubh>" in firstname field
    And   I enter last name "<Parikh>" lastname field
    And   I enter email address "<sbparikh0205>" in emailfield
    And   I enter telephone "<079124841492>" in telephone field
    And   I enter password "<charlie789>" in password field
    And   I confirm Password "<Charlie789>" in confirm password field
    Then  I select subscribe radio button
    And   I click on privacy check box
    Then  I click on continue button
    And   I verify the text "<Your Account Has Been Created!>"
    And   I click on continue button again
    Then  I click on My account link
    And   I  select logout tab and click on it
    Then  I verify the text "<Account Logout>"
    And   I click on continue button







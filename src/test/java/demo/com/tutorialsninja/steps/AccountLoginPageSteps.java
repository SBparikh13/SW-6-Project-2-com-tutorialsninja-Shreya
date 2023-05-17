package demo.com.tutorialsninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.com.tutorialsninja.pages.MyAccountLoginPage;
import demo.com.tutorialsninja.pages.MyAccountPage;
import demo.com.tutorialsninja.pages.MyAccountRegisterPage;
import org.testng.Assert;

public class AccountLoginPageSteps {
    //on  home page
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }
   // Click on My Account Link
    @When("^I click on My Account Link\\.$")
    public void iClickOnMyAccountLink() {
       new MyAccountPage().clickOnMyAccountTab();

    }
    //Call the method “selectMyAccountOptions” method and pass the parameter "login"

    @And("^I select login tab$")
    public void iSelectLoginTab() {
     new MyAccountPage().selectMyAccountOptions("Login");
    }
    //Enter Email address
    @Then("^I Enter Email address \"([^\"]*)\" in emailfield$")
    public void iEnterEmailAddressInEmailfield(String arg0) {
        new MyAccountLoginPage().enterEmailAddress("kp1309@gmail.com");

    }


    @And("^I Enter password \"([^\"]*)\" in password field$")
    public void iEnterpasswordInPasswordField(String arg0) {
       new MyAccountLoginPage().enterValidPassword("Tango456");
    }
    // Click on Login button
    @Then("^I click on login button$")
    public void iClickOnLoginButton() {
        new MyAccountLoginPage().clickOnLoginButton();

    }

    //Verify text “My Account”

    @And("^I Verify text “<My Account>”$")
    public void iVerifyTextMyAccount() {
   Assert.assertEquals(new MyAccountLoginPage().getMyAccountText(),"My Account");
    }

    //Click on My Account Link again
    @And("^I click on My Account Link again$")
    public void iClickOnMyAccountLinkAgain() {
       new MyAccountPage().clickOnMyAccountTabAgain();
    }
    //Select logout tab and click

    @Then("^I select and click on logout tab$")
    public void iSelectAndClickOnLogoutTab() {
       new MyAccountPage().clickLogout();
    }
    //Verify the text “Account Logout”
    @And("^I Verify the text “<Account Logout>”$")
    public void iVerifyTheTextAccountLogout() {
       Assert.assertEquals(new MyAccountRegisterPage().getAccountLogoutText(),"Account Logout","Account logout has not displayed");

    }
    //Click on Continue button

    @Then("^I click on continue button$")
    public void iClickOnContinueButton() {
       new MyAccountRegisterPage().clickOnContinueButtonAgain();
    }
    //click on My account link
    //select login tab and click

    @And("^I select and click on login tab$")
    public void iSelectAndClickOnLoginTab() {
       new MyAccountPage().selectMyAccountOptions("Login");

    }
    //verify the "Returning customer" text

    @Then("^I Verify the text “Returning Customer”$")
    public void iVerifyTheTextReturningCustomer() {
        Assert.assertEquals(new MyAccountPage().getReturningCustomerText(), "Returning Customer", "Returning Customer Text not displayed");
    }


}

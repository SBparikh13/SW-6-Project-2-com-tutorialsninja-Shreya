package demo.com.tutorialsninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import demo.com.tutorialsninja.pages.MyAccountPage;
import demo.com.tutorialsninja.pages.MyAccountRegisterPage;
import org.testng.Assert;

import java.util.UUID;

public class AccountRegisterPageSteps {

    @And("^I select and click on register tab$")
    public void iSelectAndClickOnRegisterTab() {
        new MyAccountPage().clickOnRegister();
    }
    @Then("^I Verify the text “<Register Account>”$")
    public void iVerifyTheTextRegisterAccount()  {
        Assert.assertEquals(new MyAccountPage().getRegisterAccountText(), "Register Account", "Register Account not displayed");
    }
    @Then("^I enter first name \"([^\"]*)\" in firstname field$")
    public void iEnterFirstNameInFirstnameField(String arg0) {
        new MyAccountRegisterPage().enterFirstName("Shubh");
    }
    @And("^I enter last name \"([^\"]*)\" lastname field$")
    public void iEnterLastNameLastnameField(String arg0) {
        new MyAccountRegisterPage().enterLastName("Parikh");
    }
    @And("^I enter email address \"([^\"]*)\" in emailfield$")
    public void iEnterEmailAddressInEmailfield(String arg0) {
        String email= "random-" + UUID.randomUUID().toString() + "@example.com";
       new MyAccountRegisterPage().enterEmail(email);
    }
    @And("^I enter telephone \"([^\"]*)\" in telephone field$")
    public void iEnterTelephoneInTelephoneField(String arg0) {
        new MyAccountRegisterPage().enterTelephone("079124841492");
    }
    @And("^I enter password \"([^\"]*)\" in password field$")
    public void iEnterPasswordInPasswordField(String arg0) {
        new MyAccountRegisterPage().enterPassword("Charlie789");
    }
    @And("^I confirm Password \"([^\"]*)\" in confirm password field$")
    public void iConfirmPasswordInConfirmPasswordField(String arg0) {
        new MyAccountRegisterPage().enterConfirmPassword("Charlie789");
    }
    @Then("^I select subscribe radio button$")
    public void iSelectSubscribeRadioButton() {
       new MyAccountRegisterPage().selectSubscribeYesRadioButton();
    }

    @And("^I click on privacy check box$")
    public void iClickOnPrivacyCheckBox() {
        new MyAccountRegisterPage().clickPrivacyPolicyCheckbox();
    }

    @And("^I verify the text <“Your Account Has Been Created!”>$")
    public void iVerifyTheTextYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountRegisterPage().getAccountHasBeenCreatedText(), "Your Account Has Been Created!", "Cannot create account");
    }

    @And("^I click on continue button again$")
    public void iClickOnContinueButtonAgain() {
        new MyAccountRegisterPage().clickOnContinueButtonAgain();

    }

    @Then("^I click on My account link$")
    public void iClickOnMyAccountLink() {
       new MyAccountRegisterPage().clickOnMyAccountLink();
    }

    @And("^I  select logout tab and click on it$")
    public void iSelectLogoutTabAndClickOnIt() {
        new MyAccountPage().selectMyAccountOptions("Logout");
    }

    @Then("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0) throws InterruptedException {
        Assert.assertEquals(new MyAccountRegisterPage().getAccountLogoutText(), "Account Logout", "Cannot logout");
        Thread.sleep(2000);

    }
}

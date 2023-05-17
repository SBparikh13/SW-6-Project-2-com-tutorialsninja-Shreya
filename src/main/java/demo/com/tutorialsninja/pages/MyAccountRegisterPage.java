package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountRegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountRegisterPage.class.getName());

    public MyAccountRegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstNameField ;
    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastNameField ;
    @CacheLookup
    @FindBy(name = "email")
    WebElement emailField ;
    @CacheLookup
    @FindBy(name ="telephone" )
    WebElement telephoneField ;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField ;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordField ;
    @CacheLookup
    @FindBy(xpath = "(//input[@type='radio'])[2]")
    WebElement subscribeRadioButton;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicyCheckBox;
    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountHasBeenCreatedText;
    @CacheLookup
    @FindBy(xpath = "//a[text() = 'Continue']")
    WebElement clickContinueButton ;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink ;
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Account Logout')]" )
    WebElement accountLogoutText ;
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
        log.info("Enter First name" +firstName + " to firstname field " + firstNameField.toString());
        

    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
        log.info("Enter lastname" +lastName + " to lastname field " + lastNameField.toString());
        

    }
    public void enterEmail(String emailId){
        sendTextToElement(emailField,emailId);
        log.info("Enter email " +emailId + " to email field " +emailField.toString());
        

    }
    public void enterTelephone(String telephoneNumber){
        sendTextToElement(telephoneField,telephoneNumber);
        log.info("Enter telephone number" +telephoneNumber+ " to telephone field " +telephoneField.toString());
       


    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
        log.info("Enter password" +password + " to password field " +passwordField.toString());
      
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Enter password again " +confirmPassword + " to confirm password field field " +confirmPasswordField.toString());
       

    }
    public void selectSubscribeYesRadioButton(){
        clickOnElement(subscribeRadioButton);
        log.info("Click on "  +subscribeRadioButton.toString());
        

    }
    public void clickPrivacyPolicyCheckbox(){
        clickOnElement(privacyPolicyCheckBox);
        log.info("Click on " +privacyPolicyCheckBox.toString());
       

    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("Click on " +continueButton.toString());
        

    }
    public String getAccountHasBeenCreatedText(){
        log.info("Get text "  +accountHasBeenCreatedText.toString());
      
        return getTextFromElement(accountHasBeenCreatedText);
    }
    public void clickOnContinueButtonAgain(){
       mouseHoverToElementAndClick(clickContinueButton);
        log.info("Click on "  +clickContinueButton.toString());
      
    }
    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
        log.info("Click on " +myAccountLink.toString());
        
    }
    public String getAccountLogoutText(){
        log.info("Get text " +accountLogoutText.toString());
       
        return getTextFromElement(accountLogoutText);
    }

}

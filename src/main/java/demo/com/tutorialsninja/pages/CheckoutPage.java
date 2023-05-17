package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephoneFeild;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement addressField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcodeField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement stateFiels;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonguestTab;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsandConditionBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonpaymentTab;
    @CacheLookup
    @FindBy(xpath = "//div[text()='Warning: Payment method required!']")
    WebElement warningMessageText;
    @CacheLookup
    @FindBy(tagName = "textarea")
    WebElement textArea;

    public void enterFirstname(String name) {
        sendTextToElement(firstNameField, name);
       log.info("Enter first name" +name + " to first name field " + firstNameField.toString());
       
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField,lastName);
       log.info("Enter lastname" + lastName + " to lastname field " + lastName.toString());
     
    }

    public void enterEmail(String emailId) {
        sendTextToElement(emailField, emailId);
       log.info("Enter Email id" + emailId + " to email field " + emailField.toString());
       
    }

    public void enterTelephone(String teleNumber) {
        sendTextToElement(telephoneFeild, teleNumber);
       log.info("Enter phone number  " +telephoneFeild .toString());
        
    }

    public void enterAddress(String streetName) {
        sendTextToElement(addressField, streetName);
       log.info("Enter street name" + streetName + " to street name field " +addressField.toString());
        
    }

    public void enterCity(String cityName) {
        sendTextToElement(cityField,cityName);
       log.info("Enter city name" +cityName + " to city name field " +cityField.toString());
       
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postcodeField, postcode);
       log.info("Enter postcode" +postcode + " to postcode field " +postcodeField.toString());
        
    }

    public void enterCountry(String countryName) {
        sendTextToElement(countryField, countryName);
       log.info("Enter country name" + countryName + " to country name field " +countryField.toString());
       
    }

    public void enterState(String stateName) {
        sendTextToElement(stateFiels,stateName);
       log.info("Enter state name" +stateName + " to state field " +stateFiels.toString());
        
    }

    public void clickContinueButtonguest() {
        clickOnElement(continueButtonguestTab);
       log.info("Click on "  + continueButtonguestTab.toString());
       
    }

    public void enterCommentInTextAea(String text) {
        sendTextToElement(textArea, text);
       log.info("Enter text" +text + " to text area field " +textArea.toString());
       
    }

    public void checkTermsAndCondtionCheckBox() {
        clickOnElement(termsandConditionBox);
       log.info(" Click on " +termsandConditionBox + " to term and condition box " +termsandConditionBox.toString());
        

    }

    public void clickContinueButtonpayment() {
        clickOnElement(continueButtonpaymentTab);
       log.info("Click on "  + continueButtonpaymentTab.toString());
       
    }
    public String GetWarningMessageText() {
       log.info("Get text " + warningMessageText.toString());
       return getTextFromElement(warningMessageText);
    }
}

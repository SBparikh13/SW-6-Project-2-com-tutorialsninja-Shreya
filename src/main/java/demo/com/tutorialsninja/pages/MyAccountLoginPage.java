package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountLoginPage.class.getName());

    public MyAccountLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id ="input-email")
    WebElement emailAddress ;
    @CacheLookup
    @FindBy(name = "password")
    WebElement enterPassword ;
    @CacheLookup
    @FindBy(xpath ="//input[@value='Login']" )
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccountText;



    public void enterEmailAddress(String emailId){
        sendTextToElement(emailAddress,emailId);
        log.info("Enter email id" + emailId + " to eamil id field " + emailAddress.toString());
        
    }
    public void enterValidPassword(String password){
        sendTextToElement(enterPassword,"Tango456");
        log.info("Enter password" + password + " to password field" + enterPassword.toString());
        
    }
    public void clickOnLoginButton() {
       mouseHoverToElementAndClick(loginButton);
        log.info("Click on " + loginButton.toString());
    }
    public String getMyAccountText(){
        log.info("Get  Text" + myAccountText.toString());
        return getTextFromElement(myAccountText);
    }
}

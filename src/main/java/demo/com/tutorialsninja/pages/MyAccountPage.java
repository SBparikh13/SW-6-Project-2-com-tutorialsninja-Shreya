package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountTab;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountOptions;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu dropdown-menu-right']//li")
    List<WebElement> optionList;
    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement logoutOption;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerOption;

    public void clickOnMyAccountTab() {
        mouseHoverToElementAndClick(myAccountTab);
        log.info("Click on " + myAccountTab.toString());
        
    }

    public void clickOnMyAccountTabAgain() {
        mouseHoverToElementAndClick(myAccountOptions);
        log.info("Click on " + myAccountOptions.toString());
       
    }
    public void clickLogout() {
        mouseHoverToElementAndClick(logoutOption);
        log.info("Click on " +logoutOption.toString());
       
    }
    public void clickOnRegister() {
        mouseHoverToElementAndClick(registerOption);
        log.info("Click on " +registerOption.toString());
      
    }

    public String getRegisterAccountText() {
        log.info("Get text" + registerAccountText.toString());
       
        return getTextFromElement(registerAccountText);
    }

    public String getReturningCustomerText() {
        log.info("Get text" + returningCustomerText.toString());
      
        return getTextFromElement(returningCustomerText);
    }

    /*
     * 1.1 create method with name "selectMyAccountOptions" it has one parameter name
     * "option" of type string
     * 1.2 This method should click on the options whatever name is passed as parameter.
     * (Hint: Handle List of Element and Select options)
     */
    public void selectMyAccountOptions(String option) {
        log.info("Select " + option + " from " + optionList.toString());

        List<WebElement> list = optionList;
        try {
            for (WebElement options : list) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            list = optionList;

        }

    }
}


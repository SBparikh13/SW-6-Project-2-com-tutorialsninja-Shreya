package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartClick;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyTabClick;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£Pound Sterling')]")
    WebElement poundSterlingClick;


    //2.10 Click on link “shopping cart” display into success message
    public void shoppingCartClick() {
        clickOnElement(shoppingCartClick);
        log.info("Click on " + shoppingCartClick.toString());

    }
        //currency tab click
        public void clickOnCurrencyTab () {
            clickOnElement(currencyTabClick);
            log.info("Click on " + currencyTabClick.toString());

        }

        public void clickOnPoundSterling () {
            clickOnElement(poundSterlingClick);
            log.info("Click on " + poundSterlingClick.toString());

        }

    }

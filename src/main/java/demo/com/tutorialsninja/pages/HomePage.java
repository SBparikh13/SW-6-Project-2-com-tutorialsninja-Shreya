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

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Desktops" )
    WebElement mouseHoverDesktop ;
    @CacheLookup
    @FindBy(linkText ="Laptops & Notebooks" )
    WebElement mouseHoverLaptopsAndNotebooks ;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement mouseHoverComponents ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
   WebElement desktopText ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopNotebookText ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
   List<WebElement> topMenu;

    public void mouseHoverAndClickDesktops() {
        mouseHoverToElementAndClick(mouseHoverDesktop);
    }
    public void mouseHoverAndClickLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(mouseHoverLaptopsAndNotebooks);
    }
    public void mouseHoverAndClickComponents(){
        mouseHoverToElementAndClick(mouseHoverComponents);
    }
    public void selectMenu(String menu) {
        
        log.info("Select " +menu +" from " + topMenu.toString());
        try {
            List<WebElement> topMenuList = topMenu;
            for (WebElement listOfElement : topMenuList) {
                if (listOfElement.getText().equals(menu)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> topMenuList = topMenu;
        }


    }
    public String getDesktopText(){
        log.info("Get Text"  + desktopText.toString());
        ;
        return getTextFromElement(desktopText);
    }

    public String getLaptopsNotebooksText(){
        log.info("Get Text"  +laptopNotebookText.toString());
     
        return getTextFromElement(laptopNotebookText);
    }
    public String getComponents(){
        log.info("Get Text"  + componentsText.toString());
       
        return getTextFromElement(componentsText);
    }



}

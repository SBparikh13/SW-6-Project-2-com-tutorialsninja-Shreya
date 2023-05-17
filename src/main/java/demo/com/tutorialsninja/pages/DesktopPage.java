package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement mouseHoverDesktop;
    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement clickDesktop;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement selectSortZToA;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement selectSortAToZ;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement selectProduct;
    //WebElement enterQty = WebElement.name("quantity");
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartClick;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement hpText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingcartText;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement hpProductText;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement product21Text;
    @CacheLookup
    @FindBy(xpath = "(//td[@class='text-right'][normalize-space()='£74.73'])[4]")
    WebElement totalcostText;
    @CacheLookup
    @FindBy(xpath = "//small[normalize-space()='Delivery Date:2023-11-30']")
    WebElement deliveryDateText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement datePicker;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthAndYearText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
   List< WebElement> dateList;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productList;

    public void selectSortByAToZ(String sortAscendingName) {
        selectByVisibleTextFromDropDown(selectSortAToZ,"Name (A - Z)" );
        log.info("Select Text" + sortAscendingName + " from drop down menu " + selectSortAToZ.toString());
       
    }

    public void mouseHoverAndClickDesktops() {
        mouseHoverToElementAndClick(mouseHoverDesktop);
        log.info("Mouse hover and click " + mouseHoverDesktop.toString());
       
    }

    public void clickOnShowAllDeskTops() {
        clickOnElement(clickDesktop);
        log.info(" click on " + clickDesktop.toString());

    }
    public void selectSortByZToA(String sortDescendingName) {
        selectByVisibleTextFromDropDown(selectSortZToA, "Name (Z - A)");
        log.info("Select Text" + sortDescendingName + " from drop down menu " + selectSortAToZ.toString());
       
    }

    public void selectProduct() {
        clickOnElement(selectProduct);
        log.info(" click on " + selectProduct.toString());
       

    }

    public void addToCart() {
        clickOnElement(addToCartClick);
        log.info(" click on " + addToCartClick.toString());
       

    }

    public String getHPText() {
        log.info("Get text  " + hpText.toString());
       
        return getTextFromElement(hpText);
    }

    public String getSuccessMessageText() {
        log.info(" Get text  " + successText.toString());
       
        return getTextFromElement(successText);
    }

    public String getShoppingcartText() {
        log.info(" Get text  " + successText.toString());
        
        return getTextFromElement(shoppingcartText);
    }

    public String getHPProdcutText() {
        log.info(" Get text  " + hpProductText.toString());
       
        return getTextFromElement(hpProductText);
    }

    public String getProdcut21Text() {
        log.info(" Get text  " + product21Text.toString());
        
        return getTextFromElement(product21Text);
    }

    public String getTotalCostText() {
        log.info(" Get text  " + totalcostText.toString());
        
        return getTextFromElement(totalcostText);
    }

    public String getdeliveryDateText() {
        log.info(" Get text  " + deliveryDateText.toString());
       
        return getTextFromElement(deliveryDateText);
    }

    public void verifyProductArrangeInDescendingOrder() {
       
        log.info("Select option from " + productList.toString());
        List<WebElement> products =productList;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }

        System.out.println(originalProductsName);
        // Sort By Reverse order
       Collections.reverse(originalProductsName);
       System.out.println(originalProductsName);
    }

    public void selectDeliveryDate(String s) {

       String year = "2023";
        String month = "November";
       String date = "13";
        clickOnElement(datePicker);
        while (true) {
            String monthAndYear = getTextFromElement(monthAndYearText);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButton);
            }
        }
        List<WebElement> allDates = dateList;
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
        log.info("select date " + dateList.toString());

    }
}

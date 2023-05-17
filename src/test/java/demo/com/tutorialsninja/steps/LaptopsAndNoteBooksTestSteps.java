package demo.com.tutorialsninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import demo.com.tutorialsninja.pages.CheckoutPage;
import demo.com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import demo.com.tutorialsninja.pages.ShoppingCartPage;
import org.testng.Assert;

public class LaptopsAndNoteBooksTestSteps {
    @And("^I Select Sort By Price \\(High > Low\\)$")
    public void iSelectSortByPriceHighLow() {
        new LaptopsAndNotebooksPage().originalProductPrice();
        new LaptopsAndNotebooksPage().sortByPriceHightoLow();

    }

    @Then("^I should see Product price is arrange in High to Low order\\.$")
    public void iShouldSeeProductPriceIsArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().afterSortByPrice();
    }

    @And("^I Click on Show All Laptops & Notebooks$")
    public void iClickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNotebooksPage().clickOnShowAllLaptopAndNoteBooks();
    }

    @And("^I Select Product MacBook$")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().clickOnMacbook();
    }

    @Then("^I should see Product name MacBook$")
    public void iShouldSeeProductNameMacBook() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getMacbooktext(), "MacBook", "Macbook product not found");

    }

    @And("^I Click on Add To Cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        new LaptopsAndNotebooksPage().addToCart();
    }

    @Then("^I should see message Success: You have added MacBook to your shopping cart!$")
    public void iShouldSeeMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getSuccesstext(), "Success: You have added MacBook to your shopping cart!\n" +
                "×", "Not correct text");
    }

    @Then("^I should see Shopping Cart$")
    public void iShouldSeeShoppingCart() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getShoppingCartText(), "Shopping Cart  (0.00kg)", "Shopping cart message not found");
    }

    @And("^I should see Product name is MacBook$")
    public void iShouldSeeProductNameIsMacBook() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getMacbookNameText(), "MacBook", "Product name not matched");
    }

    @And("^I Change Quantity to (\\d+)$")
    public void iChangeQuantityTo(int arg0) {
        new LaptopsAndNotebooksPage().clearQty();
        new LaptopsAndNotebooksPage().changeQty();
    }

    @And("^I click on Update tab$")
    public void iClickOnUpdateTab() {
        new LaptopsAndNotebooksPage().clickUpdateTab();
    }

    @Then("^I should see message Success: You have modified your shopping cart!$")
    public void iShouldSeeMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getModifiedSuccessText(), "Success: You have modified your shopping cart!\n" +
                "×", "Cart not modified");
    }

    @And("^I should see the updated price £(\\d+)\\.(\\d+)$")
    public void iShouldSeeTheUpdatedPrice£(int arg0, int arg1) {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getTotaltext(), "£737.45", "Total cost do not match");

    }

    @And("^I click on Checkout button$")
    public void iClickOnCheckoutButton() {
        new LaptopsAndNotebooksPage().clickCheckout();
    }

    @Then("^I should see text Checkout$")
    public void iShouldSeeTextCheckout() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getCheckoutText(), "Checkout", "text not found");
    }

    @And("^I should see text New Customer$")
    public void iShouldSeeTextNewCustomer() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new LaptopsAndNotebooksPage().getNewCustomerText(), "New Customer", "Text not found");
    }

    @And("^I click on Guest Checkout radio button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new LaptopsAndNotebooksPage().clickOnGuestCheckoutButton();
    }

    @And("^I click on Continue tab$")
    public void iClickOnContinueTab() {
        new LaptopsAndNotebooksPage().clickOnContinueButton();
    }

    @Then("^I fill all the mandatory details$")
    public void iFillAllTheMandatoryDetails() {
        new CheckoutPage().enterFirstname("Kiara");
        new CheckoutPage().enterLastName("Parikh");
        new CheckoutPage().enterEmail("kp1309@gmail.com");
        new CheckoutPage().enterTelephone("07912418492");
        new CheckoutPage().enterAddress("61,Maven Road");
        new CheckoutPage().enterCity("United Kingdom");
        new CheckoutPage().enterPostcode("T123NG");
        new CheckoutPage().enterCountry("England");
        new CheckoutPage().enterState("London");

    }

    @And("^I click on Continue$")
    public void iClickOnContinue() {
        new CheckoutPage().clickContinueButtonguest();
    }


    @And("^I enter Comments about order into text field$")
    public void iEnterCommentsAboutOrderIntoTextField(String text) {
        new CheckoutPage().enterCommentInTextAea("Thank you");
    }

    @And("^I  Click on check the Terms & Conditions check box$")
    public void iClickOnCheckTheTermsConditionsCheckBox() {
        new CheckoutPage().checkTermsAndCondtionCheckBox();
    }

    @And("^I Click on Continues$")
    public void iClickOnContinues() {
        new CheckoutPage().clickContinueButtonpayment();
    }

    @Then("^I should see message Warning: Payment method required$")
    public void iShouldSeeMessageWarningPaymentMethodRequired() {
       Assert.assertEquals(new CheckoutPage().GetWarningMessageText(), "Warning: Payment method required!\n" + "×", "message not found");
    }

    @And("^I click on link shopping cart display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new LaptopsAndNotebooksPage().clickShoppingCart();
    }

    @And("^I click on currency tab$")
    public void iClickOnCurrencyTab() {
        new ShoppingCartPage().clickOnCurrencyTab();
    }

    @And("^I change currency to £ sterling$")
    public void iChangeCurrencyTo£Sterling() {
        new ShoppingCartPage().clickOnPoundSterling();
    }
}


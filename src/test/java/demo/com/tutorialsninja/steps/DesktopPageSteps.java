package demo.com.tutorialsninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.com.tutorialsninja.pages.DesktopPage;
import demo.com.tutorialsninja.pages.ShoppingCartPage;
import org.testng.Assert;

public class DesktopPageSteps {
    @When("^I mouse hover on desktop tab$")
    public void iMouseHoverOnDesktopTab() {
        new DesktopPage().mouseHoverAndClickDesktops();

    }

    @And("^I mouse hover and click on Show all Desktops$")
    public void iMouseHoverAndClickOnShowAllDesktops() {
        new DesktopPage().clickOnShowAllDeskTops();
    }

    @And("^I select sort filter Name: Z to A$")
    public void iSelectSortFilterNameZToA() {
       new DesktopPage().selectSortByZToA("Name: Z to A");
    }

    @Then("^I verify products are arranged in descending order$")
    public void iVerifyProductsAreArrangedInDescendingOrder() {
        new DesktopPage().verifyProductArrangeInDescendingOrder();
    }

    @And("^I select sort filter Name : A to Z$")
    public void iSelectSortFilterNameAToZ() {
        new DesktopPage().selectSortByAToZ("Name(A-Z)");
    }
    @Then("^I Select product “<HP LP(\\d+)>”$")
    public void iSelectProductHPLP(int arg0) {
        new DesktopPage().selectProduct();
    }
    @And("^I verify the product text$")
    public void iVerifyTheProductText() {
        Assert.assertEquals(new DesktopPage().getHPText(), "HP LP3065", "HP LP3065 Product not display");

    }

    @And("^I Select Delivery Date \"([^\"]*)\"$")
    public void iSelectDeliveryDate(String s) throws  InterruptedException {
       new DesktopPage().selectDeliveryDate("2023-11-13");

    }


    @And("^I Click on “<Add to Cart>” button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new DesktopPage().addToCart();
    }
    @And("^I verify success messege$")
    public void iVerifySuccessMessege() {
        Assert.assertEquals(new DesktopPage().getSuccessMessageText(),"Product not added to cart" ,"Success: You have added HP LP3065 to your shopping cart!\n" + "×");

    }

    @And("^I click on shooping cart link$")
    public void iClickOnShoopingCartLink() {
       new ShoppingCartPage().shoppingCartClick();
    }

    @And("^I Verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0) {
        Assert.assertEquals(new DesktopPage().getShoppingcartText(),"Shopping Cart  (1.00kg)","Shopping cart not displayed");

    }

    @Then("^I click on change currenct tab$")
    public void iClickOnChangeCurrenctTab() {
       new ShoppingCartPage().clickOnCurrencyTab();
    }

    @And("^I change the currency to  £ sterling$")
    public void iChangeTheCurrencyTo£Sterling() {
        new ShoppingCartPage().clickOnPoundSterling();
    }

    @And("^I Verify the Product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String arg0) {
        Assert.assertEquals(new DesktopPage().getHPProdcutText(),"HP LP3065","HP LP3065 not displayed");
    }

    @And("^I Verify the Delivery Date \"([^\"]*)\"$")
    public void iVerifyTheDeliveryDate(String arg0) {
        Assert.assertEquals(new DesktopPage().getdeliveryDateText(),"Delivery Date:2023-11-30","2023-11-30 not displayed");

    }

    @And("^I Verify the Model \"([^\"]*)\"$")
    public void iVerifyTheModel(String arg0){
        Assert.assertEquals(new DesktopPage().getProdcut21Text(),"Product 21","product21 not displayed");

    }

    @And("^I Verify the Todal \"([^\"]*)\"$")
    public void iVerifyTheTodal(String arg0) {
        Assert.assertEquals(new DesktopPage().getTotalCostText(),"£74.73","total not matched");
    }



}

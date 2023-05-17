package demo.com.tutorialsninja.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.com.tutorialsninja.pages.HomePage;
import org.testng.Assert;

public class TopMenuTestSteps {
    @When("^I mouse hover on Desktop tab and Click$")
    public void iMouseHoverOnDesktopTabAndClick() {
        new HomePage().mouseHoverAndClickDesktops();
    }

    @And("^I click on Show All Desktops$")
    public void iClickOnShowAllDesktops() {
        new HomePage().selectMenu("Show AllDesktops");
    }

    @Then("^I should see text Desktops$")
    public void iShouldSeeTextDesktops() {
        Assert.assertEquals(new HomePage().getDesktopText(), "Desktops", "Desktops text not found");
    }

    @When("^I Mouse hover on Laptops & Notebooks Tab and click$")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverAndClickLaptopsAndNotebooks();
    }

    @And("^Click on Show All Laptops & Notebooks$")
    public void clickOnShowAllLaptopsNotebooks() {
        new HomePage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("^I should see text Laptops & Notebooks$")
    public void iShouldSeeTextLaptopsNotebooks() {
        Assert.assertEquals(new HomePage().getLaptopsNotebooksText(), "Laptops & Notebooks", "Laptops and Notebooks text not found");
    }

    @When("^I Mouse hover on Components Tab and click$")
    public void iMouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverAndClickComponents();
    }

    @And("^I Click on Show All Components$")
    public void iClickOnShowAllComponents() {
        new HomePage().selectMenu("Show AllComponents");
    }

    @Then("^I should see text Components$")
    public void iShouldSeeTextComponents() {
        Assert.assertEquals(new HomePage().getComponents(), "Components", "Components not found");
    }

}

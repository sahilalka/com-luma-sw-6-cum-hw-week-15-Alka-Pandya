package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearTestPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {

    @When("^I Mouse Hover on Gear Menu$")
    public void iMouseHoverOnGearMenu() {
        new GearTestPage().mouseHoverOnGearMenu();
    }

    @And("^I Click on Bags$")
    public void iClickOnBags() {
        new GearTestPage().clickOnBags();
    }

    @And("^I click On Product Name \"([^\"]*)\"$")
    public void iClickOnProductName(String arg0)  {
        new GearTestPage().clickOnProductName();

    }

    @And("^I should be able to Verify the Text \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyTheText(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromProductName(), "Overnight Duffle", "Error message: Product name is not matching");

    }

    @And("^I change the Qty to (\\d+) on Product$")
    public void iChangeTheQtyToOnProduct(String qty) {
        new GearTestPage().clearAnElement();
        new GearTestPage().changeQuantity(qty);
    }

    @And("^I  Click On \"([^\"]*)\" Button$")
    public void iClickOnButton(String arg0) {
        new GearTestPage().clickOnAddToCart();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromAfterAddToCart(), "You added Overnight Duffle to your shopping cart.", "Error message: message is not matching");

    }




    @And("^I click on \"([^\"]*)\" link into Message$")
    public void iClickOnLinkIntoMessage(String arg0)  {
        new GearTestPage().clickOnShoppingCart();

    }

    @And("^Verify Product Name \"([^\"]*)\"$")
    public void verifyProductName(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromOverNightDuffleBag(),  "Overnight Duffle", "Error message: message is not matching");

    }

    @And("^Verify the Qty to\"([^\"]*)\"$")
    public void verifyTheQtyTo(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromTheEnteredQuantity(), "3", "Error message: Quantity is not matching");

    }

    @And("^Verify the Product Price \"([^\"]*)\"$")
    public void verifyTheProductPrice(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromProductPrice(), "$135.00", "Error message: Price is not matching");

    }

    @And("^I change the Qty to\"([^\"]*)\"$")
    public void iChangeTheQtyTo(String qty)  {
        new GearTestPage().clearAnElementFromUpdatedShoppingCart();
        new GearTestPage().updateTheQuantity(qty);
    }

    @And("^I clicking on \"([^\"]*)\" button$")
    public void iClickingOnButton(String arg0)  {
        new GearTestPage().updateShoppingCart();
    }

    @Then("^Verify the Updated Product Price \"([^\"]*)\"$")
    public void verifyTheUpdatedProductPrice(String arg0)  {
        Assert.assertEquals(new GearTestPage().getTextFromUpdatedProductPrice(), "$225.00", "Error message: Price is not matching");

    }



}
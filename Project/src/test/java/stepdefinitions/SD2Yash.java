package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.JewelryHomepageYash;
import pages.Ringproductpage;
import pages.RingspageYash;

public class SD2Yash {

    @Given("the user navigates to the Mayors homepage")
    public void the_user_navigates_to_the_mayors_homepage() {
        JewelryHomepageYash.clickOnCookies();

    }

    @When("the user hovers over Jewelry on the navigation bar and clicks on Chanel")
    public void the_user_hovers_over_jewelry_on_the_navigation_bar_and_clicks_on_chanel() {
        JewelryHomepageYash.hoverOnJewelry();
        JewelryHomepageYash.clickOnchanel();
        JewelryHomepageYash.clickOnPopUp();
    }

    @When("the user clicks on Rings")
    public void the_user_clicks_on_rings() {
        RingspageYash.clickOnRings();
        RingspageYash.clickOnBrandCollectionFilter();

    }

    @When("the user clicks on Coco crush under Brand")
    public void the_user_clicks_on_coco_crush_under_brand() {

        RingspageYash.clickOnCocoCrush();

    }

    @When("the user clicks on White Gold under Dial Color")
    public void the_user_clicks_on_white_gold_under_dial_color() {
        RingspageYash.clickOnMetalTypeFilter();
        RingspageYash.clickOnWhiteGold();

    }

    @Then("the user adds the first product")
    public void the_user_adds_the_first_product() {
        Ringproductpage.firstProduct();

    }

}

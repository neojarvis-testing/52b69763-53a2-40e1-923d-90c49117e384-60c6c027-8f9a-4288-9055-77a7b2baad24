package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BrandHomepageYash;
import pages.MensWatchpageYash;
import pages.ProductPageYash;

public class SD1Yash {

    @Given("the user navigates to the Mayors homepage and maximizes the browser window")
    public void the_user_navigates_to_the_mayors_homepage_and_maximizes_the_browser_window() {

        BrandHomepageYash.cookiesclick();
    }

    @When("the user hovers over Brands on the navigation bar and clicks on Omega")
    public void the_user_hovers_over_brands_on_the_navigation_bar_and_clicks_on_omega() {
        BrandHomepageYash.hoverBrand();
        BrandHomepageYash.omegaClick();

    }

    @When("the user clicks on Mens Watches under Recipient")
    public void the_user_clicks_on_mens_watches_under_recipient() {
        MensWatchpageYash.popUp();
        MensWatchpageYash.mensWatch();

    }

    @When("the user clicks on Seamaster under Brand Collections")
    public void the_user_clicks_on_seamaster_under_brand_collections() {
        ProductPageYash.semasterClick();

    }

    @When("the user clicks on Blue under Dial Color")
    public void the_user_clicks_on_blue_under_dial_color() {
        ProductPageYash.blueClick();

    }

    @Then("the user adds the first product to the shopping bag")
    public void the_user_adds_the_first_product_to_the_shopping_bag() {
        ProductPageYash.firstProduct();
        ProductPageYash.addCart();

    }
}

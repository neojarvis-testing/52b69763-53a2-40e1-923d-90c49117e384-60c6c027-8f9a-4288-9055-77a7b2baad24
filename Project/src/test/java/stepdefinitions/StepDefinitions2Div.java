package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageDiv;
import pages.ProductBuyingActionDiv;
import pages.RingPageActionDiv;
import utils.LoggerHandler;

public class StepDefinitions2Div {

    @Given("user navigates to the ring homepage")
    public void user_navigates_to_the_ring_homepage() {

        LoggerHandler.info("Browser Open");
    }

    @When("user enter rings")
    public void user_enter_rings() {

        HomePageDiv.homepageactionring(HooksDiv.test);

    }

    @When("user click on brand then carlex")
    public void user_click_on_brand_then_carlex() {
        RingPageActionDiv.selectingring(HooksDiv.test);

    }

    @Then("user click on rings then click on for her")
    public void user_click_on_rings_then_click_on_for_her() throws InterruptedException {
        ProductBuyingActionDiv.ringbuying(HooksDiv.test);
    }
}

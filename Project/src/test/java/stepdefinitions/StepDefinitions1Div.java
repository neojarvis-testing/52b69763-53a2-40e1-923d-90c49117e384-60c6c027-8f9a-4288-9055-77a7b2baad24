package stepdefinitions;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageDiv;
import pages.ProductBuyingActionDiv;
import pages.WeddingPageActionDiv;

public class StepDefinitions1Div {

    @Given("user lands on the bracelet homepage")
    public void user_lands_on_the_bracelet_homepage() {
        Hooks.test.log(Status.INFO, "BrowserLaunced");
    }

    @When("user hover on wedding and click on the bracelet")
    public void user_hover_on_wedding_and_click_on_the_bracelet() {
        HomePageDiv.homepageaction(Hooks.test);
    }

    @When("user clicks on the jwelery then yellow gold,diamond")
    public void user_clicks_on_the_jwelery_then_yellow_gold_diamond() {

        WeddingPageActionDiv.weddingaction(Hooks.test);
    }

    @Then("user click on bracelet")
    public void user_click_on_bracelet() throws InterruptedException {
        ProductBuyingActionDiv.braceletproductbuying(Hooks.test);
    }

}

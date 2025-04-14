package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeepSeaUmang;
import pages.HomePageUmang;

public class StepdefinitionsTwoUmang {

    @Given("user navigates to the homepage")
    public void user_lands_on_the_homepage() {
        System.out.println("user navigates to the HomePage");
    }

    @When("user hover on Rolex and click on DeepSea")
    public void user_hover_on_rolex_and_click_on_deep_sea() {

        HomePageUmang.allhomedeepseaAction();

    }

    @And("user click on the Rolex Watches and again click on Discover Rolex")
    public void user_click_on_the_rolex_watches_and_again_click_on_discover_rolex() {

        DeepSeaUmang.allDeepseaActions();

    }

    @Then("user click on New Watches 2025 and click on Watchmaking")
    public void user_click_on_new_watches_and_click_on_watchmaking() {

        DeepSeaUmang.allNewWatchesActions();

    }

}

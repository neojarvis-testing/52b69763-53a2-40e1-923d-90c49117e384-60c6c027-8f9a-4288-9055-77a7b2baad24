package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.HomePage_Kasak;

public class SD1Kasak {

    @Given("user launches the browser and navigates to the homepage")
    public void user_launches_the_browser_and_navigates_to_the_homepage() {
        System.out.println("Browser Launched");

    }

    @When("user maximizes the browser window")
    public void user_maximizes_the_browser_window() {
        System.out.println("Maximised the browser window");

    }

    @When("user scrolls down to the footer")
    public void user_scrolls_down_to_the_footer() {
        System.out.println("Scrolled down to the footer");

    }

    @When("user clicks on the About Mayors link in the footer and navigates back to homepage")
    public void user_clicks_on_the_about_mayors_link_in_the_footer_and_navigates_back_to_homepage() {
        HomePage_Kasak.AboutMayors();
        

    }

    @Then("user clicks on the Press Room link in the footer and navigates back to homepage")
    public void user_clicks_on_the_press_room_link_in_the_footer_and_navigates_back_to_homepage() {
        HomePage_Kasak.pressRoomFunc();
        

    }

    @When("user clicks on the Careers link in the footer and navigates back to homepage")
    public void user_clicks_on_the_careers_link_in_the_footer_and_navigates_back_to_homepage() {
        HomePage_Kasak.careersFunc();
        
    }

    @When("user clicks on the Sustainability link in the footer and navigates back to homepage")
    public void user_clicks_on_the_sustainability_link_in_the_footer_and_navigates_back_to_homepage() {
        HomePage_Kasak.sustainFunc();
        

    }

    @When("user clicks on the Newsletter signup link in the footer and navigates back to homepage")
    public void user_clicks_on_the_newsletter_signup_link_in_the_footer_and_navigates_back_to_homepage() {
        HomePage_Kasak.newsletterFunc();
        

    }

    @When("user clicks on the Wedding link in the footer and navigates back to homepage")
    public void user_clicks_on_the_wedding_link_in_the_footer_and_navigates_back_to_homepage() {
        HomePage_Kasak.weddingFunc();
        

    }

    @Then("user clicks on the Rolex link in the footer and navigates back to homepage")
    public void user_clicks_on_the_rolex_link_in_the_footer_and_navigates_back_to_homepage() {
        HomePage_Kasak.rolexFunc();
        

    }

    @Then("user clicks on the Brands link in the footer and navigates back to homepage")
    public void user_clicks_on_the_brands_link_in_the_footer_and_navigates_back_to_homepage() {

        HomePage_Kasak.BrandsFunc();
        

    }

}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FooterRedirectionActions_Ram;
import pages.HomePageActions_Ram;

public class SD1Ram {

    HomePageActions_Ram home = new HomePageActions_Ram();
    FooterRedirectionActions_Ram footer = new FooterRedirectionActions_Ram();

    @Given("User is on the Mayors homepage and User scrolls to the footer section")
    public void user_is_on_the_mayors_homepage_and_user_scrolls_to_the_footer_section() {
        home.scrolltofooter();
    }

    @When("User clicks on Your Security and verifies redirection")
    public void user_clicks_on_your_security_and_verifies_redirection() {
        home.yourSecurityVerification();
    }

    @When("User clicks on Terms and Conditions and verifies redirection")
    public void user_clicks_on_terms_and_conditions_and_verifies_redirection() {
        home.termsVerification();
    }

    @When("User clicks on Privacy Policy and verifies redirection")
    public void user_clicks_on_privacy_policy_and_verifies_redirection() {
        home.privacyPolicyVerification();
    }

    @When("User clicks on Cookie Policy and verifies redirection")
    public void user_clicks_on_cookie_policy_and_verifies_redirection() {
        home.cookiePolicyVerification();
    }

    @When("User clicks on Accessibility and verifies redirection")
    public void user_clicks_on_accessibility_and_verifies_redirection() {
        home.accessibilityVerification();
    }

    @When("User clicks on Pay By Link and verifies redirection")
    public void user_clicks_on_pay_by_link_and_verifies_redirection() {
        home.payByLinkVerification();
    }

    @When("User clicks on Watches and verifies redirection")
    public void user_clicks_on_watches_and_verifies_redirection() {
        home.watchesVerification();
    }

    @Then("User clicks on Jewelry and verifies redirection")
    public void user_clicks_on_jewelry_and_verifies_redirection() {
        home.jweleryVerification();
        home.categoryVerification();
    }

}

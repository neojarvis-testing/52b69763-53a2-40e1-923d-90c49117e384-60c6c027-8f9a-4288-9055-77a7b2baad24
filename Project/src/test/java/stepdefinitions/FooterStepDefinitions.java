package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import pages.HomePage_Siva;
import stepdefinitions.Hooks;
import utils.Base;
import utils.WebDriverHelper;

public class FooterStepDefinitions {

    WebDriverHelper wb = new WebDriverHelper(); 
    HomePage_Siva homeAction = new HomePage_Siva(wb); 

    @Given("the user is on the Home page")
    public void the_user_is_on_the_home_page() {
        Base.driver.findElement(By.id("onetrust-accept-btn-handler")).click();

    }

    @When("the user scrolls to the footer section")
    public void the_user_scrolls_to_the_footer_section() {
        // homeAction.scrollToFooter();
    }


    @Then("the user verifies the footer links is redirected to its expected URL")
    public void the_user_verifies_the_footer_links_is_redirected_to_its_expected_url() {
        homeAction.footerVerification(Hooks.test); 
}
}
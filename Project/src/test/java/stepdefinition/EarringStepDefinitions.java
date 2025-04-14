package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.EarringPage_Siva;
import pages.HomePage_Siva;
import uistore.EarringLocator_Siva;
import utils.WebDriverHelper;

public class EarringStepDefinitions {

    WebDriverHelper wb = new WebDriverHelper(); 
    HomePage_Siva homeAction = new HomePage_Siva(wb);
    EarringPage_Siva earringAction = new EarringPage_Siva(wb); 

    @Given("the user is on the Home page of the site")
    public void the_user_is_on_the_home_page() {
       
    }

    @When("the user enters {string} in the search bar")
    public void the_user_enters_in_the_search_bar(String searchItem) {
        homeAction.searchBarAction(searchItem);
    }

    @Then("the user scrolls to the metal type brand section")
    public void the_user_scrolls_to_the_metal_type_brand_section() {
        wb.javascriptScroll(EarringLocator_Siva.metalTypeBrand);
    }

    @Then("the user selects the brand tab")
    public void the_user_selects_the_brand_tab() {
         wb.clickOnElement(EarringLocator_Siva.brandTab);
    }

    @Then("the user hovers over the metal type brand")
    public void the_user_hovers_over_the_metal_type_brand() {
         wb.hoverOverElement(EarringLocator_Siva.metalTypeBrand);
    }

    @Then("the user selects the metal type brand")
    public void the_user_selects_the_metal_type_brand() {
         wb.clickOnElement(EarringLocator_Siva.metalTypeBrand);
    }

    @Then("the user clicks on the rose gold earrings")
    public void the_user_clicks_on_the_rose_gold_earrings() {
        wb.clickOnElement(EarringLocator_Siva.roseGold);
    }
}
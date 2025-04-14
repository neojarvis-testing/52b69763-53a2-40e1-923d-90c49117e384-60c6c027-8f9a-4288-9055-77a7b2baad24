package stepdefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageUmang;
import pages.RolexWatchUmang;


public class StepDefinitionsOneUmang {

    
  

    @Given("user lands on the homepage")
    public void user_lands_on_the_homepage() {
        System.out.println("Browser Launched");
    }

    @When("user hover on watches and click on the BestSellers")
    public void user_hover_on_watches_and_click_on_the_best_sellers() {
        HomePageUmang.allHomePageActions();


    }

    @And("user clicks on the ForHim, Cartier under brand and Black under dial color")
    public void user_clicks_on_the_for_him_cartier_under_brand_and_black_under_dial_color() {
       
        RolexWatchUmang.allrolexfilter();
        
    }

    @Then("user click on the product that appears and click on add to bag")
    public void user_click_on_the_product_that_appears_and_click_on_add_to_bag() {
      
        RolexWatchUmang.alladdtoCart();
     
    }
}

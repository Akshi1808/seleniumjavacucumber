package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static pages.LoggedIn.*;
import static pages.Login.*;

public class LoggedIn {
    @Then("User should be able to view the product category page")
    public void User_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        visibility_productcategory_formalshoes();
        visibility_productcategory_sportsshoes();
        visibility_productcategory_sneakershoes();

    }

}

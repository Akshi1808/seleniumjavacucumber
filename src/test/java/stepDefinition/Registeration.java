package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static pages.Login.click_NewRegister_btn;
import static pages.Registeration.visibility_user_registration_page;

public class Registeration {

    @Then("User should be able to view the Registration page")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        visibility_user_registration_page();
    }

}

package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.Home.click_hamburger_menu;
import static pages.Home.click_signIn_link;
import static pages.Login.*;

public class Login {

    @Given("User successfully enters the log in details")
    public void User_successfully_enters_the_log_in_details() throws InterruptedException {
        click_username();
        click_password();
        click_login();

    }
}

package stepDefinition;

import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;

import static pages.Home.*;

public class Home {

    @Given("User navigates to the Login page")
    public void User_navigates_to_the_Login_page() throws InterruptedException {

        click_hamburger_menu();
        click_signIn_link();

    }
}

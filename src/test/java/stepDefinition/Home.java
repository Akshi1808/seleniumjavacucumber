package stepDefinition;

import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;

import static pages.Home.*;
import static pages.Registeration.visibility_user_registration_page;

public class Home {

    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
//        Allure.feature("Given");
//        Allure.addAttachment("HTML Snapshot","text/html", driver.getPageSource(), "html");
        click_hamburger_menu();
        click_signIn_link();

    }


    @Given("User navigates to the Online products page")
    public void userNavigatesToTheOnlineProductsPage() throws InterruptedException {
        click_hamburger_menu();
        click_OnlineProducts_link();
    }
}

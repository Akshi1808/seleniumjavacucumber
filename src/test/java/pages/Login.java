package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowseDriver;

public class Login extends BrowseDriver {


    public static String username_xpath = "//input[@id = 'usr']";
    public static String password_xpath = "//input[@id = 'pwd']";
    public static String login_xpath = "//input[@class = 'btn btn-info']";
    public static String newregister_btn_id ="NewRegistration";

    public static void click_username() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(username_xpath)).sendKeys("Scott.gale@gmail.com");
    }

    public static void click_password() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(password_xpath)).sendKeys("P@sword!");
    }

    public static void click_login() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(login_xpath)).click();
    }

    public static void click_NewRegister_btn()
    {
        driver.findElement(By.id(newregister_btn_id)).click();
    }


}

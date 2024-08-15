package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowseDriver;
//import utility.BrowserDriver;



public class Home extends BrowseDriver {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link= "//*[@id=\"menu\"]/a[2]/li";
    public static String onlineProductsPage_link_LinkText = "Online Products";

    public static void click_hamburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_link)).click();
    }

    public static void click_OnlineProducts_link() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductsPage_link_LinkText)).click();
    }

}
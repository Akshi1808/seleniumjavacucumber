package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import utility.BrowserDriver;



public class Home {
    public static WebDriver driver = new ChromeDriver();
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link= "//*[@id=\"menu\"]/a[2]/li";
    public static String onlineProductsPage_link_LinkText = "Online Products";

    public static void click_hamburger_menu() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link)).click();
    }

    public static void click_OnlineProducts_link() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductsPage_link_LinkText)).click();
    }

}
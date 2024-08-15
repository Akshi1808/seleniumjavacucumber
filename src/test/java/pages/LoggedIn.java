package pages;

import org.openqa.selenium.By;
import utility.BrowseDriver;

import static org.junit.Assert.assertEquals;

public class LoggedIn extends BrowseDriver {

    public static String formalshoes = "//*[text()='Formal Shoes']";

    public static String sportsshoes = "//*[text()='Sports']";

    public static String sneakers = "//*[text()='Sneakers']";

    public static void visibility_productcategory_formalshoes() throws InterruptedException {
        String actualproductcategory_fs = driver.findElement(By.xpath(formalshoes)).getText();
        assertEquals("Formal Shoes",actualproductcategory_fs);
    }

    public static void visibility_productcategory_sportsshoes() throws InterruptedException {
        String actualproductcategory_ss = driver.findElement(By.xpath(sportsshoes)).getText();
        assertEquals("Sports",actualproductcategory_ss);
    }

    public static void visibility_productcategory_sneakershoes() throws InterruptedException {
        String actualproductcategory_s = driver.findElement(By.xpath(sneakers)).getText();
        assertEquals("Sneakers",actualproductcategory_s);
    }

}
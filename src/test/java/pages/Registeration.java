package pages;

import org.openqa.selenium.By;
import utility.BrowseDriver;

import static org.junit.Assert.assertEquals;

public class Registeration extends BrowseDriver {

    public static String userregistration_xpath = "/html/body/center/h1";

    public static void visibility_user_registration_page() throws InterruptedException {
        String actualproductcategory_fs = driver.findElement(By.xpath(userregistration_xpath)).getText();
        assertEquals("User Registration Page",actualproductcategory_fs);
    }
}
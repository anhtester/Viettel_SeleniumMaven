package com.anhtester.Bai7_WebDriver;

import com.anhtester.Bai5_Locators.BT_Locators.LocatorsCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class DemoCookies extends BaseTest {

    public static void main(String[] args) {

        //createBrowser();
        createBrowser("chrome");

        driver.navigate().to("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        //Get Cookie by Name
        System.out.println("sp_session: " + driver.manage().getCookieNamed("sp_session"));

        //Get All Cookies
        System.out.println("All Cookies: " + driver.manage().getCookies());

        Set<Cookie> allCookies = driver.manage().getCookies();

        for (Cookie cookie : driver.manage().getCookies()){
            System.out.println(cookie.getValue());
        }

        closeBrowser();

    }

}

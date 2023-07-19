package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.BT_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6ActionsGet {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        String textOfHeader = driver.findElement(By.xpath(LocatorsCRM.headerLoginPage)).getText();
        System.out.println("Header Login Page: " + textOfHeader);
        String labelEmail = driver.findElement(By.xpath("//label[normalize-space()='Email Address']")).getText();
        System.out.println("Label Email: " + labelEmail);

        String attributeButtonLogin1 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getAttribute("type");
        System.out.println("Attribute Type: " + attributeButtonLogin1);
        String attributeButtonLogin2 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getAttribute("class");
        System.out.println("Attribute Class: " + attributeButtonLogin2);

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        Thread.sleep(1000);
        String emailValue = driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value");
        System.out.println("Email value: " + emailValue);
        String passwordValue = driver.findElement(By.xpath(LocatorsCRM.inputPassword)).getAttribute("value");
        System.out.println("Password value: " + passwordValue);
        Thread.sleep(1000);
        driver.get("https://anhtester.com/signup");
        String attributeFullName = driver.findElement(By.xpath("//input[@name='name']")).getAttribute("placeholder");
        System.out.println("Full Name attribute: " + attributeFullName);
        Thread.sleep(1000);
        driver.get("https://crm.anhtester.com/admin/authentication");
        String cssValue1 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("background-color");
        System.out.println("CSS value: " + cssValue1);
        String cssValue2 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("color");
        System.out.println("CSS value: " + cssValue2);
        String cssValue3 = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-size");
        System.out.println("CSS value: " + cssValue3);
        Thread.sleep(1000);
        Dimension dimension = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize();
        System.out.println("Height: " + dimension.getHeight());
        System.out.println("Width: " + dimension.getWidth());

        Point point = driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation();
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());

        Thread.sleep(2000);
        driver.quit();

    }
}

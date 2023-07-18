package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.BT_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3ActionsCheck {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com");

        boolean checkDisplay = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed();
        System.out.println("Check isDisplayed(): " + checkDisplay);
        Thread.sleep(2000);

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        boolean checkEnable1 = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check isEnabled(): " + checkEnable1);
        //Ctrl + Alt + L  => Format code cho ngày hàng thẳng lối

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");

        boolean checkEnable2 = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check isEnabled(): " + checkEnable2);

        Thread.sleep(2000);
        driver.get("https://crm.anhtester.com/admin/authentication");
        boolean checkSelected1 = driver.findElement(By.xpath(LocatorsCRM.checkboxRemember)).isSelected();
        System.out.println("Check isSelected(): " + checkSelected1);

        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        boolean checkSelected2 = driver.findElement(By.xpath(LocatorsCRM.checkboxRemember)).isSelected();
        System.out.println("Check isSelected(): " + checkSelected2);

        Thread.sleep(2000);
        driver.quit(); //Tắt browser
    }
}

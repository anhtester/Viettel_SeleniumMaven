package com.anhtester.Bai5_Locators.XpathTuyetDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AddCategory_XpathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login to CMS
        driver.get("https://cms.anhtester.com/login");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000); //Chờ đợi 3 giây

        //Open Category Page
        //Click Products menu
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/ul[2]/li[1]/a/span[1]")).click();
        Thread.sleep(1000);
        //Click Category menu
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/ul[2]/li[1]/ul/li[8]/a/span")).click();
        Thread.sleep(1000);
        //Click nút Add New Category
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/a/span")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}

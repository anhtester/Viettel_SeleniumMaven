package com.anhtester.Bai5_Locators.XpathTuyetDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AddCategory_XpathTuongDoi {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login to CMS
        driver.get("https://cms.anhtester.com/login");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(2000); //Chờ đợi 3 giây

        //Open Category Page
        //Click Products menu
        driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
        Thread.sleep(1000);
        //Click Category menu
        driver.findElement(By.xpath("//span[normalize-space()='Category']")).click();
        Thread.sleep(1000);
        //Click nút Add New Category
        driver.findElement(By.xpath("//span[normalize-space()='Add New category']")).click();

//        List<WebElement> elementList = driver.findElements(By.xpath("//ul[@id='main-menu']//li"));
//        System.out.println("Số lượng Menu: " + elementList.size());
//
//        for (WebElement element : elementList){
//            System.out.println("Tên Menu: " + element.getText());
//        }

        Thread.sleep(2000);
        driver.quit();
    }
}

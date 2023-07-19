package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class DemoScreenshot {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com");

        //Chụp hình phần tử chỉ định
        WebElement logo = driver.findElement(By.xpath("//body//section[@class='slider-area']//div[@class='row']//div[@class='row']//div[1]//div[1]//a[1]"));

        File file = logo.getScreenshotAs(OutputType.FILE);
        File destFile = new File("website_testing.png");

        try {
            Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Chụp cả màn hình
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(source, new File("full_screen.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Thread.sleep(2000);
        driver.quit();
    }
}

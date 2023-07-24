package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoWebDriverAdvanced {

    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo Browser
        WebDriver driver = new ChromeDriver();
        //2 hàm chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Học kỹ bài số 15
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        //2 hàm để maximize/minimize cửa sổ trình duyệt
        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");
        String window1 = driver.getWindowHandle();
        System.out.println("MÃ WINDOW 1: " + window1);

        Thread.sleep(1000);
        //Mở Tab mới và chuyển hướng đến Tab đó
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://google.com");
        String window2 = driver.getWindowHandle();
        System.out.println("MÃ WINDOW 2: " + window2);

        //Mở cửa sổ Window mới và chuyển hướng đến Window đó
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://github.com");
        System.out.println("MÃ WINDOW 3: " + driver.getWindowHandle());
        Thread.sleep(1000);
        //Chuyển về cửa sổ chỉ định
        driver.switchTo().window(window1);
        Thread.sleep(1000);
        driver.switchTo().window(window2);

        Thread.sleep(2000);
        //Đóng Browser
        driver.quit();
    }

}

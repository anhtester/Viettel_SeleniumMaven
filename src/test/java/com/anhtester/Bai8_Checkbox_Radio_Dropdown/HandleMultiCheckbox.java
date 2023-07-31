package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultiCheckbox extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        System.out.println(listCheckbox.size());

        //Cách 1: dùng duyệt List
        for (int i = 0; i < listCheckbox.size(); i++) {
            System.out.println(listCheckbox.get(i).isSelected());
        }

        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Option 2']")).click();

        //Kiểm tra lại sau khi click chọn 2 ô checkbox
        listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));

        for (int i = 0; i < listCheckbox.size(); i++) {
            System.out.println(listCheckbox.get(i).isSelected());
            //Xác nhận nó đúng hay chưa? => TCs passes/failed
        }

        System.out.println("===================");
        if (listCheckbox.get(0).isSelected() == true &&
                listCheckbox.get(1).isSelected() == true &&
                listCheckbox.get(2).isSelected() == true) {
            System.out.println("Passed"); //Sau này dùng hàm trong class Assert của TestNG để xác nhận pass/fail
        } else {
            System.out.println("Failed");
        }

        //Cách 2 dùng doạn Xpath cụ thể để duyệt từng vị trí checkbox
        System.out.println("==========Cách 2===========");
        for (int i = 1; i <= listCheckbox.size(); i++) {
            System.out.println(driver.findElement(By.xpath("(//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox'])[" + i + "]")).isSelected());
        }

        closeBrowser();
    }
}

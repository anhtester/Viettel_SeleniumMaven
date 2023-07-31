package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //Kiểm tra giá trị Default
        boolean checkCheckbox = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected();
        System.out.println("Checkbox Default: " + checkCheckbox);
        driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).click();
        boolean checkCheckboxAfter = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected();
        System.out.println("Checkbox Default (After): " + checkCheckboxAfter);

        closeBrowser();
    }
}

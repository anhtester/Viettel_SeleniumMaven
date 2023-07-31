package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;

public class HandleRadio extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        boolean checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Male']/input")).isSelected();
        System.out.println("Radio Male: " + checkRadioMale);
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Male']")).click();
        checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Male']/input")).isSelected();
        System.out.println("Radio Male (After): " + checkRadioMale);

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Female']")).click();
        checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Male']/input")).isSelected();
        System.out.println("Radio Male (Change): " + checkRadioMale);
        boolean checkRadioFemale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']//following-sibling::div//label[normalize-space()='Female']/input")).isSelected();
        System.out.println("Radio Female: " + checkRadioFemale);

        //Kiểm tra chính cái Radio tick chọn
        //Kiểm tra các radio còn lại

        closeBrowser();
    }
}

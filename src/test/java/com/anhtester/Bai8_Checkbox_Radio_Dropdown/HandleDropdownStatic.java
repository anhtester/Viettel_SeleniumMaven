package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownStatic extends BaseTest {
    public static void main(String[] args) {
        createBrowser();

        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        sleep(1);
        //Khởi tạo đối tượng của class Select
        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));

        //Chọn option theo 3 hàm hỗ trợ
        select.selectByVisibleText("Monday");
        sleep(1);
        select.selectByValue("Tuesday");
        sleep(1);
        select.selectByIndex(5); //Vị trí thứ 6 (bắt đầu từ 0)

        //Kiểm tra giá trị đã chọn đúng chưa
        System.out.println(select.getFirstSelectedOption().getText());

        closeBrowser();
    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithElements extends BrowserSetup {

    @Test
    public void testElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radio_btn = driver.findElement(By.xpath("//input[@value='radio1']"));
        radio_btn.click();

        WebElement radio_btn2 = driver.findElement(By.xpath("//input[@value='radio2']"));
//        radio_btn2.click();
        System.out.println(radio_btn.isSelected());
        System.out.println(radio_btn2.isSelected());

        Thread.sleep(2000);
    }
}

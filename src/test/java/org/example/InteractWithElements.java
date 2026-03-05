package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithElements extends BrowserSetup {

    @Test
    public void testElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radio_btn1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("Radio button1 select State After Click: " + radio_btn1.isSelected()); // isSelected is here to determine if an element is selected or not
        System.out.println("isEnable" + radio_btn1.isEnabled());
        radio_btn1.click();

        WebElement radio_btn2 = driver.findElement(By.xpath("//input[@value='radio2']"));
//        radio_btn2.click();
        System.out.println("Radio button1 select State After Click: " + radio_btn1.isSelected()); // isSelected is here to determine if an element is selected or not
        System.out.println("Radio button2 select State Before Click: " + radio_btn2.isSelected());

        Thread.sleep(2000);
    }
}

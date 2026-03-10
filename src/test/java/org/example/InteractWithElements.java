package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithElements extends BrowserSetup {

    @Test
    public void testElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//      Check radio button click
//        WebElement radio_btn1 = driver.findElement(By.xpath("//input[@value='radio1']"));
//        System.out.println("Radio button1 select State After Click: " + radio_btn1.isSelected()); // isSelected is here to determine if an element is selected or not
//        System.out.println("isEnable" + radio_btn1.isEnabled());
//        radio_btn1.click();
//
//        WebElement radio_btn2 = driver.findElement(By.xpath("//input[@value='radio2']"));
////        radio_btn2.click();
//        System.out.println("Radio button1 select State After Click: " + radio_btn1.isSelected()); // isSelected is here to determine if an element is selected or not
//        System.out.println("Radio button2 select State Before Click: " + radio_btn2.isSelected());
//
////        Check if webElement is displayed or not
//        WebElement text_DisplayBtn = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//        System.out.println("Is the text box displayed before clicking?: " + text_DisplayBtn.isDisplayed());
//        driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
//        System.out.println("Is the text box displayed After Clicking?: " + text_DisplayBtn.isDisplayed());
//
////        getText method
//        WebElement dropdown_txt = driver.findElement(By.xpath("//legend[normalize-space()='Dropdown Example']"));
//        System.out.println(dropdown_txt.getText());

//        Write something by using sendKeys method
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("This is Tajwar");
        Thread.sleep(2000);
        name.clear();
        String place_holder = name.getAttribute("placeholder");
        System.out.println();

        Thread.sleep(2000);

    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractWithElements extends BrowserSetup {

    @Test
    public void testElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// //     Check radio button click
        WebElement radio_btn1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        WebElement radio_btn2 = driver.findElement(By.xpath("//input[@value='radio2']"));

        Assert.assertFalse(radio_btn1.isSelected()); // isSelected is here to determine if an element is selected or not
        System.out.println("isEnable" + radio_btn1.isEnabled());
        radio_btn1.click();
        Assert.assertTrue(radio_btn1.isSelected());

        radio_btn2.click();
        Assert.assertTrue(radio_btn2.isSelected()); // AssertTrue is used for making sure that the button was clicked

////        Check if webElement is displayed or not
        WebElement text_DisplayBtn = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        Assert.assertTrue(text_DisplayBtn.isDisplayed());
        driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
        Assert.assertFalse(text_DisplayBtn.isDisplayed());

////        getText method
        WebElement dropdown_txt = driver.findElement(By.xpath("//legend[normalize-space()='Dropdown Example']"));
        Assert.assertEquals(dropdown_txt.getText(), "Dropdown Example"); // AssertEquals is used for making sure that the element is equal to what we are getting

////        Write something by using sendKeys method
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("This is Tajwar");
        Thread.sleep(2000);
        name.clear();
        String place_holder = name.getAttribute("placeholder");
        Assert.assertEquals(place_holder, "Enter Your Name");

        Thread.sleep(2000);

    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractUsingMethods extends BrowserSetup {
    

    @Test
    public void testElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// //     Check radio button click
        WebElement radio_btn1 = getElement(By.xpath("//input[@value='radio1']"));
        WebElement radio_btn2 = getElement(By.xpath("//input[@value='radio2']"));

        Assert.assertFalse(radio_btn1.isSelected()); // isSelected is here to determine if an element is se
        // lected or not
        System.out.println("isEnable" + radio_btn1.isEnabled());
        radio_btn1.click();
        Assert.assertTrue(radio_btn1.isSelected());

        radio_btn2.click();
        Assert.assertTrue(radio_btn2.isSelected()); // AssertTrue is used for making sure that the button was clicked

////        Check if webElement is displayed or not
        WebElement text_DisplayBtn = getElement(By.xpath("//input[@id='displayed-text']"));
        Assert.assertTrue(text_DisplayBtn.isDisplayed());
        getElement(By.xpath("//input[@id='hide-textbox']")).click();
        Assert.assertFalse(text_DisplayBtn.isDisplayed());

////        getText method
        WebElement dropdown_txt = getElement(By.xpath("//legend[normalize-space()='Dropdown Example']"));
        Assert.assertEquals(dropdown_txt.getText(), "Dropdown Example"); // AssertEquals is used for making sure that the element is equal to what we are getting


////        Write something by using sendKeys method
        WebElement name = getElement(By.xpath("//input[@id='name']"));
        name.sendKeys("This is Tajwar");
        Assert.assertEquals(name.getAttribute("value"), "This is Tajwar");

        Thread.sleep(2000);
        name.clear();
        String place_holder = name.getAttribute("placeholder");
        Assert.assertEquals(place_holder, "Enter Your Name");

        Thread.sleep(2000);

    }
}

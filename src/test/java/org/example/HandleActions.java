package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleActions extends BrowserSetup {

    By mouse_Hover = By.xpath("//button[@id='mousehover']");
    By topOption_btn = By.xpath("//a[normalize-space()='Top']");
    By reloadOption_btn = By.xpath("//a[normalize-space()='Reload']");
    By textBox_field = By.xpath("//input[@id='autocomplete']");
    By name_field = By.xpath("//input[@id='name']");


    @Test
    public void testActions() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions actions = new Actions(driver); //** this is action class, which will help to perform different tasks like scrollByAMount, scrollToElement hover etc
        actions.scrollByAmount(0, 1000).build().perform(); // We must always use build and perform for action class.
        actions.moveToElement(getElement(mouse_Hover)).clickAndHold();
        actions.click(getElement(topOption_btn)).build().perform();
        Thread.sleep(2000);

        // Below we are trying to copy-paste something written in a field to another field
        actions.sendKeys(getElement(textBox_field), "This Is Tajwar").build().perform();
        Thread.sleep(2000);

        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").build().perform();

        actions.click(getElement(name_field)).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(2000);

    }
}

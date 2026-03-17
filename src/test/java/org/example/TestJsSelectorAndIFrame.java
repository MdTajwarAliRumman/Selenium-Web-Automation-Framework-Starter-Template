package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestJsSelectorAndIFrame extends BrowserSetup {

    By iframe_locator = By.xpath("//legend[normalize-space()='iFrame Example']");
    By support_email = By.xpath("//li[normalize-space()='contact@rahulshettyacademy.com']");

    @Test
    public void testActions() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        JavascriptExecutor js = (JavascriptExecutor) driver; //this jsExecutor helps to scroll to elements
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//        Thread.sleep(2000);
//        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
//        Thread.sleep(2000);


        WebElement iFrame_example = getElement(iframe_locator);
        js.executeScript("arguments[0].scrollIntoView();", iFrame_example);
        Thread.sleep(2000);
//        driver.switchTo().frame("courses-iframe"); // courses-iframe is id here
        driver.switchTo().frame("iframe-name"); // iframe-name is name here

        System.out.println(getElement(support_email).getText());
        Thread.sleep(2000);
//        driver.switchTo().parentFrame(); // parent or default frame e abar back korar way
        driver.switchTo().defaultContent();


    }
}

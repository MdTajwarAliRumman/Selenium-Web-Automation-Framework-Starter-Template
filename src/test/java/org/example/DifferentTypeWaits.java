package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentTypeWaits extends BrowserSetup {
    By click_btn = By.xpath("//input[@name='commit']");
    By h2_txt = By.xpath("//h2[@id='two']");
    By startLoader_btn = By.xpath("//input[@id='loaderStart']");
    By loaderDelay_txt = By.xpath("//h2[@id='loaderdelay']");
    By loading_txt = By.xpath("//div[@id='loader']");

    @Test
    public void testWait() {
        driver.get("https://qavbox.github.io/demo/delay/");

        getElement(click_btn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Selenium WebDriverWait method for specific condition or element to show up
        wait.until(ExpectedConditions.textToBePresentInElementLocated(h2_txt, "I am here!"));
//        Assert.assertEquals(getElement(h2).getText(), "I am here!");

        getElement(startLoader_btn).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicitlyWait is based on the total browser lifecycle
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loading_txt));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loaderDelay_txt));
        Assert.assertEquals(getElement(loaderDelay_txt).getText(), "I appeared after 5 sec loading");
        
    }


    // When webDriverWait fails it shows: Timeout
    // When ImplicitWait fails it shows: NoSuchElementEx
}

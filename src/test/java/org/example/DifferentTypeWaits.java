package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentTypeWaits extends BrowserSetup {
    By click_btn = By.xpath("//input[@name='commit']");
    By h2_txt = By.xpath("//h2[@id='two']");

    @Test
    public void testWait() {
        driver.get("https://qavbox.github.io/demo/delay/");
        getElement(click_btn).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Selenuim wait method for specific elemement to show up
        wait.until(ExpectedConditions.textToBePresentInElementLocated(h2_txt, "I am here!"));
//        Assert.assertEquals(getElement(h2).getText(), "I am here!");

    }

}

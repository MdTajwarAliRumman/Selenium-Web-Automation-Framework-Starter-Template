package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorAdvance extends BrowserSetup {
    @Test
    public void testElement() throws InterruptedException {
        driver.get("https://www.google.com");
//        driver.findElement(By.cssSelector("textarea")).sendKeys ("CSS Selector");
        driver.findElement(By.xpath("//textarea")).sendKeys("XPATH");
        String text = driver.findElement(By.cssSelector("div[class=\"KxwPGc AghGtd\"] > a")).getText(); // to get Child elements
        System.out.println(text);

        String text1 = driver.findElement(By.xpath("//div[@class=\"KxwPGc AghGtd\"] /a")).getText(); // to get Child elements
        System.out.println(text1);

        String text2 = driver.findElement(By.xpath("//div[@class=\"KxwPGc AghGtd\"] /a[last()]")).getText(); // to get Child elements
        System.out.println(text1);
        Thread.sleep(3000);
    }
}

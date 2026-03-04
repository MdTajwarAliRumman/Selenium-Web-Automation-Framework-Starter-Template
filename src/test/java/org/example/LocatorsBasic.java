package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsBasic extends BrowserSetup {

    @Test
    public void testElements() {
        driver.get("https://www.google.com/");
        WebElement search_Btn = driver.findElement(By.id("APjFqb"));
        

    }
}
